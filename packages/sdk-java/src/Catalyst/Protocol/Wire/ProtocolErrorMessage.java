// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Wire.proto

package Catalyst.Protocol.Wire;

/**
 * <pre>
 **
 * Provides a network error message, for when a node cant send/ build a valid response
 * </pre>
 *
 * Protobuf type {@code Catalyst.Protocol.Wire.ProtocolErrorMessage}
 */
public  final class ProtocolErrorMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Catalyst.Protocol.Wire.ProtocolErrorMessage)
    ProtocolErrorMessageOrBuilder {
  // Use ProtocolErrorMessage.newBuilder() to construct.
  private ProtocolErrorMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProtocolErrorMessage() {
    correlationId_ = com.google.protobuf.ByteString.EMPTY;
    code_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ProtocolErrorMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            Catalyst.Protocol.Cryptography.Signature.Builder subBuilder = null;
            if (signature_ != null) {
              subBuilder = signature_.toBuilder();
            }
            signature_ = input.readMessage(Catalyst.Protocol.Cryptography.Signature.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(signature_);
              signature_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            Catalyst.Protocol.Peer.PeerId.Builder subBuilder = null;
            if (peerId_ != null) {
              subBuilder = peerId_.toBuilder();
            }
            peerId_ = input.readMessage(Catalyst.Protocol.Peer.PeerId.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(peerId_);
              peerId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {

            correlationId_ = input.readBytes();
            break;
          }
          case 32: {

            code_ = input.readInt32();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Catalyst.Protocol.Wire.Wire.internal_static_Catalyst_Protocol_Wire_ProtocolErrorMessage_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Catalyst.Protocol.Wire.Wire.internal_static_Catalyst_Protocol_Wire_ProtocolErrorMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Catalyst.Protocol.Wire.ProtocolErrorMessage.class, Catalyst.Protocol.Wire.ProtocolErrorMessage.Builder.class);
  }

  public static final int SIGNATURE_FIELD_NUMBER = 1;
  private Catalyst.Protocol.Cryptography.Signature signature_;
  /**
   * <code>.Catalyst.Protocol.Cryptography.Signature signature = 1;</code>
   */
  public boolean hasSignature() {
    return signature_ != null;
  }
  /**
   * <code>.Catalyst.Protocol.Cryptography.Signature signature = 1;</code>
   */
  public Catalyst.Protocol.Cryptography.Signature getSignature() {
    return signature_ == null ? Catalyst.Protocol.Cryptography.Signature.getDefaultInstance() : signature_;
  }
  /**
   * <code>.Catalyst.Protocol.Cryptography.Signature signature = 1;</code>
   */
  public Catalyst.Protocol.Cryptography.SignatureOrBuilder getSignatureOrBuilder() {
    return getSignature();
  }

  public static final int PEER_ID_FIELD_NUMBER = 2;
  private Catalyst.Protocol.Peer.PeerId peerId_;
  /**
   * <code>.Catalyst.Protocol.Peer.PeerId peer_id = 2;</code>
   */
  public boolean hasPeerId() {
    return peerId_ != null;
  }
  /**
   * <code>.Catalyst.Protocol.Peer.PeerId peer_id = 2;</code>
   */
  public Catalyst.Protocol.Peer.PeerId getPeerId() {
    return peerId_ == null ? Catalyst.Protocol.Peer.PeerId.getDefaultInstance() : peerId_;
  }
  /**
   * <code>.Catalyst.Protocol.Peer.PeerId peer_id = 2;</code>
   */
  public Catalyst.Protocol.Peer.PeerIdOrBuilder getPeerIdOrBuilder() {
    return getPeerId();
  }

  public static final int CORRELATION_ID_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString correlationId_;
  /**
   * <code>bytes correlation_id = 3;</code>
   */
  public com.google.protobuf.ByteString getCorrelationId() {
    return correlationId_;
  }

  public static final int CODE_FIELD_NUMBER = 4;
  private int code_;
  /**
   * <code>int32 code = 4;</code>
   */
  public int getCode() {
    return code_;
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
    if (signature_ != null) {
      output.writeMessage(1, getSignature());
    }
    if (peerId_ != null) {
      output.writeMessage(2, getPeerId());
    }
    if (!correlationId_.isEmpty()) {
      output.writeBytes(3, correlationId_);
    }
    if (code_ != 0) {
      output.writeInt32(4, code_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (signature_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSignature());
    }
    if (peerId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPeerId());
    }
    if (!correlationId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, correlationId_);
    }
    if (code_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, code_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Catalyst.Protocol.Wire.ProtocolErrorMessage)) {
      return super.equals(obj);
    }
    Catalyst.Protocol.Wire.ProtocolErrorMessage other = (Catalyst.Protocol.Wire.ProtocolErrorMessage) obj;

    boolean result = true;
    result = result && (hasSignature() == other.hasSignature());
    if (hasSignature()) {
      result = result && getSignature()
          .equals(other.getSignature());
    }
    result = result && (hasPeerId() == other.hasPeerId());
    if (hasPeerId()) {
      result = result && getPeerId()
          .equals(other.getPeerId());
    }
    result = result && getCorrelationId()
        .equals(other.getCorrelationId());
    result = result && (getCode()
        == other.getCode());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasSignature()) {
      hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
      hash = (53 * hash) + getSignature().hashCode();
    }
    if (hasPeerId()) {
      hash = (37 * hash) + PEER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPeerId().hashCode();
    }
    hash = (37 * hash) + CORRELATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCorrelationId().hashCode();
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Catalyst.Protocol.Wire.ProtocolErrorMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Catalyst.Protocol.Wire.ProtocolErrorMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Catalyst.Protocol.Wire.ProtocolErrorMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Catalyst.Protocol.Wire.ProtocolErrorMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Catalyst.Protocol.Wire.ProtocolErrorMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Catalyst.Protocol.Wire.ProtocolErrorMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Catalyst.Protocol.Wire.ProtocolErrorMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Catalyst.Protocol.Wire.ProtocolErrorMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Catalyst.Protocol.Wire.ProtocolErrorMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Catalyst.Protocol.Wire.ProtocolErrorMessage parseFrom(
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
  public static Builder newBuilder(Catalyst.Protocol.Wire.ProtocolErrorMessage prototype) {
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
   **
   * Provides a network error message, for when a node cant send/ build a valid response
   * </pre>
   *
   * Protobuf type {@code Catalyst.Protocol.Wire.ProtocolErrorMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Catalyst.Protocol.Wire.ProtocolErrorMessage)
      Catalyst.Protocol.Wire.ProtocolErrorMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Catalyst.Protocol.Wire.Wire.internal_static_Catalyst_Protocol_Wire_ProtocolErrorMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Catalyst.Protocol.Wire.Wire.internal_static_Catalyst_Protocol_Wire_ProtocolErrorMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Catalyst.Protocol.Wire.ProtocolErrorMessage.class, Catalyst.Protocol.Wire.ProtocolErrorMessage.Builder.class);
    }

    // Construct using Catalyst.Protocol.Wire.ProtocolErrorMessage.newBuilder()
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
      if (signatureBuilder_ == null) {
        signature_ = null;
      } else {
        signature_ = null;
        signatureBuilder_ = null;
      }
      if (peerIdBuilder_ == null) {
        peerId_ = null;
      } else {
        peerId_ = null;
        peerIdBuilder_ = null;
      }
      correlationId_ = com.google.protobuf.ByteString.EMPTY;

      code_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Catalyst.Protocol.Wire.Wire.internal_static_Catalyst_Protocol_Wire_ProtocolErrorMessage_descriptor;
    }

    public Catalyst.Protocol.Wire.ProtocolErrorMessage getDefaultInstanceForType() {
      return Catalyst.Protocol.Wire.ProtocolErrorMessage.getDefaultInstance();
    }

    public Catalyst.Protocol.Wire.ProtocolErrorMessage build() {
      Catalyst.Protocol.Wire.ProtocolErrorMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public Catalyst.Protocol.Wire.ProtocolErrorMessage buildPartial() {
      Catalyst.Protocol.Wire.ProtocolErrorMessage result = new Catalyst.Protocol.Wire.ProtocolErrorMessage(this);
      if (signatureBuilder_ == null) {
        result.signature_ = signature_;
      } else {
        result.signature_ = signatureBuilder_.build();
      }
      if (peerIdBuilder_ == null) {
        result.peerId_ = peerId_;
      } else {
        result.peerId_ = peerIdBuilder_.build();
      }
      result.correlationId_ = correlationId_;
      result.code_ = code_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
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
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Catalyst.Protocol.Wire.ProtocolErrorMessage) {
        return mergeFrom((Catalyst.Protocol.Wire.ProtocolErrorMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Catalyst.Protocol.Wire.ProtocolErrorMessage other) {
      if (other == Catalyst.Protocol.Wire.ProtocolErrorMessage.getDefaultInstance()) return this;
      if (other.hasSignature()) {
        mergeSignature(other.getSignature());
      }
      if (other.hasPeerId()) {
        mergePeerId(other.getPeerId());
      }
      if (other.getCorrelationId() != com.google.protobuf.ByteString.EMPTY) {
        setCorrelationId(other.getCorrelationId());
      }
      if (other.getCode() != 0) {
        setCode(other.getCode());
      }
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
      Catalyst.Protocol.Wire.ProtocolErrorMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Catalyst.Protocol.Wire.ProtocolErrorMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Catalyst.Protocol.Cryptography.Signature signature_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        Catalyst.Protocol.Cryptography.Signature, Catalyst.Protocol.Cryptography.Signature.Builder, Catalyst.Protocol.Cryptography.SignatureOrBuilder> signatureBuilder_;
    /**
     * <code>.Catalyst.Protocol.Cryptography.Signature signature = 1;</code>
     */
    public boolean hasSignature() {
      return signatureBuilder_ != null || signature_ != null;
    }
    /**
     * <code>.Catalyst.Protocol.Cryptography.Signature signature = 1;</code>
     */
    public Catalyst.Protocol.Cryptography.Signature getSignature() {
      if (signatureBuilder_ == null) {
        return signature_ == null ? Catalyst.Protocol.Cryptography.Signature.getDefaultInstance() : signature_;
      } else {
        return signatureBuilder_.getMessage();
      }
    }
    /**
     * <code>.Catalyst.Protocol.Cryptography.Signature signature = 1;</code>
     */
    public Builder setSignature(Catalyst.Protocol.Cryptography.Signature value) {
      if (signatureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        signature_ = value;
        onChanged();
      } else {
        signatureBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Catalyst.Protocol.Cryptography.Signature signature = 1;</code>
     */
    public Builder setSignature(
        Catalyst.Protocol.Cryptography.Signature.Builder builderForValue) {
      if (signatureBuilder_ == null) {
        signature_ = builderForValue.build();
        onChanged();
      } else {
        signatureBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Catalyst.Protocol.Cryptography.Signature signature = 1;</code>
     */
    public Builder mergeSignature(Catalyst.Protocol.Cryptography.Signature value) {
      if (signatureBuilder_ == null) {
        if (signature_ != null) {
          signature_ =
            Catalyst.Protocol.Cryptography.Signature.newBuilder(signature_).mergeFrom(value).buildPartial();
        } else {
          signature_ = value;
        }
        onChanged();
      } else {
        signatureBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Catalyst.Protocol.Cryptography.Signature signature = 1;</code>
     */
    public Builder clearSignature() {
      if (signatureBuilder_ == null) {
        signature_ = null;
        onChanged();
      } else {
        signature_ = null;
        signatureBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Catalyst.Protocol.Cryptography.Signature signature = 1;</code>
     */
    public Catalyst.Protocol.Cryptography.Signature.Builder getSignatureBuilder() {
      
      onChanged();
      return getSignatureFieldBuilder().getBuilder();
    }
    /**
     * <code>.Catalyst.Protocol.Cryptography.Signature signature = 1;</code>
     */
    public Catalyst.Protocol.Cryptography.SignatureOrBuilder getSignatureOrBuilder() {
      if (signatureBuilder_ != null) {
        return signatureBuilder_.getMessageOrBuilder();
      } else {
        return signature_ == null ?
            Catalyst.Protocol.Cryptography.Signature.getDefaultInstance() : signature_;
      }
    }
    /**
     * <code>.Catalyst.Protocol.Cryptography.Signature signature = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Catalyst.Protocol.Cryptography.Signature, Catalyst.Protocol.Cryptography.Signature.Builder, Catalyst.Protocol.Cryptography.SignatureOrBuilder> 
        getSignatureFieldBuilder() {
      if (signatureBuilder_ == null) {
        signatureBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Catalyst.Protocol.Cryptography.Signature, Catalyst.Protocol.Cryptography.Signature.Builder, Catalyst.Protocol.Cryptography.SignatureOrBuilder>(
                getSignature(),
                getParentForChildren(),
                isClean());
        signature_ = null;
      }
      return signatureBuilder_;
    }

    private Catalyst.Protocol.Peer.PeerId peerId_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        Catalyst.Protocol.Peer.PeerId, Catalyst.Protocol.Peer.PeerId.Builder, Catalyst.Protocol.Peer.PeerIdOrBuilder> peerIdBuilder_;
    /**
     * <code>.Catalyst.Protocol.Peer.PeerId peer_id = 2;</code>
     */
    public boolean hasPeerId() {
      return peerIdBuilder_ != null || peerId_ != null;
    }
    /**
     * <code>.Catalyst.Protocol.Peer.PeerId peer_id = 2;</code>
     */
    public Catalyst.Protocol.Peer.PeerId getPeerId() {
      if (peerIdBuilder_ == null) {
        return peerId_ == null ? Catalyst.Protocol.Peer.PeerId.getDefaultInstance() : peerId_;
      } else {
        return peerIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.Catalyst.Protocol.Peer.PeerId peer_id = 2;</code>
     */
    public Builder setPeerId(Catalyst.Protocol.Peer.PeerId value) {
      if (peerIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        peerId_ = value;
        onChanged();
      } else {
        peerIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Catalyst.Protocol.Peer.PeerId peer_id = 2;</code>
     */
    public Builder setPeerId(
        Catalyst.Protocol.Peer.PeerId.Builder builderForValue) {
      if (peerIdBuilder_ == null) {
        peerId_ = builderForValue.build();
        onChanged();
      } else {
        peerIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Catalyst.Protocol.Peer.PeerId peer_id = 2;</code>
     */
    public Builder mergePeerId(Catalyst.Protocol.Peer.PeerId value) {
      if (peerIdBuilder_ == null) {
        if (peerId_ != null) {
          peerId_ =
            Catalyst.Protocol.Peer.PeerId.newBuilder(peerId_).mergeFrom(value).buildPartial();
        } else {
          peerId_ = value;
        }
        onChanged();
      } else {
        peerIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Catalyst.Protocol.Peer.PeerId peer_id = 2;</code>
     */
    public Builder clearPeerId() {
      if (peerIdBuilder_ == null) {
        peerId_ = null;
        onChanged();
      } else {
        peerId_ = null;
        peerIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Catalyst.Protocol.Peer.PeerId peer_id = 2;</code>
     */
    public Catalyst.Protocol.Peer.PeerId.Builder getPeerIdBuilder() {
      
      onChanged();
      return getPeerIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.Catalyst.Protocol.Peer.PeerId peer_id = 2;</code>
     */
    public Catalyst.Protocol.Peer.PeerIdOrBuilder getPeerIdOrBuilder() {
      if (peerIdBuilder_ != null) {
        return peerIdBuilder_.getMessageOrBuilder();
      } else {
        return peerId_ == null ?
            Catalyst.Protocol.Peer.PeerId.getDefaultInstance() : peerId_;
      }
    }
    /**
     * <code>.Catalyst.Protocol.Peer.PeerId peer_id = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Catalyst.Protocol.Peer.PeerId, Catalyst.Protocol.Peer.PeerId.Builder, Catalyst.Protocol.Peer.PeerIdOrBuilder> 
        getPeerIdFieldBuilder() {
      if (peerIdBuilder_ == null) {
        peerIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Catalyst.Protocol.Peer.PeerId, Catalyst.Protocol.Peer.PeerId.Builder, Catalyst.Protocol.Peer.PeerIdOrBuilder>(
                getPeerId(),
                getParentForChildren(),
                isClean());
        peerId_ = null;
      }
      return peerIdBuilder_;
    }

    private com.google.protobuf.ByteString correlationId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes correlation_id = 3;</code>
     */
    public com.google.protobuf.ByteString getCorrelationId() {
      return correlationId_;
    }
    /**
     * <code>bytes correlation_id = 3;</code>
     */
    public Builder setCorrelationId(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      correlationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes correlation_id = 3;</code>
     */
    public Builder clearCorrelationId() {
      
      correlationId_ = getDefaultInstance().getCorrelationId();
      onChanged();
      return this;
    }

    private int code_ ;
    /**
     * <code>int32 code = 4;</code>
     */
    public int getCode() {
      return code_;
    }
    /**
     * <code>int32 code = 4;</code>
     */
    public Builder setCode(int value) {
      
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 code = 4;</code>
     */
    public Builder clearCode() {
      
      code_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Catalyst.Protocol.Wire.ProtocolErrorMessage)
  }

  // @@protoc_insertion_point(class_scope:Catalyst.Protocol.Wire.ProtocolErrorMessage)
  private static final Catalyst.Protocol.Wire.ProtocolErrorMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Catalyst.Protocol.Wire.ProtocolErrorMessage();
  }

  public static Catalyst.Protocol.Wire.ProtocolErrorMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProtocolErrorMessage>
      PARSER = new com.google.protobuf.AbstractParser<ProtocolErrorMessage>() {
    public ProtocolErrorMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ProtocolErrorMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProtocolErrorMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProtocolErrorMessage> getParserForType() {
    return PARSER;
  }

  public Catalyst.Protocol.Wire.ProtocolErrorMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
