// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Transaction.proto

package Catalyst.Protocol.Transaction;

public interface RangeProofOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Catalyst.Protocol.Transaction.RangeProof)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * m * 32 bytes, value commitment (eq. 36) 
   * </pre>
   *
   * <code>repeated bytes value_commitment = 1;</code>
   */
  java.util.List<com.google.protobuf.ByteString> getValueCommitmentList();
  /**
   * <pre>
   * m * 32 bytes, value commitment (eq. 36) 
   * </pre>
   *
   * <code>repeated bytes value_commitment = 1;</code>
   */
  int getValueCommitmentCount();
  /**
   * <pre>
   * m * 32 bytes, value commitment (eq. 36) 
   * </pre>
   *
   * <code>repeated bytes value_commitment = 1;</code>
   */
  com.google.protobuf.ByteString getValueCommitment(int index);

  /**
   * <pre>
   * 32 bytes, bit commitment (eq. 48)
   * </pre>
   *
   * <code>bytes bit_commitment = 2;</code>
   */
  com.google.protobuf.ByteString getBitCommitment();

  /**
   * <pre>
   * 32 bytes, per bit blinding factor commitment (eq. 48)
   * </pre>
   *
   * <code>bytes per_bit_blinding_factor_commitment = 3;</code>
   */
  com.google.protobuf.ByteString getPerBitBlindingFactorCommitment();

  /**
   * <pre>
   * 32 bytes, poly commitment (eq. 54)
   * </pre>
   *
   * <code>bytes poly_commitment_t1 = 4;</code>
   */
  com.google.protobuf.ByteString getPolyCommitmentT1();

  /**
   * <pre>
   * 32 bytes, poly commitment (eq. 54)
   * </pre>
   *
   * <code>bytes poly_commitment_t2 = 5;</code>
   */
  com.google.protobuf.ByteString getPolyCommitmentT2();

  /**
   * <pre>
   * 32 bytes, proof of share (eq. 63)
   * </pre>
   *
   * <code>bytes proof_of_share_tau = 6;</code>
   */
  com.google.protobuf.ByteString getProofOfShareTau();

  /**
   * <pre>
   * 32 bytes, proof of share (eq. 63)
   * </pre>
   *
   * <code>bytes proof_of_share_mu = 7;</code>
   */
  com.google.protobuf.ByteString getProofOfShareMu();

  /**
   * <pre>
   * k * 32 bytes, aggregated vector polynomial (eq. 63)
   * </pre>
   *
   * <code>repeated bytes aggregated_vector_polynomial_l = 8;</code>
   */
  java.util.List<com.google.protobuf.ByteString> getAggregatedVectorPolynomialLList();
  /**
   * <pre>
   * k * 32 bytes, aggregated vector polynomial (eq. 63)
   * </pre>
   *
   * <code>repeated bytes aggregated_vector_polynomial_l = 8;</code>
   */
  int getAggregatedVectorPolynomialLCount();
  /**
   * <pre>
   * k * 32 bytes, aggregated vector polynomial (eq. 63)
   * </pre>
   *
   * <code>repeated bytes aggregated_vector_polynomial_l = 8;</code>
   */
  com.google.protobuf.ByteString getAggregatedVectorPolynomialL(int index);

  /**
   * <pre>
   * k * 32 bytes, aggregated vector polynomial (eq. 63)
   * </pre>
   *
   * <code>repeated bytes aggregated_vector_polynomial_r = 9;</code>
   */
  java.util.List<com.google.protobuf.ByteString> getAggregatedVectorPolynomialRList();
  /**
   * <pre>
   * k * 32 bytes, aggregated vector polynomial (eq. 63)
   * </pre>
   *
   * <code>repeated bytes aggregated_vector_polynomial_r = 9;</code>
   */
  int getAggregatedVectorPolynomialRCount();
  /**
   * <pre>
   * k * 32 bytes, aggregated vector polynomial (eq. 63)
   * </pre>
   *
   * <code>repeated bytes aggregated_vector_polynomial_r = 9;</code>
   */
  com.google.protobuf.ByteString getAggregatedVectorPolynomialR(int index);

  /**
   * <pre>
   * 32 bytes (eq. 63)
   * </pre>
   *
   * <code>bytes a_prime_0 = 10;</code>
   */
  com.google.protobuf.ByteString getAPrime0();

  /**
   * <pre>
   * 32 bytes (eq. 63)
   * </pre>
   *
   * <code>bytes b_prime_0 = 11;</code>
   */
  com.google.protobuf.ByteString getBPrime0();

  /**
   * <code>bytes t = 12;</code>
   */
  com.google.protobuf.ByteString getT();
}
