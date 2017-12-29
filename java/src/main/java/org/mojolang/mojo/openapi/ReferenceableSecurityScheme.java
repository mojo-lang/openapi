// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/referenceable_security_scheme.proto

package org.mojolang.mojo.openapi;

/**
 * Protobuf type {@code mojo.openapi.ReferenceableSecurityScheme}
 */
public final class ReferenceableSecurityScheme extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.openapi.ReferenceableSecurityScheme)
    ReferenceableSecuritySchemeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReferenceableSecurityScheme.newBuilder() to construct.
  private ReferenceableSecurityScheme(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReferenceableSecurityScheme() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReferenceableSecurityScheme();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReferenceableSecurityScheme(
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
            if (referenceableSecuritySchemeCase_ == 1) {
              subBuilder = ((org.mojolang.mojo.openapi.Reference) referenceableSecurityScheme_).toBuilder();
            }
            referenceableSecurityScheme_ =
                input.readMessage(org.mojolang.mojo.openapi.Reference.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((org.mojolang.mojo.openapi.Reference) referenceableSecurityScheme_);
              referenceableSecurityScheme_ = subBuilder.buildPartial();
            }
            referenceableSecuritySchemeCase_ = 1;
            break;
          }
          case 18: {
            org.mojolang.mojo.openapi.SecurityScheme.Builder subBuilder = null;
            if (referenceableSecuritySchemeCase_ == 2) {
              subBuilder = ((org.mojolang.mojo.openapi.SecurityScheme) referenceableSecurityScheme_).toBuilder();
            }
            referenceableSecurityScheme_ =
                input.readMessage(org.mojolang.mojo.openapi.SecurityScheme.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((org.mojolang.mojo.openapi.SecurityScheme) referenceableSecurityScheme_);
              referenceableSecurityScheme_ = subBuilder.buildPartial();
            }
            referenceableSecuritySchemeCase_ = 2;
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
    return org.mojolang.mojo.openapi.ReferenceableSecuritySchemeProto.internal_static_mojo_openapi_ReferenceableSecurityScheme_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.openapi.ReferenceableSecuritySchemeProto.internal_static_mojo_openapi_ReferenceableSecurityScheme_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.openapi.ReferenceableSecurityScheme.class, org.mojolang.mojo.openapi.ReferenceableSecurityScheme.Builder.class);
  }

  private int referenceableSecuritySchemeCase_ = 0;
  private java.lang.Object referenceableSecurityScheme_;
  public enum ReferenceableSecuritySchemeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    REFERENCE(1),
    SECURITY_SCHEME(2),
    REFERENCEABLESECURITYSCHEME_NOT_SET(0);
    private final int value;
    private ReferenceableSecuritySchemeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ReferenceableSecuritySchemeCase valueOf(int value) {
      return forNumber(value);
    }

    public static ReferenceableSecuritySchemeCase forNumber(int value) {
      switch (value) {
        case 1: return REFERENCE;
        case 2: return SECURITY_SCHEME;
        case 0: return REFERENCEABLESECURITYSCHEME_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ReferenceableSecuritySchemeCase
  getReferenceableSecuritySchemeCase() {
    return ReferenceableSecuritySchemeCase.forNumber(
        referenceableSecuritySchemeCase_);
  }

  public static final int REFERENCE_FIELD_NUMBER = 1;
  /**
   * <code>.mojo.openapi.Reference reference = 1;</code>
   * @return Whether the reference field is set.
   */
  @java.lang.Override
  public boolean hasReference() {
    return referenceableSecuritySchemeCase_ == 1;
  }
  /**
   * <code>.mojo.openapi.Reference reference = 1;</code>
   * @return The reference.
   */
  @java.lang.Override
  public org.mojolang.mojo.openapi.Reference getReference() {
    if (referenceableSecuritySchemeCase_ == 1) {
       return (org.mojolang.mojo.openapi.Reference) referenceableSecurityScheme_;
    }
    return org.mojolang.mojo.openapi.Reference.getDefaultInstance();
  }
  /**
   * <code>.mojo.openapi.Reference reference = 1;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.openapi.ReferenceOrBuilder getReferenceOrBuilder() {
    if (referenceableSecuritySchemeCase_ == 1) {
       return (org.mojolang.mojo.openapi.Reference) referenceableSecurityScheme_;
    }
    return org.mojolang.mojo.openapi.Reference.getDefaultInstance();
  }

  public static final int SECURITY_SCHEME_FIELD_NUMBER = 2;
  /**
   * <code>.mojo.openapi.SecurityScheme security_scheme = 2;</code>
   * @return Whether the securityScheme field is set.
   */
  @java.lang.Override
  public boolean hasSecurityScheme() {
    return referenceableSecuritySchemeCase_ == 2;
  }
  /**
   * <code>.mojo.openapi.SecurityScheme security_scheme = 2;</code>
   * @return The securityScheme.
   */
  @java.lang.Override
  public org.mojolang.mojo.openapi.SecurityScheme getSecurityScheme() {
    if (referenceableSecuritySchemeCase_ == 2) {
       return (org.mojolang.mojo.openapi.SecurityScheme) referenceableSecurityScheme_;
    }
    return org.mojolang.mojo.openapi.SecurityScheme.getDefaultInstance();
  }
  /**
   * <code>.mojo.openapi.SecurityScheme security_scheme = 2;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.openapi.SecuritySchemeOrBuilder getSecuritySchemeOrBuilder() {
    if (referenceableSecuritySchemeCase_ == 2) {
       return (org.mojolang.mojo.openapi.SecurityScheme) referenceableSecurityScheme_;
    }
    return org.mojolang.mojo.openapi.SecurityScheme.getDefaultInstance();
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
    if (referenceableSecuritySchemeCase_ == 1) {
      output.writeMessage(1, (org.mojolang.mojo.openapi.Reference) referenceableSecurityScheme_);
    }
    if (referenceableSecuritySchemeCase_ == 2) {
      output.writeMessage(2, (org.mojolang.mojo.openapi.SecurityScheme) referenceableSecurityScheme_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (referenceableSecuritySchemeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (org.mojolang.mojo.openapi.Reference) referenceableSecurityScheme_);
    }
    if (referenceableSecuritySchemeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (org.mojolang.mojo.openapi.SecurityScheme) referenceableSecurityScheme_);
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
    if (!(obj instanceof org.mojolang.mojo.openapi.ReferenceableSecurityScheme)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.openapi.ReferenceableSecurityScheme other = (org.mojolang.mojo.openapi.ReferenceableSecurityScheme) obj;

    if (!getReferenceableSecuritySchemeCase().equals(other.getReferenceableSecuritySchemeCase())) return false;
    switch (referenceableSecuritySchemeCase_) {
      case 1:
        if (!getReference()
            .equals(other.getReference())) return false;
        break;
      case 2:
        if (!getSecurityScheme()
            .equals(other.getSecurityScheme())) return false;
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
    switch (referenceableSecuritySchemeCase_) {
      case 1:
        hash = (37 * hash) + REFERENCE_FIELD_NUMBER;
        hash = (53 * hash) + getReference().hashCode();
        break;
      case 2:
        hash = (37 * hash) + SECURITY_SCHEME_FIELD_NUMBER;
        hash = (53 * hash) + getSecurityScheme().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.openapi.ReferenceableSecurityScheme parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.ReferenceableSecurityScheme parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.ReferenceableSecurityScheme parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.ReferenceableSecurityScheme parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.ReferenceableSecurityScheme parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.ReferenceableSecurityScheme parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.ReferenceableSecurityScheme parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.ReferenceableSecurityScheme parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.ReferenceableSecurityScheme parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.ReferenceableSecurityScheme parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.ReferenceableSecurityScheme parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.ReferenceableSecurityScheme parseFrom(
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
  public static Builder newBuilder(org.mojolang.mojo.openapi.ReferenceableSecurityScheme prototype) {
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
   * Protobuf type {@code mojo.openapi.ReferenceableSecurityScheme}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.openapi.ReferenceableSecurityScheme)
      org.mojolang.mojo.openapi.ReferenceableSecuritySchemeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.openapi.ReferenceableSecuritySchemeProto.internal_static_mojo_openapi_ReferenceableSecurityScheme_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.openapi.ReferenceableSecuritySchemeProto.internal_static_mojo_openapi_ReferenceableSecurityScheme_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.openapi.ReferenceableSecurityScheme.class, org.mojolang.mojo.openapi.ReferenceableSecurityScheme.Builder.class);
    }

    // Construct using org.mojolang.mojo.openapi.ReferenceableSecurityScheme.newBuilder()
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
      referenceableSecuritySchemeCase_ = 0;
      referenceableSecurityScheme_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.openapi.ReferenceableSecuritySchemeProto.internal_static_mojo_openapi_ReferenceableSecurityScheme_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.ReferenceableSecurityScheme getDefaultInstanceForType() {
      return org.mojolang.mojo.openapi.ReferenceableSecurityScheme.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.ReferenceableSecurityScheme build() {
      org.mojolang.mojo.openapi.ReferenceableSecurityScheme result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.ReferenceableSecurityScheme buildPartial() {
      org.mojolang.mojo.openapi.ReferenceableSecurityScheme result = new org.mojolang.mojo.openapi.ReferenceableSecurityScheme(this);
      if (referenceableSecuritySchemeCase_ == 1) {
        if (referenceBuilder_ == null) {
          result.referenceableSecurityScheme_ = referenceableSecurityScheme_;
        } else {
          result.referenceableSecurityScheme_ = referenceBuilder_.build();
        }
      }
      if (referenceableSecuritySchemeCase_ == 2) {
        if (securitySchemeBuilder_ == null) {
          result.referenceableSecurityScheme_ = referenceableSecurityScheme_;
        } else {
          result.referenceableSecurityScheme_ = securitySchemeBuilder_.build();
        }
      }
      result.referenceableSecuritySchemeCase_ = referenceableSecuritySchemeCase_;
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
      if (other instanceof org.mojolang.mojo.openapi.ReferenceableSecurityScheme) {
        return mergeFrom((org.mojolang.mojo.openapi.ReferenceableSecurityScheme)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.openapi.ReferenceableSecurityScheme other) {
      if (other == org.mojolang.mojo.openapi.ReferenceableSecurityScheme.getDefaultInstance()) return this;
      switch (other.getReferenceableSecuritySchemeCase()) {
        case REFERENCE: {
          mergeReference(other.getReference());
          break;
        }
        case SECURITY_SCHEME: {
          mergeSecurityScheme(other.getSecurityScheme());
          break;
        }
        case REFERENCEABLESECURITYSCHEME_NOT_SET: {
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
      org.mojolang.mojo.openapi.ReferenceableSecurityScheme parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.mojolang.mojo.openapi.ReferenceableSecurityScheme) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int referenceableSecuritySchemeCase_ = 0;
    private java.lang.Object referenceableSecurityScheme_;
    public ReferenceableSecuritySchemeCase
        getReferenceableSecuritySchemeCase() {
      return ReferenceableSecuritySchemeCase.forNumber(
          referenceableSecuritySchemeCase_);
    }

    public Builder clearReferenceableSecurityScheme() {
      referenceableSecuritySchemeCase_ = 0;
      referenceableSecurityScheme_ = null;
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
      return referenceableSecuritySchemeCase_ == 1;
    }
    /**
     * <code>.mojo.openapi.Reference reference = 1;</code>
     * @return The reference.
     */
    @java.lang.Override
    public org.mojolang.mojo.openapi.Reference getReference() {
      if (referenceBuilder_ == null) {
        if (referenceableSecuritySchemeCase_ == 1) {
          return (org.mojolang.mojo.openapi.Reference) referenceableSecurityScheme_;
        }
        return org.mojolang.mojo.openapi.Reference.getDefaultInstance();
      } else {
        if (referenceableSecuritySchemeCase_ == 1) {
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
        referenceableSecurityScheme_ = value;
        onChanged();
      } else {
        referenceBuilder_.setMessage(value);
      }
      referenceableSecuritySchemeCase_ = 1;
      return this;
    }
    /**
     * <code>.mojo.openapi.Reference reference = 1;</code>
     */
    public Builder setReference(
        org.mojolang.mojo.openapi.Reference.Builder builderForValue) {
      if (referenceBuilder_ == null) {
        referenceableSecurityScheme_ = builderForValue.build();
        onChanged();
      } else {
        referenceBuilder_.setMessage(builderForValue.build());
      }
      referenceableSecuritySchemeCase_ = 1;
      return this;
    }
    /**
     * <code>.mojo.openapi.Reference reference = 1;</code>
     */
    public Builder mergeReference(org.mojolang.mojo.openapi.Reference value) {
      if (referenceBuilder_ == null) {
        if (referenceableSecuritySchemeCase_ == 1 &&
            referenceableSecurityScheme_ != org.mojolang.mojo.openapi.Reference.getDefaultInstance()) {
          referenceableSecurityScheme_ = org.mojolang.mojo.openapi.Reference.newBuilder((org.mojolang.mojo.openapi.Reference) referenceableSecurityScheme_)
              .mergeFrom(value).buildPartial();
        } else {
          referenceableSecurityScheme_ = value;
        }
        onChanged();
      } else {
        if (referenceableSecuritySchemeCase_ == 1) {
          referenceBuilder_.mergeFrom(value);
        }
        referenceBuilder_.setMessage(value);
      }
      referenceableSecuritySchemeCase_ = 1;
      return this;
    }
    /**
     * <code>.mojo.openapi.Reference reference = 1;</code>
     */
    public Builder clearReference() {
      if (referenceBuilder_ == null) {
        if (referenceableSecuritySchemeCase_ == 1) {
          referenceableSecuritySchemeCase_ = 0;
          referenceableSecurityScheme_ = null;
          onChanged();
        }
      } else {
        if (referenceableSecuritySchemeCase_ == 1) {
          referenceableSecuritySchemeCase_ = 0;
          referenceableSecurityScheme_ = null;
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
      if ((referenceableSecuritySchemeCase_ == 1) && (referenceBuilder_ != null)) {
        return referenceBuilder_.getMessageOrBuilder();
      } else {
        if (referenceableSecuritySchemeCase_ == 1) {
          return (org.mojolang.mojo.openapi.Reference) referenceableSecurityScheme_;
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
        if (!(referenceableSecuritySchemeCase_ == 1)) {
          referenceableSecurityScheme_ = org.mojolang.mojo.openapi.Reference.getDefaultInstance();
        }
        referenceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojolang.mojo.openapi.Reference, org.mojolang.mojo.openapi.Reference.Builder, org.mojolang.mojo.openapi.ReferenceOrBuilder>(
                (org.mojolang.mojo.openapi.Reference) referenceableSecurityScheme_,
                getParentForChildren(),
                isClean());
        referenceableSecurityScheme_ = null;
      }
      referenceableSecuritySchemeCase_ = 1;
      onChanged();;
      return referenceBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.openapi.SecurityScheme, org.mojolang.mojo.openapi.SecurityScheme.Builder, org.mojolang.mojo.openapi.SecuritySchemeOrBuilder> securitySchemeBuilder_;
    /**
     * <code>.mojo.openapi.SecurityScheme security_scheme = 2;</code>
     * @return Whether the securityScheme field is set.
     */
    @java.lang.Override
    public boolean hasSecurityScheme() {
      return referenceableSecuritySchemeCase_ == 2;
    }
    /**
     * <code>.mojo.openapi.SecurityScheme security_scheme = 2;</code>
     * @return The securityScheme.
     */
    @java.lang.Override
    public org.mojolang.mojo.openapi.SecurityScheme getSecurityScheme() {
      if (securitySchemeBuilder_ == null) {
        if (referenceableSecuritySchemeCase_ == 2) {
          return (org.mojolang.mojo.openapi.SecurityScheme) referenceableSecurityScheme_;
        }
        return org.mojolang.mojo.openapi.SecurityScheme.getDefaultInstance();
      } else {
        if (referenceableSecuritySchemeCase_ == 2) {
          return securitySchemeBuilder_.getMessage();
        }
        return org.mojolang.mojo.openapi.SecurityScheme.getDefaultInstance();
      }
    }
    /**
     * <code>.mojo.openapi.SecurityScheme security_scheme = 2;</code>
     */
    public Builder setSecurityScheme(org.mojolang.mojo.openapi.SecurityScheme value) {
      if (securitySchemeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        referenceableSecurityScheme_ = value;
        onChanged();
      } else {
        securitySchemeBuilder_.setMessage(value);
      }
      referenceableSecuritySchemeCase_ = 2;
      return this;
    }
    /**
     * <code>.mojo.openapi.SecurityScheme security_scheme = 2;</code>
     */
    public Builder setSecurityScheme(
        org.mojolang.mojo.openapi.SecurityScheme.Builder builderForValue) {
      if (securitySchemeBuilder_ == null) {
        referenceableSecurityScheme_ = builderForValue.build();
        onChanged();
      } else {
        securitySchemeBuilder_.setMessage(builderForValue.build());
      }
      referenceableSecuritySchemeCase_ = 2;
      return this;
    }
    /**
     * <code>.mojo.openapi.SecurityScheme security_scheme = 2;</code>
     */
    public Builder mergeSecurityScheme(org.mojolang.mojo.openapi.SecurityScheme value) {
      if (securitySchemeBuilder_ == null) {
        if (referenceableSecuritySchemeCase_ == 2 &&
            referenceableSecurityScheme_ != org.mojolang.mojo.openapi.SecurityScheme.getDefaultInstance()) {
          referenceableSecurityScheme_ = org.mojolang.mojo.openapi.SecurityScheme.newBuilder((org.mojolang.mojo.openapi.SecurityScheme) referenceableSecurityScheme_)
              .mergeFrom(value).buildPartial();
        } else {
          referenceableSecurityScheme_ = value;
        }
        onChanged();
      } else {
        if (referenceableSecuritySchemeCase_ == 2) {
          securitySchemeBuilder_.mergeFrom(value);
        }
        securitySchemeBuilder_.setMessage(value);
      }
      referenceableSecuritySchemeCase_ = 2;
      return this;
    }
    /**
     * <code>.mojo.openapi.SecurityScheme security_scheme = 2;</code>
     */
    public Builder clearSecurityScheme() {
      if (securitySchemeBuilder_ == null) {
        if (referenceableSecuritySchemeCase_ == 2) {
          referenceableSecuritySchemeCase_ = 0;
          referenceableSecurityScheme_ = null;
          onChanged();
        }
      } else {
        if (referenceableSecuritySchemeCase_ == 2) {
          referenceableSecuritySchemeCase_ = 0;
          referenceableSecurityScheme_ = null;
        }
        securitySchemeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.mojo.openapi.SecurityScheme security_scheme = 2;</code>
     */
    public org.mojolang.mojo.openapi.SecurityScheme.Builder getSecuritySchemeBuilder() {
      return getSecuritySchemeFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.openapi.SecurityScheme security_scheme = 2;</code>
     */
    @java.lang.Override
    public org.mojolang.mojo.openapi.SecuritySchemeOrBuilder getSecuritySchemeOrBuilder() {
      if ((referenceableSecuritySchemeCase_ == 2) && (securitySchemeBuilder_ != null)) {
        return securitySchemeBuilder_.getMessageOrBuilder();
      } else {
        if (referenceableSecuritySchemeCase_ == 2) {
          return (org.mojolang.mojo.openapi.SecurityScheme) referenceableSecurityScheme_;
        }
        return org.mojolang.mojo.openapi.SecurityScheme.getDefaultInstance();
      }
    }
    /**
     * <code>.mojo.openapi.SecurityScheme security_scheme = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.openapi.SecurityScheme, org.mojolang.mojo.openapi.SecurityScheme.Builder, org.mojolang.mojo.openapi.SecuritySchemeOrBuilder> 
        getSecuritySchemeFieldBuilder() {
      if (securitySchemeBuilder_ == null) {
        if (!(referenceableSecuritySchemeCase_ == 2)) {
          referenceableSecurityScheme_ = org.mojolang.mojo.openapi.SecurityScheme.getDefaultInstance();
        }
        securitySchemeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojolang.mojo.openapi.SecurityScheme, org.mojolang.mojo.openapi.SecurityScheme.Builder, org.mojolang.mojo.openapi.SecuritySchemeOrBuilder>(
                (org.mojolang.mojo.openapi.SecurityScheme) referenceableSecurityScheme_,
                getParentForChildren(),
                isClean());
        referenceableSecurityScheme_ = null;
      }
      referenceableSecuritySchemeCase_ = 2;
      onChanged();;
      return securitySchemeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:mojo.openapi.ReferenceableSecurityScheme)
  }

  // @@protoc_insertion_point(class_scope:mojo.openapi.ReferenceableSecurityScheme)
  private static final org.mojolang.mojo.openapi.ReferenceableSecurityScheme DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.openapi.ReferenceableSecurityScheme();
  }

  public static org.mojolang.mojo.openapi.ReferenceableSecurityScheme getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReferenceableSecurityScheme>
      PARSER = new com.google.protobuf.AbstractParser<ReferenceableSecurityScheme>() {
    @java.lang.Override
    public ReferenceableSecurityScheme parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReferenceableSecurityScheme(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReferenceableSecurityScheme> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReferenceableSecurityScheme> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.openapi.ReferenceableSecurityScheme getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

