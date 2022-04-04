// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/security_requirement.proto

package org.mojolang.mojo.openapi;

/**
 * Protobuf type {@code mojo.openapi.SecurityRequirement}
 */
public final class SecurityRequirement extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.openapi.SecurityRequirement)
    SecurityRequirementOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SecurityRequirement.newBuilder() to construct.
  private SecurityRequirement(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SecurityRequirement() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SecurityRequirement();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SecurityRequirement(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              vals_ = com.google.protobuf.MapField.newMapField(
                  ValsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, org.mojolang.mojo.core.Strings>
            vals__ = input.readMessage(
                ValsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            vals_.getMutableMap().put(
                vals__.getKey(), vals__.getValue());
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mojolang.mojo.openapi.SecurityRequirementProto.internal_static_mojo_openapi_SecurityRequirement_descriptor;
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
    return org.mojolang.mojo.openapi.SecurityRequirementProto.internal_static_mojo_openapi_SecurityRequirement_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.openapi.SecurityRequirement.class, org.mojolang.mojo.openapi.SecurityRequirement.Builder.class);
  }

  public static final int VALS_FIELD_NUMBER = 1;
  private static final class ValsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, org.mojolang.mojo.core.Strings> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, org.mojolang.mojo.core.Strings>newDefaultInstance(
                org.mojolang.mojo.openapi.SecurityRequirementProto.internal_static_mojo_openapi_SecurityRequirement_ValsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                org.mojolang.mojo.core.Strings.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, org.mojolang.mojo.core.Strings> vals_;
  private com.google.protobuf.MapField<java.lang.String, org.mojolang.mojo.core.Strings>
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
   * <code>map&lt;string, .mojo.core.Strings&gt; vals = 1;</code>
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
  public java.util.Map<java.lang.String, org.mojolang.mojo.core.Strings> getVals() {
    return getValsMap();
  }
  /**
   * <code>map&lt;string, .mojo.core.Strings&gt; vals = 1;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, org.mojolang.mojo.core.Strings> getValsMap() {
    return internalGetVals().getMap();
  }
  /**
   * <code>map&lt;string, .mojo.core.Strings&gt; vals = 1;</code>
   */
  @java.lang.Override

  public org.mojolang.mojo.core.Strings getValsOrDefault(
      java.lang.String key,
      org.mojolang.mojo.core.Strings defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, org.mojolang.mojo.core.Strings> map =
        internalGetVals().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .mojo.core.Strings&gt; vals = 1;</code>
   */
  @java.lang.Override

  public org.mojolang.mojo.core.Strings getValsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, org.mojolang.mojo.core.Strings> map =
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, org.mojolang.mojo.core.Strings> entry
         : internalGetVals().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, org.mojolang.mojo.core.Strings>
      vals__ = ValsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, vals__);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.mojolang.mojo.openapi.SecurityRequirement)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.openapi.SecurityRequirement other = (org.mojolang.mojo.openapi.SecurityRequirement) obj;

    if (!internalGetVals().equals(
        other.internalGetVals())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.openapi.SecurityRequirement parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.SecurityRequirement parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.SecurityRequirement parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.SecurityRequirement parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.SecurityRequirement parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.SecurityRequirement parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.SecurityRequirement parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.SecurityRequirement parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.SecurityRequirement parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.SecurityRequirement parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.SecurityRequirement parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.SecurityRequirement parseFrom(
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
  public static Builder newBuilder(org.mojolang.mojo.openapi.SecurityRequirement prototype) {
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
   * Protobuf type {@code mojo.openapi.SecurityRequirement}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.openapi.SecurityRequirement)
      org.mojolang.mojo.openapi.SecurityRequirementOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.openapi.SecurityRequirementProto.internal_static_mojo_openapi_SecurityRequirement_descriptor;
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
      return org.mojolang.mojo.openapi.SecurityRequirementProto.internal_static_mojo_openapi_SecurityRequirement_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.openapi.SecurityRequirement.class, org.mojolang.mojo.openapi.SecurityRequirement.Builder.class);
    }

    // Construct using org.mojolang.mojo.openapi.SecurityRequirement.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableVals().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.openapi.SecurityRequirementProto.internal_static_mojo_openapi_SecurityRequirement_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.SecurityRequirement getDefaultInstanceForType() {
      return org.mojolang.mojo.openapi.SecurityRequirement.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.SecurityRequirement build() {
      org.mojolang.mojo.openapi.SecurityRequirement result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.SecurityRequirement buildPartial() {
      org.mojolang.mojo.openapi.SecurityRequirement result = new org.mojolang.mojo.openapi.SecurityRequirement(this);
      int from_bitField0_ = bitField0_;
      result.vals_ = internalGetVals();
      result.vals_.makeImmutable();
      onBuilt();
      return result;
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
      if (other instanceof org.mojolang.mojo.openapi.SecurityRequirement) {
        return mergeFrom((org.mojolang.mojo.openapi.SecurityRequirement)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.openapi.SecurityRequirement other) {
      if (other == org.mojolang.mojo.openapi.SecurityRequirement.getDefaultInstance()) return this;
      internalGetMutableVals().mergeFrom(
          other.internalGetVals());
      this.mergeUnknownFields(other.unknownFields);
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
      org.mojolang.mojo.openapi.SecurityRequirement parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.mojolang.mojo.openapi.SecurityRequirement) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, org.mojolang.mojo.core.Strings> vals_;
    private com.google.protobuf.MapField<java.lang.String, org.mojolang.mojo.core.Strings>
    internalGetVals() {
      if (vals_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ValsDefaultEntryHolder.defaultEntry);
      }
      return vals_;
    }
    private com.google.protobuf.MapField<java.lang.String, org.mojolang.mojo.core.Strings>
    internalGetMutableVals() {
      onChanged();;
      if (vals_ == null) {
        vals_ = com.google.protobuf.MapField.newMapField(
            ValsDefaultEntryHolder.defaultEntry);
      }
      if (!vals_.isMutable()) {
        vals_ = vals_.copy();
      }
      return vals_;
    }

    public int getValsCount() {
      return internalGetVals().getMap().size();
    }
    /**
     * <code>map&lt;string, .mojo.core.Strings&gt; vals = 1;</code>
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
    public java.util.Map<java.lang.String, org.mojolang.mojo.core.Strings> getVals() {
      return getValsMap();
    }
    /**
     * <code>map&lt;string, .mojo.core.Strings&gt; vals = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, org.mojolang.mojo.core.Strings> getValsMap() {
      return internalGetVals().getMap();
    }
    /**
     * <code>map&lt;string, .mojo.core.Strings&gt; vals = 1;</code>
     */
    @java.lang.Override

    public org.mojolang.mojo.core.Strings getValsOrDefault(
        java.lang.String key,
        org.mojolang.mojo.core.Strings defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, org.mojolang.mojo.core.Strings> map =
          internalGetVals().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .mojo.core.Strings&gt; vals = 1;</code>
     */
    @java.lang.Override

    public org.mojolang.mojo.core.Strings getValsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, org.mojolang.mojo.core.Strings> map =
          internalGetVals().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearVals() {
      internalGetMutableVals().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .mojo.core.Strings&gt; vals = 1;</code>
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
    public java.util.Map<java.lang.String, org.mojolang.mojo.core.Strings>
    getMutableVals() {
      return internalGetMutableVals().getMutableMap();
    }
    /**
     * <code>map&lt;string, .mojo.core.Strings&gt; vals = 1;</code>
     */
    public Builder putVals(
        java.lang.String key,
        org.mojolang.mojo.core.Strings value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableVals().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .mojo.core.Strings&gt; vals = 1;</code>
     */

    public Builder putAllVals(
        java.util.Map<java.lang.String, org.mojolang.mojo.core.Strings> values) {
      internalGetMutableVals().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:mojo.openapi.SecurityRequirement)
  }

  // @@protoc_insertion_point(class_scope:mojo.openapi.SecurityRequirement)
  private static final org.mojolang.mojo.openapi.SecurityRequirement DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.openapi.SecurityRequirement();
  }

  public static org.mojolang.mojo.openapi.SecurityRequirement getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecurityRequirement>
      PARSER = new com.google.protobuf.AbstractParser<SecurityRequirement>() {
    @java.lang.Override
    public SecurityRequirement parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SecurityRequirement(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SecurityRequirement> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecurityRequirement> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.openapi.SecurityRequirement getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

