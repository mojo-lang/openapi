// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/openapi.proto

package org.mojolang.mojo.openapi;

/**
 * Protobuf type {@code mojo.openapi.ReferenceableRequestBody}
 */
public final class ReferenceableRequestBody extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.openapi.ReferenceableRequestBody)
    ReferenceableRequestBodyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReferenceableRequestBody.newBuilder() to construct.
  private ReferenceableRequestBody(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReferenceableRequestBody() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReferenceableRequestBody();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReferenceableRequestBody(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            org.mojolang.mojo.openapi.Reference.Builder subBuilder = null;
            if (referenceableRequestBodyCase_ == 1) {
              subBuilder = ((org.mojolang.mojo.openapi.Reference) referenceableRequestBody_).toBuilder();
            }
            referenceableRequestBody_ =
                input.readMessage(org.mojolang.mojo.openapi.Reference.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((org.mojolang.mojo.openapi.Reference) referenceableRequestBody_);
              referenceableRequestBody_ = subBuilder.buildPartial();
            }
            referenceableRequestBodyCase_ = 1;
            break;
          }
          case 18: {
            org.mojolang.mojo.openapi.RequestBody.Builder subBuilder = null;
            if (referenceableRequestBodyCase_ == 2) {
              subBuilder = ((org.mojolang.mojo.openapi.RequestBody) referenceableRequestBody_).toBuilder();
            }
            referenceableRequestBody_ =
                input.readMessage(org.mojolang.mojo.openapi.RequestBody.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((org.mojolang.mojo.openapi.RequestBody) referenceableRequestBody_);
              referenceableRequestBody_ = subBuilder.buildPartial();
            }
            referenceableRequestBodyCase_ = 2;
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
    return org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_ReferenceableRequestBody_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_ReferenceableRequestBody_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.openapi.ReferenceableRequestBody.class, org.mojolang.mojo.openapi.ReferenceableRequestBody.Builder.class);
  }

  private int referenceableRequestBodyCase_ = 0;
  private java.lang.Object referenceableRequestBody_;
  public enum ReferenceableRequestBodyCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    REFERENCE(1),
    REQUEST_BODY(2),
    REFERENCEABLEREQUESTBODY_NOT_SET(0);
    private final int value;
    private ReferenceableRequestBodyCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ReferenceableRequestBodyCase valueOf(int value) {
      return forNumber(value);
    }

    public static ReferenceableRequestBodyCase forNumber(int value) {
      switch (value) {
        case 1: return REFERENCE;
        case 2: return REQUEST_BODY;
        case 0: return REFERENCEABLEREQUESTBODY_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ReferenceableRequestBodyCase
  getReferenceableRequestBodyCase() {
    return ReferenceableRequestBodyCase.forNumber(
        referenceableRequestBodyCase_);
  }

  public static final int REFERENCE_FIELD_NUMBER = 1;
  /**
   * <code>.mojo.openapi.Reference reference = 1;</code>
   * @return Whether the reference field is set.
   */
  @java.lang.Override
  public boolean hasReference() {
    return referenceableRequestBodyCase_ == 1;
  }
  /**
   * <code>.mojo.openapi.Reference reference = 1;</code>
   * @return The reference.
   */
  @java.lang.Override
  public org.mojolang.mojo.openapi.Reference getReference() {
    if (referenceableRequestBodyCase_ == 1) {
       return (org.mojolang.mojo.openapi.Reference) referenceableRequestBody_;
    }
    return org.mojolang.mojo.openapi.Reference.getDefaultInstance();
  }
  /**
   * <code>.mojo.openapi.Reference reference = 1;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.openapi.ReferenceOrBuilder getReferenceOrBuilder() {
    if (referenceableRequestBodyCase_ == 1) {
       return (org.mojolang.mojo.openapi.Reference) referenceableRequestBody_;
    }
    return org.mojolang.mojo.openapi.Reference.getDefaultInstance();
  }

  public static final int REQUEST_BODY_FIELD_NUMBER = 2;
  /**
   * <code>.mojo.openapi.RequestBody request_body = 2;</code>
   * @return Whether the requestBody field is set.
   */
  @java.lang.Override
  public boolean hasRequestBody() {
    return referenceableRequestBodyCase_ == 2;
  }
  /**
   * <code>.mojo.openapi.RequestBody request_body = 2;</code>
   * @return The requestBody.
   */
  @java.lang.Override
  public org.mojolang.mojo.openapi.RequestBody getRequestBody() {
    if (referenceableRequestBodyCase_ == 2) {
       return (org.mojolang.mojo.openapi.RequestBody) referenceableRequestBody_;
    }
    return org.mojolang.mojo.openapi.RequestBody.getDefaultInstance();
  }
  /**
   * <code>.mojo.openapi.RequestBody request_body = 2;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.openapi.RequestBodyOrBuilder getRequestBodyOrBuilder() {
    if (referenceableRequestBodyCase_ == 2) {
       return (org.mojolang.mojo.openapi.RequestBody) referenceableRequestBody_;
    }
    return org.mojolang.mojo.openapi.RequestBody.getDefaultInstance();
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
    if (referenceableRequestBodyCase_ == 1) {
      output.writeMessage(1, (org.mojolang.mojo.openapi.Reference) referenceableRequestBody_);
    }
    if (referenceableRequestBodyCase_ == 2) {
      output.writeMessage(2, (org.mojolang.mojo.openapi.RequestBody) referenceableRequestBody_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (referenceableRequestBodyCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (org.mojolang.mojo.openapi.Reference) referenceableRequestBody_);
    }
    if (referenceableRequestBodyCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (org.mojolang.mojo.openapi.RequestBody) referenceableRequestBody_);
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
    if (!(obj instanceof org.mojolang.mojo.openapi.ReferenceableRequestBody)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.openapi.ReferenceableRequestBody other = (org.mojolang.mojo.openapi.ReferenceableRequestBody) obj;

    if (!getReferenceableRequestBodyCase().equals(other.getReferenceableRequestBodyCase())) return false;
    switch (referenceableRequestBodyCase_) {
      case 1:
        if (!getReference()
            .equals(other.getReference())) return false;
        break;
      case 2:
        if (!getRequestBody()
            .equals(other.getRequestBody())) return false;
        break;
      case 0:
      default:
    }
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
    switch (referenceableRequestBodyCase_) {
      case 1:
        hash = (37 * hash) + REFERENCE_FIELD_NUMBER;
        hash = (53 * hash) + getReference().hashCode();
        break;
      case 2:
        hash = (37 * hash) + REQUEST_BODY_FIELD_NUMBER;
        hash = (53 * hash) + getRequestBody().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.openapi.ReferenceableRequestBody parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.ReferenceableRequestBody parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.ReferenceableRequestBody parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.ReferenceableRequestBody parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.ReferenceableRequestBody parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.ReferenceableRequestBody parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.ReferenceableRequestBody parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.ReferenceableRequestBody parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.ReferenceableRequestBody parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.ReferenceableRequestBody parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.ReferenceableRequestBody parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.ReferenceableRequestBody parseFrom(
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
  public static Builder newBuilder(org.mojolang.mojo.openapi.ReferenceableRequestBody prototype) {
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
   * Protobuf type {@code mojo.openapi.ReferenceableRequestBody}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.openapi.ReferenceableRequestBody)
      org.mojolang.mojo.openapi.ReferenceableRequestBodyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_ReferenceableRequestBody_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_ReferenceableRequestBody_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.openapi.ReferenceableRequestBody.class, org.mojolang.mojo.openapi.ReferenceableRequestBody.Builder.class);
    }

    // Construct using org.mojolang.mojo.openapi.ReferenceableRequestBody.newBuilder()
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
      referenceableRequestBodyCase_ = 0;
      referenceableRequestBody_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.openapi.OpenapiProto.internal_static_mojo_openapi_ReferenceableRequestBody_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.ReferenceableRequestBody getDefaultInstanceForType() {
      return org.mojolang.mojo.openapi.ReferenceableRequestBody.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.ReferenceableRequestBody build() {
      org.mojolang.mojo.openapi.ReferenceableRequestBody result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.ReferenceableRequestBody buildPartial() {
      org.mojolang.mojo.openapi.ReferenceableRequestBody result = new org.mojolang.mojo.openapi.ReferenceableRequestBody(this);
      if (referenceableRequestBodyCase_ == 1) {
        if (referenceBuilder_ == null) {
          result.referenceableRequestBody_ = referenceableRequestBody_;
        } else {
          result.referenceableRequestBody_ = referenceBuilder_.build();
        }
      }
      if (referenceableRequestBodyCase_ == 2) {
        if (requestBodyBuilder_ == null) {
          result.referenceableRequestBody_ = referenceableRequestBody_;
        } else {
          result.referenceableRequestBody_ = requestBodyBuilder_.build();
        }
      }
      result.referenceableRequestBodyCase_ = referenceableRequestBodyCase_;
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
      if (other instanceof org.mojolang.mojo.openapi.ReferenceableRequestBody) {
        return mergeFrom((org.mojolang.mojo.openapi.ReferenceableRequestBody)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.openapi.ReferenceableRequestBody other) {
      if (other == org.mojolang.mojo.openapi.ReferenceableRequestBody.getDefaultInstance()) return this;
      switch (other.getReferenceableRequestBodyCase()) {
        case REFERENCE: {
          mergeReference(other.getReference());
          break;
        }
        case REQUEST_BODY: {
          mergeRequestBody(other.getRequestBody());
          break;
        }
        case REFERENCEABLEREQUESTBODY_NOT_SET: {
          break;
        }
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
      org.mojolang.mojo.openapi.ReferenceableRequestBody parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.mojolang.mojo.openapi.ReferenceableRequestBody) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int referenceableRequestBodyCase_ = 0;
    private java.lang.Object referenceableRequestBody_;
    public ReferenceableRequestBodyCase
        getReferenceableRequestBodyCase() {
      return ReferenceableRequestBodyCase.forNumber(
          referenceableRequestBodyCase_);
    }

    public Builder clearReferenceableRequestBody() {
      referenceableRequestBodyCase_ = 0;
      referenceableRequestBody_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.openapi.Reference, org.mojolang.mojo.openapi.Reference.Builder, org.mojolang.mojo.openapi.ReferenceOrBuilder> referenceBuilder_;
    /**
     * <code>.mojo.openapi.Reference reference = 1;</code>
     * @return Whether the reference field is set.
     */
    @java.lang.Override
    public boolean hasReference() {
      return referenceableRequestBodyCase_ == 1;
    }
    /**
     * <code>.mojo.openapi.Reference reference = 1;</code>
     * @return The reference.
     */
    @java.lang.Override
    public org.mojolang.mojo.openapi.Reference getReference() {
      if (referenceBuilder_ == null) {
        if (referenceableRequestBodyCase_ == 1) {
          return (org.mojolang.mojo.openapi.Reference) referenceableRequestBody_;
        }
        return org.mojolang.mojo.openapi.Reference.getDefaultInstance();
      } else {
        if (referenceableRequestBodyCase_ == 1) {
          return referenceBuilder_.getMessage();
        }
        return org.mojolang.mojo.openapi.Reference.getDefaultInstance();
      }
    }
    /**
     * <code>.mojo.openapi.Reference reference = 1;</code>
     */
    public Builder setReference(org.mojolang.mojo.openapi.Reference value) {
      if (referenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        referenceableRequestBody_ = value;
        onChanged();
      } else {
        referenceBuilder_.setMessage(value);
      }
      referenceableRequestBodyCase_ = 1;
      return this;
    }
    /**
     * <code>.mojo.openapi.Reference reference = 1;</code>
     */
    public Builder setReference(
        org.mojolang.mojo.openapi.Reference.Builder builderForValue) {
      if (referenceBuilder_ == null) {
        referenceableRequestBody_ = builderForValue.build();
        onChanged();
      } else {
        referenceBuilder_.setMessage(builderForValue.build());
      }
      referenceableRequestBodyCase_ = 1;
      return this;
    }
    /**
     * <code>.mojo.openapi.Reference reference = 1;</code>
     */
    public Builder mergeReference(org.mojolang.mojo.openapi.Reference value) {
      if (referenceBuilder_ == null) {
        if (referenceableRequestBodyCase_ == 1 &&
            referenceableRequestBody_ != org.mojolang.mojo.openapi.Reference.getDefaultInstance()) {
          referenceableRequestBody_ = org.mojolang.mojo.openapi.Reference.newBuilder((org.mojolang.mojo.openapi.Reference) referenceableRequestBody_)
              .mergeFrom(value).buildPartial();
        } else {
          referenceableRequestBody_ = value;
        }
        onChanged();
      } else {
        if (referenceableRequestBodyCase_ == 1) {
          referenceBuilder_.mergeFrom(value);
        }
        referenceBuilder_.setMessage(value);
      }
      referenceableRequestBodyCase_ = 1;
      return this;
    }
    /**
     * <code>.mojo.openapi.Reference reference = 1;</code>
     */
    public Builder clearReference() {
      if (referenceBuilder_ == null) {
        if (referenceableRequestBodyCase_ == 1) {
          referenceableRequestBodyCase_ = 0;
          referenceableRequestBody_ = null;
          onChanged();
        }
      } else {
        if (referenceableRequestBodyCase_ == 1) {
          referenceableRequestBodyCase_ = 0;
          referenceableRequestBody_ = null;
        }
        referenceBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.mojo.openapi.Reference reference = 1;</code>
     */
    public org.mojolang.mojo.openapi.Reference.Builder getReferenceBuilder() {
      return getReferenceFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.openapi.Reference reference = 1;</code>
     */
    @java.lang.Override
    public org.mojolang.mojo.openapi.ReferenceOrBuilder getReferenceOrBuilder() {
      if ((referenceableRequestBodyCase_ == 1) && (referenceBuilder_ != null)) {
        return referenceBuilder_.getMessageOrBuilder();
      } else {
        if (referenceableRequestBodyCase_ == 1) {
          return (org.mojolang.mojo.openapi.Reference) referenceableRequestBody_;
        }
        return org.mojolang.mojo.openapi.Reference.getDefaultInstance();
      }
    }
    /**
     * <code>.mojo.openapi.Reference reference = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.openapi.Reference, org.mojolang.mojo.openapi.Reference.Builder, org.mojolang.mojo.openapi.ReferenceOrBuilder> 
        getReferenceFieldBuilder() {
      if (referenceBuilder_ == null) {
        if (!(referenceableRequestBodyCase_ == 1)) {
          referenceableRequestBody_ = org.mojolang.mojo.openapi.Reference.getDefaultInstance();
        }
        referenceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojolang.mojo.openapi.Reference, org.mojolang.mojo.openapi.Reference.Builder, org.mojolang.mojo.openapi.ReferenceOrBuilder>(
                (org.mojolang.mojo.openapi.Reference) referenceableRequestBody_,
                getParentForChildren(),
                isClean());
        referenceableRequestBody_ = null;
      }
      referenceableRequestBodyCase_ = 1;
      onChanged();;
      return referenceBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.openapi.RequestBody, org.mojolang.mojo.openapi.RequestBody.Builder, org.mojolang.mojo.openapi.RequestBodyOrBuilder> requestBodyBuilder_;
    /**
     * <code>.mojo.openapi.RequestBody request_body = 2;</code>
     * @return Whether the requestBody field is set.
     */
    @java.lang.Override
    public boolean hasRequestBody() {
      return referenceableRequestBodyCase_ == 2;
    }
    /**
     * <code>.mojo.openapi.RequestBody request_body = 2;</code>
     * @return The requestBody.
     */
    @java.lang.Override
    public org.mojolang.mojo.openapi.RequestBody getRequestBody() {
      if (requestBodyBuilder_ == null) {
        if (referenceableRequestBodyCase_ == 2) {
          return (org.mojolang.mojo.openapi.RequestBody) referenceableRequestBody_;
        }
        return org.mojolang.mojo.openapi.RequestBody.getDefaultInstance();
      } else {
        if (referenceableRequestBodyCase_ == 2) {
          return requestBodyBuilder_.getMessage();
        }
        return org.mojolang.mojo.openapi.RequestBody.getDefaultInstance();
      }
    }
    /**
     * <code>.mojo.openapi.RequestBody request_body = 2;</code>
     */
    public Builder setRequestBody(org.mojolang.mojo.openapi.RequestBody value) {
      if (requestBodyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        referenceableRequestBody_ = value;
        onChanged();
      } else {
        requestBodyBuilder_.setMessage(value);
      }
      referenceableRequestBodyCase_ = 2;
      return this;
    }
    /**
     * <code>.mojo.openapi.RequestBody request_body = 2;</code>
     */
    public Builder setRequestBody(
        org.mojolang.mojo.openapi.RequestBody.Builder builderForValue) {
      if (requestBodyBuilder_ == null) {
        referenceableRequestBody_ = builderForValue.build();
        onChanged();
      } else {
        requestBodyBuilder_.setMessage(builderForValue.build());
      }
      referenceableRequestBodyCase_ = 2;
      return this;
    }
    /**
     * <code>.mojo.openapi.RequestBody request_body = 2;</code>
     */
    public Builder mergeRequestBody(org.mojolang.mojo.openapi.RequestBody value) {
      if (requestBodyBuilder_ == null) {
        if (referenceableRequestBodyCase_ == 2 &&
            referenceableRequestBody_ != org.mojolang.mojo.openapi.RequestBody.getDefaultInstance()) {
          referenceableRequestBody_ = org.mojolang.mojo.openapi.RequestBody.newBuilder((org.mojolang.mojo.openapi.RequestBody) referenceableRequestBody_)
              .mergeFrom(value).buildPartial();
        } else {
          referenceableRequestBody_ = value;
        }
        onChanged();
      } else {
        if (referenceableRequestBodyCase_ == 2) {
          requestBodyBuilder_.mergeFrom(value);
        }
        requestBodyBuilder_.setMessage(value);
      }
      referenceableRequestBodyCase_ = 2;
      return this;
    }
    /**
     * <code>.mojo.openapi.RequestBody request_body = 2;</code>
     */
    public Builder clearRequestBody() {
      if (requestBodyBuilder_ == null) {
        if (referenceableRequestBodyCase_ == 2) {
          referenceableRequestBodyCase_ = 0;
          referenceableRequestBody_ = null;
          onChanged();
        }
      } else {
        if (referenceableRequestBodyCase_ == 2) {
          referenceableRequestBodyCase_ = 0;
          referenceableRequestBody_ = null;
        }
        requestBodyBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.mojo.openapi.RequestBody request_body = 2;</code>
     */
    public org.mojolang.mojo.openapi.RequestBody.Builder getRequestBodyBuilder() {
      return getRequestBodyFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.openapi.RequestBody request_body = 2;</code>
     */
    @java.lang.Override
    public org.mojolang.mojo.openapi.RequestBodyOrBuilder getRequestBodyOrBuilder() {
      if ((referenceableRequestBodyCase_ == 2) && (requestBodyBuilder_ != null)) {
        return requestBodyBuilder_.getMessageOrBuilder();
      } else {
        if (referenceableRequestBodyCase_ == 2) {
          return (org.mojolang.mojo.openapi.RequestBody) referenceableRequestBody_;
        }
        return org.mojolang.mojo.openapi.RequestBody.getDefaultInstance();
      }
    }
    /**
     * <code>.mojo.openapi.RequestBody request_body = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.openapi.RequestBody, org.mojolang.mojo.openapi.RequestBody.Builder, org.mojolang.mojo.openapi.RequestBodyOrBuilder> 
        getRequestBodyFieldBuilder() {
      if (requestBodyBuilder_ == null) {
        if (!(referenceableRequestBodyCase_ == 2)) {
          referenceableRequestBody_ = org.mojolang.mojo.openapi.RequestBody.getDefaultInstance();
        }
        requestBodyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojolang.mojo.openapi.RequestBody, org.mojolang.mojo.openapi.RequestBody.Builder, org.mojolang.mojo.openapi.RequestBodyOrBuilder>(
                (org.mojolang.mojo.openapi.RequestBody) referenceableRequestBody_,
                getParentForChildren(),
                isClean());
        referenceableRequestBody_ = null;
      }
      referenceableRequestBodyCase_ = 2;
      onChanged();;
      return requestBodyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:mojo.openapi.ReferenceableRequestBody)
  }

  // @@protoc_insertion_point(class_scope:mojo.openapi.ReferenceableRequestBody)
  private static final org.mojolang.mojo.openapi.ReferenceableRequestBody DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.openapi.ReferenceableRequestBody();
  }

  public static org.mojolang.mojo.openapi.ReferenceableRequestBody getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReferenceableRequestBody>
      PARSER = new com.google.protobuf.AbstractParser<ReferenceableRequestBody>() {
    @java.lang.Override
    public ReferenceableRequestBody parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReferenceableRequestBody(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReferenceableRequestBody> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReferenceableRequestBody> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.openapi.ReferenceableRequestBody getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

