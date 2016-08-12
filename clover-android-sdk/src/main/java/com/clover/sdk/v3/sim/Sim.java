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

package com.clover.sdk.v3.sim;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class Sim implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

 /**
  * Unique identifier
  */
  public String getId() {
    return genClient.cacheGet(CacheKey.id);
  }
 /**
  * Unique integrated circuit chip identifier
  */
  public String getIccid() {
    return genClient.cacheGet(CacheKey.iccid);
  }
 /**
  * The current status of the SIM
  */
  public com.clover.sdk.v3.sim.SimStatus getStatus() {
    return genClient.cacheGet(CacheKey.status);
  }
 /**
  * The device using this SIM
  */
  public com.clover.sdk.v3.base.Reference getDevice() {
    return genClient.cacheGet(CacheKey.device);
  }
 /**
  * The merchant the SIM belongs to
  */
  public com.clover.sdk.v3.base.Reference getMerchant() {
    return genClient.cacheGet(CacheKey.merchant);
  }
 /**
  * The data that the SIM has used
  */
  public java.util.List<com.clover.sdk.v3.base.Reference> getUsage() {
    return genClient.cacheGet(CacheKey.usage);
  }
 /**
  * The wireless provider the SIM belongs to
  */
  public com.clover.sdk.v3.base.Reference getWirelessProvider() {
    return genClient.cacheGet(CacheKey.wirelessProvider);
  }
 /**
  * The price plan the SIM is subscribed to
  */
  public com.clover.sdk.v3.base.Reference getWirelessPricePlan() {
    return genClient.cacheGet(CacheKey.wirelessPricePlan);
  }


  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Sim> {
    id {
      @Override
      public Object extractValue(Sim instance) {
        return instance.genClient.extractOther("id", String.class);
      }
    },
    iccid {
      @Override
      public Object extractValue(Sim instance) {
        return instance.genClient.extractOther("iccid", String.class);
      }
    },
    status {
      @Override
      public Object extractValue(Sim instance) {
        return instance.genClient.extractEnum("status", com.clover.sdk.v3.sim.SimStatus.class);
      }
    },
    device {
      @Override
      public Object extractValue(Sim instance) {
        return instance.genClient.extractRecord("device", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    merchant {
      @Override
      public Object extractValue(Sim instance) {
        return instance.genClient.extractRecord("merchant", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    usage {
      @Override
      public Object extractValue(Sim instance) {
        return instance.genClient.extractListRecord("usage", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    wirelessProvider {
      @Override
      public Object extractValue(Sim instance) {
        return instance.genClient.extractRecord("wirelessProvider", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    wirelessPricePlan {
      @Override
      public Object extractValue(Sim instance) {
        return instance.genClient.extractRecord("wirelessPricePlan", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    ;
  }

  private GenericClient<Sim> genClient = new GenericClient<Sim>(this);

  /**
   * Constructs a new empty instance.
   */
  public Sim() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Sim(String json) throws IllegalArgumentException {
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
  public Sim(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Sim(Sim src) {
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
    genClient.validateLength(getId(), 13);

    genClient.validateLength(getIccid(), 22);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'iccid' field is set and is not null */
  public boolean isNotNullIccid() {
    return genClient.cacheValueIsNotNull(CacheKey.iccid);
  }

  /** Checks whether the 'status' field is set and is not null */
  public boolean isNotNullStatus() {
    return genClient.cacheValueIsNotNull(CacheKey.status);
  }

  /** Checks whether the 'device' field is set and is not null */
  public boolean isNotNullDevice() {
    return genClient.cacheValueIsNotNull(CacheKey.device);
  }

  /** Checks whether the 'merchant' field is set and is not null */
  public boolean isNotNullMerchant() {
    return genClient.cacheValueIsNotNull(CacheKey.merchant);
  }

  /** Checks whether the 'usage' field is set and is not null */
  public boolean isNotNullUsage() {
    return genClient.cacheValueIsNotNull(CacheKey.usage);
  }

  /** Checks whether the 'usage' field is set and is not null and is not empty */
  public boolean isNotEmptyUsage() { return isNotNullUsage() && !getUsage().isEmpty(); }

  /** Checks whether the 'wirelessProvider' field is set and is not null */
  public boolean isNotNullWirelessProvider() {
    return genClient.cacheValueIsNotNull(CacheKey.wirelessProvider);
  }

  /** Checks whether the 'wirelessPricePlan' field is set and is not null */
  public boolean isNotNullWirelessPricePlan() {
    return genClient.cacheValueIsNotNull(CacheKey.wirelessPricePlan);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'iccid' field has been set, however the value could be null */
  public boolean hasIccid() {
    return genClient.cacheHasKey(CacheKey.iccid);
  }

  /** Checks whether the 'status' field has been set, however the value could be null */
  public boolean hasStatus() {
    return genClient.cacheHasKey(CacheKey.status);
  }

  /** Checks whether the 'device' field has been set, however the value could be null */
  public boolean hasDevice() {
    return genClient.cacheHasKey(CacheKey.device);
  }

  /** Checks whether the 'merchant' field has been set, however the value could be null */
  public boolean hasMerchant() {
    return genClient.cacheHasKey(CacheKey.merchant);
  }

  /** Checks whether the 'usage' field has been set, however the value could be null */
  public boolean hasUsage() {
    return genClient.cacheHasKey(CacheKey.usage);
  }

  /** Checks whether the 'wirelessProvider' field has been set, however the value could be null */
  public boolean hasWirelessProvider() {
    return genClient.cacheHasKey(CacheKey.wirelessProvider);
  }

  /** Checks whether the 'wirelessPricePlan' field has been set, however the value could be null */
  public boolean hasWirelessPricePlan() {
    return genClient.cacheHasKey(CacheKey.wirelessPricePlan);
  }


  /**
   * Sets the field 'id'.
   */
  public Sim setId(String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'iccid'.
   */
  public Sim setIccid(String iccid) {
    return genClient.setOther(iccid, CacheKey.iccid);
  }

  /**
   * Sets the field 'status'.
   */
  public Sim setStatus(com.clover.sdk.v3.sim.SimStatus status) {
    return genClient.setOther(status, CacheKey.status);
  }

  /**
   * Sets the field 'device'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Sim setDevice(com.clover.sdk.v3.base.Reference device) {
    return genClient.setRecord(device, CacheKey.device);
  }

  /**
   * Sets the field 'merchant'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Sim setMerchant(com.clover.sdk.v3.base.Reference merchant) {
    return genClient.setRecord(merchant, CacheKey.merchant);
  }

  /**
   * Sets the field 'usage'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public Sim setUsage(java.util.List<com.clover.sdk.v3.base.Reference> usage) {
    return genClient.setArrayRecord(usage, CacheKey.usage);
  }

  /**
   * Sets the field 'wirelessProvider'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Sim setWirelessProvider(com.clover.sdk.v3.base.Reference wirelessProvider) {
    return genClient.setRecord(wirelessProvider, CacheKey.wirelessProvider);
  }

  /**
   * Sets the field 'wirelessPricePlan'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Sim setWirelessPricePlan(com.clover.sdk.v3.base.Reference wirelessPricePlan) {
    return genClient.setRecord(wirelessPricePlan, CacheKey.wirelessPricePlan);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'iccid' field, the 'has' method for this field will now return false */
  public void clearIccid() {
    genClient.clear(CacheKey.iccid);
  }
  /** Clears the 'status' field, the 'has' method for this field will now return false */
  public void clearStatus() {
    genClient.clear(CacheKey.status);
  }
  /** Clears the 'device' field, the 'has' method for this field will now return false */
  public void clearDevice() {
    genClient.clear(CacheKey.device);
  }
  /** Clears the 'merchant' field, the 'has' method for this field will now return false */
  public void clearMerchant() {
    genClient.clear(CacheKey.merchant);
  }
  /** Clears the 'usage' field, the 'has' method for this field will now return false */
  public void clearUsage() {
    genClient.clear(CacheKey.usage);
  }
  /** Clears the 'wirelessProvider' field, the 'has' method for this field will now return false */
  public void clearWirelessProvider() {
    genClient.clear(CacheKey.wirelessProvider);
  }
  /** Clears the 'wirelessPricePlan' field, the 'has' method for this field will now return false */
  public void clearWirelessPricePlan() {
    genClient.clear(CacheKey.wirelessPricePlan);
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
  public Sim copyChanges() {
    Sim copy = new Sim();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Sim src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Sim(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<Sim> CREATOR = new android.os.Parcelable.Creator<Sim>() {
    @Override
    public Sim createFromParcel(android.os.Parcel in) {
      Sim instance = new Sim(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Sim[] newArray(int size) {
      return new Sim[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Sim> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Sim>() {
    @Override
    public Sim create(org.json.JSONObject jsonObject) {
      return new Sim(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean ICCID_IS_REQUIRED = false;
    public static final long ICCID_MAX_LEN = 22;

    public static final boolean STATUS_IS_REQUIRED = false;

    public static final boolean DEVICE_IS_REQUIRED = false;

    public static final boolean MERCHANT_IS_REQUIRED = false;

    public static final boolean USAGE_IS_REQUIRED = false;

    public static final boolean WIRELESSPROVIDER_IS_REQUIRED = false;

    public static final boolean WIRELESSPRICEPLAN_IS_REQUIRED = false;

  }

}
