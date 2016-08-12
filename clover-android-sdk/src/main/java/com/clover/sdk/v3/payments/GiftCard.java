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
public final class GiftCard implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

 /**
  * Track 2 Card Data
  */
  public String getTrack2() {
    return genClient.cacheGet(CacheKey.track2);
  }
 /**
  * Embossed Card Number
  */
  public String getCardNumber() {
    return genClient.cacheGet(CacheKey.cardNumber);
  }
 /**
  * Was Account Number Manually Entered
  */
  public Boolean getIsManuallyEntered() {
    return genClient.cacheGet(CacheKey.isManuallyEntered);
  }
  public String getDeviceSerial() {
    return genClient.cacheGet(CacheKey.deviceSerial);
  }


  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<GiftCard> {
    track2 {
      @Override
      public Object extractValue(GiftCard instance) {
        return instance.genClient.extractOther("track2", String.class);
      }
    },
    cardNumber {
      @Override
      public Object extractValue(GiftCard instance) {
        return instance.genClient.extractOther("cardNumber", String.class);
      }
    },
    isManuallyEntered {
      @Override
      public Object extractValue(GiftCard instance) {
        return instance.genClient.extractOther("isManuallyEntered", Boolean.class);
      }
    },
    deviceSerial {
      @Override
      public Object extractValue(GiftCard instance) {
        return instance.genClient.extractOther("deviceSerial", String.class);
      }
    },
    ;
  }

  private GenericClient<GiftCard> genClient = new GenericClient<GiftCard>(this);

  /**
   * Constructs a new empty instance.
   */
  public GiftCard() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public GiftCard(String json) throws IllegalArgumentException {
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
  public GiftCard(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public GiftCard(GiftCard src) {
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

  /** Checks whether the 'track2' field is set and is not null */
  public boolean isNotNullTrack2() {
    return genClient.cacheValueIsNotNull(CacheKey.track2);
  }

  /** Checks whether the 'cardNumber' field is set and is not null */
  public boolean isNotNullCardNumber() {
    return genClient.cacheValueIsNotNull(CacheKey.cardNumber);
  }

  /** Checks whether the 'isManuallyEntered' field is set and is not null */
  public boolean isNotNullIsManuallyEntered() {
    return genClient.cacheValueIsNotNull(CacheKey.isManuallyEntered);
  }

  /** Checks whether the 'deviceSerial' field is set and is not null */
  public boolean isNotNullDeviceSerial() {
    return genClient.cacheValueIsNotNull(CacheKey.deviceSerial);
  }


  /** Checks whether the 'track2' field has been set, however the value could be null */
  public boolean hasTrack2() {
    return genClient.cacheHasKey(CacheKey.track2);
  }

  /** Checks whether the 'cardNumber' field has been set, however the value could be null */
  public boolean hasCardNumber() {
    return genClient.cacheHasKey(CacheKey.cardNumber);
  }

  /** Checks whether the 'isManuallyEntered' field has been set, however the value could be null */
  public boolean hasIsManuallyEntered() {
    return genClient.cacheHasKey(CacheKey.isManuallyEntered);
  }

  /** Checks whether the 'deviceSerial' field has been set, however the value could be null */
  public boolean hasDeviceSerial() {
    return genClient.cacheHasKey(CacheKey.deviceSerial);
  }


  /**
   * Sets the field 'track2'.
   */
  public GiftCard setTrack2(String track2) {
    return genClient.setOther(track2, CacheKey.track2);
  }

  /**
   * Sets the field 'cardNumber'.
   */
  public GiftCard setCardNumber(String cardNumber) {
    return genClient.setOther(cardNumber, CacheKey.cardNumber);
  }

  /**
   * Sets the field 'isManuallyEntered'.
   */
  public GiftCard setIsManuallyEntered(Boolean isManuallyEntered) {
    return genClient.setOther(isManuallyEntered, CacheKey.isManuallyEntered);
  }

  /**
   * Sets the field 'deviceSerial'.
   */
  public GiftCard setDeviceSerial(String deviceSerial) {
    return genClient.setOther(deviceSerial, CacheKey.deviceSerial);
  }


  /** Clears the 'track2' field, the 'has' method for this field will now return false */
  public void clearTrack2() {
    genClient.clear(CacheKey.track2);
  }
  /** Clears the 'cardNumber' field, the 'has' method for this field will now return false */
  public void clearCardNumber() {
    genClient.clear(CacheKey.cardNumber);
  }
  /** Clears the 'isManuallyEntered' field, the 'has' method for this field will now return false */
  public void clearIsManuallyEntered() {
    genClient.clear(CacheKey.isManuallyEntered);
  }
  /** Clears the 'deviceSerial' field, the 'has' method for this field will now return false */
  public void clearDeviceSerial() {
    genClient.clear(CacheKey.deviceSerial);
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
  public GiftCard copyChanges() {
    GiftCard copy = new GiftCard();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(GiftCard src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new GiftCard(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<GiftCard> CREATOR = new android.os.Parcelable.Creator<GiftCard>() {
    @Override
    public GiftCard createFromParcel(android.os.Parcel in) {
      GiftCard instance = new GiftCard(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public GiftCard[] newArray(int size) {
      return new GiftCard[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<GiftCard> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<GiftCard>() {
    @Override
    public GiftCard create(org.json.JSONObject jsonObject) {
      return new GiftCard(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean TRACK2_IS_REQUIRED = false;

    public static final boolean CARDNUMBER_IS_REQUIRED = false;

    public static final boolean ISMANUALLYENTERED_IS_REQUIRED = false;

    public static final boolean DEVICESERIAL_IS_REQUIRED = false;

  }

}
