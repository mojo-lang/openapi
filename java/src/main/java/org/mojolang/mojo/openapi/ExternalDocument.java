// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/external_document.proto

package org.mojolang.mojo.openapi;

/**
 * Protobuf type {@code mojo.openapi.ExternalDocument}
 */
public final class ExternalDocument extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.openapi.ExternalDocument)
    ExternalDocumentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExternalDocument.newBuilder() to construct.
  private ExternalDocument(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExternalDocument() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExternalDocument();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mojolang.mojo.openapi.ExternalDocumentProto.internal_static_mojo_openapi_ExternalDocument_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.openapi.ExternalDocumentProto.internal_static_mojo_openapi_ExternalDocument_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.openapi.ExternalDocument.class, org.mojolang.mojo.openapi.ExternalDocument.Builder.class);
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 1;
  private org.mojolang.mojo.openapi.CachedDocument description_;
  /**
   * <code>.mojo.openapi.CachedDocument description = 1;</code>
   * @return Whether the description field is set.
   */
  @java.lang.Override
  public boolean hasDescription() {
    return description_ != null;
  }
  /**
   * <code>.mojo.openapi.CachedDocument description = 1;</code>
   * @return The description.
   */
  @java.lang.Override
  public org.mojolang.mojo.openapi.CachedDocument getDescription() {
    return description_ == null ? org.mojolang.mojo.openapi.CachedDocument.getDefaultInstance() : description_;
  }
  /**
   * <code>.mojo.openapi.CachedDocument description = 1;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.openapi.CachedDocumentOrBuilder getDescriptionOrBuilder() {
    return description_ == null ? org.mojolang.mojo.openapi.CachedDocument.getDefaultInstance() : description_;
  }

  public static final int URL_FIELD_NUMBER = 2;
  private org.mojolang.mojo.core.Url url_;
  /**
   * <code>.mojo.core.Url url = 2;</code>
   * @return Whether the url field is set.
   */
  @java.lang.Override
  public boolean hasUrl() {
    return url_ != null;
  }
  /**
   * <code>.mojo.core.Url url = 2;</code>
   * @return The url.
   */
  @java.lang.Override
  public org.mojolang.mojo.core.Url getUrl() {
    return url_ == null ? org.mojolang.mojo.core.Url.getDefaultInstance() : url_;
  }
  /**
   * <code>.mojo.core.Url url = 2;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.core.UrlOrBuilder getUrlOrBuilder() {
    return url_ == null ? org.mojolang.mojo.core.Url.getDefaultInstance() : url_;
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
    if (description_ != null) {
      output.writeMessage(1, getDescription());
    }
    if (url_ != null) {
      output.writeMessage(2, getUrl());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (description_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDescription());
    }
    if (url_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUrl());
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
    if (!(obj instanceof org.mojolang.mojo.openapi.ExternalDocument)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.openapi.ExternalDocument other = (org.mojolang.mojo.openapi.ExternalDocument) obj;

    if (hasDescription() != other.hasDescription()) return false;
    if (hasDescription()) {
      if (!getDescription()
          .equals(other.getDescription())) return false;
    }
    if (hasUrl() != other.hasUrl()) return false;
    if (hasUrl()) {
      if (!getUrl()
          .equals(other.getUrl())) return false;
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
    if (hasDescription()) {
      hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getDescription().hashCode();
    }
    if (hasUrl()) {
      hash = (37 * hash) + URL_FIELD_NUMBER;
      hash = (53 * hash) + getUrl().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.openapi.ExternalDocument parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.ExternalDocument parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.ExternalDocument parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.ExternalDocument parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.ExternalDocument parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.ExternalDocument parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.ExternalDocument parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.ExternalDocument parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.ExternalDocument parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.ExternalDocument parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.ExternalDocument parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.ExternalDocument parseFrom(
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
  public static Builder newBuilder(org.mojolang.mojo.openapi.ExternalDocument prototype) {
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
   * Protobuf type {@code mojo.openapi.ExternalDocument}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.openapi.ExternalDocument)
      org.mojolang.mojo.openapi.ExternalDocumentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.openapi.ExternalDocumentProto.internal_static_mojo_openapi_ExternalDocument_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.openapi.ExternalDocumentProto.internal_static_mojo_openapi_ExternalDocument_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.openapi.ExternalDocument.class, org.mojolang.mojo.openapi.ExternalDocument.Builder.class);
    }

    // Construct using org.mojolang.mojo.openapi.ExternalDocument.newBuilder()
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
      description_ = null;
      if (descriptionBuilder_ != null) {
        descriptionBuilder_.dispose();
        descriptionBuilder_ = null;
      }
      url_ = null;
      if (urlBuilder_ != null) {
        urlBuilder_.dispose();
        urlBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.openapi.ExternalDocumentProto.internal_static_mojo_openapi_ExternalDocument_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.ExternalDocument getDefaultInstanceForType() {
      return org.mojolang.mojo.openapi.ExternalDocument.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.ExternalDocument build() {
      org.mojolang.mojo.openapi.ExternalDocument result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.ExternalDocument buildPartial() {
      org.mojolang.mojo.openapi.ExternalDocument result = new org.mojolang.mojo.openapi.ExternalDocument(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.mojolang.mojo.openapi.ExternalDocument result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.description_ = descriptionBuilder_ == null
            ? description_
            : descriptionBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.url_ = urlBuilder_ == null
            ? url_
            : urlBuilder_.build();
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
      if (other instanceof org.mojolang.mojo.openapi.ExternalDocument) {
        return mergeFrom((org.mojolang.mojo.openapi.ExternalDocument)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.openapi.ExternalDocument other) {
      if (other == org.mojolang.mojo.openapi.ExternalDocument.getDefaultInstance()) return this;
      if (other.hasDescription()) {
        mergeDescription(other.getDescription());
      }
      if (other.hasUrl()) {
        mergeUrl(other.getUrl());
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
              input.readMessage(
                  getDescriptionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUrlFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private org.mojolang.mojo.openapi.CachedDocument description_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.openapi.CachedDocument, org.mojolang.mojo.openapi.CachedDocument.Builder, org.mojolang.mojo.openapi.CachedDocumentOrBuilder> descriptionBuilder_;
    /**
     * <code>.mojo.openapi.CachedDocument description = 1;</code>
     * @return Whether the description field is set.
     */
    public boolean hasDescription() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.mojo.openapi.CachedDocument description = 1;</code>
     * @return The description.
     */
    public org.mojolang.mojo.openapi.CachedDocument getDescription() {
      if (descriptionBuilder_ == null) {
        return description_ == null ? org.mojolang.mojo.openapi.CachedDocument.getDefaultInstance() : description_;
      } else {
        return descriptionBuilder_.getMessage();
      }
    }
    /**
     * <code>.mojo.openapi.CachedDocument description = 1;</code>
     */
    public Builder setDescription(org.mojolang.mojo.openapi.CachedDocument value) {
      if (descriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        description_ = value;
      } else {
        descriptionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.openapi.CachedDocument description = 1;</code>
     */
    public Builder setDescription(
        org.mojolang.mojo.openapi.CachedDocument.Builder builderForValue) {
      if (descriptionBuilder_ == null) {
        description_ = builderForValue.build();
      } else {
        descriptionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.openapi.CachedDocument description = 1;</code>
     */
    public Builder mergeDescription(org.mojolang.mojo.openapi.CachedDocument value) {
      if (descriptionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          description_ != null &&
          description_ != org.mojolang.mojo.openapi.CachedDocument.getDefaultInstance()) {
          getDescriptionBuilder().mergeFrom(value);
        } else {
          description_ = value;
        }
      } else {
        descriptionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.openapi.CachedDocument description = 1;</code>
     */
    public Builder clearDescription() {
      bitField0_ = (bitField0_ & ~0x00000001);
      description_ = null;
      if (descriptionBuilder_ != null) {
        descriptionBuilder_.dispose();
        descriptionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.openapi.CachedDocument description = 1;</code>
     */
    public org.mojolang.mojo.openapi.CachedDocument.Builder getDescriptionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDescriptionFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.openapi.CachedDocument description = 1;</code>
     */
    public org.mojolang.mojo.openapi.CachedDocumentOrBuilder getDescriptionOrBuilder() {
      if (descriptionBuilder_ != null) {
        return descriptionBuilder_.getMessageOrBuilder();
      } else {
        return description_ == null ?
            org.mojolang.mojo.openapi.CachedDocument.getDefaultInstance() : description_;
      }
    }
    /**
     * <code>.mojo.openapi.CachedDocument description = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.openapi.CachedDocument, org.mojolang.mojo.openapi.CachedDocument.Builder, org.mojolang.mojo.openapi.CachedDocumentOrBuilder> 
        getDescriptionFieldBuilder() {
      if (descriptionBuilder_ == null) {
        descriptionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojolang.mojo.openapi.CachedDocument, org.mojolang.mojo.openapi.CachedDocument.Builder, org.mojolang.mojo.openapi.CachedDocumentOrBuilder>(
                getDescription(),
                getParentForChildren(),
                isClean());
        description_ = null;
      }
      return descriptionBuilder_;
    }

    private org.mojolang.mojo.core.Url url_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.core.Url, org.mojolang.mojo.core.Url.Builder, org.mojolang.mojo.core.UrlOrBuilder> urlBuilder_;
    /**
     * <code>.mojo.core.Url url = 2;</code>
     * @return Whether the url field is set.
     */
    public boolean hasUrl() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.mojo.core.Url url = 2;</code>
     * @return The url.
     */
    public org.mojolang.mojo.core.Url getUrl() {
      if (urlBuilder_ == null) {
        return url_ == null ? org.mojolang.mojo.core.Url.getDefaultInstance() : url_;
      } else {
        return urlBuilder_.getMessage();
      }
    }
    /**
     * <code>.mojo.core.Url url = 2;</code>
     */
    public Builder setUrl(org.mojolang.mojo.core.Url value) {
      if (urlBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        url_ = value;
      } else {
        urlBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Url url = 2;</code>
     */
    public Builder setUrl(
        org.mojolang.mojo.core.Url.Builder builderForValue) {
      if (urlBuilder_ == null) {
        url_ = builderForValue.build();
      } else {
        urlBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Url url = 2;</code>
     */
    public Builder mergeUrl(org.mojolang.mojo.core.Url value) {
      if (urlBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          url_ != null &&
          url_ != org.mojolang.mojo.core.Url.getDefaultInstance()) {
          getUrlBuilder().mergeFrom(value);
        } else {
          url_ = value;
        }
      } else {
        urlBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Url url = 2;</code>
     */
    public Builder clearUrl() {
      bitField0_ = (bitField0_ & ~0x00000002);
      url_ = null;
      if (urlBuilder_ != null) {
        urlBuilder_.dispose();
        urlBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Url url = 2;</code>
     */
    public org.mojolang.mojo.core.Url.Builder getUrlBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUrlFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.core.Url url = 2;</code>
     */
    public org.mojolang.mojo.core.UrlOrBuilder getUrlOrBuilder() {
      if (urlBuilder_ != null) {
        return urlBuilder_.getMessageOrBuilder();
      } else {
        return url_ == null ?
            org.mojolang.mojo.core.Url.getDefaultInstance() : url_;
      }
    }
    /**
     * <code>.mojo.core.Url url = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.core.Url, org.mojolang.mojo.core.Url.Builder, org.mojolang.mojo.core.UrlOrBuilder> 
        getUrlFieldBuilder() {
      if (urlBuilder_ == null) {
        urlBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojolang.mojo.core.Url, org.mojolang.mojo.core.Url.Builder, org.mojolang.mojo.core.UrlOrBuilder>(
                getUrl(),
                getParentForChildren(),
                isClean());
        url_ = null;
      }
      return urlBuilder_;
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


    // @@protoc_insertion_point(builder_scope:mojo.openapi.ExternalDocument)
  }

  // @@protoc_insertion_point(class_scope:mojo.openapi.ExternalDocument)
  private static final org.mojolang.mojo.openapi.ExternalDocument DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.openapi.ExternalDocument();
  }

  public static org.mojolang.mojo.openapi.ExternalDocument getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExternalDocument>
      PARSER = new com.google.protobuf.AbstractParser<ExternalDocument>() {
    @java.lang.Override
    public ExternalDocument parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExternalDocument> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExternalDocument> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.openapi.ExternalDocument getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

