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
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * Filter on person name.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4beta1.PersonNameFilter}
 */
public final class PersonNameFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4beta1.PersonNameFilter)
    PersonNameFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PersonNameFilter.newBuilder() to construct.
  private PersonNameFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PersonNameFilter() {
    personName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PersonNameFilter();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private PersonNameFilter(
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

              personName_ = s;
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.talent.v4beta1.FiltersProto
        .internal_static_google_cloud_talent_v4beta1_PersonNameFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4beta1.FiltersProto
        .internal_static_google_cloud_talent_v4beta1_PersonNameFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4beta1.PersonNameFilter.class,
            com.google.cloud.talent.v4beta1.PersonNameFilter.Builder.class);
  }

  public static final int PERSON_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object personName_;
  /**
   *
   *
   * <pre>
   * Required. The person name. For example, "John Smith".
   * Can be any combination of [PersonName.structured_name.given_name][],
   * [PersonName.structured_name.middle_initial][],
   * [PersonName.structured_name.family_name][], and
   * [PersonName.formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name].
   * </pre>
   *
   * <code>string person_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The personName.
   */
  public java.lang.String getPersonName() {
    java.lang.Object ref = personName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      personName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The person name. For example, "John Smith".
   * Can be any combination of [PersonName.structured_name.given_name][],
   * [PersonName.structured_name.middle_initial][],
   * [PersonName.structured_name.family_name][], and
   * [PersonName.formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name].
   * </pre>
   *
   * <code>string person_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for personName.
   */
  public com.google.protobuf.ByteString getPersonNameBytes() {
    java.lang.Object ref = personName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      personName_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getPersonNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, personName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPersonNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, personName_);
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
    if (!(obj instanceof com.google.cloud.talent.v4beta1.PersonNameFilter)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4beta1.PersonNameFilter other =
        (com.google.cloud.talent.v4beta1.PersonNameFilter) obj;

    if (!getPersonName().equals(other.getPersonName())) return false;
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
    hash = (37 * hash) + PERSON_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPersonName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4beta1.PersonNameFilter parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.PersonNameFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.PersonNameFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.PersonNameFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.PersonNameFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.PersonNameFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.PersonNameFilter parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.PersonNameFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.PersonNameFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.PersonNameFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.PersonNameFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.PersonNameFilter parseFrom(
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

  public static Builder newBuilder(com.google.cloud.talent.v4beta1.PersonNameFilter prototype) {
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
   * Filter on person name.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4beta1.PersonNameFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4beta1.PersonNameFilter)
      com.google.cloud.talent.v4beta1.PersonNameFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.talent.v4beta1.FiltersProto
          .internal_static_google_cloud_talent_v4beta1_PersonNameFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4beta1.FiltersProto
          .internal_static_google_cloud_talent_v4beta1_PersonNameFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4beta1.PersonNameFilter.class,
              com.google.cloud.talent.v4beta1.PersonNameFilter.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4beta1.PersonNameFilter.newBuilder()
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
      personName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.talent.v4beta1.FiltersProto
          .internal_static_google_cloud_talent_v4beta1_PersonNameFilter_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.PersonNameFilter getDefaultInstanceForType() {
      return com.google.cloud.talent.v4beta1.PersonNameFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.PersonNameFilter build() {
      com.google.cloud.talent.v4beta1.PersonNameFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.PersonNameFilter buildPartial() {
      com.google.cloud.talent.v4beta1.PersonNameFilter result =
          new com.google.cloud.talent.v4beta1.PersonNameFilter(this);
      result.personName_ = personName_;
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
      if (other instanceof com.google.cloud.talent.v4beta1.PersonNameFilter) {
        return mergeFrom((com.google.cloud.talent.v4beta1.PersonNameFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4beta1.PersonNameFilter other) {
      if (other == com.google.cloud.talent.v4beta1.PersonNameFilter.getDefaultInstance())
        return this;
      if (!other.getPersonName().isEmpty()) {
        personName_ = other.personName_;
        onChanged();
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
      com.google.cloud.talent.v4beta1.PersonNameFilter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.talent.v4beta1.PersonNameFilter) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object personName_ = "";
    /**
     *
     *
     * <pre>
     * Required. The person name. For example, "John Smith".
     * Can be any combination of [PersonName.structured_name.given_name][],
     * [PersonName.structured_name.middle_initial][],
     * [PersonName.structured_name.family_name][], and
     * [PersonName.formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name].
     * </pre>
     *
     * <code>string person_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The personName.
     */
    public java.lang.String getPersonName() {
      java.lang.Object ref = personName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        personName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The person name. For example, "John Smith".
     * Can be any combination of [PersonName.structured_name.given_name][],
     * [PersonName.structured_name.middle_initial][],
     * [PersonName.structured_name.family_name][], and
     * [PersonName.formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name].
     * </pre>
     *
     * <code>string person_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for personName.
     */
    public com.google.protobuf.ByteString getPersonNameBytes() {
      java.lang.Object ref = personName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        personName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The person name. For example, "John Smith".
     * Can be any combination of [PersonName.structured_name.given_name][],
     * [PersonName.structured_name.middle_initial][],
     * [PersonName.structured_name.family_name][], and
     * [PersonName.formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name].
     * </pre>
     *
     * <code>string person_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The personName to set.
     * @return This builder for chaining.
     */
    public Builder setPersonName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      personName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The person name. For example, "John Smith".
     * Can be any combination of [PersonName.structured_name.given_name][],
     * [PersonName.structured_name.middle_initial][],
     * [PersonName.structured_name.family_name][], and
     * [PersonName.formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name].
     * </pre>
     *
     * <code>string person_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPersonName() {

      personName_ = getDefaultInstance().getPersonName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The person name. For example, "John Smith".
     * Can be any combination of [PersonName.structured_name.given_name][],
     * [PersonName.structured_name.middle_initial][],
     * [PersonName.structured_name.family_name][], and
     * [PersonName.formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name].
     * </pre>
     *
     * <code>string person_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for personName to set.
     * @return This builder for chaining.
     */
    public Builder setPersonNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      personName_ = value;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4beta1.PersonNameFilter)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.PersonNameFilter)
  private static final com.google.cloud.talent.v4beta1.PersonNameFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4beta1.PersonNameFilter();
  }

  public static com.google.cloud.talent.v4beta1.PersonNameFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PersonNameFilter> PARSER =
      new com.google.protobuf.AbstractParser<PersonNameFilter>() {
        @java.lang.Override
        public PersonNameFilter parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PersonNameFilter(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<PersonNameFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PersonNameFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4beta1.PersonNameFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
