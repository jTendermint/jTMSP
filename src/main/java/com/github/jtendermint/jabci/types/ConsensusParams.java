// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.github.jtendermint.jabci.types;

/**
 * <pre>
 * ConsensusParams contains all consensus-relevant parameters
 * that can be adjusted by the abci app
 * </pre>
 *
 * Protobuf type {@code com.github.jtendermint.jabci.types.ConsensusParams}
 */
public  final class ConsensusParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.github.jtendermint.jabci.types.ConsensusParams)
    ConsensusParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConsensusParams.newBuilder() to construct.
  private ConsensusParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConsensusParams() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConsensusParams(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.github.jtendermint.jabci.types.BlockSize.Builder subBuilder = null;
            if (blockSize_ != null) {
              subBuilder = blockSize_.toBuilder();
            }
            blockSize_ = input.readMessage(com.github.jtendermint.jabci.types.BlockSize.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(blockSize_);
              blockSize_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.github.jtendermint.jabci.types.TxSize.Builder subBuilder = null;
            if (txSize_ != null) {
              subBuilder = txSize_.toBuilder();
            }
            txSize_ = input.readMessage(com.github.jtendermint.jabci.types.TxSize.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(txSize_);
              txSize_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.github.jtendermint.jabci.types.BlockGossip.Builder subBuilder = null;
            if (blockGossip_ != null) {
              subBuilder = blockGossip_.toBuilder();
            }
            blockGossip_ = input.readMessage(com.github.jtendermint.jabci.types.BlockGossip.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(blockGossip_);
              blockGossip_ = subBuilder.buildPartial();
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
    return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ConsensusParams_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ConsensusParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.jtendermint.jabci.types.ConsensusParams.class, com.github.jtendermint.jabci.types.ConsensusParams.Builder.class);
  }

  public static final int BLOCK_SIZE_FIELD_NUMBER = 1;
  private com.github.jtendermint.jabci.types.BlockSize blockSize_;
  /**
   * <code>.com.github.jtendermint.jabci.types.BlockSize block_size = 1;</code>
   */
  public boolean hasBlockSize() {
    return blockSize_ != null;
  }
  /**
   * <code>.com.github.jtendermint.jabci.types.BlockSize block_size = 1;</code>
   */
  public com.github.jtendermint.jabci.types.BlockSize getBlockSize() {
    return blockSize_ == null ? com.github.jtendermint.jabci.types.BlockSize.getDefaultInstance() : blockSize_;
  }
  /**
   * <code>.com.github.jtendermint.jabci.types.BlockSize block_size = 1;</code>
   */
  public com.github.jtendermint.jabci.types.BlockSizeOrBuilder getBlockSizeOrBuilder() {
    return getBlockSize();
  }

  public static final int TX_SIZE_FIELD_NUMBER = 2;
  private com.github.jtendermint.jabci.types.TxSize txSize_;
  /**
   * <code>.com.github.jtendermint.jabci.types.TxSize tx_size = 2;</code>
   */
  public boolean hasTxSize() {
    return txSize_ != null;
  }
  /**
   * <code>.com.github.jtendermint.jabci.types.TxSize tx_size = 2;</code>
   */
  public com.github.jtendermint.jabci.types.TxSize getTxSize() {
    return txSize_ == null ? com.github.jtendermint.jabci.types.TxSize.getDefaultInstance() : txSize_;
  }
  /**
   * <code>.com.github.jtendermint.jabci.types.TxSize tx_size = 2;</code>
   */
  public com.github.jtendermint.jabci.types.TxSizeOrBuilder getTxSizeOrBuilder() {
    return getTxSize();
  }

  public static final int BLOCK_GOSSIP_FIELD_NUMBER = 3;
  private com.github.jtendermint.jabci.types.BlockGossip blockGossip_;
  /**
   * <code>.com.github.jtendermint.jabci.types.BlockGossip block_gossip = 3;</code>
   */
  public boolean hasBlockGossip() {
    return blockGossip_ != null;
  }
  /**
   * <code>.com.github.jtendermint.jabci.types.BlockGossip block_gossip = 3;</code>
   */
  public com.github.jtendermint.jabci.types.BlockGossip getBlockGossip() {
    return blockGossip_ == null ? com.github.jtendermint.jabci.types.BlockGossip.getDefaultInstance() : blockGossip_;
  }
  /**
   * <code>.com.github.jtendermint.jabci.types.BlockGossip block_gossip = 3;</code>
   */
  public com.github.jtendermint.jabci.types.BlockGossipOrBuilder getBlockGossipOrBuilder() {
    return getBlockGossip();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (blockSize_ != null) {
      output.writeMessage(1, getBlockSize());
    }
    if (txSize_ != null) {
      output.writeMessage(2, getTxSize());
    }
    if (blockGossip_ != null) {
      output.writeMessage(3, getBlockGossip());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (blockSize_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBlockSize());
    }
    if (txSize_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTxSize());
    }
    if (blockGossip_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getBlockGossip());
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
    if (!(obj instanceof com.github.jtendermint.jabci.types.ConsensusParams)) {
      return super.equals(obj);
    }
    com.github.jtendermint.jabci.types.ConsensusParams other = (com.github.jtendermint.jabci.types.ConsensusParams) obj;

    boolean result = true;
    result = result && (hasBlockSize() == other.hasBlockSize());
    if (hasBlockSize()) {
      result = result && getBlockSize()
          .equals(other.getBlockSize());
    }
    result = result && (hasTxSize() == other.hasTxSize());
    if (hasTxSize()) {
      result = result && getTxSize()
          .equals(other.getTxSize());
    }
    result = result && (hasBlockGossip() == other.hasBlockGossip());
    if (hasBlockGossip()) {
      result = result && getBlockGossip()
          .equals(other.getBlockGossip());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasBlockSize()) {
      hash = (37 * hash) + BLOCK_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getBlockSize().hashCode();
    }
    if (hasTxSize()) {
      hash = (37 * hash) + TX_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getTxSize().hashCode();
    }
    if (hasBlockGossip()) {
      hash = (37 * hash) + BLOCK_GOSSIP_FIELD_NUMBER;
      hash = (53 * hash) + getBlockGossip().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.jtendermint.jabci.types.ConsensusParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.ConsensusParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ConsensusParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.ConsensusParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ConsensusParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.ConsensusParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ConsensusParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.ConsensusParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ConsensusParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.ConsensusParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ConsensusParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.ConsensusParams parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.jtendermint.jabci.types.ConsensusParams prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * ConsensusParams contains all consensus-relevant parameters
   * that can be adjusted by the abci app
   * </pre>
   *
   * Protobuf type {@code com.github.jtendermint.jabci.types.ConsensusParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.github.jtendermint.jabci.types.ConsensusParams)
      com.github.jtendermint.jabci.types.ConsensusParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ConsensusParams_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ConsensusParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.jtendermint.jabci.types.ConsensusParams.class, com.github.jtendermint.jabci.types.ConsensusParams.Builder.class);
    }

    // Construct using com.github.jtendermint.jabci.types.ConsensusParams.newBuilder()
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
    public Builder clear() {
      super.clear();
      if (blockSizeBuilder_ == null) {
        blockSize_ = null;
      } else {
        blockSize_ = null;
        blockSizeBuilder_ = null;
      }
      if (txSizeBuilder_ == null) {
        txSize_ = null;
      } else {
        txSize_ = null;
        txSizeBuilder_ = null;
      }
      if (blockGossipBuilder_ == null) {
        blockGossip_ = null;
      } else {
        blockGossip_ = null;
        blockGossipBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ConsensusParams_descriptor;
    }

    public com.github.jtendermint.jabci.types.ConsensusParams getDefaultInstanceForType() {
      return com.github.jtendermint.jabci.types.ConsensusParams.getDefaultInstance();
    }

    public com.github.jtendermint.jabci.types.ConsensusParams build() {
      com.github.jtendermint.jabci.types.ConsensusParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.jtendermint.jabci.types.ConsensusParams buildPartial() {
      com.github.jtendermint.jabci.types.ConsensusParams result = new com.github.jtendermint.jabci.types.ConsensusParams(this);
      if (blockSizeBuilder_ == null) {
        result.blockSize_ = blockSize_;
      } else {
        result.blockSize_ = blockSizeBuilder_.build();
      }
      if (txSizeBuilder_ == null) {
        result.txSize_ = txSize_;
      } else {
        result.txSize_ = txSizeBuilder_.build();
      }
      if (blockGossipBuilder_ == null) {
        result.blockGossip_ = blockGossip_;
      } else {
        result.blockGossip_ = blockGossipBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.jtendermint.jabci.types.ConsensusParams) {
        return mergeFrom((com.github.jtendermint.jabci.types.ConsensusParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.jtendermint.jabci.types.ConsensusParams other) {
      if (other == com.github.jtendermint.jabci.types.ConsensusParams.getDefaultInstance()) return this;
      if (other.hasBlockSize()) {
        mergeBlockSize(other.getBlockSize());
      }
      if (other.hasTxSize()) {
        mergeTxSize(other.getTxSize());
      }
      if (other.hasBlockGossip()) {
        mergeBlockGossip(other.getBlockGossip());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.github.jtendermint.jabci.types.ConsensusParams parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.jtendermint.jabci.types.ConsensusParams) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.github.jtendermint.jabci.types.BlockSize blockSize_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.jtendermint.jabci.types.BlockSize, com.github.jtendermint.jabci.types.BlockSize.Builder, com.github.jtendermint.jabci.types.BlockSizeOrBuilder> blockSizeBuilder_;
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockSize block_size = 1;</code>
     */
    public boolean hasBlockSize() {
      return blockSizeBuilder_ != null || blockSize_ != null;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockSize block_size = 1;</code>
     */
    public com.github.jtendermint.jabci.types.BlockSize getBlockSize() {
      if (blockSizeBuilder_ == null) {
        return blockSize_ == null ? com.github.jtendermint.jabci.types.BlockSize.getDefaultInstance() : blockSize_;
      } else {
        return blockSizeBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockSize block_size = 1;</code>
     */
    public Builder setBlockSize(com.github.jtendermint.jabci.types.BlockSize value) {
      if (blockSizeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        blockSize_ = value;
        onChanged();
      } else {
        blockSizeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockSize block_size = 1;</code>
     */
    public Builder setBlockSize(
        com.github.jtendermint.jabci.types.BlockSize.Builder builderForValue) {
      if (blockSizeBuilder_ == null) {
        blockSize_ = builderForValue.build();
        onChanged();
      } else {
        blockSizeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockSize block_size = 1;</code>
     */
    public Builder mergeBlockSize(com.github.jtendermint.jabci.types.BlockSize value) {
      if (blockSizeBuilder_ == null) {
        if (blockSize_ != null) {
          blockSize_ =
            com.github.jtendermint.jabci.types.BlockSize.newBuilder(blockSize_).mergeFrom(value).buildPartial();
        } else {
          blockSize_ = value;
        }
        onChanged();
      } else {
        blockSizeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockSize block_size = 1;</code>
     */
    public Builder clearBlockSize() {
      if (blockSizeBuilder_ == null) {
        blockSize_ = null;
        onChanged();
      } else {
        blockSize_ = null;
        blockSizeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockSize block_size = 1;</code>
     */
    public com.github.jtendermint.jabci.types.BlockSize.Builder getBlockSizeBuilder() {
      
      onChanged();
      return getBlockSizeFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockSize block_size = 1;</code>
     */
    public com.github.jtendermint.jabci.types.BlockSizeOrBuilder getBlockSizeOrBuilder() {
      if (blockSizeBuilder_ != null) {
        return blockSizeBuilder_.getMessageOrBuilder();
      } else {
        return blockSize_ == null ?
            com.github.jtendermint.jabci.types.BlockSize.getDefaultInstance() : blockSize_;
      }
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockSize block_size = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.jtendermint.jabci.types.BlockSize, com.github.jtendermint.jabci.types.BlockSize.Builder, com.github.jtendermint.jabci.types.BlockSizeOrBuilder> 
        getBlockSizeFieldBuilder() {
      if (blockSizeBuilder_ == null) {
        blockSizeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.jtendermint.jabci.types.BlockSize, com.github.jtendermint.jabci.types.BlockSize.Builder, com.github.jtendermint.jabci.types.BlockSizeOrBuilder>(
                getBlockSize(),
                getParentForChildren(),
                isClean());
        blockSize_ = null;
      }
      return blockSizeBuilder_;
    }

    private com.github.jtendermint.jabci.types.TxSize txSize_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.jtendermint.jabci.types.TxSize, com.github.jtendermint.jabci.types.TxSize.Builder, com.github.jtendermint.jabci.types.TxSizeOrBuilder> txSizeBuilder_;
    /**
     * <code>.com.github.jtendermint.jabci.types.TxSize tx_size = 2;</code>
     */
    public boolean hasTxSize() {
      return txSizeBuilder_ != null || txSize_ != null;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.TxSize tx_size = 2;</code>
     */
    public com.github.jtendermint.jabci.types.TxSize getTxSize() {
      if (txSizeBuilder_ == null) {
        return txSize_ == null ? com.github.jtendermint.jabci.types.TxSize.getDefaultInstance() : txSize_;
      } else {
        return txSizeBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.TxSize tx_size = 2;</code>
     */
    public Builder setTxSize(com.github.jtendermint.jabci.types.TxSize value) {
      if (txSizeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        txSize_ = value;
        onChanged();
      } else {
        txSizeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.TxSize tx_size = 2;</code>
     */
    public Builder setTxSize(
        com.github.jtendermint.jabci.types.TxSize.Builder builderForValue) {
      if (txSizeBuilder_ == null) {
        txSize_ = builderForValue.build();
        onChanged();
      } else {
        txSizeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.TxSize tx_size = 2;</code>
     */
    public Builder mergeTxSize(com.github.jtendermint.jabci.types.TxSize value) {
      if (txSizeBuilder_ == null) {
        if (txSize_ != null) {
          txSize_ =
            com.github.jtendermint.jabci.types.TxSize.newBuilder(txSize_).mergeFrom(value).buildPartial();
        } else {
          txSize_ = value;
        }
        onChanged();
      } else {
        txSizeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.TxSize tx_size = 2;</code>
     */
    public Builder clearTxSize() {
      if (txSizeBuilder_ == null) {
        txSize_ = null;
        onChanged();
      } else {
        txSize_ = null;
        txSizeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.TxSize tx_size = 2;</code>
     */
    public com.github.jtendermint.jabci.types.TxSize.Builder getTxSizeBuilder() {
      
      onChanged();
      return getTxSizeFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.TxSize tx_size = 2;</code>
     */
    public com.github.jtendermint.jabci.types.TxSizeOrBuilder getTxSizeOrBuilder() {
      if (txSizeBuilder_ != null) {
        return txSizeBuilder_.getMessageOrBuilder();
      } else {
        return txSize_ == null ?
            com.github.jtendermint.jabci.types.TxSize.getDefaultInstance() : txSize_;
      }
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.TxSize tx_size = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.jtendermint.jabci.types.TxSize, com.github.jtendermint.jabci.types.TxSize.Builder, com.github.jtendermint.jabci.types.TxSizeOrBuilder> 
        getTxSizeFieldBuilder() {
      if (txSizeBuilder_ == null) {
        txSizeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.jtendermint.jabci.types.TxSize, com.github.jtendermint.jabci.types.TxSize.Builder, com.github.jtendermint.jabci.types.TxSizeOrBuilder>(
                getTxSize(),
                getParentForChildren(),
                isClean());
        txSize_ = null;
      }
      return txSizeBuilder_;
    }

    private com.github.jtendermint.jabci.types.BlockGossip blockGossip_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.jtendermint.jabci.types.BlockGossip, com.github.jtendermint.jabci.types.BlockGossip.Builder, com.github.jtendermint.jabci.types.BlockGossipOrBuilder> blockGossipBuilder_;
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockGossip block_gossip = 3;</code>
     */
    public boolean hasBlockGossip() {
      return blockGossipBuilder_ != null || blockGossip_ != null;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockGossip block_gossip = 3;</code>
     */
    public com.github.jtendermint.jabci.types.BlockGossip getBlockGossip() {
      if (blockGossipBuilder_ == null) {
        return blockGossip_ == null ? com.github.jtendermint.jabci.types.BlockGossip.getDefaultInstance() : blockGossip_;
      } else {
        return blockGossipBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockGossip block_gossip = 3;</code>
     */
    public Builder setBlockGossip(com.github.jtendermint.jabci.types.BlockGossip value) {
      if (blockGossipBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        blockGossip_ = value;
        onChanged();
      } else {
        blockGossipBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockGossip block_gossip = 3;</code>
     */
    public Builder setBlockGossip(
        com.github.jtendermint.jabci.types.BlockGossip.Builder builderForValue) {
      if (blockGossipBuilder_ == null) {
        blockGossip_ = builderForValue.build();
        onChanged();
      } else {
        blockGossipBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockGossip block_gossip = 3;</code>
     */
    public Builder mergeBlockGossip(com.github.jtendermint.jabci.types.BlockGossip value) {
      if (blockGossipBuilder_ == null) {
        if (blockGossip_ != null) {
          blockGossip_ =
            com.github.jtendermint.jabci.types.BlockGossip.newBuilder(blockGossip_).mergeFrom(value).buildPartial();
        } else {
          blockGossip_ = value;
        }
        onChanged();
      } else {
        blockGossipBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockGossip block_gossip = 3;</code>
     */
    public Builder clearBlockGossip() {
      if (blockGossipBuilder_ == null) {
        blockGossip_ = null;
        onChanged();
      } else {
        blockGossip_ = null;
        blockGossipBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockGossip block_gossip = 3;</code>
     */
    public com.github.jtendermint.jabci.types.BlockGossip.Builder getBlockGossipBuilder() {
      
      onChanged();
      return getBlockGossipFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockGossip block_gossip = 3;</code>
     */
    public com.github.jtendermint.jabci.types.BlockGossipOrBuilder getBlockGossipOrBuilder() {
      if (blockGossipBuilder_ != null) {
        return blockGossipBuilder_.getMessageOrBuilder();
      } else {
        return blockGossip_ == null ?
            com.github.jtendermint.jabci.types.BlockGossip.getDefaultInstance() : blockGossip_;
      }
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockGossip block_gossip = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.jtendermint.jabci.types.BlockGossip, com.github.jtendermint.jabci.types.BlockGossip.Builder, com.github.jtendermint.jabci.types.BlockGossipOrBuilder> 
        getBlockGossipFieldBuilder() {
      if (blockGossipBuilder_ == null) {
        blockGossipBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.jtendermint.jabci.types.BlockGossip, com.github.jtendermint.jabci.types.BlockGossip.Builder, com.github.jtendermint.jabci.types.BlockGossipOrBuilder>(
                getBlockGossip(),
                getParentForChildren(),
                isClean());
        blockGossip_ = null;
      }
      return blockGossipBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.github.jtendermint.jabci.types.ConsensusParams)
  }

  // @@protoc_insertion_point(class_scope:com.github.jtendermint.jabci.types.ConsensusParams)
  private static final com.github.jtendermint.jabci.types.ConsensusParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.jtendermint.jabci.types.ConsensusParams();
  }

  public static com.github.jtendermint.jabci.types.ConsensusParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConsensusParams>
      PARSER = new com.google.protobuf.AbstractParser<ConsensusParams>() {
    public ConsensusParams parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConsensusParams(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConsensusParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConsensusParams> getParserForType() {
    return PARSER;
  }

  public com.github.jtendermint.jabci.types.ConsensusParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

