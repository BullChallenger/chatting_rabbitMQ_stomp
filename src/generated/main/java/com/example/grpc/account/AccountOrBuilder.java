// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: account.proto

package com.example.grpc.account;

public interface AccountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:accountpb.Account)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string Id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string Id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string Provider = 2;</code>
   * @return The provider.
   */
  java.lang.String getProvider();
  /**
   * <code>string Provider = 2;</code>
   * @return The bytes for provider.
   */
  com.google.protobuf.ByteString
      getProviderBytes();

  /**
   * <code>string ProviderUserId = 3;</code>
   * @return The providerUserId.
   */
  java.lang.String getProviderUserId();
  /**
   * <code>string ProviderUserId = 3;</code>
   * @return The bytes for providerUserId.
   */
  com.google.protobuf.ByteString
      getProviderUserIdBytes();

  /**
   * <code>string Nickname = 4;</code>
   * @return The nickname.
   */
  java.lang.String getNickname();
  /**
   * <code>string Nickname = 4;</code>
   * @return The bytes for nickname.
   */
  com.google.protobuf.ByteString
      getNicknameBytes();

  /**
   * <code>string Role = 5;</code>
   * @return The role.
   */
  java.lang.String getRole();
  /**
   * <code>string Role = 5;</code>
   * @return The bytes for role.
   */
  com.google.protobuf.ByteString
      getRoleBytes();
}
