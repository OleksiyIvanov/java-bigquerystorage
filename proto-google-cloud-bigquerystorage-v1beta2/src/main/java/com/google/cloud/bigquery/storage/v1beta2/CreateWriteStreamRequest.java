/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/storage/v1beta2/storage.proto

package com.google.cloud.bigquery.storage.v1beta2;

/**
 *
 *
 * <pre>
 * Request message for `CreateWriteStream`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest}
 */
public final class CreateWriteStreamRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest)
    CreateWriteStreamRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateWriteStreamRequest.newBuilder() to construct.
  private CreateWriteStreamRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateWriteStreamRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateWriteStreamRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateWriteStreamRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.bigquery.storage.v1beta2.WriteStream.Builder subBuilder = null;
              if (writeStream_ != null) {
                subBuilder = writeStream_.toBuilder();
              }
              writeStream_ =
                  input.readMessage(
                      com.google.cloud.bigquery.storage.v1beta2.WriteStream.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(writeStream_);
                writeStream_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.storage.v1beta2.StorageProto
        .internal_static_google_cloud_bigquery_storage_v1beta2_CreateWriteStreamRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.storage.v1beta2.StorageProto
        .internal_static_google_cloud_bigquery_storage_v1beta2_CreateWriteStreamRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest.class,
            com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. Reference to the table to which the stream belongs, in the format
   * of `projects/{project}/datasets/{dataset}/tables/{table}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Reference to the table to which the stream belongs, in the format
   * of `projects/{project}/datasets/{dataset}/tables/{table}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WRITE_STREAM_FIELD_NUMBER = 2;
  private com.google.cloud.bigquery.storage.v1beta2.WriteStream writeStream_;
  /**
   *
   *
   * <pre>
   * Required. Stream to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.storage.v1beta2.WriteStream write_stream = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the writeStream field is set.
   */
  @java.lang.Override
  public boolean hasWriteStream() {
    return writeStream_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Stream to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.storage.v1beta2.WriteStream write_stream = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The writeStream.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.storage.v1beta2.WriteStream getWriteStream() {
    return writeStream_ == null
        ? com.google.cloud.bigquery.storage.v1beta2.WriteStream.getDefaultInstance()
        : writeStream_;
  }
  /**
   *
   *
   * <pre>
   * Required. Stream to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.storage.v1beta2.WriteStream write_stream = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.storage.v1beta2.WriteStreamOrBuilder getWriteStreamOrBuilder() {
    return getWriteStream();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (writeStream_ != null) {
      output.writeMessage(2, getWriteStream());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (writeStream_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getWriteStream());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest other =
        (com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasWriteStream() != other.hasWriteStream()) return false;
    if (hasWriteStream()) {
      if (!getWriteStream().equals(other.getWriteStream())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasWriteStream()) {
      hash = (37 * hash) + WRITE_STREAM_FIELD_NUMBER;
      hash = (53 * hash) + getWriteStream().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for `CreateWriteStream`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest)
      com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.storage.v1beta2.StorageProto
          .internal_static_google_cloud_bigquery_storage_v1beta2_CreateWriteStreamRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.storage.v1beta2.StorageProto
          .internal_static_google_cloud_bigquery_storage_v1beta2_CreateWriteStreamRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest.class,
              com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (writeStreamBuilder_ == null) {
        writeStream_ = null;
      } else {
        writeStream_ = null;
        writeStreamBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.storage.v1beta2.StorageProto
          .internal_static_google_cloud_bigquery_storage_v1beta2_CreateWriteStreamRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest build() {
      com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest buildPartial() {
      com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest result =
          new com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest(this);
      result.parent_ = parent_;
      if (writeStreamBuilder_ == null) {
        result.writeStream_ = writeStream_;
      } else {
        result.writeStream_ = writeStreamBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest) {
        return mergeFrom(
            (com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest other) {
      if (other
          == com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasWriteStream()) {
        mergeWriteStream(other.getWriteStream());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Reference to the table to which the stream belongs, in the format
     * of `projects/{project}/datasets/{dataset}/tables/{table}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Reference to the table to which the stream belongs, in the format
     * of `projects/{project}/datasets/{dataset}/tables/{table}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Reference to the table to which the stream belongs, in the format
     * of `projects/{project}/datasets/{dataset}/tables/{table}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Reference to the table to which the stream belongs, in the format
     * of `projects/{project}/datasets/{dataset}/tables/{table}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Reference to the table to which the stream belongs, in the format
     * of `projects/{project}/datasets/{dataset}/tables/{table}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.bigquery.storage.v1beta2.WriteStream writeStream_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.storage.v1beta2.WriteStream,
            com.google.cloud.bigquery.storage.v1beta2.WriteStream.Builder,
            com.google.cloud.bigquery.storage.v1beta2.WriteStreamOrBuilder>
        writeStreamBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Stream to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1beta2.WriteStream write_stream = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the writeStream field is set.
     */
    public boolean hasWriteStream() {
      return writeStreamBuilder_ != null || writeStream_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Stream to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1beta2.WriteStream write_stream = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The writeStream.
     */
    public com.google.cloud.bigquery.storage.v1beta2.WriteStream getWriteStream() {
      if (writeStreamBuilder_ == null) {
        return writeStream_ == null
            ? com.google.cloud.bigquery.storage.v1beta2.WriteStream.getDefaultInstance()
            : writeStream_;
      } else {
        return writeStreamBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Stream to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1beta2.WriteStream write_stream = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWriteStream(com.google.cloud.bigquery.storage.v1beta2.WriteStream value) {
      if (writeStreamBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        writeStream_ = value;
        onChanged();
      } else {
        writeStreamBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Stream to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1beta2.WriteStream write_stream = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWriteStream(
        com.google.cloud.bigquery.storage.v1beta2.WriteStream.Builder builderForValue) {
      if (writeStreamBuilder_ == null) {
        writeStream_ = builderForValue.build();
        onChanged();
      } else {
        writeStreamBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Stream to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1beta2.WriteStream write_stream = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeWriteStream(com.google.cloud.bigquery.storage.v1beta2.WriteStream value) {
      if (writeStreamBuilder_ == null) {
        if (writeStream_ != null) {
          writeStream_ =
              com.google.cloud.bigquery.storage.v1beta2.WriteStream.newBuilder(writeStream_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          writeStream_ = value;
        }
        onChanged();
      } else {
        writeStreamBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Stream to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1beta2.WriteStream write_stream = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearWriteStream() {
      if (writeStreamBuilder_ == null) {
        writeStream_ = null;
        onChanged();
      } else {
        writeStream_ = null;
        writeStreamBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Stream to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1beta2.WriteStream write_stream = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.bigquery.storage.v1beta2.WriteStream.Builder getWriteStreamBuilder() {

      onChanged();
      return getWriteStreamFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Stream to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1beta2.WriteStream write_stream = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.bigquery.storage.v1beta2.WriteStreamOrBuilder
        getWriteStreamOrBuilder() {
      if (writeStreamBuilder_ != null) {
        return writeStreamBuilder_.getMessageOrBuilder();
      } else {
        return writeStream_ == null
            ? com.google.cloud.bigquery.storage.v1beta2.WriteStream.getDefaultInstance()
            : writeStream_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Stream to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1beta2.WriteStream write_stream = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.storage.v1beta2.WriteStream,
            com.google.cloud.bigquery.storage.v1beta2.WriteStream.Builder,
            com.google.cloud.bigquery.storage.v1beta2.WriteStreamOrBuilder>
        getWriteStreamFieldBuilder() {
      if (writeStreamBuilder_ == null) {
        writeStreamBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.bigquery.storage.v1beta2.WriteStream,
                com.google.cloud.bigquery.storage.v1beta2.WriteStream.Builder,
                com.google.cloud.bigquery.storage.v1beta2.WriteStreamOrBuilder>(
                getWriteStream(), getParentForChildren(), isClean());
        writeStream_ = null;
      }
      return writeStreamBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest)
  private static final com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest();
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateWriteStreamRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateWriteStreamRequest>() {
        @java.lang.Override
        public CreateWriteStreamRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateWriteStreamRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateWriteStreamRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateWriteStreamRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.storage.v1beta2.CreateWriteStreamRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
