package zoomifi.donatehere;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

import com.clover.sdk.util.CloverAccount;
import com.clover.sdk.v1.BindingException;
import com.clover.sdk.v1.ClientException;
import com.clover.sdk.v1.ServiceConnector;
import com.clover.sdk.v1.ServiceException;
import com.clover.sdk.v1.customer.Customer;
import com.clover.sdk.v1.customer.CustomerConnector;
import com.clover.sdk.v3.order.Order;
import com.clover.sdk.v3.order.OrderConnector;
import com.clover.sdk.v3.order.OrderContract;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.Query;
import com.firebase.client.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class AlarmReciever extends BroadcastReceiver {
    private List<OrderEntity> OrdersMasterList;
    private Context context;
    private Account cloverAccount;
    private OrderConnector orderConnector;
    private CustomerConnector customerConnector;
    private static final int FLAG_UPDATE = 1002;

    @Override
    public void onReceive(Context context, Intent intent) {
        this.context = context;
        if (this.cloverAccount == null) {
            this.cloverAccount = CloverAccount.getAccount(context);

            if (this.cloverAccount == null) {
                return;
            }
        }
        connectCustomerConnector();
        connectOrderConnector();
        callQueryDonationOrders();
    }

    public void callQueryDonationOrders() {
        new QueryDonationOrders(context, FLAG_UPDATE).execute();
    }

    private void connectCustomerConnector() {
        disconnectCustomerConnect();
        if (this.cloverAccount != null) {
            this.customerConnector = new CustomerConnector(context, this.cloverAccount, null);
            this.customerConnector.connect();
        }
    }

    /**
     * Disconnect the Order Connector.
     */

    private void disconnectCustomerConnect() {
        if (this.customerConnector != null) {
            this.customerConnector.disconnect();
            this.customerConnector = null;
        }
    }

    /**
     * Connect the Order Connector.
     */

    private void connectOrderConnector() {
        disconnectOrderConnect();
        if (this.cloverAccount != null) {
            this.orderConnector = new OrderConnector(context, this.cloverAccount, new ServiceConnector.OnServiceConnectedListener() {
                @Override
                public void onServiceConnected(ServiceConnector<? extends IInterface> serviceConnector) {
                    if (orderConnector != null) {
                        //queryDonations();
                    }
                }

                @Override
                public void onServiceDisconnected(ServiceConnector<? extends IInterface> serviceConnector) {
                }
            });
            this.orderConnector.connect();
        }
    }

    /**
     * Disconnect the Order Connector.
     */

    private void disconnectOrderConnect() {
        if (this.orderConnector != null) {
            this.orderConnector.disconnect();
            this.orderConnector = null;
        }
    }

    private void populateOrderEntitiesFromFirebase(final Integer flag) //final int index, final String orderId)
    {
        SharedPreferences prefs = context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE);

        Firebase ref = new Firebase("https://donatehere.firebaseio.com/merchants/" + prefs.getString("merchantID", null) + "/customers");
        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot child : dataSnapshot.getChildren()) {
                    boolean c = true;
                    if (child.child("orderid").exists()) {
                        for (int x = 0; x < OrdersMasterList.size() && c; x++) {
                            if (OrdersMasterList.get(x).getOrderID().equals(child.child("orderid").getValue().toString())) {
                                System.out.println(child.child("orderid").getValue().toString());
                                if (child.child("customText1").exists())
                                    OrdersMasterList.get(x).setCustomText1(child.child("customText1").getValue().toString());
                                if (child.child("customText2").exists())
                                    OrdersMasterList.get(x).setCustomText2(child.child("customText2").getValue().toString());
                                if (child.child("customText3").exists())
                                    OrdersMasterList.get(x).setCustomText3(child.child("customText3").getValue().toString());
                                if (child.child("customText4").exists())
                                    OrdersMasterList.get(x).setCustomText4(child.child("customText4").getValue().toString());
                                if (child.child("department").exists())
                                    OrdersMasterList.get(x).setDepartment(child.child("department").getValue().toString());
                                c = false;
                            }
                        }
                    }
                }

                //parseDonations();

                System.out.println("addFeesToOrderEntities complete, call frefresh OrderList");
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }

    private class QueryDonationOrders extends AsyncTask<Void, Void, Boolean> {
        private Context context;
        private Integer FLAG;

        public QueryDonationOrders(Context _context, Integer _FLAG) {
            this.context = _context;
            this.FLAG = _FLAG;
        }

        @Override
        protected void onPreExecute() {

        }

        @Override
        protected Boolean doInBackground(Void... params) {
            OrderEntity orderEntity;

            Cursor cursor
                    = context.getContentResolver().query(OrderContract.Summaries.contentUriWithAccount(cloverAccount),
                    new String[]{
                            OrderContract.Summaries.ID,
                            OrderContract.Summaries.TITLE,
                            OrderContract.Summaries.CREATED,
                            OrderContract.Summaries.TOTAL,
                            OrderContract.Summaries.PAYMENT_STATE
                    }, OrderContract.Summaries.TITLE + " LIKE ? AND " + OrderContract.Summaries.PAYMENT_STATE + " LIKE ?", new String[]{"Donation", "PAID"}, OrderContract.Summaries.CREATED + " DESC");

            //"COALESCE(" + OrderContract.Summaries.ORDER_TYPE + ", '')

            if (cursor != null && cursor.getCount() >= 1) {
                OrdersMasterList = new ArrayList<>();

                cursor.moveToFirst();

                do {
                    orderEntity = new OrderEntity();

                    orderEntity.setDate(cursor.getLong(2));
                    orderEntity.setAmount(cursor.getLong(3));

                    System.out.println(
                            cursor.getString(0) + " " +
                                    cursor.getString(1) + " " +
                                    cursor.getString(2) + " " +
                                    cursor.getString(3) + " " +
                                    cursor.getString(4)
                    );

                    try {
                        Order order = orderConnector.getOrder(cursor.getString(0));
                        orderEntity.setOrderID(order.getId());

                        if (order.isNotEmptyCustomers()) {
                            Customer customer = customerConnector.getCustomer(order.getCustomers().get(0).getId());
                            orderEntity.setCustomerFirstName(customer.getFirstName());
                            orderEntity.setCustomerLastName(customer.getLastName());

                            if (customer.getEmailAddresses() != null && customer.getEmailAddresses().size() > 0) {
                                orderEntity.setEmail(customer.getEmailAddresses().get(0).getEmailAddress());
                                System.out.println("F: " + customer.getFirstName() + " L: " + customer.getLastName() + " E: " + orderEntity.getEmail());
                            }

                            if (customer.getPhoneNumbers() != null && customer.getPhoneNumbers().size() > 0)
                                orderEntity.setPhoneNumber(customer.getPhoneNumbers().get(0).getPhoneNumber());
                        }
                        OrdersMasterList.add(orderEntity);
                    } catch (ServiceException e) {
                        cursor.close();
                        Log.e("ERROR: ServiceException", e.getMessage());
                    } catch (RemoteException e) {
                        cursor.close();
                        Log.e("ERROR: RemoteException", e.getMessage());
                    } catch (BindingException e) {
                        cursor.close();
                        Log.e("ERROR: BindingException", e.getMessage());
                    } catch (ClientException e) {
                        cursor.close();
                        Log.e("ERROR: ClientException", e.getMessage());
                    }
                }

                while (cursor.moveToNext());

                cursor.close();

                return true;
            } else
                return false;
        }

        @Override
        protected void onPostExecute(Boolean result) {
            if (result)
                populateOrderEntitiesFromFirebase(this.FLAG);
        }
    }

    public void parseDonations() {
        // added this function call to line 694
        SharedPreferences prefs = context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE);

        Firebase ref = new Firebase("https://donatehere.firebaseio.com/merchants/" + prefs.getString("merchantID", null) + "/customers");

        for (int x = 0; x < OrdersMasterList.size(); x++) {
            Query queryRef = ref.orderByChild("orderid").equalTo(OrdersMasterList.get(x).getOrderID());

            if (queryRef != null) {
                Firebase customerRef = new Firebase("https://donatehere.firebaseio.com/merchants/" + prefs.getString("merchantID", null) + "/customers");
                Firebase newCustomerRef = customerRef.push();

                String firstName = OrdersMasterList.get(x).getCustomerFirstName();
                String lastName = OrdersMasterList.get(x).getCustomerLastName();
                String email = OrdersMasterList.get(x).getEmail();
                String phoneNumber = OrdersMasterList.get(x).getPhoneNumber();
                String custom1 = OrdersMasterList.get(x).getCustomText1();
                String custom2 = OrdersMasterList.get(x).getCustomText2();
                String custom3 = OrdersMasterList.get(x).getCustomText3();
                String custom4 = OrdersMasterList.get(x).getCustomText4();
                String department = OrdersMasterList.get(x).getDepartment();

                if (firstName != null && firstName.length() > 0 && firstName != "—") {
                    if (lastName != null && lastName.length() > 0 && lastName != "—")
                        newCustomerRef.child("name").setValue(firstName + " " + lastName);
                    else
                        newCustomerRef.child("name").setValue(firstName);
                } else if (lastName != null && lastName.length() > 0 && lastName != "—")
                    newCustomerRef.child("name").setValue(lastName);

                if (email != null && email.length() > 0 && email != "—")
                    newCustomerRef.child("email").setValue(firstName + " " + lastName);

                if (phoneNumber != null && phoneNumber.length() > 0 && phoneNumber != "—")
                    newCustomerRef.child("phone").setValue(firstName + " " + lastName);

                if (custom1 != null && custom1.length() > 0 && custom1 != "—")
                    newCustomerRef.child("customText1").setValue(firstName + " " + lastName);

                if (custom2 != null && custom2.length() > 0 && custom2 != "—")
                    newCustomerRef.child("customText2").setValue(firstName + " " + lastName);

                if (custom3 != null && custom3.length() > 0 && custom3 != "—")
                    newCustomerRef.child("customText3").setValue(firstName + " " + lastName);

                if (custom4 != null && custom4.length() > 0 && custom4 != "—")
                    newCustomerRef.child("customText4").setValue(firstName + " " + lastName);

                if (department != null && department.length() > 0 && department != "—")
                    newCustomerRef.child("department").setValue(firstName + " " + lastName);

                newCustomerRef.child("date").setValue(OrdersMasterList.get(x).getParsedDate());
                newCustomerRef.child("amount").setValue(OrdersMasterList.get(x).getParsedAmount());
            }
        }
    }

}
