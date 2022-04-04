// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/openapi.proto

package org.mojolang.mojo.openapi;

/**
 * Protobuf type {@code mojo.openapi.Encoding}
 */
public final class Encoding extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.openapi.Encoding)
    EncodingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Encoding.newBuilder() to construct.
  private Encoding(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Encoding() {
    contentType_ = "";
    style_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Encoding();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Encoding(
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

            contentType_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              headers_ = com.google.protobuf.MapField.newMapField(
                  HeadersDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader>
            headers__ = input.readMessage(
                HeadersDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            headers_.getMutableMap().put(
                headers__.getKey(), headers__.getValue());
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            style_ = s;
            break;
          }
          case 32: {

            explode_ = input.readBool();
            break;
          }
          case 40: {

            allowReserved_ = input.readBool();
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
    return org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_Encoding_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetHeaders();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_Encoding_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.openapi.Encoding.class, org.mojolang.mojo.openapi.Encoding.Builder.class);
  }

  public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object contentType_;
  /**
   * <code>string content_type = 1;</code>
   * @return The contentType.
   */
  @java.lang.Override
  public java.lang.String getContentType() {
    java.lang.Object ref = contentType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      contentType_ = s;
      return s;
    }
  }
  /**
   * <code>string content_type = 1;</code>
   * @return The bytes for contentType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContentTypeBytes() {
    java.lang.Object ref = contentType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      contentType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HEADERS_FIELD_NUMBER = 2;
  private static final class HeadersDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader>newDefaultInstance(
                org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_Encoding_HeadersEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                org.mojolang.mojo.openapi.ReferenceableHeader.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader> headers_;
  private com.google.protobuf.MapField<java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader>
  internalGetHeaders() {
    if (headers_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          HeadersDefaultEntryHolder.defaultEntry);
    }
    return headers_;
  }

  public int getHeadersCount() {
    return internalGetHeaders().getMap().size();
  }
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableHeader&gt; headers = 2;</code>
   */

  @java.lang.Override
  public boolean containsHeaders(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetHeaders().getMap().containsKey(key);
  }
  /**
   * Use {@link #getHeadersMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader> getHeaders() {
    return getHeadersMap();
  }
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableHeader&gt; headers = 2;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader> getHeadersMap() {
    return internalGetHeaders().getMap();
  }
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableHeader&gt; headers = 2;</code>
   */
  @java.lang.Override

  public org.mojolang.mojo.openapi.ReferenceableHeader getHeadersOrDefault(
      java.lang.String key,
      org.mojolang.mojo.openapi.ReferenceableHeader defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader> map =
        internalGetHeaders().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableHeader&gt; headers = 2;</code>
   */
  @java.lang.Override

  public org.mojolang.mojo.openapi.ReferenceableHeader getHeadersOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader> map =
        internalGetHeaders().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int STYLE_FIELD_NUMBER = 3;
  private volatile java.lang.Object style_;
  /**
   * <code>string style = 3;</code>
   * @return The style.
   */
  @java.lang.Override
  public java.lang.String getStyle() {
    java.lang.Object ref = style_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      style_ = s;
      return s;
    }
  }
  /**
   * <code>string style = 3;</code>
   * @return The bytes for style.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStyleBytes() {
    java.lang.Object ref = style_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      style_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPLODE_FIELD_NUMBER = 4;
  private boolean explode_;
  /**
   * <code>bool explode = 4;</code>
   * @return The explode.
   */
  @java.lang.Override
  public boolean getExplode() {
    return explode_;
  }

  public static final int ALLOW_RESERVED_FIELD_NUMBER = 5;
  private boolean allowReserved_;
  /**
   * <code>bool allow_reserved = 5;</code>
   * @return The allowReserved.
   */
  @java.lang.Override
  public boolean getAllowReserved() {
    return allowReserved_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contentType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, contentType_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetHeaders(),
        HeadersDefaultEntryHolder.defaultEntry,
        2);
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(style_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, style_);
    }
    if (explode_ != false) {
      output.writeBool(4, explode_);
    }
    if (allowReserved_ != false) {
      output.writeBool(5, allowReserved_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contentType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, contentType_);
    }
    for (java.util.Map.Entry<java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader> entry
         : internalGetHeaders().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader>
      headers__ = HeadersDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, headers__);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(style_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, style_);
    }
    if (explode_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, explode_);
    }
    if (allowReserved_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, allowReserved_);
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
    if (!(obj instanceof org.mojolang.mojo.openapi.Encoding)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.openapi.Encoding other = (org.mojolang.mojo.openapi.Encoding) obj;

    if (!getContentType()
        .equals(other.getContentType())) return false;
    if (!internalGetHeaders().equals(
        other.internalGetHeaders())) return false;
    if (!getStyle()
        .equals(other.getStyle())) return false;
    if (getExplode()
        != other.getExplode()) return false;
    if (getAllowReserved()
        != other.getAllowReserved()) return false;
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
    hash = (37 * hash) + CONTENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getContentType().hashCode();
    if (!internalGetHeaders().getMap().isEmpty()) {
      hash = (37 * hash) + HEADERS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetHeaders().hashCode();
    }
    hash = (37 * hash) + STYLE_FIELD_NUMBER;
    hash = (53 * hash) + getStyle().hashCode();
    hash = (37 * hash) + EXPLODE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getExplode());
    hash = (37 * hash) + ALLOW_RESERVED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAllowReserved());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.openapi.Encoding parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.Encoding parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Encoding parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.Encoding parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Encoding parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.Encoding parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Encoding parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.Encoding parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Encoding parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.Encoding parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.Encoding parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.Encoding parseFrom(
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
  public static Builder newBuilder(org.mojolang.mojo.openapi.Encoding prototype) {
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
   * Protobuf type {@code mojo.openapi.Encoding}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.openapi.Encoding)
      org.mojolang.mojo.openapi.EncodingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_Encoding_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetHeaders();
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
          return internalGetMutableHeaders();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_Encoding_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.openapi.Encoding.class, org.mojolang.mojo.openapi.Encoding.Builder.class);
    }

    // Construct using org.mojolang.mojo.openapi.Encoding.newBuilder()
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
      contentType_ = "";

      internalGetMutableHeaders().clear();
      style_ = "";

      explode_ = false;

      allowReserved_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_Encoding_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.Encoding getDefaultInstanceForType() {
      return org.mojolang.mojo.openapi.Encoding.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.Encoding build() {
      org.mojolang.mojo.openapi.Encoding result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.Encoding buildPartial() {
      org.mojolang.mojo.openapi.Encoding result = new org.mojolang.mojo.openapi.Encoding(this);
      int from_bitField0_ = bitField0_;
      result.contentType_ = contentType_;
      result.headers_ = internalGetHeaders();
      result.headers_.makeImmutable();
      result.style_ = style_;
      result.explode_ = explode_;
      result.allowReserved_ = allowReserved_;
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
      if (other instanceof org.mojolang.mojo.openapi.Encoding) {
        return mergeFrom((org.mojolang.mojo.openapi.Encoding)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.openapi.Encoding other) {
      if (other == org.mojolang.mojo.openapi.Encoding.getDefaultInstance()) return this;
      if (!other.getContentType().isEmpty()) {
        contentType_ = other.contentType_;
        onChanged();
      }
      internalGetMutableHeaders().mergeFrom(
          other.internalGetHeaders());
      if (!other.getStyle().isEmpty()) {
        style_ = other.style_;
        onChanged();
      }
      if (other.getExplode() != false) {
        setExplode(other.getExplode());
      }
      if (other.getAllowReserved() != false) {
        setAllowReserved(other.getAllowReserved());
      }
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
      org.mojolang.mojo.openapi.Encoding parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.mojolang.mojo.openapi.Encoding) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object contentType_ = "";
    /**
     * <code>string content_type = 1;</code>
     * @return The contentType.
     */
    public java.lang.String getContentType() {
      java.lang.Object ref = contentType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contentType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string content_type = 1;</code>
     * @return The bytes for contentType.
     */
    public com.google.protobuf.ByteString
        getContentTypeBytes() {
      java.lang.Object ref = contentType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        contentType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string content_type = 1;</code>
     * @param value The contentType to set.
     * @return This builder for chaining.
     */
    public Builder setContentType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      contentType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string content_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearContentType() {
      
      contentType_ = getDefaultInstance().getContentType();
      onChanged();
      return this;
    }
    /**
     * <code>string content_type = 1;</code>
     * @param value The bytes for contentType to set.
     * @return This builder for chaining.
     */
    public Builder setContentTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      contentType_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader> headers_;
    private com.google.protobuf.MapField<java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader>
    internalGetHeaders() {
      if (headers_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            HeadersDefaultEntryHolder.defaultEntry);
      }
      return headers_;
    }
    private com.google.protobuf.MapField<java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader>
    internalGetMutableHeaders() {
      onChanged();;
      if (headers_ == null) {
        headers_ = com.google.protobuf.MapField.newMapField(
            HeadersDefaultEntryHolder.defaultEntry);
      }
      if (!headers_.isMutable()) {
        headers_ = headers_.copy();
      }
      return headers_;
    }

    public int getHeadersCount() {
      return internalGetHeaders().getMap().size();
    }
    /**
     * <code>map&lt;string, .mojo.openapi.ReferenceableHeader&gt; headers = 2;</code>
     */

    @java.lang.Override
    public boolean containsHeaders(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetHeaders().getMap().containsKey(key);
    }
    /**
     * Use {@link #getHeadersMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader> getHeaders() {
      return getHeadersMap();
    }
    /**
     * <code>map&lt;string, .mojo.openapi.ReferenceableHeader&gt; headers = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader> getHeadersMap() {
      return internalGetHeaders().getMap();
    }
    /**
     * <code>map&lt;string, .mojo.openapi.ReferenceableHeader&gt; headers = 2;</code>
     */
    @java.lang.Override

    public org.mojolang.mojo.openapi.ReferenceableHeader getHeadersOrDefault(
        java.lang.String key,
        org.mojolang.mojo.openapi.ReferenceableHeader defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader> map =
          internalGetHeaders().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .mojo.openapi.ReferenceableHeader&gt; headers = 2;</code>
     */
    @java.lang.Override

    public org.mojolang.mojo.openapi.ReferenceableHeader getHeadersOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader> map =
          internalGetHeaders().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearHeaders() {
      internalGetMutableHeaders().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .mojo.openapi.ReferenceableHeader&gt; headers = 2;</code>
     */

    public Builder removeHeaders(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableHeaders().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader>
    getMutableHeaders() {
      return internalGetMutableHeaders().getMutableMap();
    }
    /**
     * <code>map&lt;string, .mojo.openapi.ReferenceableHeader&gt; headers = 2;</code>
     */
    public Builder putHeaders(
        java.lang.String key,
        org.mojolang.mojo.openapi.ReferenceableHeader value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableHeaders().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .mojo.openapi.ReferenceableHeader&gt; headers = 2;</code>
     */

    public Builder putAllHeaders(
        java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader> values) {
      internalGetMutableHeaders().getMutableMap()
          .putAll(values);
      return this;
    }

    private java.lang.Object style_ = "";
    /**
     * <code>string style = 3;</code>
     * @return The style.
     */
    public java.lang.String getStyle() {
      java.lang.Object ref = style_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        style_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string style = 3;</code>
     * @return The bytes for style.
     */
    public com.google.protobuf.ByteString
        getStyleBytes() {
      java.lang.Object ref = style_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        style_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string style = 3;</code>
     * @param value The style to set.
     * @return This builder for chaining.
     */
    public Builder setStyle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      style_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string style = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStyle() {
      
      style_ = getDefaultInstance().getStyle();
      onChanged();
      return this;
    }
    /**
     * <code>string style = 3;</code>
     * @param value The bytes for style to set.
     * @return This builder for chaining.
     */
    public Builder setStyleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      style_ = value;
      onChanged();
      return this;
    }

    private boolean explode_ ;
    /**
     * <code>bool explode = 4;</code>
     * @return The explode.
     */
    @java.lang.Override
    public boolean getExplode() {
      return explode_;
    }
    /**
     * <code>bool explode = 4;</code>
     * @param value The explode to set.
     * @return This builder for chaining.
     */
    public Builder setExplode(boolean value) {
      
      explode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool explode = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearExplode() {
      
      explode_ = false;
      onChanged();
      return this;
    }

    private boolean allowReserved_ ;
    /**
     * <code>bool allow_reserved = 5;</code>
     * @return The allowReserved.
     */
    @java.lang.Override
    public boolean getAllowReserved() {
      return allowReserved_;
    }
    /**
     * <code>bool allow_reserved = 5;</code>
     * @param value The allowReserved to set.
     * @return This builder for chaining.
     */
    public Builder setAllowReserved(boolean value) {
      
      allowReserved_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool allow_reserved = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowReserved() {
      
      allowReserved_ = false;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:mojo.openapi.Encoding)
  }

  // @@protoc_insertion_point(class_scope:mojo.openapi.Encoding)
  private static final org.mojolang.mojo.openapi.Encoding DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.openapi.Encoding();
  }

  public static org.mojolang.mojo.openapi.Encoding getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Encoding>
      PARSER = new com.google.protobuf.AbstractParser<Encoding>() {
    @java.lang.Override
    public Encoding parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Encoding(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Encoding> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Encoding> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.openapi.Encoding getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

