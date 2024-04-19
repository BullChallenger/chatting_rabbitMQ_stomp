// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zip.proto

package com.example.grpc.zip;

/**
 * Protobuf type {@code zip.GetZipsByAgentIdResponse}
 */
public final class GetZipsByAgentIdResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zip.GetZipsByAgentIdResponse)
    GetZipsByAgentIdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetZipsByAgentIdResponse.newBuilder() to construct.
  private GetZipsByAgentIdResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetZipsByAgentIdResponse() {
    zipId_ = "";
    attachmentPath_ = "";
    location_ = "";
    note_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetZipsByAgentIdResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.grpc.zip.ZipProto.internal_static_zip_GetZipsByAgentIdResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.zip.ZipProto.internal_static_zip_GetZipsByAgentIdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.zip.GetZipsByAgentIdResponse.class, com.example.grpc.zip.GetZipsByAgentIdResponse.Builder.class);
  }

  public static final int ZIPID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object zipId_ = "";
  /**
   * <code>string zipId = 1;</code>
   * @return The zipId.
   */
  @java.lang.Override
  public java.lang.String getZipId() {
    java.lang.Object ref = zipId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zipId_ = s;
      return s;
    }
  }
  /**
   * <code>string zipId = 1;</code>
   * @return The bytes for zipId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getZipIdBytes() {
    java.lang.Object ref = zipId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      zipId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ATTACHMENTPATH_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object attachmentPath_ = "";
  /**
   * <code>string attachmentPath = 2;</code>
   * @return The attachmentPath.
   */
  @java.lang.Override
  public java.lang.String getAttachmentPath() {
    java.lang.Object ref = attachmentPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      attachmentPath_ = s;
      return s;
    }
  }
  /**
   * <code>string attachmentPath = 2;</code>
   * @return The bytes for attachmentPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAttachmentPathBytes() {
    java.lang.Object ref = attachmentPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      attachmentPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCATION_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object location_ = "";
  /**
   * <code>string location = 3;</code>
   * @return The location.
   */
  @java.lang.Override
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   * <code>string location = 3;</code>
   * @return The bytes for location.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      location_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BUILDINGFLOOR_FIELD_NUMBER = 4;
  private int buildingFloor_ = 0;
  /**
   * <code>sint32 buildingFloor = 4;</code>
   * @return The buildingFloor.
   */
  @java.lang.Override
  public int getBuildingFloor() {
    return buildingFloor_;
  }

  public static final int NOTE_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object note_ = "";
  /**
   * <code>string note = 5;</code>
   * @return The note.
   */
  @java.lang.Override
  public java.lang.String getNote() {
    java.lang.Object ref = note_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      note_ = s;
      return s;
    }
  }
  /**
   * <code>string note = 5;</code>
   * @return The bytes for note.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNoteBytes() {
    java.lang.Object ref = note_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      note_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zipId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, zipId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(attachmentPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, attachmentPath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, location_);
    }
    if (buildingFloor_ != 0) {
      output.writeSInt32(4, buildingFloor_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(note_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, note_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zipId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, zipId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(attachmentPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, attachmentPath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, location_);
    }
    if (buildingFloor_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeSInt32Size(4, buildingFloor_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(note_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, note_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.grpc.zip.GetZipsByAgentIdResponse)) {
      return super.equals(obj);
    }
    com.example.grpc.zip.GetZipsByAgentIdResponse other = (com.example.grpc.zip.GetZipsByAgentIdResponse) obj;

    if (!getZipId()
        .equals(other.getZipId())) return false;
    if (!getAttachmentPath()
        .equals(other.getAttachmentPath())) return false;
    if (!getLocation()
        .equals(other.getLocation())) return false;
    if (getBuildingFloor()
        != other.getBuildingFloor()) return false;
    if (!getNote()
        .equals(other.getNote())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ZIPID_FIELD_NUMBER;
    hash = (53 * hash) + getZipId().hashCode();
    hash = (37 * hash) + ATTACHMENTPATH_FIELD_NUMBER;
    hash = (53 * hash) + getAttachmentPath().hashCode();
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    hash = (37 * hash) + BUILDINGFLOOR_FIELD_NUMBER;
    hash = (53 * hash) + getBuildingFloor();
    hash = (37 * hash) + NOTE_FIELD_NUMBER;
    hash = (53 * hash) + getNote().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.zip.GetZipsByAgentIdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.zip.GetZipsByAgentIdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.zip.GetZipsByAgentIdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.zip.GetZipsByAgentIdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.zip.GetZipsByAgentIdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.zip.GetZipsByAgentIdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.zip.GetZipsByAgentIdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.zip.GetZipsByAgentIdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.example.grpc.zip.GetZipsByAgentIdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.example.grpc.zip.GetZipsByAgentIdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.zip.GetZipsByAgentIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.zip.GetZipsByAgentIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.grpc.zip.GetZipsByAgentIdResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code zip.GetZipsByAgentIdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zip.GetZipsByAgentIdResponse)
      com.example.grpc.zip.GetZipsByAgentIdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.zip.ZipProto.internal_static_zip_GetZipsByAgentIdResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.zip.ZipProto.internal_static_zip_GetZipsByAgentIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.zip.GetZipsByAgentIdResponse.class, com.example.grpc.zip.GetZipsByAgentIdResponse.Builder.class);
    }

    // Construct using com.example.grpc.zip.GetZipsByAgentIdResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      zipId_ = "";
      attachmentPath_ = "";
      location_ = "";
      buildingFloor_ = 0;
      note_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.zip.ZipProto.internal_static_zip_GetZipsByAgentIdResponse_descriptor;
    }

    @java.lang.Override
    public com.example.grpc.zip.GetZipsByAgentIdResponse getDefaultInstanceForType() {
      return com.example.grpc.zip.GetZipsByAgentIdResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.grpc.zip.GetZipsByAgentIdResponse build() {
      com.example.grpc.zip.GetZipsByAgentIdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.grpc.zip.GetZipsByAgentIdResponse buildPartial() {
      com.example.grpc.zip.GetZipsByAgentIdResponse result = new com.example.grpc.zip.GetZipsByAgentIdResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.example.grpc.zip.GetZipsByAgentIdResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.zipId_ = zipId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.attachmentPath_ = attachmentPath_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.location_ = location_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.buildingFloor_ = buildingFloor_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.note_ = note_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.grpc.zip.GetZipsByAgentIdResponse) {
        return mergeFrom((com.example.grpc.zip.GetZipsByAgentIdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.zip.GetZipsByAgentIdResponse other) {
      if (other == com.example.grpc.zip.GetZipsByAgentIdResponse.getDefaultInstance()) return this;
      if (!other.getZipId().isEmpty()) {
        zipId_ = other.zipId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAttachmentPath().isEmpty()) {
        attachmentPath_ = other.attachmentPath_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getBuildingFloor() != 0) {
        setBuildingFloor(other.getBuildingFloor());
      }
      if (!other.getNote().isEmpty()) {
        note_ = other.note_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              zipId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              attachmentPath_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              location_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              buildingFloor_ = input.readSInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              note_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object zipId_ = "";
    /**
     * <code>string zipId = 1;</code>
     * @return The zipId.
     */
    public java.lang.String getZipId() {
      java.lang.Object ref = zipId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zipId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string zipId = 1;</code>
     * @return The bytes for zipId.
     */
    public com.google.protobuf.ByteString
        getZipIdBytes() {
      java.lang.Object ref = zipId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        zipId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string zipId = 1;</code>
     * @param value The zipId to set.
     * @return This builder for chaining.
     */
    public Builder setZipId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      zipId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string zipId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearZipId() {
      zipId_ = getDefaultInstance().getZipId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string zipId = 1;</code>
     * @param value The bytes for zipId to set.
     * @return This builder for chaining.
     */
    public Builder setZipIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      zipId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object attachmentPath_ = "";
    /**
     * <code>string attachmentPath = 2;</code>
     * @return The attachmentPath.
     */
    public java.lang.String getAttachmentPath() {
      java.lang.Object ref = attachmentPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        attachmentPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string attachmentPath = 2;</code>
     * @return The bytes for attachmentPath.
     */
    public com.google.protobuf.ByteString
        getAttachmentPathBytes() {
      java.lang.Object ref = attachmentPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        attachmentPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string attachmentPath = 2;</code>
     * @param value The attachmentPath to set.
     * @return This builder for chaining.
     */
    public Builder setAttachmentPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      attachmentPath_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string attachmentPath = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAttachmentPath() {
      attachmentPath_ = getDefaultInstance().getAttachmentPath();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string attachmentPath = 2;</code>
     * @param value The bytes for attachmentPath to set.
     * @return This builder for chaining.
     */
    public Builder setAttachmentPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      attachmentPath_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object location_ = "";
    /**
     * <code>string location = 3;</code>
     * @return The location.
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string location = 3;</code>
     * @return The bytes for location.
     */
    public com.google.protobuf.ByteString
        getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string location = 3;</code>
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      location_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string location = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      location_ = getDefaultInstance().getLocation();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string location = 3;</code>
     * @param value The bytes for location to set.
     * @return This builder for chaining.
     */
    public Builder setLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      location_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int buildingFloor_ ;
    /**
     * <code>sint32 buildingFloor = 4;</code>
     * @return The buildingFloor.
     */
    @java.lang.Override
    public int getBuildingFloor() {
      return buildingFloor_;
    }
    /**
     * <code>sint32 buildingFloor = 4;</code>
     * @param value The buildingFloor to set.
     * @return This builder for chaining.
     */
    public Builder setBuildingFloor(int value) {

      buildingFloor_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>sint32 buildingFloor = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBuildingFloor() {
      bitField0_ = (bitField0_ & ~0x00000008);
      buildingFloor_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object note_ = "";
    /**
     * <code>string note = 5;</code>
     * @return The note.
     */
    public java.lang.String getNote() {
      java.lang.Object ref = note_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        note_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string note = 5;</code>
     * @return The bytes for note.
     */
    public com.google.protobuf.ByteString
        getNoteBytes() {
      java.lang.Object ref = note_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        note_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string note = 5;</code>
     * @param value The note to set.
     * @return This builder for chaining.
     */
    public Builder setNote(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      note_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string note = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearNote() {
      note_ = getDefaultInstance().getNote();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string note = 5;</code>
     * @param value The bytes for note to set.
     * @return This builder for chaining.
     */
    public Builder setNoteBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      note_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:zip.GetZipsByAgentIdResponse)
  }

  // @@protoc_insertion_point(class_scope:zip.GetZipsByAgentIdResponse)
  private static final com.example.grpc.zip.GetZipsByAgentIdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.zip.GetZipsByAgentIdResponse();
  }

  public static com.example.grpc.zip.GetZipsByAgentIdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetZipsByAgentIdResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetZipsByAgentIdResponse>() {
    @java.lang.Override
    public GetZipsByAgentIdResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<GetZipsByAgentIdResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetZipsByAgentIdResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.grpc.zip.GetZipsByAgentIdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
