// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/lint.proto

package org.mojolang.mojo.openapi;

/**
 * Protobuf type {@code mojo.openapi.LintResult}
 */
public final class LintResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.openapi.LintResult)
    LintResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LintResult.newBuilder() to construct.
  private LintResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LintResult() {
    operations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LintResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mojolang.mojo.openapi.LintProto.internal_static_mojo_openapi_LintResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.openapi.LintProto.internal_static_mojo_openapi_LintResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.openapi.LintResult.class, org.mojolang.mojo.openapi.LintResult.Builder.class);
  }

  public static final int VALID_FIELD_NUMBER = 1;
  private boolean valid_ = false;
  /**
   * <code>bool valid = 1;</code>
   * @return The valid.
   */
  @java.lang.Override
  public boolean getValid() {
    return valid_;
  }

  public static final int OPERATIONS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<org.mojolang.mojo.openapi.LintOperation> operations_;
  /**
   * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.mojolang.mojo.openapi.LintOperation> getOperationsList() {
    return operations_;
  }
  /**
   * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.mojolang.mojo.openapi.LintOperationOrBuilder> 
      getOperationsOrBuilderList() {
    return operations_;
  }
  /**
   * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
   */
  @java.lang.Override
  public int getOperationsCount() {
    return operations_.size();
  }
  /**
   * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.openapi.LintOperation getOperations(int index) {
    return operations_.get(index);
  }
  /**
   * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.openapi.LintOperationOrBuilder getOperationsOrBuilder(
      int index) {
    return operations_.get(index);
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
    if (valid_ != false) {
      output.writeBool(1, valid_);
    }
    for (int i = 0; i < operations_.size(); i++) {
      output.writeMessage(2, operations_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (valid_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, valid_);
    }
    for (int i = 0; i < operations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, operations_.get(i));
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
    if (!(obj instanceof org.mojolang.mojo.openapi.LintResult)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.openapi.LintResult other = (org.mojolang.mojo.openapi.LintResult) obj;

    if (getValid()
        != other.getValid()) return false;
    if (!getOperationsList()
        .equals(other.getOperationsList())) return false;
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
    hash = (37 * hash) + VALID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getValid());
    if (getOperationsCount() > 0) {
      hash = (37 * hash) + OPERATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOperationsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.openapi.LintResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.LintResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.LintResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.LintResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.LintResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.openapi.LintResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.LintResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.LintResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.LintResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.LintResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.openapi.LintResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.openapi.LintResult parseFrom(
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
  public static Builder newBuilder(org.mojolang.mojo.openapi.LintResult prototype) {
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
   * Protobuf type {@code mojo.openapi.LintResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.openapi.LintResult)
      org.mojolang.mojo.openapi.LintResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.openapi.LintProto.internal_static_mojo_openapi_LintResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.openapi.LintProto.internal_static_mojo_openapi_LintResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.openapi.LintResult.class, org.mojolang.mojo.openapi.LintResult.Builder.class);
    }

    // Construct using org.mojolang.mojo.openapi.LintResult.newBuilder()
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
      valid_ = false;
      if (operationsBuilder_ == null) {
        operations_ = java.util.Collections.emptyList();
      } else {
        operations_ = null;
        operationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.openapi.LintProto.internal_static_mojo_openapi_LintResult_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.LintResult getDefaultInstanceForType() {
      return org.mojolang.mojo.openapi.LintResult.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.LintResult build() {
      org.mojolang.mojo.openapi.LintResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.openapi.LintResult buildPartial() {
      org.mojolang.mojo.openapi.LintResult result = new org.mojolang.mojo.openapi.LintResult(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.mojolang.mojo.openapi.LintResult result) {
      if (operationsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          operations_ = java.util.Collections.unmodifiableList(operations_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.operations_ = operations_;
      } else {
        result.operations_ = operationsBuilder_.build();
      }
    }

    private void buildPartial0(org.mojolang.mojo.openapi.LintResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.valid_ = valid_;
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
      if (other instanceof org.mojolang.mojo.openapi.LintResult) {
        return mergeFrom((org.mojolang.mojo.openapi.LintResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.openapi.LintResult other) {
      if (other == org.mojolang.mojo.openapi.LintResult.getDefaultInstance()) return this;
      if (other.getValid() != false) {
        setValid(other.getValid());
      }
      if (operationsBuilder_ == null) {
        if (!other.operations_.isEmpty()) {
          if (operations_.isEmpty()) {
            operations_ = other.operations_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureOperationsIsMutable();
            operations_.addAll(other.operations_);
          }
          onChanged();
        }
      } else {
        if (!other.operations_.isEmpty()) {
          if (operationsBuilder_.isEmpty()) {
            operationsBuilder_.dispose();
            operationsBuilder_ = null;
            operations_ = other.operations_;
            bitField0_ = (bitField0_ & ~0x00000002);
            operationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOperationsFieldBuilder() : null;
          } else {
            operationsBuilder_.addAllMessages(other.operations_);
          }
        }
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
            case 8: {
              valid_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              org.mojolang.mojo.openapi.LintOperation m =
                  input.readMessage(
                      org.mojolang.mojo.openapi.LintOperation.parser(),
                      extensionRegistry);
              if (operationsBuilder_ == null) {
                ensureOperationsIsMutable();
                operations_.add(m);
              } else {
                operationsBuilder_.addMessage(m);
              }
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

    private boolean valid_ ;
    /**
     * <code>bool valid = 1;</code>
     * @return The valid.
     */
    @java.lang.Override
    public boolean getValid() {
      return valid_;
    }
    /**
     * <code>bool valid = 1;</code>
     * @param value The valid to set.
     * @return This builder for chaining.
     */
    public Builder setValid(boolean value) {
      
      valid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool valid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearValid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      valid_ = false;
      onChanged();
      return this;
    }

    private java.util.List<org.mojolang.mojo.openapi.LintOperation> operations_ =
      java.util.Collections.emptyList();
    private void ensureOperationsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        operations_ = new java.util.ArrayList<org.mojolang.mojo.openapi.LintOperation>(operations_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.mojolang.mojo.openapi.LintOperation, org.mojolang.mojo.openapi.LintOperation.Builder, org.mojolang.mojo.openapi.LintOperationOrBuilder> operationsBuilder_;

    /**
     * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
     */
    public java.util.List<org.mojolang.mojo.openapi.LintOperation> getOperationsList() {
      if (operationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(operations_);
      } else {
        return operationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
     */
    public int getOperationsCount() {
      if (operationsBuilder_ == null) {
        return operations_.size();
      } else {
        return operationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
     */
    public org.mojolang.mojo.openapi.LintOperation getOperations(int index) {
      if (operationsBuilder_ == null) {
        return operations_.get(index);
      } else {
        return operationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
     */
    public Builder setOperations(
        int index, org.mojolang.mojo.openapi.LintOperation value) {
      if (operationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.set(index, value);
        onChanged();
      } else {
        operationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
     */
    public Builder setOperations(
        int index, org.mojolang.mojo.openapi.LintOperation.Builder builderForValue) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.set(index, builderForValue.build());
        onChanged();
      } else {
        operationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
     */
    public Builder addOperations(org.mojolang.mojo.openapi.LintOperation value) {
      if (operationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.add(value);
        onChanged();
      } else {
        operationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
     */
    public Builder addOperations(
        int index, org.mojolang.mojo.openapi.LintOperation value) {
      if (operationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.add(index, value);
        onChanged();
      } else {
        operationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
     */
    public Builder addOperations(
        org.mojolang.mojo.openapi.LintOperation.Builder builderForValue) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.add(builderForValue.build());
        onChanged();
      } else {
        operationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
     */
    public Builder addOperations(
        int index, org.mojolang.mojo.openapi.LintOperation.Builder builderForValue) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.add(index, builderForValue.build());
        onChanged();
      } else {
        operationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
     */
    public Builder addAllOperations(
        java.lang.Iterable<? extends org.mojolang.mojo.openapi.LintOperation> values) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, operations_);
        onChanged();
      } else {
        operationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
     */
    public Builder clearOperations() {
      if (operationsBuilder_ == null) {
        operations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        operationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
     */
    public Builder removeOperations(int index) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.remove(index);
        onChanged();
      } else {
        operationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
     */
    public org.mojolang.mojo.openapi.LintOperation.Builder getOperationsBuilder(
        int index) {
      return getOperationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
     */
    public org.mojolang.mojo.openapi.LintOperationOrBuilder getOperationsOrBuilder(
        int index) {
      if (operationsBuilder_ == null) {
        return operations_.get(index);  } else {
        return operationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
     */
    public java.util.List<? extends org.mojolang.mojo.openapi.LintOperationOrBuilder> 
         getOperationsOrBuilderList() {
      if (operationsBuilder_ != null) {
        return operationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(operations_);
      }
    }
    /**
     * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
     */
    public org.mojolang.mojo.openapi.LintOperation.Builder addOperationsBuilder() {
      return getOperationsFieldBuilder().addBuilder(
          org.mojolang.mojo.openapi.LintOperation.getDefaultInstance());
    }
    /**
     * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
     */
    public org.mojolang.mojo.openapi.LintOperation.Builder addOperationsBuilder(
        int index) {
      return getOperationsFieldBuilder().addBuilder(
          index, org.mojolang.mojo.openapi.LintOperation.getDefaultInstance());
    }
    /**
     * <code>repeated .mojo.openapi.LintOperation operations = 2;</code>
     */
    public java.util.List<org.mojolang.mojo.openapi.LintOperation.Builder> 
         getOperationsBuilderList() {
      return getOperationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.mojolang.mojo.openapi.LintOperation, org.mojolang.mojo.openapi.LintOperation.Builder, org.mojolang.mojo.openapi.LintOperationOrBuilder> 
        getOperationsFieldBuilder() {
      if (operationsBuilder_ == null) {
        operationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.mojolang.mojo.openapi.LintOperation, org.mojolang.mojo.openapi.LintOperation.Builder, org.mojolang.mojo.openapi.LintOperationOrBuilder>(
                operations_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        operations_ = null;
      }
      return operationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:mojo.openapi.LintResult)
  }

  // @@protoc_insertion_point(class_scope:mojo.openapi.LintResult)
  private static final org.mojolang.mojo.openapi.LintResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.openapi.LintResult();
  }

  public static org.mojolang.mojo.openapi.LintResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LintResult>
      PARSER = new com.google.protobuf.AbstractParser<LintResult>() {
    @java.lang.Override
    public LintResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<LintResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LintResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.openapi.LintResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

