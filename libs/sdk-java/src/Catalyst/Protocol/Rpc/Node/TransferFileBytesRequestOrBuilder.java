// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Rpc.proto

package Catalyst.Protocol.Rpc.Node;

public interface TransferFileBytesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Catalyst.Protocol.Rpc.Node.TransferFileBytesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 chunk_id = 1;</code>
   */
  int getChunkId();

  /**
   * <code>bytes chunk_bytes = 2;</code>
   */
  com.google.protobuf.ByteString getChunkBytes();

  /**
   * <code>bytes correlation_file_name = 3;</code>
   */
  com.google.protobuf.ByteString getCorrelationFileName();
}