/**
 * Copyright (C) 2015 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */

package com.clover.sdk.v3.payments;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class GiftCardTransaction implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

 /**
  * Transaction Amount
  */
  public Long getAmount() {
    return genClient.cacheGet(CacheKey.amount);
  }
 /**
  * Tax Amount
  */
  public Long getTaxAmount() {
    return genClient.cacheGet(CacheKey.taxAmount);
  }
  public String getOrderId() {
    return genClient.cacheGet(CacheKey.orderId);
  }
 /**
  * Gift Card
  */
  public com.clover.sdk.v3.payments.GiftCard getCard() {
    return genClient.cacheGet(CacheKey.card);
  }
  public java.util.List<String> getPaymentIds() {
    return genClient.cacheGet(CacheKey.paymentIds);
  }
  public Boolean getIgnorePayment() {
    return genClient.cacheGet(CacheKey.ignorePayment);
  }
  public com.clover.sdk.v3.payments.ServiceChargeAmount getServiceChargeAmount() {
    return genClient.cacheGet(CacheKey.serviceChargeAmount);
  }
  public java.util.List<com.clover.sdk.v3.payments.TaxableAmountRate> getTaxableAmountRates() {
    return genClient.cacheGet(CacheKey.taxableAmountRates);
  }
 /**
  * Payments that were made for this line item
  */
  public java.util.List<com.clover.sdk.v3.payments.LineItemPayment> getLineItems() {
    return genClient.cacheGet(CacheKey.lineItems);
  }
  public String getEmployeeId() {
    return genClient.cacheGet(CacheKey.employeeId);
  }


  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<GiftCardTransaction> {
    amount {
      @Override
      public Object extractValue(GiftCardTransaction instance) {
        return instance.genClient.extractOther("amount", Long.class);
      }
    },
    taxAmount {
      @Override
      public Object extractValue(GiftCardTransaction instance) {
        return instance.genClient.extractOther("taxAmount", Long.class);
      }
    },
    orderId {
      @Override
      public Object extractValue(GiftCardTransaction instance) {
        return instance.genClient.extractOther("orderId", String.class);
      }
    },
    card {
      @Override
      public Object extractValue(GiftCardTransaction instance) {
        return instance.genClient.extractRecord("card", com.clover.sdk.v3.payments.GiftCard.JSON_CREATOR);
      }
    },
    paymentIds {
      @Override
      public Object extractValue(GiftCardTransaction instance) {
        return instance.genClient.extractListOther("paymentIds", String.class);
      }
    },
    ignorePayment {
      @Override
      public Object extractValue(GiftCardTransaction instance) {
        return instance.genClient.extractOther("ignorePayment", Boolean.class);
      }
    },
    serviceChargeAmount {
      @Override
      public Object extractValue(GiftCardTransaction instance) {
        return instance.genClient.extractRecord("serviceChargeAmount", com.clover.sdk.v3.payments.ServiceChargeAmount.JSON_CREATOR);
      }
    },
    taxableAmountRates {
      @Override
      public Object extractValue(GiftCardTransaction instance) {
        return instance.genClient.extractListRecord("taxableAmountRates", com.clover.sdk.v3.payments.TaxableAmountRate.JSON_CREATOR);
      }
    },
    lineItems {
      @Override
      public Object extractValue(GiftCardTransaction instance) {
        return instance.genClient.extractListRecord("lineItems", com.clover.sdk.v3.payments.LineItemPayment.JSON_CREATOR);
      }
    },
    employeeId {
      @Override
      public Object extractValue(GiftCardTransaction instance) {
        return instance.genClient.extractOther("employeeId", String.class);
      }
    },
    ;
  }

  private GenericClient<GiftCardTransaction> genClient = new GenericClient<GiftCardTransaction>(this);

  /**
   * Constructs a new empty instance.
   */
  public GiftCardTransaction() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public GiftCardTransaction(String json) throws IllegalArgumentException {
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public GiftCardTransaction(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public GiftCardTransaction(GiftCardTransaction src) {
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }


  @Override
  public void validate() {
  }

  /** Checks whether the 'amount' field is set and is not null */
  public boolean isNotNullAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.amount);
  }

  /** Checks whether the 'taxAmount' field is set and is not null */
  public boolean isNotNullTaxAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.taxAmount);
  }

  /** Checks whether the 'orderId' field is set and is not null */
  public boolean isNotNullOrderId() {
    return genClient.cacheValueIsNotNull(CacheKey.orderId);
  }

  /** Checks whether the 'card' field is set and is not null */
  public boolean isNotNullCard() {
    return genClient.cacheValueIsNotNull(CacheKey.card);
  }

  /** Checks whether the 'paymentIds' field is set and is not null */
  public boolean isNotNullPaymentIds() {
    return genClient.cacheValueIsNotNull(CacheKey.paymentIds);
  }

  /** Checks whether the 'paymentIds' field is set and is not null and is not empty */
  public boolean isNotEmptyPaymentIds() { return isNotNullPaymentIds() && !getPaymentIds().isEmpty(); }

  /** Checks whether the 'ignorePayment' field is set and is not null */
  public boolean isNotNullIgnorePayment() {
    return genClient.cacheValueIsNotNull(CacheKey.ignorePayment);
  }

  /** Checks whether the 'serviceChargeAmount' field is set and is not null */
  public boolean isNotNullServiceChargeAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.serviceChargeAmount);
  }

  /** Checks whether the 'taxableAmountRates' field is set and is not null */
  public boolean isNotNullTaxableAmountRates() {
    return genClient.cacheValueIsNotNull(CacheKey.taxableAmountRates);
  }

  /** Checks whether the 'taxableAmountRates' field is set and is not null and is not empty */
  public boolean isNotEmptyTaxableAmountRates() { return isNotNullTaxableAmountRates() && !getTaxableAmountRates().isEmpty(); }

  /** Checks whether the 'lineItems' field is set and is not null */
  public boolean isNotNullLineItems() {
    return genClient.cacheValueIsNotNull(CacheKey.lineItems);
  }

  /** Checks whether the 'lineItems' field is set and is not null and is not empty */
  public boolean isNotEmptyLineItems() { return isNotNullLineItems() && !getLineItems().isEmpty(); }

  /** Checks whether the 'employeeId' field is set and is not null */
  public boolean isNotNullEmployeeId() {
    return genClient.cacheValueIsNotNull(CacheKey.employeeId);
  }


  /** Checks whether the 'amount' field has been set, however the value could be null */
  public boolean hasAmount() {
    return genClient.cacheHasKey(CacheKey.amount);
  }

  /** Checks whether the 'taxAmount' field has been set, however the value could be null */
  public boolean hasTaxAmount() {
    return genClient.cacheHasKey(CacheKey.taxAmount);
  }

  /** Checks whether the 'orderId' field has been set, however the value could be null */
  public boolean hasOrderId() {
    return genClient.cacheHasKey(CacheKey.orderId);
  }

  /** Checks whether the 'card' field has been set, however the value could be null */
  public boolean hasCard() {
    return genClient.cacheHasKey(CacheKey.card);
  }

  /** Checks whether the 'paymentIds' field has been set, however the value could be null */
  public boolean hasPaymentIds() {
    return genClient.cacheHasKey(CacheKey.paymentIds);
  }

  /** Checks whether the 'ignorePayment' field has been set, however the value could be null */
  public boolean hasIgnorePayment() {
    return genClient.cacheHasKey(CacheKey.ignorePayment);
  }

  /** Checks whether the 'serviceChargeAmount' field has been set, however the value could be null */
  public boolean hasServiceChargeAmount() {
    return genClient.cacheHasKey(CacheKey.serviceChargeAmount);
  }

  /** Checks whether the 'taxableAmountRates' field has been set, however the value could be null */
  public boolean hasTaxableAmountRates() {
    return genClient.cacheHasKey(CacheKey.taxableAmountRates);
  }

  /** Checks whether the 'lineItems' field has been set, however the value could be null */
  public boolean hasLineItems() {
    return genClient.cacheHasKey(CacheKey.lineItems);
  }

  /** Checks whether the 'employeeId' field has been set, however the value could be null */
  public boolean hasEmployeeId() {
    return genClient.cacheHasKey(CacheKey.employeeId);
  }


  /**
   * Sets the field 'amount'.
   */
  public GiftCardTransaction setAmount(Long amount) {
    return genClient.setOther(amount, CacheKey.amount);
  }

  /**
   * Sets the field 'taxAmount'.
   */
  public GiftCardTransaction setTaxAmount(Long taxAmount) {
    return genClient.setOther(taxAmount, CacheKey.taxAmount);
  }

  /**
   * Sets the field 'orderId'.
   */
  public GiftCardTransaction setOrderId(String orderId) {
    return genClient.setOther(orderId, CacheKey.orderId);
  }

  /**
   * Sets the field 'card'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public GiftCardTransaction setCard(com.clover.sdk.v3.payments.GiftCard card) {
    return genClient.setRecord(card, CacheKey.card);
  }

  /**
   * Sets the field 'paymentIds'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public GiftCardTransaction setPaymentIds(java.util.List<String> paymentIds) {
    return genClient.setArrayOther(paymentIds, CacheKey.paymentIds);
  }

  /**
   * Sets the field 'ignorePayment'.
   */
  public GiftCardTransaction setIgnorePayment(Boolean ignorePayment) {
    return genClient.setOther(ignorePayment, CacheKey.ignorePayment);
  }

  /**
   * Sets the field 'serviceChargeAmount'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public GiftCardTransaction setServiceChargeAmount(com.clover.sdk.v3.payments.ServiceChargeAmount serviceChargeAmount) {
    return genClient.setRecord(serviceChargeAmount, CacheKey.serviceChargeAmount);
  }

  /**
   * Sets the field 'taxableAmountRates'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public GiftCardTransaction setTaxableAmountRates(java.util.List<com.clover.sdk.v3.payments.TaxableAmountRate> taxableAmountRates) {
    return genClient.setArrayRecord(taxableAmountRates, CacheKey.taxableAmountRates);
  }

  /**
   * Sets the field 'lineItems'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public GiftCardTransaction setLineItems(java.util.List<com.clover.sdk.v3.payments.LineItemPayment> lineItems) {
    return genClient.setArrayRecord(lineItems, CacheKey.lineItems);
  }

  /**
   * Sets the field 'employeeId'.
   */
  public GiftCardTransaction setEmployeeId(String employeeId) {
    return genClient.setOther(employeeId, CacheKey.employeeId);
  }


  /** Clears the 'amount' field, the 'has' method for this field will now return false */
  public void clearAmount() {
    genClient.clear(CacheKey.amount);
  }
  /** Clears the 'taxAmount' field, the 'has' method for this field will now return false */
  public void clearTaxAmount() {
    genClient.clear(CacheKey.taxAmount);
  }
  /** Clears the 'orderId' field, the 'has' method for this field will now return false */
  public void clearOrderId() {
    genClient.clear(CacheKey.orderId);
  }
  /** Clears the 'card' field, the 'has' method for this field will now return false */
  public void clearCard() {
    genClient.clear(CacheKey.card);
  }
  /** Clears the 'paymentIds' field, the 'has' method for this field will now return false */
  public void clearPaymentIds() {
    genClient.clear(CacheKey.paymentIds);
  }
  /** Clears the 'ignorePayment' field, the 'has' method for this field will now return false */
  public void clearIgnorePayment() {
    genClient.clear(CacheKey.ignorePayment);
  }
  /** Clears the 'serviceChargeAmount' field, the 'has' method for this field will now return false */
  public void clearServiceChargeAmount() {
    genClient.clear(CacheKey.serviceChargeAmount);
  }
  /** Clears the 'taxableAmountRates' field, the 'has' method for this field will now return false */
  public void clearTaxableAmountRates() {
    genClient.clear(CacheKey.taxableAmountRates);
  }
  /** Clears the 'lineItems' field, the 'has' method for this field will now return false */
  public void clearLineItems() {
    genClient.clear(CacheKey.lineItems);
  }
  /** Clears the 'employeeId' field, the 'has' method for this field will now return false */
  public void clearEmployeeId() {
    genClient.clear(CacheKey.employeeId);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public GiftCardTransaction copyChanges() {
    GiftCardTransaction copy = new GiftCardTransaction();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(GiftCardTransaction src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new GiftCardTransaction(src).getJSONObject(), src.genClient);
    }
  }

  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    return genClient.getBundle();
  }

  @Override
  public String toString() {
    return genClient.toString();
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
    genClient.writeToParcel(dest, flags);
  }

  public static final android.os.Parcelable.Creator<GiftCardTransaction> CREATOR = new android.os.Parcelable.Creator<GiftCardTransaction>() {
    @Override
    public GiftCardTransaction createFromParcel(android.os.Parcel in) {
      GiftCardTransaction instance = new GiftCardTransaction(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public GiftCardTransaction[] newArray(int size) {
      return new GiftCardTransaction[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<GiftCardTransaction> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<GiftCardTransaction>() {
    @Override
    public GiftCardTransaction create(org.json.JSONObject jsonObject) {
      return new GiftCardTransaction(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean AMOUNT_IS_REQUIRED = false;

    public static final boolean TAXAMOUNT_IS_REQUIRED = false;

    public static final boolean ORDERID_IS_REQUIRED = false;

    public static final boolean CARD_IS_REQUIRED = false;

    public static final boolean PAYMENTIDS_IS_REQUIRED = false;

    public static final boolean IGNOREPAYMENT_IS_REQUIRED = false;

    public static final boolean SERVICECHARGEAMOUNT_IS_REQUIRED = false;

    public static final boolean TAXABLEAMOUNTRATES_IS_REQUIRED = false;

    public static final boolean LINEITEMS_IS_REQUIRED = false;

    public static final boolean EMPLOYEEID_IS_REQUIRED = false;

  }

}
