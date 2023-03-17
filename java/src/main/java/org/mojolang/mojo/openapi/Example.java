// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/example.proto

package org.mojolang.mojo.openapi;

/**
 * Protobuf type {@code mojo.openapi.Example}
 */
public final class Example extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.openapi.Example)
    ExampleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Example.newBuilder() to construct.
  private Example(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Example() {
    summary_ = "";
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Example();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mojolang.mojo.openapi.ExampleProto.internal_static_mojo_openapi_Example_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.openapi.ExampleProto.internal_static_mojo_openapi_Example_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.openapi.Example.class, org.mojolang.mojo.openapi.Example.Builder.class);
  }

  public static final int SUMMARY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object summary_ = "";
  /**
   * <code>string summary = 1;</code>
   * @return The summary.
   */
  @java.lang.Override
  public java.lang.String getSummary() {
    java.lang.Object ref = summary_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      summary_ = s;
      return s;
    }
  }
  /**
   * <code>string summary = 1;</code>
   * @return The bytes for summary.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSummaryBytes() {
    java.lang.Object ref = summary_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      summary_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <code>string description = 2;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private org.mojolang.mojo.core.Value value_;
  /**
   * <code>.mojo.core.Value value = 3;</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return value_ != null;
  }
  /**
   * <code>.mojo.core.Value value = 3;</code>
   * @return The value.
   */
  @java.lang.Override
  public org.mojolang.mojo.core.Value getValue() {
    return value_ == null ? org.mojolang.mojo.core.Value.getDefaultInstance() : value_;
  }
  /**
   * <code>.mojo.core.Value value = 3;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.core.ValueOrBuilder getValueOrBuilder() {
    return value_ == null ? org.mojolang.mojo.core.Value.getDefaultInstance() : value_;
  }

  public static final int EXTERNAL_VALUE_FIELD_NUMBER = 4;
  private org.mojolang.mojo.core.Url externalValue_;
  /**
   * <code>.mojo.core.Url external_value = 4;</code>
   * @return Whether the externalValue field is set.
   */
  @java.lang.Override
  public boolean hasExternalValue() {
    return externalValue_ != null;
  }
  /**
   * <code>.mojo.core.Url external_value = 4;</code>
   * @return The externalValue.
   */
  @java.lang.Override
  public org.mojolang.mojo.core.Url getExternalValue() {
    return externalValue_ == null ? org.mojolang.mojo.core.Url.getDefaultInstance() : externalValue_;
  }
  /**
   * <code>.mojo.core.Url external_value = 4;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.core.UrlOrBuilder getExternalValueOrBuilder() {
    return externalValue_ == null ? org.mojolang.mojo.core.Url.getDefaultInstance() : externalValue_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(summary_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, summary_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (value_ != null) {
      output.writeMessage(3, getValue());
    }
    if (externalValue_ != null) {
      output.writeMessage(4, getExternalValue());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(summary_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, summary_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (value_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getValue());
    }
    if (externalValue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getExternalValue());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.mojolang.mojo.openapi.Example)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.openapi.Example other = (org.mojolang.mojo.openapi.Example) obj;

    if (!getSummary()
        .equals(other.getSummary())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
    }
    if (hasExternalValue() != other.hasExternalValue()) return false;
    if (hasExternalValue()) {
      if (!getExternalValue()
          .equals(other.getExternalValue())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SUMMARY_FIELD_NUMBER;
    hash = (53 * hash) + getSummary().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    if (hasExternalValue()) {
      hash = (37 * hash) + EXTERNAL_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getExternalValue().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.openapi.Example parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.Example parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Example parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.Example parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Example parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.Example parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Example parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.Example parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Example parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.Example parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Example parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.Example parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.mojolang.mojo.openapi.Example prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code mojo.openapi.Example}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.openapi.Example)
      org.mojolang.mojo.openapi.ExampleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.openapi.ExampleProto.internal_static_mojo_openapi_Example_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.openapi.ExampleProto.internal_static_mojo_openapi_Example_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.openapi.Example.class, org.mojolang.mojo.openapi.Example.Builder.class);
    }

    // Construct using org.mojolang.mojo.openapi.Example.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      summary_ = "";
      description_ = "";
      value_ = null;
      if (valueBuilder_ != null) {
        valueBuilder_.dispose();
        valueBuilder_ = null;
      }
      externalValue_ = null;
      if (externalValueBuilder_ != null) {
        externalValueBuilder_.dispose();
        externalValueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.openapi.ExampleProto.internal_static_mojo_openapi_Example_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.Example getDefaultInstanceForType() {
      return org.mojolang.mojo.openapi.Example.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.Example build() {
      org.mojolang.mojo.openapi.Example result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.Example buildPartial() {
      org.mojolang.mojo.openapi.Example result = new org.mojolang.mojo.openapi.Example(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.mojolang.mojo.openapi.Example result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.summary_ = summary_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.value_ = valueBuilder_ == null
            ? value_
            : valueBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.externalValue_ = externalValueBuilder_ == null
            ? externalValue_
            : externalValueBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.mojolang.mojo.openapi.Example) {
        return mergeFrom((org.mojolang.mojo.openapi.Example)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.openapi.Example other) {
      if (other == org.mojolang.mojo.openapi.Example.getDefaultInstance()) return this;
      if (!other.getSummary().isEmpty()) {
        summary_ = other.summary_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
      }
      if (other.hasExternalValue()) {
        mergeExternalValue(other.getExternalValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              summary_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              description_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getValueFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getExternalValueFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object summary_ = "";
    /**
     * <code>string summary = 1;</code>
     * @return The summary.
     */
    public java.lang.String getSummary() {
      java.lang.Object ref = summary_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        summary_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string summary = 1;</code>
     * @return The bytes for summary.
     */
    public com.google.protobuf.ByteString
        getSummaryBytes() {
      java.lang.Object ref = summary_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        summary_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string summary = 1;</code>
     * @param value The summary to set.
     * @return This builder for chaining.
     */
    public Builder setSummary(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      summary_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string summary = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSummary() {
      summary_ = getDefaultInstance().getSummary();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string summary = 1;</code>
     * @param value The bytes for summary to set.
     * @return This builder for chaining.
     */
    public Builder setSummaryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      summary_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 2;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 2;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 2;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string description = 2;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private org.mojolang.mojo.core.Value value_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.core.Value, org.mojolang.mojo.core.Value.Builder, org.mojolang.mojo.core.ValueOrBuilder> valueBuilder_;
    /**
     * <code>.mojo.core.Value value = 3;</code>
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.mojo.core.Value value = 3;</code>
     * @return The value.
     */
    public org.mojolang.mojo.core.Value getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? org.mojolang.mojo.core.Value.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     * <code>.mojo.core.Value value = 3;</code>
     */
    public Builder setValue(org.mojolang.mojo.core.Value value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
      } else {
        valueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Value value = 3;</code>
     */
    public Builder setValue(
        org.mojolang.mojo.core.Value.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Value value = 3;</code>
     */
    public Builder mergeValue(org.mojolang.mojo.core.Value value) {
      if (valueBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          value_ != null &&
          value_ != org.mojolang.mojo.core.Value.getDefaultInstance()) {
          getValueBuilder().mergeFrom(value);
        } else {
          value_ = value;
        }
      } else {
        valueBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Value value = 3;</code>
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000004);
      value_ = null;
      if (valueBuilder_ != null) {
        valueBuilder_.dispose();
        valueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Value value = 3;</code>
     */
    public org.mojolang.mojo.core.Value.Builder getValueBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.core.Value value = 3;</code>
     */
    public org.mojolang.mojo.core.ValueOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ?
            org.mojolang.mojo.core.Value.getDefaultInstance() : value_;
      }
    }
    /**
     * <code>.mojo.core.Value value = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.core.Value, org.mojolang.mojo.core.Value.Builder, org.mojolang.mojo.core.ValueOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojolang.mojo.core.Value, org.mojolang.mojo.core.Value.Builder, org.mojolang.mojo.core.ValueOrBuilder>(
                getValue(),
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      return valueBuilder_;
    }

    private org.mojolang.mojo.core.Url externalValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.core.Url, org.mojolang.mojo.core.Url.Builder, org.mojolang.mojo.core.UrlOrBuilder> externalValueBuilder_;
    /**
     * <code>.mojo.core.Url external_value = 4;</code>
     * @return Whether the externalValue field is set.
     */
    public boolean hasExternalValue() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.mojo.core.Url external_value = 4;</code>
     * @return The externalValue.
     */
    public org.mojolang.mojo.core.Url getExternalValue() {
      if (externalValueBuilder_ == null) {
        return externalValue_ == null ? org.mojolang.mojo.core.Url.getDefaultInstance() : externalValue_;
      } else {
        return externalValueBuilder_.getMessage();
      }
    }
    /**
     * <code>.mojo.core.Url external_value = 4;</code>
     */
    public Builder setExternalValue(org.mojolang.mojo.core.Url value) {
      if (externalValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        externalValue_ = value;
      } else {
        externalValueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Url external_value = 4;</code>
     */
    public Builder setExternalValue(
        org.mojolang.mojo.core.Url.Builder builderForValue) {
      if (externalValueBuilder_ == null) {
        externalValue_ = builderForValue.build();
      } else {
        externalValueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Url external_value = 4;</code>
     */
    public Builder mergeExternalValue(org.mojolang.mojo.core.Url value) {
      if (externalValueBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          externalValue_ != null &&
          externalValue_ != org.mojolang.mojo.core.Url.getDefaultInstance()) {
          getExternalValueBuilder().mergeFrom(value);
        } else {
          externalValue_ = value;
        }
      } else {
        externalValueBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Url external_value = 4;</code>
     */
    public Builder clearExternalValue() {
      bitField0_ = (bitField0_ & ~0x00000008);
      externalValue_ = null;
      if (externalValueBuilder_ != null) {
        externalValueBuilder_.dispose();
        externalValueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Url external_value = 4;</code>
     */
    public org.mojolang.mojo.core.Url.Builder getExternalValueBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getExternalValueFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.core.Url external_value = 4;</code>
     */
    public org.mojolang.mojo.core.UrlOrBuilder getExternalValueOrBuilder() {
      if (externalValueBuilder_ != null) {
        return externalValueBuilder_.getMessageOrBuilder();
      } else {
        return externalValue_ == null ?
            org.mojolang.mojo.core.Url.getDefaultInstance() : externalValue_;
      }
    }
    /**
     * <code>.mojo.core.Url external_value = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.core.Url, org.mojolang.mojo.core.Url.Builder, org.mojolang.mojo.core.UrlOrBuilder> 
        getExternalValueFieldBuilder() {
      if (externalValueBuilder_ == null) {
        externalValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojolang.mojo.core.Url, org.mojolang.mojo.core.Url.Builder, org.mojolang.mojo.core.UrlOrBuilder>(
                getExternalValue(),
                getParentForChildren(),
                isClean());
        externalValue_ = null;
      }
      return externalValueBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:mojo.openapi.Example)
  }

  // @@protoc_insertion_point(class_scope:mojo.openapi.Example)
  private static final org.mojolang.mojo.openapi.Example DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.openapi.Example();
  }

  public static org.mojolang.mojo.openapi.Example getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Example>
      PARSER = new com.google.protobuf.AbstractParser<Example>() {
    @java.lang.Override
    public Example parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Example> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Example> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.openapi.Example getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

