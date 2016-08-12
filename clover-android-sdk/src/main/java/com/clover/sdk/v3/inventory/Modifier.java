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
public final class Modifier implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

 /**
  * Unique identifier
  */
  public String getId() {
    return genClient.cacheGet(CacheKey.id);
  }
 /**
  * Name of the modifier
  */
  public String getName() {
    return genClient.cacheGet(CacheKey.name);
  }
 /**
  * Alternate name of the modifier
  */
  public String getAlternateName() {
    return genClient.cacheGet(CacheKey.alternateName);
  }
  public Long getPrice() {
    return genClient.cacheGet(CacheKey.price);
  }
  public com.clover.sdk.v3.base.Reference getModifierGroup() {
    return genClient.cacheGet(CacheKey.modifierGroup);
  }


  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Modifier> {
    id {
      @Override
      public Object extractValue(Modifier instance) {
        return instance.genClient.extractOther("id", String.class);
      }
    },
    name {
      @Override
      public Object extractValue(Modifier instance) {
        return instance.genClient.extractOther("name", String.class);
      }
    },
    alternateName {
      @Override
      public Object extractValue(Modifier instance) {
        return instance.genClient.extractOther("alternateName", String.class);
      }
    },
    price {
      @Override
      public Object extractValue(Modifier instance) {
        return instance.genClient.extractOther("price", Long.class);
      }
    },
    modifierGroup {
      @Override
      public Object extractValue(Modifier instance) {
        return instance.genClient.extractRecord("modifierGroup", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    ;
  }

  private GenericClient<Modifier> genClient = new GenericClient<Modifier>(this);

  /**
   * Constructs a new empty instance.
   */
  public Modifier() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Modifier(String json) throws IllegalArgumentException {
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
  public Modifier(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Modifier(Modifier src) {
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

    genClient.validateNull(getName(), "name");
    genClient.validateLength(getName(), 255);

    genClient.validateLength(getAlternateName(), 255);

    genClient.validateNull(getPrice(), "price");
    if (getPrice() != null && ( getPrice() < 0)) throw new IllegalArgumentException("Invalid value for 'getPrice()'");
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'alternateName' field is set and is not null */
  public boolean isNotNullAlternateName() {
    return genClient.cacheValueIsNotNull(CacheKey.alternateName);
  }

  /** Checks whether the 'price' field is set and is not null */
  public boolean isNotNullPrice() {
    return genClient.cacheValueIsNotNull(CacheKey.price);
  }

  /** Checks whether the 'modifierGroup' field is set and is not null */
  public boolean isNotNullModifierGroup() {
    return genClient.cacheValueIsNotNull(CacheKey.modifierGroup);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'alternateName' field has been set, however the value could be null */
  public boolean hasAlternateName() {
    return genClient.cacheHasKey(CacheKey.alternateName);
  }

  /** Checks whether the 'price' field has been set, however the value could be null */
  public boolean hasPrice() {
    return genClient.cacheHasKey(CacheKey.price);
  }

  /** Checks whether the 'modifierGroup' field has been set, however the value could be null */
  public boolean hasModifierGroup() {
    return genClient.cacheHasKey(CacheKey.modifierGroup);
  }


  /**
   * Sets the field 'id'.
   */
  public Modifier setId(String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'name'.
   */
  public Modifier setName(String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'alternateName'.
   */
  public Modifier setAlternateName(String alternateName) {
    return genClient.setOther(alternateName, CacheKey.alternateName);
  }

  /**
   * Sets the field 'price'.
   */
  public Modifier setPrice(Long price) {
    return genClient.setOther(price, CacheKey.price);
  }

  /**
   * Sets the field 'modifierGroup'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Modifier setModifierGroup(com.clover.sdk.v3.base.Reference modifierGroup) {
    return genClient.setRecord(modifierGroup, CacheKey.modifierGroup);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'alternateName' field, the 'has' method for this field will now return false */
  public void clearAlternateName() {
    genClient.clear(CacheKey.alternateName);
  }
  /** Clears the 'price' field, the 'has' method for this field will now return false */
  public void clearPrice() {
    genClient.clear(CacheKey.price);
  }
  /** Clears the 'modifierGroup' field, the 'has' method for this field will now return false */
  public void clearModifierGroup() {
    genClient.clear(CacheKey.modifierGroup);
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
  public Modifier copyChanges() {
    Modifier copy = new Modifier();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Modifier src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Modifier(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<Modifier> CREATOR = new android.os.Parcelable.Creator<Modifier>() {
    @Override
    public Modifier createFromParcel(android.os.Parcel in) {
      Modifier instance = new Modifier(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Modifier[] newArray(int size) {
      return new Modifier[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Modifier> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Modifier>() {
    @Override
    public Modifier create(org.json.JSONObject jsonObject) {
      return new Modifier(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean NAME_IS_REQUIRED = true;
    public static final long NAME_MAX_LEN = 255;

    public static final boolean ALTERNATENAME_IS_REQUIRED = false;
    public static final long ALTERNATENAME_MAX_LEN = 255;

    public static final boolean PRICE_IS_REQUIRED = true;
    public static final long PRICE_MIN = 0;

    public static final boolean MODIFIERGROUP_IS_REQUIRED = false;

  }

}
