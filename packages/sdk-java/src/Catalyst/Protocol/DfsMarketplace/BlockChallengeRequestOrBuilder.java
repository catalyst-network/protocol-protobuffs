// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DfsMarketplace.proto

package Catalyst.Protocol.DfsMarketplace;

public interface BlockChallengeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Catalyst.Protocol.DfsMarketplace.BlockChallengeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string challenge_salt = 1;</code>
   */
  java.lang.String getChallengeSalt();
  /**
   * <code>string challenge_salt = 1;</code>
   */
  com.google.protobuf.ByteString
      getChallengeSaltBytes();

  /**
   * <code>string main_file_cid = 2;</code>
   */
  java.lang.String getMainFileCid();
  /**
   * <code>string main_file_cid = 2;</code>
   */
  com.google.protobuf.ByteString
      getMainFileCidBytes();

  /**
   * <code>bytes block_idx_random_guid = 3;</code>
   */
  com.google.protobuf.ByteString getBlockIdxRandomGuid();
}