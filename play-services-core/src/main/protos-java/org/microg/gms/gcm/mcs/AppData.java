// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: protos-repo/mcs.proto
package org.microg.gms.gcm.mcs;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.REQUIRED;

public final class AppData extends Message {

  public static final String DEFAULT_KEY = "";
  public static final String DEFAULT_VALUE = "";

  @ProtoField(tag = 1, type = STRING, label = REQUIRED)
  public final String key;

  @ProtoField(tag = 2, type = STRING, label = REQUIRED)
  public final String value;

  public AppData(String key, String value) {
    this.key = key;
    this.value = value;
  }

  private AppData(Builder builder) {
    this(builder.key, builder.value);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AppData)) return false;
    AppData o = (AppData) other;
    return equals(key, o.key)
        && equals(value, o.value);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = key != null ? key.hashCode() : 0;
      result = result * 37 + (value != null ? value.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<AppData> {

    public String key;
    public String value;

    public Builder() {
    }

    public Builder(AppData message) {
      super(message);
      if (message == null) return;
      this.key = message.key;
      this.value = message.value;
    }

    public Builder key(String key) {
      this.key = key;
      return this;
    }

    public Builder value(String value) {
      this.value = value;
      return this;
    }

    @Override
    public AppData build() {
      checkRequiredFields();
      return new AppData(this);
    }
  }
}
