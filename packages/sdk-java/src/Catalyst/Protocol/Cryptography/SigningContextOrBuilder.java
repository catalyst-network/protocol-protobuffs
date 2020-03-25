// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Cryptography.proto

package Catalyst.Protocol.Cryptography;

public interface SigningContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Catalyst.Protocol.Cryptography.SigningContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * is the network enum (mainet / devnet etc).
   * </pre>
   *
   * <code>.Catalyst.Protocol.Network.NetworkType network_type = 1;</code>
   * @return The enum numeric value on the wire for networkType.
   */
  int getNetworkTypeValue();
  /**
   * <pre>
   * is the network enum (mainet / devnet etc).
   * </pre>
   *
   * <code>.Catalyst.Protocol.Network.NetworkType network_type = 1;</code>
   * @return The networkType.
   */
  Catalyst.Protocol.Network.NetworkType getNetworkType();

  /**
   * <pre>
   * contains info on whether the signature is for a protocol message or a transaction.
   * </pre>
   *
   * <code>.Catalyst.Protocol.Cryptography.SignatureType signature_type = 2;</code>
   * @return The enum numeric value on the wire for signatureType.
   */
  int getSignatureTypeValue();
  /**
   * <pre>
   * contains info on whether the signature is for a protocol message or a transaction.
   * </pre>
   *
   * <code>.Catalyst.Protocol.Cryptography.SignatureType signature_type = 2;</code>
   * @return The signatureType.
   */
  Catalyst.Protocol.Cryptography.SignatureType getSignatureType();
}
