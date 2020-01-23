// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Transaction.proto

package Catalyst.Protocol.Transaction;

public interface ConfidentialEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Catalyst.Protocol.Transaction.ConfidentialEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Catalyst.Protocol.Transaction.BaseEntry base = 1;</code>
   */
  boolean hasBase();
  /**
   * <code>.Catalyst.Protocol.Transaction.BaseEntry base = 1;</code>
   */
  Catalyst.Protocol.Transaction.BaseEntry getBase();
  /**
   * <code>.Catalyst.Protocol.Transaction.BaseEntry base = 1;</code>
   */
  Catalyst.Protocol.Transaction.BaseEntryOrBuilder getBaseOrBuilder();

  /**
   * <pre>
   * 32 bytes
   * </pre>
   *
   * <code>bytes pedersen_commitment = 2;</code>
   */
  com.google.protobuf.ByteString getPedersenCommitment();

  /**
   * <code>.Catalyst.Protocol.Transaction.RangeProof range_proof = 3;</code>
   */
  boolean hasRangeProof();
  /**
   * <code>.Catalyst.Protocol.Transaction.RangeProof range_proof = 3;</code>
   */
  Catalyst.Protocol.Transaction.RangeProof getRangeProof();
  /**
   * <code>.Catalyst.Protocol.Transaction.RangeProof range_proof = 3;</code>
   */
  Catalyst.Protocol.Transaction.RangeProofOrBuilder getRangeProofOrBuilder();
}