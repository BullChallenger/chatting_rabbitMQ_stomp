// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chatting.proto

package com.example.grpc.chat;

public interface ChatMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:token.ChatMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string chatRoomId = 2;</code>
   * @return The chatRoomId.
   */
  java.lang.String getChatRoomId();
  /**
   * <code>string chatRoomId = 2;</code>
   * @return The bytes for chatRoomId.
   */
  com.google.protobuf.ByteString
      getChatRoomIdBytes();

  /**
   * <code>string accountId = 3;</code>
   * @return The accountId.
   */
  java.lang.String getAccountId();
  /**
   * <code>string accountId = 3;</code>
   * @return The bytes for accountId.
   */
  com.google.protobuf.ByteString
      getAccountIdBytes();

  /**
   * <code>string nickname = 4;</code>
   * @return The nickname.
   */
  java.lang.String getNickname();
  /**
   * <code>string nickname = 4;</code>
   * @return The bytes for nickname.
   */
  com.google.protobuf.ByteString
      getNicknameBytes();

  /**
   * <code>string message = 5;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 5;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
