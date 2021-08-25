// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message_dto.proto

package com.madchan.imserver.bean.dto;

public final class MessageDTO {
  private MessageDTO() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Message)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *消息唯一值
     * </pre>
     *
     * <code>uint64 message_id = 1;</code>
     */
    long getMessageId();

    /**
     * <pre>
     *消息类型
     * </pre>
     *
     * <code>.Message.MessageType message_type = 2;</code>
     */
    int getMessageTypeValue();
    /**
     * <pre>
     *消息类型
     * </pre>
     *
     * <code>.Message.MessageType message_type = 2;</code>
     */
    Message.MessageType getMessageType();

    /**
     * <pre>
     *消息发送用户
     * </pre>
     *
     * <code>string sender_id = 3;</code>
     */
    String getSenderId();
    /**
     * <pre>
     *消息发送用户
     * </pre>
     *
     * <code>string sender_id = 3;</code>
     */
    com.google.protobuf.ByteString
        getSenderIdBytes();

    /**
     * <pre>
     *消息目标用户
     * </pre>
     *
     * <code>string target_id = 4;</code>
     */
    String getTargetId();
    /**
     * <pre>
     *消息目标用户
     * </pre>
     *
     * <code>string target_id = 4;</code>
     */
    com.google.protobuf.ByteString
        getTargetIdBytes();

    /**
     * <pre>
     *消息时间戳
     * </pre>
     *
     * <code>uint64 timestamp = 5;</code>
     */
    long getTimestamp();

    /**
     * <pre>
     *消息内容
     * </pre>
     *
     * <code>bytes content = 6;</code>
     */
    com.google.protobuf.ByteString getContent();
  }
  /**
   * Protobuf type {@code Message}
   */
  public  static final class Message extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Message)
      MessageOrBuilder {
    // Use Message.newBuilder() to construct.
    private Message(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Message() {
      messageId_ = 0L;
      messageType_ = 0;
      senderId_ = "";
      targetId_ = "";
      timestamp_ = 0L;
      content_ = com.google.protobuf.ByteString.EMPTY;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Message(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              messageId_ = input.readUInt64();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();

              messageType_ = rawValue;
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              senderId_ = s;
              break;
            }
            case 34: {
              String s = input.readStringRequireUtf8();

              targetId_ = s;
              break;
            }
            case 40: {

              timestamp_ = input.readUInt64();
              break;
            }
            case 50: {

              content_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MessageDTO.internal_static_Message_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MessageDTO.internal_static_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Message.class, Builder.class);
    }

    /**
     * Protobuf enum {@code Message.MessageType}
     */
    public enum MessageType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <pre>
       * 未指定
       * </pre>
       *
       * <code>MESSAGE_TYPE_UNSPECIFIED = 0;</code>
       */
      MESSAGE_TYPE_UNSPECIFIED(0),
      /**
       * <pre>
       * 文本消息
       * </pre>
       *
       * <code>MESSAGE_TYPE_TEXT = 1;</code>
       */
      MESSAGE_TYPE_TEXT(1),
      /**
       * <pre>
       * 图片消息
       * </pre>
       *
       * <code>MESSAGE_TYPE_IMAGE = 2;</code>
       */
      MESSAGE_TYPE_IMAGE(2),
      /**
       * <pre>
       * 音频消息
       * </pre>
       *
       * <code>MESSAGE_TYPE_AUDIO = 3;</code>
       */
      MESSAGE_TYPE_AUDIO(3),
      /**
       * <pre>
       * 视频消息
       * </pre>
       *
       * <code>MESSAGE_TYPE_VIDEO = 4;</code>
       */
      MESSAGE_TYPE_VIDEO(4),
      /**
       * <pre>
       * 文件消息
       * </pre>
       *
       * <code>MESSAGE_TYPE_FILE = 5;</code>
       */
      MESSAGE_TYPE_FILE(5),
      /**
       * <pre>
       * 名片消息
       * </pre>
       *
       * <code>MESSAGE_TYPE_CONTACT = 6;</code>
       */
      MESSAGE_TYPE_CONTACT(6),
      /**
       * <pre>
       * 位置消息
       * </pre>
       *
       * <code>MESSAGE_TYPE_LOCATION = 7;</code>
       */
      MESSAGE_TYPE_LOCATION(7),
      /**
       * <pre>
       * 表情消息
       * </pre>
       *
       * <code>MESSAGE_TYPE_EMOTION = 8;</code>
       */
      MESSAGE_TYPE_EMOTION(8),
      /**
       * <pre>
       * 链接消息
       * </pre>
       *
       * <code>MESSAGE_TYPE_URL = 10;</code>
       */
      MESSAGE_TYPE_URL(10),
      UNRECOGNIZED(-1),
      ;

      /**
       * <pre>
       * 未指定
       * </pre>
       *
       * <code>MESSAGE_TYPE_UNSPECIFIED = 0;</code>
       */
      public static final int MESSAGE_TYPE_UNSPECIFIED_VALUE = 0;
      /**
       * <pre>
       * 文本消息
       * </pre>
       *
       * <code>MESSAGE_TYPE_TEXT = 1;</code>
       */
      public static final int MESSAGE_TYPE_TEXT_VALUE = 1;
      /**
       * <pre>
       * 图片消息
       * </pre>
       *
       * <code>MESSAGE_TYPE_IMAGE = 2;</code>
       */
      public static final int MESSAGE_TYPE_IMAGE_VALUE = 2;
      /**
       * <pre>
       * 音频消息
       * </pre>
       *
       * <code>MESSAGE_TYPE_AUDIO = 3;</code>
       */
      public static final int MESSAGE_TYPE_AUDIO_VALUE = 3;
      /**
       * <pre>
       * 视频消息
       * </pre>
       *
       * <code>MESSAGE_TYPE_VIDEO = 4;</code>
       */
      public static final int MESSAGE_TYPE_VIDEO_VALUE = 4;
      /**
       * <pre>
       * 文件消息
       * </pre>
       *
       * <code>MESSAGE_TYPE_FILE = 5;</code>
       */
      public static final int MESSAGE_TYPE_FILE_VALUE = 5;
      /**
       * <pre>
       * 名片消息
       * </pre>
       *
       * <code>MESSAGE_TYPE_CONTACT = 6;</code>
       */
      public static final int MESSAGE_TYPE_CONTACT_VALUE = 6;
      /**
       * <pre>
       * 位置消息
       * </pre>
       *
       * <code>MESSAGE_TYPE_LOCATION = 7;</code>
       */
      public static final int MESSAGE_TYPE_LOCATION_VALUE = 7;
      /**
       * <pre>
       * 表情消息
       * </pre>
       *
       * <code>MESSAGE_TYPE_EMOTION = 8;</code>
       */
      public static final int MESSAGE_TYPE_EMOTION_VALUE = 8;
      /**
       * <pre>
       * 链接消息
       * </pre>
       *
       * <code>MESSAGE_TYPE_URL = 10;</code>
       */
      public static final int MESSAGE_TYPE_URL_VALUE = 10;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @Deprecated
      public static MessageType valueOf(int value) {
        return forNumber(value);
      }

      public static MessageType forNumber(int value) {
        switch (value) {
          case 0: return MESSAGE_TYPE_UNSPECIFIED;
          case 1: return MESSAGE_TYPE_TEXT;
          case 2: return MESSAGE_TYPE_IMAGE;
          case 3: return MESSAGE_TYPE_AUDIO;
          case 4: return MESSAGE_TYPE_VIDEO;
          case 5: return MESSAGE_TYPE_FILE;
          case 6: return MESSAGE_TYPE_CONTACT;
          case 7: return MESSAGE_TYPE_LOCATION;
          case 8: return MESSAGE_TYPE_EMOTION;
          case 10: return MESSAGE_TYPE_URL;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<MessageType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          MessageType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<MessageType>() {
              public MessageType findValueByNumber(int number) {
                return MessageType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return Message.getDescriptor().getEnumTypes().get(0);
      }

      private static final MessageType[] VALUES = values();

      public static MessageType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private MessageType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:Message.MessageType)
    }

    public static final int MESSAGE_ID_FIELD_NUMBER = 1;
    private long messageId_;
    /**
     * <pre>
     *消息唯一值
     * </pre>
     *
     * <code>uint64 message_id = 1;</code>
     */
    public long getMessageId() {
      return messageId_;
    }

    public static final int MESSAGE_TYPE_FIELD_NUMBER = 2;
    private int messageType_;
    /**
     * <pre>
     *消息类型
     * </pre>
     *
     * <code>.Message.MessageType message_type = 2;</code>
     */
    public int getMessageTypeValue() {
      return messageType_;
    }
    /**
     * <pre>
     *消息类型
     * </pre>
     *
     * <code>.Message.MessageType message_type = 2;</code>
     */
    public MessageType getMessageType() {
      MessageType result = MessageType.valueOf(messageType_);
      return result == null ? MessageType.UNRECOGNIZED : result;
    }

    public static final int SENDER_ID_FIELD_NUMBER = 3;
    private volatile Object senderId_;
    /**
     * <pre>
     *消息发送用户
     * </pre>
     *
     * <code>string sender_id = 3;</code>
     */
    public String getSenderId() {
      Object ref = senderId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        senderId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *消息发送用户
     * </pre>
     *
     * <code>string sender_id = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSenderIdBytes() {
      Object ref = senderId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        senderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TARGET_ID_FIELD_NUMBER = 4;
    private volatile Object targetId_;
    /**
     * <pre>
     *消息目标用户
     * </pre>
     *
     * <code>string target_id = 4;</code>
     */
    public String getTargetId() {
      Object ref = targetId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        targetId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *消息目标用户
     * </pre>
     *
     * <code>string target_id = 4;</code>
     */
    public com.google.protobuf.ByteString
        getTargetIdBytes() {
      Object ref = targetId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        targetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 5;
    private long timestamp_;
    /**
     * <pre>
     *消息时间戳
     * </pre>
     *
     * <code>uint64 timestamp = 5;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }

    public static final int CONTENT_FIELD_NUMBER = 6;
    private com.google.protobuf.ByteString content_;
    /**
     * <pre>
     *消息内容
     * </pre>
     *
     * <code>bytes content = 6;</code>
     */
    public com.google.protobuf.ByteString getContent() {
      return content_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (messageId_ != 0L) {
        output.writeUInt64(1, messageId_);
      }
      if (messageType_ != MessageType.MESSAGE_TYPE_UNSPECIFIED.getNumber()) {
        output.writeEnum(2, messageType_);
      }
      if (!getSenderIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, senderId_);
      }
      if (!getTargetIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, targetId_);
      }
      if (timestamp_ != 0L) {
        output.writeUInt64(5, timestamp_);
      }
      if (!content_.isEmpty()) {
        output.writeBytes(6, content_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (messageId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, messageId_);
      }
      if (messageType_ != MessageType.MESSAGE_TYPE_UNSPECIFIED.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, messageType_);
      }
      if (!getSenderIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, senderId_);
      }
      if (!getTargetIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, targetId_);
      }
      if (timestamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, timestamp_);
      }
      if (!content_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, content_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Message)) {
        return super.equals(obj);
      }
      Message other = (Message) obj;

      boolean result = true;
      result = result && (getMessageId()
          == other.getMessageId());
      result = result && messageType_ == other.messageType_;
      result = result && getSenderId()
          .equals(other.getSenderId());
      result = result && getTargetId()
          .equals(other.getTargetId());
      result = result && (getTimestamp()
          == other.getTimestamp());
      result = result && getContent()
          .equals(other.getContent());
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + MESSAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMessageId());
      hash = (37 * hash) + MESSAGE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + messageType_;
      hash = (37 * hash) + SENDER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSenderId().hashCode();
      hash = (37 * hash) + TARGET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetId().hashCode();
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimestamp());
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Message parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Message parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Message parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Message parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Message parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Message parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Message parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Message parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Message parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Message parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Message prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Message}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Message)
        MessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MessageDTO.internal_static_Message_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MessageDTO.internal_static_Message_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Message.class, Builder.class);
      }

      // Construct using com.madchan.imserver.bean.dto.MessageDTO.Message.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        messageId_ = 0L;

        messageType_ = 0;

        senderId_ = "";

        targetId_ = "";

        timestamp_ = 0L;

        content_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MessageDTO.internal_static_Message_descriptor;
      }

      public Message getDefaultInstanceForType() {
        return Message.getDefaultInstance();
      }

      public Message build() {
        Message result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Message buildPartial() {
        Message result = new Message(this);
        result.messageId_ = messageId_;
        result.messageType_ = messageType_;
        result.senderId_ = senderId_;
        result.targetId_ = targetId_;
        result.timestamp_ = timestamp_;
        result.content_ = content_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Message) {
          return mergeFrom((Message)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Message other) {
        if (other == Message.getDefaultInstance()) return this;
        if (other.getMessageId() != 0L) {
          setMessageId(other.getMessageId());
        }
        if (other.messageType_ != 0) {
          setMessageTypeValue(other.getMessageTypeValue());
        }
        if (!other.getSenderId().isEmpty()) {
          senderId_ = other.senderId_;
          onChanged();
        }
        if (!other.getTargetId().isEmpty()) {
          targetId_ = other.targetId_;
          onChanged();
        }
        if (other.getTimestamp() != 0L) {
          setTimestamp(other.getTimestamp());
        }
        if (other.getContent() != com.google.protobuf.ByteString.EMPTY) {
          setContent(other.getContent());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Message parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Message) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long messageId_ ;
      /**
       * <pre>
       *消息唯一值
       * </pre>
       *
       * <code>uint64 message_id = 1;</code>
       */
      public long getMessageId() {
        return messageId_;
      }
      /**
       * <pre>
       *消息唯一值
       * </pre>
       *
       * <code>uint64 message_id = 1;</code>
       */
      public Builder setMessageId(long value) {
        
        messageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *消息唯一值
       * </pre>
       *
       * <code>uint64 message_id = 1;</code>
       */
      public Builder clearMessageId() {
        
        messageId_ = 0L;
        onChanged();
        return this;
      }

      private int messageType_ = 0;
      /**
       * <pre>
       *消息类型
       * </pre>
       *
       * <code>.Message.MessageType message_type = 2;</code>
       */
      public int getMessageTypeValue() {
        return messageType_;
      }
      /**
       * <pre>
       *消息类型
       * </pre>
       *
       * <code>.Message.MessageType message_type = 2;</code>
       */
      public Builder setMessageTypeValue(int value) {
        messageType_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *消息类型
       * </pre>
       *
       * <code>.Message.MessageType message_type = 2;</code>
       */
      public MessageType getMessageType() {
        MessageType result = MessageType.valueOf(messageType_);
        return result == null ? MessageType.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       *消息类型
       * </pre>
       *
       * <code>.Message.MessageType message_type = 2;</code>
       */
      public Builder setMessageType(MessageType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        messageType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *消息类型
       * </pre>
       *
       * <code>.Message.MessageType message_type = 2;</code>
       */
      public Builder clearMessageType() {
        
        messageType_ = 0;
        onChanged();
        return this;
      }

      private Object senderId_ = "";
      /**
       * <pre>
       *消息发送用户
       * </pre>
       *
       * <code>string sender_id = 3;</code>
       */
      public String getSenderId() {
        Object ref = senderId_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          senderId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       *消息发送用户
       * </pre>
       *
       * <code>string sender_id = 3;</code>
       */
      public com.google.protobuf.ByteString
          getSenderIdBytes() {
        Object ref = senderId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          senderId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *消息发送用户
       * </pre>
       *
       * <code>string sender_id = 3;</code>
       */
      public Builder setSenderId(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        senderId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *消息发送用户
       * </pre>
       *
       * <code>string sender_id = 3;</code>
       */
      public Builder clearSenderId() {
        
        senderId_ = getDefaultInstance().getSenderId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *消息发送用户
       * </pre>
       *
       * <code>string sender_id = 3;</code>
       */
      public Builder setSenderIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        senderId_ = value;
        onChanged();
        return this;
      }

      private Object targetId_ = "";
      /**
       * <pre>
       *消息目标用户
       * </pre>
       *
       * <code>string target_id = 4;</code>
       */
      public String getTargetId() {
        Object ref = targetId_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          targetId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       *消息目标用户
       * </pre>
       *
       * <code>string target_id = 4;</code>
       */
      public com.google.protobuf.ByteString
          getTargetIdBytes() {
        Object ref = targetId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          targetId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *消息目标用户
       * </pre>
       *
       * <code>string target_id = 4;</code>
       */
      public Builder setTargetId(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        targetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *消息目标用户
       * </pre>
       *
       * <code>string target_id = 4;</code>
       */
      public Builder clearTargetId() {
        
        targetId_ = getDefaultInstance().getTargetId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *消息目标用户
       * </pre>
       *
       * <code>string target_id = 4;</code>
       */
      public Builder setTargetIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        targetId_ = value;
        onChanged();
        return this;
      }

      private long timestamp_ ;
      /**
       * <pre>
       *消息时间戳
       * </pre>
       *
       * <code>uint64 timestamp = 5;</code>
       */
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <pre>
       *消息时间戳
       * </pre>
       *
       * <code>uint64 timestamp = 5;</code>
       */
      public Builder setTimestamp(long value) {
        
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *消息时间戳
       * </pre>
       *
       * <code>uint64 timestamp = 5;</code>
       */
      public Builder clearTimestamp() {
        
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString content_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       *消息内容
       * </pre>
       *
       * <code>bytes content = 6;</code>
       */
      public com.google.protobuf.ByteString getContent() {
        return content_;
      }
      /**
       * <pre>
       *消息内容
       * </pre>
       *
       * <code>bytes content = 6;</code>
       */
      public Builder setContent(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *消息内容
       * </pre>
       *
       * <code>bytes content = 6;</code>
       */
      public Builder clearContent() {
        
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:Message)
    }

    // @@protoc_insertion_point(class_scope:Message)
    private static final Message DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Message();
    }

    public static Message getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Message>
        PARSER = new com.google.protobuf.AbstractParser<Message>() {
      public Message parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Message(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Message> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Message> getParserForType() {
      return PARSER;
    }

    public Message getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Message_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\021message_dto.proto\"\234\003\n\007Message\022\022\n\nmessa" +
      "ge_id\030\001 \001(\004\022*\n\014message_type\030\002 \001(\0162\024.Mess" +
      "age.MessageType\022\021\n\tsender_id\030\003 \001(\t\022\021\n\tta" +
      "rget_id\030\004 \001(\t\022\021\n\ttimestamp\030\005 \001(\004\022\017\n\007cont" +
      "ent\030\006 \001(\014\"\206\002\n\013MessageType\022\034\n\030MESSAGE_TYP" +
      "E_UNSPECIFIED\020\000\022\025\n\021MESSAGE_TYPE_TEXT\020\001\022\026" +
      "\n\022MESSAGE_TYPE_IMAGE\020\002\022\026\n\022MESSAGE_TYPE_A" +
      "UDIO\020\003\022\026\n\022MESSAGE_TYPE_VIDEO\020\004\022\025\n\021MESSAG" +
      "E_TYPE_FILE\020\005\022\030\n\024MESSAGE_TYPE_CONTACT\020\006\022" +
      "\031\n\025MESSAGE_TYPE_LOCATION\020\007\022\030\n\024MESSAGE_TY",
      "PE_EMOTION\020\010\022\024\n\020MESSAGE_TYPE_URL\020\nB+\n\035co" +
      "m.madchan.imserver.bean.dtoB\nMessageDTOb" +
      "\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Message_descriptor,
        new String[] { "MessageId", "MessageType", "SenderId", "TargetId", "Timestamp", "Content", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
