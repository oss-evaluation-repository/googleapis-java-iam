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
// source: google/iam/v2/policy.proto

package com.google.iam.v2;

/**
 *
 *
 * <pre>
 * A single rule in a `Policy`.
 * </pre>
 *
 * Protobuf type {@code google.iam.v2.PolicyRule}
 */
public final class PolicyRule extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.iam.v2.PolicyRule)
    PolicyRuleOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PolicyRule.newBuilder() to construct.
  private PolicyRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PolicyRule() {
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PolicyRule();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private PolicyRule(
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

              description_ = s;
              break;
            }
          case 18:
            {
              com.google.iam.v2.DenyRule.Builder subBuilder = null;
              if (kindCase_ == 2) {
                subBuilder = ((com.google.iam.v2.DenyRule) kind_).toBuilder();
              }
              kind_ = input.readMessage(com.google.iam.v2.DenyRule.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.iam.v2.DenyRule) kind_);
                kind_ = subBuilder.buildPartial();
              }
              kindCase_ = 2;
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
    return com.google.iam.v2.PolicyProto.internal_static_google_iam_v2_PolicyRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.v2.PolicyProto.internal_static_google_iam_v2_PolicyRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.v2.PolicyRule.class, com.google.iam.v2.PolicyRule.Builder.class);
  }

  private int kindCase_ = 0;
  private java.lang.Object kind_;

  public enum KindCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    DENY_RULE(2),
    KIND_NOT_SET(0);
    private final int value;

    private KindCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static KindCase valueOf(int value) {
      return forNumber(value);
    }

    public static KindCase forNumber(int value) {
      switch (value) {
        case 2:
          return DENY_RULE;
        case 0:
          return KIND_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public KindCase getKindCase() {
    return KindCase.forNumber(kindCase_);
  }

  public static final int DENY_RULE_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * A rule for a deny policy.
   * </pre>
   *
   * <code>.google.iam.v2.DenyRule deny_rule = 2;</code>
   *
   * @return Whether the denyRule field is set.
   */
  @java.lang.Override
  public boolean hasDenyRule() {
    return kindCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * A rule for a deny policy.
   * </pre>
   *
   * <code>.google.iam.v2.DenyRule deny_rule = 2;</code>
   *
   * @return The denyRule.
   */
  @java.lang.Override
  public com.google.iam.v2.DenyRule getDenyRule() {
    if (kindCase_ == 2) {
      return (com.google.iam.v2.DenyRule) kind_;
    }
    return com.google.iam.v2.DenyRule.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * A rule for a deny policy.
   * </pre>
   *
   * <code>.google.iam.v2.DenyRule deny_rule = 2;</code>
   */
  @java.lang.Override
  public com.google.iam.v2.DenyRuleOrBuilder getDenyRuleOrBuilder() {
    if (kindCase_ == 2) {
      return (com.google.iam.v2.DenyRule) kind_;
    }
    return com.google.iam.v2.DenyRule.getDefaultInstance();
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 1;
  private volatile java.lang.Object description_;
  /**
   *
   *
   * <pre>
   * A user-specified description of the rule. This value can be up to 256
   * characters.
   * </pre>
   *
   * <code>string description = 1;</code>
   *
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A user-specified description of the rule. This value can be up to 256
   * characters.
   * </pre>
   *
   * <code>string description = 1;</code>
   *
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      description_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, description_);
    }
    if (kindCase_ == 2) {
      output.writeMessage(2, (com.google.iam.v2.DenyRule) kind_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, description_);
    }
    if (kindCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.iam.v2.DenyRule) kind_);
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
    if (!(obj instanceof com.google.iam.v2.PolicyRule)) {
      return super.equals(obj);
    }
    com.google.iam.v2.PolicyRule other = (com.google.iam.v2.PolicyRule) obj;

    if (!getDescription().equals(other.getDescription())) return false;
    if (!getKindCase().equals(other.getKindCase())) return false;
    switch (kindCase_) {
      case 2:
        if (!getDenyRule().equals(other.getDenyRule())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    switch (kindCase_) {
      case 2:
        hash = (37 * hash) + DENY_RULE_FIELD_NUMBER;
        hash = (53 * hash) + getDenyRule().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.v2.PolicyRule parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.v2.PolicyRule parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.v2.PolicyRule parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.v2.PolicyRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.v2.PolicyRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.v2.PolicyRule parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.v2.PolicyRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.v2.PolicyRule parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.v2.PolicyRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.iam.v2.PolicyRule parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.v2.PolicyRule parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.v2.PolicyRule parseFrom(
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

  public static Builder newBuilder(com.google.iam.v2.PolicyRule prototype) {
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
   * A single rule in a `Policy`.
   * </pre>
   *
   * Protobuf type {@code google.iam.v2.PolicyRule}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.iam.v2.PolicyRule)
      com.google.iam.v2.PolicyRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.iam.v2.PolicyProto.internal_static_google_iam_v2_PolicyRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.v2.PolicyProto
          .internal_static_google_iam_v2_PolicyRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.v2.PolicyRule.class, com.google.iam.v2.PolicyRule.Builder.class);
    }

    // Construct using com.google.iam.v2.PolicyRule.newBuilder()
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
      description_ = "";

      kindCase_ = 0;
      kind_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.iam.v2.PolicyProto.internal_static_google_iam_v2_PolicyRule_descriptor;
    }

    @java.lang.Override
    public com.google.iam.v2.PolicyRule getDefaultInstanceForType() {
      return com.google.iam.v2.PolicyRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.iam.v2.PolicyRule build() {
      com.google.iam.v2.PolicyRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.iam.v2.PolicyRule buildPartial() {
      com.google.iam.v2.PolicyRule result = new com.google.iam.v2.PolicyRule(this);
      if (kindCase_ == 2) {
        if (denyRuleBuilder_ == null) {
          result.kind_ = kind_;
        } else {
          result.kind_ = denyRuleBuilder_.build();
        }
      }
      result.description_ = description_;
      result.kindCase_ = kindCase_;
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
      if (other instanceof com.google.iam.v2.PolicyRule) {
        return mergeFrom((com.google.iam.v2.PolicyRule) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.v2.PolicyRule other) {
      if (other == com.google.iam.v2.PolicyRule.getDefaultInstance()) return this;
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      switch (other.getKindCase()) {
        case DENY_RULE:
          {
            mergeDenyRule(other.getDenyRule());
            break;
          }
        case KIND_NOT_SET:
          {
            break;
          }
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
      com.google.iam.v2.PolicyRule parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.iam.v2.PolicyRule) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int kindCase_ = 0;
    private java.lang.Object kind_;

    public KindCase getKindCase() {
      return KindCase.forNumber(kindCase_);
    }

    public Builder clearKind() {
      kindCase_ = 0;
      kind_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.iam.v2.DenyRule,
            com.google.iam.v2.DenyRule.Builder,
            com.google.iam.v2.DenyRuleOrBuilder>
        denyRuleBuilder_;
    /**
     *
     *
     * <pre>
     * A rule for a deny policy.
     * </pre>
     *
     * <code>.google.iam.v2.DenyRule deny_rule = 2;</code>
     *
     * @return Whether the denyRule field is set.
     */
    @java.lang.Override
    public boolean hasDenyRule() {
      return kindCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * A rule for a deny policy.
     * </pre>
     *
     * <code>.google.iam.v2.DenyRule deny_rule = 2;</code>
     *
     * @return The denyRule.
     */
    @java.lang.Override
    public com.google.iam.v2.DenyRule getDenyRule() {
      if (denyRuleBuilder_ == null) {
        if (kindCase_ == 2) {
          return (com.google.iam.v2.DenyRule) kind_;
        }
        return com.google.iam.v2.DenyRule.getDefaultInstance();
      } else {
        if (kindCase_ == 2) {
          return denyRuleBuilder_.getMessage();
        }
        return com.google.iam.v2.DenyRule.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A rule for a deny policy.
     * </pre>
     *
     * <code>.google.iam.v2.DenyRule deny_rule = 2;</code>
     */
    public Builder setDenyRule(com.google.iam.v2.DenyRule value) {
      if (denyRuleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        kind_ = value;
        onChanged();
      } else {
        denyRuleBuilder_.setMessage(value);
      }
      kindCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A rule for a deny policy.
     * </pre>
     *
     * <code>.google.iam.v2.DenyRule deny_rule = 2;</code>
     */
    public Builder setDenyRule(com.google.iam.v2.DenyRule.Builder builderForValue) {
      if (denyRuleBuilder_ == null) {
        kind_ = builderForValue.build();
        onChanged();
      } else {
        denyRuleBuilder_.setMessage(builderForValue.build());
      }
      kindCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A rule for a deny policy.
     * </pre>
     *
     * <code>.google.iam.v2.DenyRule deny_rule = 2;</code>
     */
    public Builder mergeDenyRule(com.google.iam.v2.DenyRule value) {
      if (denyRuleBuilder_ == null) {
        if (kindCase_ == 2 && kind_ != com.google.iam.v2.DenyRule.getDefaultInstance()) {
          kind_ =
              com.google.iam.v2.DenyRule.newBuilder((com.google.iam.v2.DenyRule) kind_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          kind_ = value;
        }
        onChanged();
      } else {
        if (kindCase_ == 2) {
          denyRuleBuilder_.mergeFrom(value);
        } else {
          denyRuleBuilder_.setMessage(value);
        }
      }
      kindCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A rule for a deny policy.
     * </pre>
     *
     * <code>.google.iam.v2.DenyRule deny_rule = 2;</code>
     */
    public Builder clearDenyRule() {
      if (denyRuleBuilder_ == null) {
        if (kindCase_ == 2) {
          kindCase_ = 0;
          kind_ = null;
          onChanged();
        }
      } else {
        if (kindCase_ == 2) {
          kindCase_ = 0;
          kind_ = null;
        }
        denyRuleBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A rule for a deny policy.
     * </pre>
     *
     * <code>.google.iam.v2.DenyRule deny_rule = 2;</code>
     */
    public com.google.iam.v2.DenyRule.Builder getDenyRuleBuilder() {
      return getDenyRuleFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A rule for a deny policy.
     * </pre>
     *
     * <code>.google.iam.v2.DenyRule deny_rule = 2;</code>
     */
    @java.lang.Override
    public com.google.iam.v2.DenyRuleOrBuilder getDenyRuleOrBuilder() {
      if ((kindCase_ == 2) && (denyRuleBuilder_ != null)) {
        return denyRuleBuilder_.getMessageOrBuilder();
      } else {
        if (kindCase_ == 2) {
          return (com.google.iam.v2.DenyRule) kind_;
        }
        return com.google.iam.v2.DenyRule.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A rule for a deny policy.
     * </pre>
     *
     * <code>.google.iam.v2.DenyRule deny_rule = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.iam.v2.DenyRule,
            com.google.iam.v2.DenyRule.Builder,
            com.google.iam.v2.DenyRuleOrBuilder>
        getDenyRuleFieldBuilder() {
      if (denyRuleBuilder_ == null) {
        if (!(kindCase_ == 2)) {
          kind_ = com.google.iam.v2.DenyRule.getDefaultInstance();
        }
        denyRuleBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.iam.v2.DenyRule,
                com.google.iam.v2.DenyRule.Builder,
                com.google.iam.v2.DenyRuleOrBuilder>(
                (com.google.iam.v2.DenyRule) kind_, getParentForChildren(), isClean());
        kind_ = null;
      }
      kindCase_ = 2;
      onChanged();
      ;
      return denyRuleBuilder_;
    }

    private java.lang.Object description_ = "";
    /**
     *
     *
     * <pre>
     * A user-specified description of the rule. This value can be up to 256
     * characters.
     * </pre>
     *
     * <code>string description = 1;</code>
     *
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A user-specified description of the rule. This value can be up to 256
     * characters.
     * </pre>
     *
     * <code>string description = 1;</code>
     *
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A user-specified description of the rule. This value can be up to 256
     * characters.
     * </pre>
     *
     * <code>string description = 1;</code>
     *
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      description_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A user-specified description of the rule. This value can be up to 256
     * characters.
     * </pre>
     *
     * <code>string description = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDescription() {

      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A user-specified description of the rule. This value can be up to 256
     * characters.
     * </pre>
     *
     * <code>string description = 1;</code>
     *
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      description_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.iam.v2.PolicyRule)
  }

  // @@protoc_insertion_point(class_scope:google.iam.v2.PolicyRule)
  private static final com.google.iam.v2.PolicyRule DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.iam.v2.PolicyRule();
  }

  public static com.google.iam.v2.PolicyRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PolicyRule> PARSER =
      new com.google.protobuf.AbstractParser<PolicyRule>() {
        @java.lang.Override
        public PolicyRule parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PolicyRule(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<PolicyRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PolicyRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.iam.v2.PolicyRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}