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

package com.clover.sdk.v3.inventory;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class TaxRateItem implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public com.clover.sdk.v3.inventory.TaxRate getTaxRate() {
    return genClient.cacheGet(CacheKey.taxRate);
  }
  public com.clover.sdk.v3.inventory.Item getItem() {
    return genClient.cacheGet(CacheKey.item);
  }


  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<TaxRateItem> {
    taxRate {
      @Override
      public Object extractValue(TaxRateItem instance) {
        return instance.genClient.extractRecord("taxRate", com.clover.sdk.v3.inventory.TaxRate.JSON_CREATOR);
      }
    },
    item {
      @Override
      public Object extractValue(TaxRateItem instance) {
        return instance.genClient.extractRecord("item", com.clover.sdk.v3.inventory.Item.JSON_CREATOR);
      }
    },
    ;
  }

  private GenericClient<TaxRateItem> genClient = new GenericClient<TaxRateItem>(this);

  /**
   * Constructs a new empty instance.
   */
  public TaxRateItem() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public TaxRateItem(String json) throws IllegalArgumentException {
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
  public TaxRateItem(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public TaxRateItem(TaxRateItem src) {
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
    genClient.validateNull(getTaxRate(), "taxRate");

    genClient.validateNull(getItem(), "item");
  }

  /** Checks whether the 'taxRate' field is set and is not null */
  public boolean isNotNullTaxRate() {
    return genClient.cacheValueIsNotNull(CacheKey.taxRate);
  }

  /** Checks whether the 'item' field is set and is not null */
  public boolean isNotNullItem() {
    return genClient.cacheValueIsNotNull(CacheKey.item);
  }


  /** Checks whether the 'taxRate' field has been set, however the value could be null */
  public boolean hasTaxRate() {
    return genClient.cacheHasKey(CacheKey.taxRate);
  }

  /** Checks whether the 'item' field has been set, however the value could be null */
  public boolean hasItem() {
    return genClient.cacheHasKey(CacheKey.item);
  }


  /**
   * Sets the field 'taxRate'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public TaxRateItem setTaxRate(com.clover.sdk.v3.inventory.TaxRate taxRate) {
    return genClient.setRecord(taxRate, CacheKey.taxRate);
  }

  /**
   * Sets the field 'item'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public TaxRateItem setItem(com.clover.sdk.v3.inventory.Item item) {
    return genClient.setRecord(item, CacheKey.item);
  }


  /** Clears the 'taxRate' field, the 'has' method for this field will now return false */
  public void clearTaxRate() {
    genClient.clear(CacheKey.taxRate);
  }
  /** Clears the 'item' field, the 'has' method for this field will now return false */
  public void clearItem() {
    genClient.clear(CacheKey.item);
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
  public TaxRateItem copyChanges() {
    TaxRateItem copy = new TaxRateItem();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(TaxRateItem src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new TaxRateItem(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<TaxRateItem> CREATOR = new android.os.Parcelable.Creator<TaxRateItem>() {
    @Override
    public TaxRateItem createFromParcel(android.os.Parcel in) {
      TaxRateItem instance = new TaxRateItem(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public TaxRateItem[] newArray(int size) {
      return new TaxRateItem[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<TaxRateItem> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<TaxRateItem>() {
    @Override
    public TaxRateItem create(org.json.JSONObject jsonObject) {
      return new TaxRateItem(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean TAXRATE_IS_REQUIRED = true;

    public static final boolean ITEM_IS_REQUIRED = true;

  }

}
