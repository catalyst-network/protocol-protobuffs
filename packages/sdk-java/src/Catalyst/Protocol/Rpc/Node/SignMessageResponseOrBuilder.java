// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Rpc.proto

package Catalyst.Protocol.Rpc.Node;

public interface SignMessageResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Catalyst.Protocol.Rpc.Node.SignMessageResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes signature = 1;</code>
   */
  com.google.protobuf.ByteString getSignature();

  /**
   * <code>bytes public_key = 2;</code>
   */
  com.google.protobuf.ByteString getPublicKey();

  /**
   * <code>bytes original_message = 3;</code>
   */
  com.google.protobuf.ByteString getOriginalMessage();
}