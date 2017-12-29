// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/referenceable_example.proto

package org.mojolang.mojo.openapi;

/**
 * Protobuf type {@code mojo.openapi.ReferenceableExample}
 */
public final class ReferenceableExample extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.openapi.ReferenceableExample)
    ReferenceableExampleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReferenceableExample.newBuilder() to construct.
  private ReferenceableExample(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReferenceableExample() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReferenceableExample();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReferenceableExample(
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
            if (referenceableExampleCase_ == 1) {
              subBuilder = ((org.mojolang.mojo.openapi.Reference) referenceableExample_).toBuilder();
            }
            referenceableExample_ =
                input.readMessage(org.mojolang.mojo.openapi.Reference.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((org.mojolang.mojo.openapi.Reference) referenceableExample_);
              referenceableExample_ = subBuilder.buildPartial();
            }
            referenceableExampleCase_ = 1;
            break;
          }
          case 18: {
            org.mojolang.mojo.openapi.Example.Builder subBuilder = null;
            if (referenceableExampleCase_ == 2) {
              subBuilder = ((org.mojolang.mojo.openapi.Example) referenceableExample_).toBuilder();
            }
            referenceableExample_ =
                input.readMessage(org.mojolang.mojo.openapi.Example.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((org.mojolang.mojo.openapi.Example) referenceableExample_);
              referenceableExample_ = subBuilder.buildPartial();
            }
            referenceableExampleCase_ = 2;
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
    return org.mojolang.mojo.openapi.ReferenceableExampleProto.internal_static_mojo_openapi_ReferenceableExample_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.openapi.ReferenceableExampleProto.internal_static_mojo_openapi_ReferenceableExample_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.openapi.ReferenceableExample.class, org.mojolang.mojo.openapi.ReferenceableExample.Builder.class);
  }

  private int referenceableExampleCase_ = 0;
  private java.lang.Object referenceableExample_;
  public enum ReferenceableExampleCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    REFERENCE(1),
    EXAMPLE(2),
    REFERENCEABLEEXAMPLE_NOT_SET(0);
    private final int value;
    private ReferenceableExampleCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ReferenceableExampleCase valueOf(int value) {
      return forNumber(value);
    }

    public static ReferenceableExampleCase forNumber(int value) {
      switch (value) {
        case 1: return REFERENCE;
        case 2: return EXAMPLE;
        case 0: return REFERENCEABLEEXAMPLE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ReferenceableExampleCase
  getReferenceableExampleCase() {
    return ReferenceableExampleCase.forNumber(
        referenceableExampleCase_);
  }

  public static final int REFERENCE_FIELD_NUMBER = 1;
  /**
   * <code>.mojo.openapi.Reference reference = 1;</code>
   * @return Whether the reference field is set.
   */
  @java.lang.Override
  public boolean hasReference() {
    return referenceableExampleCase_ == 1;
  }
  /**
   * <code>.mojo.openapi.Reference reference = 1;</code>
   * @return The reference.
   */
  @java.lang.Override
  public org.mojolang.mojo.openapi.Reference getReference() {
    if (referenceableExampleCase_ == 1) {
       return (org.mojolang.mojo.openapi.Reference) referenceableExample_;
    }
    return org.mojolang.mojo.openapi.Reference.getDefaultInstance();
  }
  /**
   * <code>.mojo.openapi.Reference reference = 1;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.openapi.ReferenceOrBuilder getReferenceOrBuilder() {
    if (referenceableExampleCase_ == 1) {
       return (org.mojolang.mojo.openapi.Reference) referenceableExample_;
    }
    return org.mojolang.mojo.openapi.Reference.getDefaultInstance();
  }

  public static final int EXAMPLE_FIELD_NUMBER = 2;
  /**
   * <code>.mojo.openapi.Example example = 2;</code>
   * @return Whether the example field is set.
   */
  @java.lang.Override
  public boolean hasExample() {
    return referenceableExampleCase_ == 2;
  }
  /**
   * <code>.mojo.openapi.Example example = 2;</code>
   * @return The example.
   */
  @java.lang.Override
  public org.mojolang.mojo.openapi.Example getExample() {
    if (referenceableExampleCase_ == 2) {
       return (org.mojolang.mojo.openapi.Example) referenceableExample_;
    }
    return org.mojolang.mojo.openapi.Example.getDefaultInstance();
  }
  /**
   * <code>.mojo.openapi.Example example = 2;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.openapi.ExampleOrBuilder getExampleOrBuilder() {
    if (referenceableExampleCase_ == 2) {
       return (org.mojolang.mojo.openapi.Example) referenceableExample_;
    }
    return org.mojolang.mojo.openapi.Example.getDefaultInstance();
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
    if (referenceableExampleCase_ == 1) {
      output.writeMessage(1, (org.mojolang.mojo.openapi.Reference) referenceableExample_);
    }
    if (referenceableExampleCase_ == 2) {
      output.writeMessage(2, (org.mojolang.mojo.openapi.Example) referenceableExample_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (referenceableExampleCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (org.mojolang.mojo.openapi.Reference) referenceableExample_);
    }
    if (referenceableExampleCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (org.mojolang.mojo.openapi.Example) referenceableExample_);
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
    if (!(obj instanceof org.mojolang.mojo.openapi.ReferenceableExample)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.openapi.ReferenceableExample other = (org.mojolang.mojo.openapi.ReferenceableExample) obj;

    if (!getReferenceableExampleCase().equals(other.getReferenceableExampleCase())) return false;
    switch (referenceableExampleCase_) {
      case 1:
        if (!getReference()
            .equals(other.getReference())) return false;
        break;
      case 2:
        if (!getExample()
            .equals(other.getExample())) return false;
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
    switch (referenceableExampleCase_) {
      case 1:
        hash = (37 * hash) + REFERENCE_FIELD_NUMBER;
        hash = (53 * hash) + getReference().hashCode();
        break;
      case 2:
        hash = (37 * hash) + EXAMPLE_FIELD_NUMBER;
        hash = (53 * hash) + getExample().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.openapi.ReferenceableExample parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.ReferenceableExample parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.ReferenceableExample parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.ReferenceableExample parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.ReferenceableExample parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.ReferenceableExample parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.ReferenceableExample parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.ReferenceableExample parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.ReferenceableExample parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.ReferenceableExample parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.ReferenceableExample parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.ReferenceableExample parseFrom(
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
  public static Builder newBuilder(org.mojolang.mojo.openapi.ReferenceableExample prototype) {
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
   * Protobuf type {@code mojo.openapi.ReferenceableExample}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.openapi.ReferenceableExample)
      org.mojolang.mojo.openapi.ReferenceableExampleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.openapi.ReferenceableExampleProto.internal_static_mojo_openapi_ReferenceableExample_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.openapi.ReferenceableExampleProto.internal_static_mojo_openapi_ReferenceableExample_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.openapi.ReferenceableExample.class, org.mojolang.mojo.openapi.ReferenceableExample.Builder.class);
    }

    // Construct using org.mojolang.mojo.openapi.ReferenceableExample.newBuilder()
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
      referenceableExampleCase_ = 0;
      referenceableExample_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.openapi.ReferenceableExampleProto.internal_static_mojo_openapi_ReferenceableExample_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.ReferenceableExample getDefaultInstanceForType() {
      return org.mojolang.mojo.openapi.ReferenceableExample.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.ReferenceableExample build() {
      org.mojolang.mojo.openapi.ReferenceableExample result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.ReferenceableExample buildPartial() {
      org.mojolang.mojo.openapi.ReferenceableExample result = new org.mojolang.mojo.openapi.ReferenceableExample(this);
      if (referenceableExampleCase_ == 1) {
        if (referenceBuilder_ == null) {
          result.referenceableExample_ = referenceableExample_;
        } else {
          result.referenceableExample_ = referenceBuilder_.build();
        }
      }
      if (referenceableExampleCase_ == 2) {
        if (exampleBuilder_ == null) {
          result.referenceableExample_ = referenceableExample_;
        } else {
          result.referenceableExample_ = exampleBuilder_.build();
        }
      }
      result.referenceableExampleCase_ = referenceableExampleCase_;
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
      if (other instanceof org.mojolang.mojo.openapi.ReferenceableExample) {
        return mergeFrom((org.mojolang.mojo.openapi.ReferenceableExample)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.openapi.ReferenceableExample other) {
      if (other == org.mojolang.mojo.openapi.ReferenceableExample.getDefaultInstance()) return this;
      switch (other.getReferenceableExampleCase()) {
        case REFERENCE: {
          mergeReference(other.getReference());
          break;
        }
        case EXAMPLE: {
          mergeExample(other.getExample());
          break;
        }
        case REFERENCEABLEEXAMPLE_NOT_SET: {
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
      org.mojolang.mojo.openapi.ReferenceableExample parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.mojolang.mojo.openapi.ReferenceableExample) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int referenceableExampleCase_ = 0;
    private java.lang.Object referenceableExample_;
    public ReferenceableExampleCase
        getReferenceableExampleCase() {
      return ReferenceableExampleCase.forNumber(
          referenceableExampleCase_);
    }

    public Builder clearReferenceableExample() {
      referenceableExampleCase_ = 0;
      referenceableExample_ = null;
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
      return referenceableExampleCase_ == 1;
    }
    /**
     * <code>.mojo.openapi.Reference reference = 1;</code>
     * @return The reference.
     */
    @java.lang.Override
    public org.mojolang.mojo.openapi.Reference getReference() {
      if (referenceBuilder_ == null) {
        if (referenceableExampleCase_ == 1) {
          return (org.mojolang.mojo.openapi.Reference) referenceableExample_;
        }
        return org.mojolang.mojo.openapi.Reference.getDefaultInstance();
      } else {
        if (referenceableExampleCase_ == 1) {
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
        referenceableExample_ = value;
        onChanged();
      } else {
        referenceBuilder_.setMessage(value);
      }
      referenceableExampleCase_ = 1;
      return this;
    }
    /**
     * <code>.mojo.openapi.Reference reference = 1;</code>
     */
    public Builder setReference(
        org.mojolang.mojo.openapi.Reference.Builder builderForValue) {
      if (referenceBuilder_ == null) {
        referenceableExample_ = builderForValue.build();
        onChanged();
      } else {
        referenceBuilder_.setMessage(builderForValue.build());
      }
      referenceableExampleCase_ = 1;
      return this;
    }
    /**
     * <code>.mojo.openapi.Reference reference = 1;</code>
     */
    public Builder mergeReference(org.mojolang.mojo.openapi.Reference value) {
      if (referenceBuilder_ == null) {
        if (referenceableExampleCase_ == 1 &&
            referenceableExample_ != org.mojolang.mojo.openapi.Reference.getDefaultInstance()) {
          referenceableExample_ = org.mojolang.mojo.openapi.Reference.newBuilder((org.mojolang.mojo.openapi.Reference) referenceableExample_)
              .mergeFrom(value).buildPartial();
        } else {
          referenceableExample_ = value;
        }
        onChanged();
      } else {
        if (referenceableExampleCase_ == 1) {
          referenceBuilder_.mergeFrom(value);
        }
        referenceBuilder_.setMessage(value);
      }
      referenceableExampleCase_ = 1;
      return this;
    }
    /**
     * <code>.mojo.openapi.Reference reference = 1;</code>
     */
    public Builder clearReference() {
      if (referenceBuilder_ == null) {
        if (referenceableExampleCase_ == 1) {
          referenceableExampleCase_ = 0;
          referenceableExample_ = null;
          onChanged();
        }
      } else {
        if (referenceableExampleCase_ == 1) {
          referenceableExampleCase_ = 0;
          referenceableExample_ = null;
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
      if ((referenceableExampleCase_ == 1) && (referenceBuilder_ != null)) {
        return referenceBuilder_.getMessageOrBuilder();
      } else {
        if (referenceableExampleCase_ == 1) {
          return (org.mojolang.mojo.openapi.Reference) referenceableExample_;
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
        if (!(referenceableExampleCase_ == 1)) {
          referenceableExample_ = org.mojolang.mojo.openapi.Reference.getDefaultInstance();
        }
        referenceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojolang.mojo.openapi.Reference, org.mojolang.mojo.openapi.Reference.Builder, org.mojolang.mojo.openapi.ReferenceOrBuilder>(
                (org.mojolang.mojo.openapi.Reference) referenceableExample_,
                getParentForChildren(),
                isClean());
        referenceableExample_ = null;
      }
      referenceableExampleCase_ = 1;
      onChanged();;
      return referenceBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.openapi.Example, org.mojolang.mojo.openapi.Example.Builder, org.mojolang.mojo.openapi.ExampleOrBuilder> exampleBuilder_;
    /**
     * <code>.mojo.openapi.Example example = 2;</code>
     * @return Whether the example field is set.
     */
    @java.lang.Override
    public boolean hasExample() {
      return referenceableExampleCase_ == 2;
    }
    /**
     * <code>.mojo.openapi.Example example = 2;</code>
     * @return The example.
     */
    @java.lang.Override
    public org.mojolang.mojo.openapi.Example getExample() {
      if (exampleBuilder_ == null) {
        if (referenceableExampleCase_ == 2) {
          return (org.mojolang.mojo.openapi.Example) referenceableExample_;
        }
        return org.mojolang.mojo.openapi.Example.getDefaultInstance();
      } else {
        if (referenceableExampleCase_ == 2) {
          return exampleBuilder_.getMessage();
        }
        return org.mojolang.mojo.openapi.Example.getDefaultInstance();
      }
    }
    /**
     * <code>.mojo.openapi.Example example = 2;</code>
     */
    public Builder setExample(org.mojolang.mojo.openapi.Example value) {
      if (exampleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        referenceableExample_ = value;
        onChanged();
      } else {
        exampleBuilder_.setMessage(value);
      }
      referenceableExampleCase_ = 2;
      return this;
    }
    /**
     * <code>.mojo.openapi.Example example = 2;</code>
     */
    public Builder setExample(
        org.mojolang.mojo.openapi.Example.Builder builderForValue) {
      if (exampleBuilder_ == null) {
        referenceableExample_ = builderForValue.build();
        onChanged();
      } else {
        exampleBuilder_.setMessage(builderForValue.build());
      }
      referenceableExampleCase_ = 2;
      return this;
    }
    /**
     * <code>.mojo.openapi.Example example = 2;</code>
     */
    public Builder mergeExample(org.mojolang.mojo.openapi.Example value) {
      if (exampleBuilder_ == null) {
        if (referenceableExampleCase_ == 2 &&
            referenceableExample_ != org.mojolang.mojo.openapi.Example.getDefaultInstance()) {
          referenceableExample_ = org.mojolang.mojo.openapi.Example.newBuilder((org.mojolang.mojo.openapi.Example) referenceableExample_)
              .mergeFrom(value).buildPartial();
        } else {
          referenceableExample_ = value;
        }
        onChanged();
      } else {
        if (referenceableExampleCase_ == 2) {
          exampleBuilder_.mergeFrom(value);
        }
        exampleBuilder_.setMessage(value);
      }
      referenceableExampleCase_ = 2;
      return this;
    }
    /**
     * <code>.mojo.openapi.Example example = 2;</code>
     */
    public Builder clearExample() {
      if (exampleBuilder_ == null) {
        if (referenceableExampleCase_ == 2) {
          referenceableExampleCase_ = 0;
          referenceableExample_ = null;
          onChanged();
        }
      } else {
        if (referenceableExampleCase_ == 2) {
          referenceableExampleCase_ = 0;
          referenceableExample_ = null;
        }
        exampleBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.mojo.openapi.Example example = 2;</code>
     */
    public org.mojolang.mojo.openapi.Example.Builder getExampleBuilder() {
      return getExampleFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.openapi.Example example = 2;</code>
     */
    @java.lang.Override
    public org.mojolang.mojo.openapi.ExampleOrBuilder getExampleOrBuilder() {
      if ((referenceableExampleCase_ == 2) && (exampleBuilder_ != null)) {
        return exampleBuilder_.getMessageOrBuilder();
      } else {
        if (referenceableExampleCase_ == 2) {
          return (org.mojolang.mojo.openapi.Example) referenceableExample_;
        }
        return org.mojolang.mojo.openapi.Example.getDefaultInstance();
      }
    }
    /**
     * <code>.mojo.openapi.Example example = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.openapi.Example, org.mojolang.mojo.openapi.Example.Builder, org.mojolang.mojo.openapi.ExampleOrBuilder> 
        getExampleFieldBuilder() {
      if (exampleBuilder_ == null) {
        if (!(referenceableExampleCase_ == 2)) {
          referenceableExample_ = org.mojolang.mojo.openapi.Example.getDefaultInstance();
        }
        exampleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojolang.mojo.openapi.Example, org.mojolang.mojo.openapi.Example.Builder, org.mojolang.mojo.openapi.ExampleOrBuilder>(
                (org.mojolang.mojo.openapi.Example) referenceableExample_,
                getParentForChildren(),
                isClean());
        referenceableExample_ = null;
      }
      referenceableExampleCase_ = 2;
      onChanged();;
      return exampleBuilder_;
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


    // @@protoc_insertion_point(builder_scope:mojo.openapi.ReferenceableExample)
  }

  // @@protoc_insertion_point(class_scope:mojo.openapi.ReferenceableExample)
  private static final org.mojolang.mojo.openapi.ReferenceableExample DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.openapi.ReferenceableExample();
  }

  public static org.mojolang.mojo.openapi.ReferenceableExample getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReferenceableExample>
      PARSER = new com.google.protobuf.AbstractParser<ReferenceableExample>() {
    @java.lang.Override
    public ReferenceableExample parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReferenceableExample(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReferenceableExample> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReferenceableExample> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.openapi.ReferenceableExample getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

