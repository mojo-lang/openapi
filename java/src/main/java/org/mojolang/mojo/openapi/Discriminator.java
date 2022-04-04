// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/discriminator.proto

package org.mojolang.mojo.openapi;

/**
 * Protobuf type {@code mojo.openapi.Discriminator}
 */
public final class Discriminator extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.openapi.Discriminator)
    DiscriminatorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Discriminator.newBuilder() to construct.
  private Discriminator(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Discriminator() {
    propertyName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Discriminator();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Discriminator(
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
            java.lang.String s = input.readStringRequireUtf8();

            propertyName_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              mapping_ = com.google.protobuf.MapField.newMapField(
                  MappingDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            mapping__ = input.readMessage(
                MappingDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            mapping_.getMutableMap().put(
                mapping__.getKey(), mapping__.getValue());
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
    return org.mojolang.mojo.openapi.DiscriminatorProto.internal_static_mojo_openapi_Discriminator_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetMapping();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.openapi.DiscriminatorProto.internal_static_mojo_openapi_Discriminator_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.openapi.Discriminator.class, org.mojolang.mojo.openapi.Discriminator.Builder.class);
  }

  public static final int PROPERTY_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object propertyName_;
  /**
   * <code>string property_name = 1;</code>
   * @return The propertyName.
   */
  @java.lang.Override
  public java.lang.String getPropertyName() {
    java.lang.Object ref = propertyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      propertyName_ = s;
      return s;
    }
  }
  /**
   * <code>string property_name = 1;</code>
   * @return The bytes for propertyName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPropertyNameBytes() {
    java.lang.Object ref = propertyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      propertyName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAPPING_FIELD_NUMBER = 2;
  private static final class MappingDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                org.mojolang.mojo.openapi.DiscriminatorProto.internal_static_mojo_openapi_Discriminator_MappingEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> mapping_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetMapping() {
    if (mapping_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          MappingDefaultEntryHolder.defaultEntry);
    }
    return mapping_;
  }

  public int getMappingCount() {
    return internalGetMapping().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; mapping = 2;</code>
   */

  @java.lang.Override
  public boolean containsMapping(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetMapping().getMap().containsKey(key);
  }
  /**
   * Use {@link #getMappingMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getMapping() {
    return getMappingMap();
  }
  /**
   * <code>map&lt;string, string&gt; mapping = 2;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getMappingMap() {
    return internalGetMapping().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; mapping = 2;</code>
   */
  @java.lang.Override

  public java.lang.String getMappingOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetMapping().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; mapping = 2;</code>
   */
  @java.lang.Override

  public java.lang.String getMappingOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetMapping().getMap();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(propertyName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, propertyName_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetMapping(),
        MappingDefaultEntryHolder.defaultEntry,
        2);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(propertyName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, propertyName_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetMapping().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      mapping__ = MappingDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, mapping__);
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
    if (!(obj instanceof org.mojolang.mojo.openapi.Discriminator)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.openapi.Discriminator other = (org.mojolang.mojo.openapi.Discriminator) obj;

    if (!getPropertyName()
        .equals(other.getPropertyName())) return false;
    if (!internalGetMapping().equals(
        other.internalGetMapping())) return false;
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
    hash = (37 * hash) + PROPERTY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPropertyName().hashCode();
    if (!internalGetMapping().getMap().isEmpty()) {
      hash = (37 * hash) + MAPPING_FIELD_NUMBER;
      hash = (53 * hash) + internalGetMapping().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.openapi.Discriminator parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.Discriminator parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Discriminator parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.Discriminator parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Discriminator parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.Discriminator parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Discriminator parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.Discriminator parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Discriminator parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.Discriminator parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Discriminator parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.Discriminator parseFrom(
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
  public static Builder newBuilder(org.mojolang.mojo.openapi.Discriminator prototype) {
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
   * Protobuf type {@code mojo.openapi.Discriminator}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.openapi.Discriminator)
      org.mojolang.mojo.openapi.DiscriminatorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.openapi.DiscriminatorProto.internal_static_mojo_openapi_Discriminator_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMapping();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableMapping();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.openapi.DiscriminatorProto.internal_static_mojo_openapi_Discriminator_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.openapi.Discriminator.class, org.mojolang.mojo.openapi.Discriminator.Builder.class);
    }

    // Construct using org.mojolang.mojo.openapi.Discriminator.newBuilder()
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
      propertyName_ = "";

      internalGetMutableMapping().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.openapi.DiscriminatorProto.internal_static_mojo_openapi_Discriminator_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.Discriminator getDefaultInstanceForType() {
      return org.mojolang.mojo.openapi.Discriminator.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.Discriminator build() {
      org.mojolang.mojo.openapi.Discriminator result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.Discriminator buildPartial() {
      org.mojolang.mojo.openapi.Discriminator result = new org.mojolang.mojo.openapi.Discriminator(this);
      int from_bitField0_ = bitField0_;
      result.propertyName_ = propertyName_;
      result.mapping_ = internalGetMapping();
      result.mapping_.makeImmutable();
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
      if (other instanceof org.mojolang.mojo.openapi.Discriminator) {
        return mergeFrom((org.mojolang.mojo.openapi.Discriminator)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.openapi.Discriminator other) {
      if (other == org.mojolang.mojo.openapi.Discriminator.getDefaultInstance()) return this;
      if (!other.getPropertyName().isEmpty()) {
        propertyName_ = other.propertyName_;
        onChanged();
      }
      internalGetMutableMapping().mergeFrom(
          other.internalGetMapping());
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
      org.mojolang.mojo.openapi.Discriminator parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.mojolang.mojo.openapi.Discriminator) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object propertyName_ = "";
    /**
     * <code>string property_name = 1;</code>
     * @return The propertyName.
     */
    public java.lang.String getPropertyName() {
      java.lang.Object ref = propertyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        propertyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string property_name = 1;</code>
     * @return The bytes for propertyName.
     */
    public com.google.protobuf.ByteString
        getPropertyNameBytes() {
      java.lang.Object ref = propertyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        propertyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string property_name = 1;</code>
     * @param value The propertyName to set.
     * @return This builder for chaining.
     */
    public Builder setPropertyName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      propertyName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string property_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPropertyName() {
      
      propertyName_ = getDefaultInstance().getPropertyName();
      onChanged();
      return this;
    }
    /**
     * <code>string property_name = 1;</code>
     * @param value The bytes for propertyName to set.
     * @return This builder for chaining.
     */
    public Builder setPropertyNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      propertyName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> mapping_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMapping() {
      if (mapping_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            MappingDefaultEntryHolder.defaultEntry);
      }
      return mapping_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableMapping() {
      onChanged();;
      if (mapping_ == null) {
        mapping_ = com.google.protobuf.MapField.newMapField(
            MappingDefaultEntryHolder.defaultEntry);
      }
      if (!mapping_.isMutable()) {
        mapping_ = mapping_.copy();
      }
      return mapping_;
    }

    public int getMappingCount() {
      return internalGetMapping().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; mapping = 2;</code>
     */

    @java.lang.Override
    public boolean containsMapping(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetMapping().getMap().containsKey(key);
    }
    /**
     * Use {@link #getMappingMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMapping() {
      return getMappingMap();
    }
    /**
     * <code>map&lt;string, string&gt; mapping = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getMappingMap() {
      return internalGetMapping().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; mapping = 2;</code>
     */
    @java.lang.Override

    public java.lang.String getMappingOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetMapping().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; mapping = 2;</code>
     */
    @java.lang.Override

    public java.lang.String getMappingOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetMapping().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearMapping() {
      internalGetMutableMapping().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; mapping = 2;</code>
     */

    public Builder removeMapping(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableMapping().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableMapping() {
      return internalGetMutableMapping().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; mapping = 2;</code>
     */
    public Builder putMapping(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableMapping().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; mapping = 2;</code>
     */

    public Builder putAllMapping(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableMapping().getMutableMap()
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


    // @@protoc_insertion_point(builder_scope:mojo.openapi.Discriminator)
  }

  // @@protoc_insertion_point(class_scope:mojo.openapi.Discriminator)
  private static final org.mojolang.mojo.openapi.Discriminator DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.openapi.Discriminator();
  }

  public static org.mojolang.mojo.openapi.Discriminator getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Discriminator>
      PARSER = new com.google.protobuf.AbstractParser<Discriminator>() {
    @java.lang.Override
    public Discriminator parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Discriminator(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Discriminator> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Discriminator> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.openapi.Discriminator getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

