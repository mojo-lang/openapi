// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/openapi.proto

package org.mojolang.mojo.openapi;

/**
 * Protobuf type {@code mojo.openapi.Responses}
 */
public final class Responses extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.openapi.Responses)
    ResponsesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Responses.newBuilder() to construct.
  private Responses(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Responses() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Responses();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_Responses_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetVals();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_Responses_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.openapi.Responses.class, org.mojolang.mojo.openapi.Responses.Builder.class);
  }

  public static final int VALS_FIELD_NUMBER = 1;
  private static final class ValsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, org.mojolang.mojo.openapi.ReferenceableResponse> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, org.mojolang.mojo.openapi.ReferenceableResponse>newDefaultInstance(
                org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_Responses_ValsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                org.mojolang.mojo.openapi.ReferenceableResponse.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, org.mojolang.mojo.openapi.ReferenceableResponse> vals_;
  private com.google.protobuf.MapField<java.lang.String, org.mojolang.mojo.openapi.ReferenceableResponse>
  internalGetVals() {
    if (vals_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ValsDefaultEntryHolder.defaultEntry);
    }
    return vals_;
  }
  public int getValsCount() {
    return internalGetVals().getMap().size();
  }
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableResponse&gt; vals = 1;</code>
   */
  @java.lang.Override
  public boolean containsVals(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetVals().getMap().containsKey(key);
  }
  /**
   * Use {@link #getValsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableResponse> getVals() {
    return getValsMap();
  }
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableResponse&gt; vals = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableResponse> getValsMap() {
    return internalGetVals().getMap();
  }
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableResponse&gt; vals = 1;</code>
   */
  @java.lang.Override
  public /* nullable */
org.mojolang.mojo.openapi.ReferenceableResponse getValsOrDefault(
      java.lang.String key,
      /* nullable */
org.mojolang.mojo.openapi.ReferenceableResponse defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableResponse> map =
        internalGetVals().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableResponse&gt; vals = 1;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.openapi.ReferenceableResponse getValsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableResponse> map =
        internalGetVals().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetVals(),
        ValsDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, org.mojolang.mojo.openapi.ReferenceableResponse> entry
         : internalGetVals().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, org.mojolang.mojo.openapi.ReferenceableResponse>
      vals__ = ValsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, vals__);
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
    if (!(obj instanceof org.mojolang.mojo.openapi.Responses)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.openapi.Responses other = (org.mojolang.mojo.openapi.Responses) obj;

    if (!internalGetVals().equals(
        other.internalGetVals())) return false;
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
    if (!internalGetVals().getMap().isEmpty()) {
      hash = (37 * hash) + VALS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetVals().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.openapi.Responses parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.Responses parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Responses parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.Responses parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Responses parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.Responses parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Responses parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.Responses parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Responses parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.Responses parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Responses parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.Responses parseFrom(
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
  public static Builder newBuilder(org.mojolang.mojo.openapi.Responses prototype) {
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
   * Protobuf type {@code mojo.openapi.Responses}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.openapi.Responses)
      org.mojolang.mojo.openapi.ResponsesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_Responses_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetVals();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableVals();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_Responses_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.openapi.Responses.class, org.mojolang.mojo.openapi.Responses.Builder.class);
    }

    // Construct using org.mojolang.mojo.openapi.Responses.newBuilder()
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
      internalGetMutableVals().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_Responses_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.Responses getDefaultInstanceForType() {
      return org.mojolang.mojo.openapi.Responses.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.Responses build() {
      org.mojolang.mojo.openapi.Responses result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.Responses buildPartial() {
      org.mojolang.mojo.openapi.Responses result = new org.mojolang.mojo.openapi.Responses(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.mojolang.mojo.openapi.Responses result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.vals_ = internalGetVals();
        result.vals_.makeImmutable();
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
      if (other instanceof org.mojolang.mojo.openapi.Responses) {
        return mergeFrom((org.mojolang.mojo.openapi.Responses)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.openapi.Responses other) {
      if (other == org.mojolang.mojo.openapi.Responses.getDefaultInstance()) return this;
      internalGetMutableVals().mergeFrom(
          other.internalGetVals());
      bitField0_ |= 0x00000001;
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
              com.google.protobuf.MapEntry<java.lang.String, org.mojolang.mojo.openapi.ReferenceableResponse>
              vals__ = input.readMessage(
                  ValsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableVals().getMutableMap().put(
                  vals__.getKey(), vals__.getValue());
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.google.protobuf.MapField<
        java.lang.String, org.mojolang.mojo.openapi.ReferenceableResponse> vals_;
    private com.google.protobuf.MapField<java.lang.String, org.mojolang.mojo.openapi.ReferenceableResponse>
        internalGetVals() {
      if (vals_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ValsDefaultEntryHolder.defaultEntry);
      }
      return vals_;
    }
    private com.google.protobuf.MapField<java.lang.String, org.mojolang.mojo.openapi.ReferenceableResponse>
        internalGetMutableVals() {
      if (vals_ == null) {
        vals_ = com.google.protobuf.MapField.newMapField(
            ValsDefaultEntryHolder.defaultEntry);
      }
      if (!vals_.isMutable()) {
        vals_ = vals_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return vals_;
    }
    public int getValsCount() {
      return internalGetVals().getMap().size();
    }
    /**
     * <code>map&lt;string, .mojo.openapi.ReferenceableResponse&gt; vals = 1;</code>
     */
    @java.lang.Override
    public boolean containsVals(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetVals().getMap().containsKey(key);
    }
    /**
     * Use {@link #getValsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableResponse> getVals() {
      return getValsMap();
    }
    /**
     * <code>map&lt;string, .mojo.openapi.ReferenceableResponse&gt; vals = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableResponse> getValsMap() {
      return internalGetVals().getMap();
    }
    /**
     * <code>map&lt;string, .mojo.openapi.ReferenceableResponse&gt; vals = 1;</code>
     */
    @java.lang.Override
    public /* nullable */
org.mojolang.mojo.openapi.ReferenceableResponse getValsOrDefault(
        java.lang.String key,
        /* nullable */
org.mojolang.mojo.openapi.ReferenceableResponse defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableResponse> map =
          internalGetVals().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .mojo.openapi.ReferenceableResponse&gt; vals = 1;</code>
     */
    @java.lang.Override
    public org.mojolang.mojo.openapi.ReferenceableResponse getValsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableResponse> map =
          internalGetVals().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearVals() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableVals().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .mojo.openapi.ReferenceableResponse&gt; vals = 1;</code>
     */
    public Builder removeVals(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableVals().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableResponse>
        getMutableVals() {
      bitField0_ |= 0x00000001;
      return internalGetMutableVals().getMutableMap();
    }
    /**
     * <code>map&lt;string, .mojo.openapi.ReferenceableResponse&gt; vals = 1;</code>
     */
    public Builder putVals(
        java.lang.String key,
        org.mojolang.mojo.openapi.ReferenceableResponse value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableVals().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>map&lt;string, .mojo.openapi.ReferenceableResponse&gt; vals = 1;</code>
     */
    public Builder putAllVals(
        java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableResponse> values) {
      internalGetMutableVals().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
      return this;
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


    // @@protoc_insertion_point(builder_scope:mojo.openapi.Responses)
  }

  // @@protoc_insertion_point(class_scope:mojo.openapi.Responses)
  private static final org.mojolang.mojo.openapi.Responses DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.openapi.Responses();
  }

  public static org.mojolang.mojo.openapi.Responses getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Responses>
      PARSER = new com.google.protobuf.AbstractParser<Responses>() {
    @java.lang.Override
    public Responses parsePartialFrom(
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

  public static com.google.protobuf.Parser<Responses> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Responses> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.openapi.Responses getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

