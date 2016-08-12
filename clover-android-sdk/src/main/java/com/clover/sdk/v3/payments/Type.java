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

import android.os.Parcelable;
import android.os.Parcel;

@SuppressWarnings("all")
public enum Type implements Parcelable {
  TAB, AUTH;

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(final Parcel dest, final int flags) {
    dest.writeString(name());
  }

  public static final Creator<Type> CREATOR = new Creator<Type>() {
    @Override
    public Type createFromParcel(final Parcel source) {
      return Type.valueOf(source.readString());
    }

    @Override
    public Type[] newArray(final int size) {
      return new Type[size];
    }
  };
}
