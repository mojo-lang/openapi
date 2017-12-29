// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/openapi.proto

package org.mojolang.mojo.openapi;

/**
 * Protobuf type {@code mojo.openapi.Paths}
 */
public final class Paths extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.openapi.Paths)
    PathsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Paths.newBuilder() to construct.
  private Paths(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Paths() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Paths();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Paths(
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
              values_ = com.google.protobuf.MapField.newMapField(
                  ValuesDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, org.mojolang.mojo.openapi.PathItem>
            values__ = input.readMessage(
                ValuesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            values_.getMutableMap().put(
                values__.getKey(), values__.getValue());
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
    return org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_Paths_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetValues();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_Paths_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.openapi.Paths.class, org.mojolang.mojo.openapi.Paths.Builder.class);
  }

  public static final int VALUES_FIELD_NUMBER = 1;
  private static final class ValuesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, org.mojolang.mojo.openapi.PathItem> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, org.mojolang.mojo.openapi.PathItem>newDefaultInstance(
                org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_Paths_ValuesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                org.mojolang.mojo.openapi.PathItem.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, org.mojolang.mojo.openapi.PathItem> values_;
  private com.google.protobuf.MapField<java.lang.String, org.mojolang.mojo.openapi.PathItem>
  internalGetValues() {
    if (values_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ValuesDefaultEntryHolder.defaultEntry);
    }
    return values_;
  }

  public int getValuesCount() {
    return internalGetValues().getMap().size();
  }
  /**
   * <code>map&lt;string, .mojo.openapi.PathItem&gt; values = 1;</code>
   */

  @java.lang.Override
  public boolean containsValues(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetValues().getMap().containsKey(key);
  }
  /**
   * Use {@link #getValuesMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, org.mojolang.mojo.openapi.PathItem> getValues() {
    return getValuesMap();
  }
  /**
   * <code>map&lt;string, .mojo.openapi.PathItem&gt; values = 1;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, org.mojolang.mojo.openapi.PathItem> getValuesMap() {
    return internalGetValues().getMap();
  }
  /**
   * <code>map&lt;string, .mojo.openapi.PathItem&gt; values = 1;</code>
   */
  @java.lang.Override

  public org.mojolang.mojo.openapi.PathItem getValuesOrDefault(
      java.lang.String key,
      org.mojolang.mojo.openapi.PathItem defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, org.mojolang.mojo.openapi.PathItem> map =
        internalGetValues().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .mojo.openapi.PathItem&gt; values = 1;</code>
   */
  @java.lang.Override

  public org.mojolang.mojo.openapi.PathItem getValuesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, org.mojolang.mojo.openapi.PathItem> map =
        internalGetValues().getMap();
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
        internalGetValues(),
        ValuesDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, org.mojolang.mojo.openapi.PathItem> entry
         : internalGetValues().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, org.mojolang.mojo.openapi.PathItem>
      values__ = ValuesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, values__);
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
    if (!(obj instanceof org.mojolang.mojo.openapi.Paths)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.openapi.Paths other = (org.mojolang.mojo.openapi.Paths) obj;

    if (!internalGetValues().equals(
        other.internalGetValues())) return false;
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
    if (!internalGetValues().getMap().isEmpty()) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetValues().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.openapi.Paths parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.Paths parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Paths parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.Paths parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Paths parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.Paths parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Paths parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.Paths parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Paths parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.Paths parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Paths parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.Paths parseFrom(
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
  public static Builder newBuilder(org.mojolang.mojo.openapi.Paths prototype) {
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
   * Protobuf type {@code mojo.openapi.Paths}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.openapi.Paths)
      org.mojolang.mojo.openapi.PathsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_Paths_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetValues();
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
          return internalGetMutableValues();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_Paths_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.openapi.Paths.class, org.mojolang.mojo.openapi.Paths.Builder.class);
    }

    // Construct using org.mojolang.mojo.openapi.Paths.newBuilder()
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
      internalGetMutableValues().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_Paths_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.Paths getDefaultInstanceForType() {
      return org.mojolang.mojo.openapi.Paths.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.Paths build() {
      org.mojolang.mojo.openapi.Paths result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.Paths buildPartial() {
      org.mojolang.mojo.openapi.Paths result = new org.mojolang.mojo.openapi.Paths(this);
      int from_bitField0_ = bitField0_;
      result.values_ = internalGetValues();
      result.values_.makeImmutable();
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
      if (other instanceof org.mojolang.mojo.openapi.Paths) {
        return mergeFrom((org.mojolang.mojo.openapi.Paths)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.openapi.Paths other) {
      if (other == org.mojolang.mojo.openapi.Paths.getDefaultInstance()) return this;
      internalGetMutableValues().mergeFrom(
          other.internalGetValues());
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
      org.mojolang.mojo.openapi.Paths parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.mojolang.mojo.openapi.Paths) e.getUnfinishedMessage();
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
        java.lang.String, org.mojolang.mojo.openapi.PathItem> values_;
    private com.google.protobuf.MapField<java.lang.String, org.mojolang.mojo.openapi.PathItem>
    internalGetValues() {
      if (values_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ValuesDefaultEntryHolder.defaultEntry);
      }
      return values_;
    }
    private com.google.protobuf.MapField<java.lang.String, org.mojolang.mojo.openapi.PathItem>
    internalGetMutableValues() {
      onChanged();;
      if (values_ == null) {
        values_ = com.google.protobuf.MapField.newMapField(
            ValuesDefaultEntryHolder.defaultEntry);
      }
      if (!values_.isMutable()) {
        values_ = values_.copy();
      }
      return values_;
    }

    public int getValuesCount() {
      return internalGetValues().getMap().size();
    }
    /**
     * <code>map&lt;string, .mojo.openapi.PathItem&gt; values = 1;</code>
     */

    @java.lang.Override
    public boolean containsValues(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetValues().getMap().containsKey(key);
    }
    /**
     * Use {@link #getValuesMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, org.mojolang.mojo.openapi.PathItem> getValues() {
      return getValuesMap();
    }
    /**
     * <code>map&lt;string, .mojo.openapi.PathItem&gt; values = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, org.mojolang.mojo.openapi.PathItem> getValuesMap() {
      return internalGetValues().getMap();
    }
    /**
     * <code>map&lt;string, .mojo.openapi.PathItem&gt; values = 1;</code>
     */
    @java.lang.Override

    public org.mojolang.mojo.openapi.PathItem getValuesOrDefault(
        java.lang.String key,
        org.mojolang.mojo.openapi.PathItem defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, org.mojolang.mojo.openapi.PathItem> map =
          internalGetValues().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .mojo.openapi.PathItem&gt; values = 1;</code>
     */
    @java.lang.Override

    public org.mojolang.mojo.openapi.PathItem getValuesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, org.mojolang.mojo.openapi.PathItem> map =
          internalGetValues().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearValues() {
      internalGetMutableValues().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .mojo.openapi.PathItem&gt; values = 1;</code>
     */

    public Builder removeValues(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableValues().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, org.mojolang.mojo.openapi.PathItem>
    getMutableValues() {
      return internalGetMutableValues().getMutableMap();
    }
    /**
     * <code>map&lt;string, .mojo.openapi.PathItem&gt; values = 1;</code>
     */
    public Builder putValues(
        java.lang.String key,
        org.mojolang.mojo.openapi.PathItem value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableValues().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .mojo.openapi.PathItem&gt; values = 1;</code>
     */

    public Builder putAllValues(
        java.util.Map<java.lang.String, org.mojolang.mojo.openapi.PathItem> values) {
      internalGetMutableValues().getMutableMap()
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


    // @@protoc_insertion_point(builder_scope:mojo.openapi.Paths)
  }

  // @@protoc_insertion_point(class_scope:mojo.openapi.Paths)
  private static final org.mojolang.mojo.openapi.Paths DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.openapi.Paths();
  }

  public static org.mojolang.mojo.openapi.Paths getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Paths>
      PARSER = new com.google.protobuf.AbstractParser<Paths>() {
    @java.lang.Override
    public Paths parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Paths(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Paths> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Paths> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.openapi.Paths getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

