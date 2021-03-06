// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message_wrapper.proto

package com.madchan.imserver.bean.wrapper;

public final class MessageWrapperDTO {
  private MessageWrapperDTO() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MessageWrapperOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MessageWrapper)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *包装器唯一值
     * </pre>
     *
     * <code>uint64 wrapper_id = 1;</code>
     */
    long getWrapperId();

    /**
     * <pre>
     *包装器类型
     * </pre>
     *
     * <code>.MessageWrapper.WrapperType wrapper_type = 2;</code>
     */
    int getWrapperTypeValue();
    /**
     * <pre>
     *包装器类型
     * </pre>
     *
     * <code>.MessageWrapper.WrapperType wrapper_type = 2;</code>
     */
    MessageWrapper.WrapperType getWrapperType();

    /**
     * <pre>
     *包装器数据
     * </pre>
     *
     * <code>bytes data = 3;</code>
     */
    com.google.protobuf.ByteString getData();
  }
  /**
   * Protobuf type {@code MessageWrapper}
   */
  public  static final class MessageWrapper extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MessageWrapper)
      MessageWrapperOrBuilder {
    // Use MessageWrapper.newBuilder() to construct.
    private MessageWrapper(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MessageWrapper() {
      wrapperId_ = 0L;
      wrapperType_ = 0;
      data_ = com.google.protobuf.ByteString.EMPTY;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private MessageWrapper(
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

              wrapperId_ = input.readUInt64();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();

              wrapperType_ = rawValue;
              break;
            }
            case 26: {

              data_ = input.readBytes();
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
      return MessageWrapperDTO.internal_static_MessageWrapper_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MessageWrapperDTO.internal_static_MessageWrapper_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MessageWrapper.class, Builder.class);
    }

    /**
     * Protobuf enum {@code MessageWrapper.WrapperType}
     */
    public enum WrapperType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <pre>
       * 未指定
       * </pre>
       *
       * <code>WRAPPER_TYPE_UNSPECIFIED = 0;</code>
       */
      WRAPPER_TYPE_UNSPECIFIED(0),
      /**
       * <pre>
       * 聊天消息
       * </pre>
       *
       * <code>WRAPPER_TYPE_MESSAGE = 1;</code>
       */
      WRAPPER_TYPE_MESSAGE(1),
      /**
       * <pre>
       * PING
       * </pre>
       *
       * <code>WRAPPER_TYPE_PING = 2;</code>
       */
      WRAPPER_TYPE_PING(2),
      /**
       * <pre>
       * PONG
       * </pre>
       *
       * <code>WRAPPER_TYPE_PONG = 3;</code>
       */
      WRAPPER_TYPE_PONG(3),
      UNRECOGNIZED(-1),
      ;

      /**
       * <pre>
       * 未指定
       * </pre>
       *
       * <code>WRAPPER_TYPE_UNSPECIFIED = 0;</code>
       */
      public static final int WRAPPER_TYPE_UNSPECIFIED_VALUE = 0;
      /**
       * <pre>
       * 聊天消息
       * </pre>
       *
       * <code>WRAPPER_TYPE_MESSAGE = 1;</code>
       */
      public static final int WRAPPER_TYPE_MESSAGE_VALUE = 1;
      /**
       * <pre>
       * PING
       * </pre>
       *
       * <code>WRAPPER_TYPE_PING = 2;</code>
       */
      public static final int WRAPPER_TYPE_PING_VALUE = 2;
      /**
       * <pre>
       * PONG
       * </pre>
       *
       * <code>WRAPPER_TYPE_PONG = 3;</code>
       */
      public static final int WRAPPER_TYPE_PONG_VALUE = 3;


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
      public static WrapperType valueOf(int value) {
        return forNumber(value);
      }

      public static WrapperType forNumber(int value) {
        switch (value) {
          case 0: return WRAPPER_TYPE_UNSPECIFIED;
          case 1: return WRAPPER_TYPE_MESSAGE;
          case 2: return WRAPPER_TYPE_PING;
          case 3: return WRAPPER_TYPE_PONG;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<WrapperType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          WrapperType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<WrapperType>() {
              public WrapperType findValueByNumber(int number) {
                return WrapperType.forNumber(number);
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
        return MessageWrapper.getDescriptor().getEnumTypes().get(0);
      }

      private static final WrapperType[] VALUES = values();

      public static WrapperType valueOf(
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

      private WrapperType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:MessageWrapper.WrapperType)
    }

    public static final int WRAPPER_ID_FIELD_NUMBER = 1;
    private long wrapperId_;
    /**
     * <pre>
     *包装器唯一值
     * </pre>
     *
     * <code>uint64 wrapper_id = 1;</code>
     */
    public long getWrapperId() {
      return wrapperId_;
    }

    public static final int WRAPPER_TYPE_FIELD_NUMBER = 2;
    private int wrapperType_;
    /**
     * <pre>
     *包装器类型
     * </pre>
     *
     * <code>.MessageWrapper.WrapperType wrapper_type = 2;</code>
     */
    public int getWrapperTypeValue() {
      return wrapperType_;
    }
    /**
     * <pre>
     *包装器类型
     * </pre>
     *
     * <code>.MessageWrapper.WrapperType wrapper_type = 2;</code>
     */
    public WrapperType getWrapperType() {
      WrapperType result = WrapperType.valueOf(wrapperType_);
      return result == null ? WrapperType.UNRECOGNIZED : result;
    }

    public static final int DATA_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString data_;
    /**
     * <pre>
     *包装器数据
     * </pre>
     *
     * <code>bytes data = 3;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
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
      if (wrapperId_ != 0L) {
        output.writeUInt64(1, wrapperId_);
      }
      if (wrapperType_ != WrapperType.WRAPPER_TYPE_UNSPECIFIED.getNumber()) {
        output.writeEnum(2, wrapperType_);
      }
      if (!data_.isEmpty()) {
        output.writeBytes(3, data_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (wrapperId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, wrapperId_);
      }
      if (wrapperType_ != WrapperType.WRAPPER_TYPE_UNSPECIFIED.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, wrapperType_);
      }
      if (!data_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, data_);
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
      if (!(obj instanceof MessageWrapper)) {
        return super.equals(obj);
      }
      MessageWrapper other = (MessageWrapper) obj;

      boolean result = true;
      result = result && (getWrapperId()
          == other.getWrapperId());
      result = result && wrapperType_ == other.wrapperType_;
      result = result && getData()
          .equals(other.getData());
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + WRAPPER_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getWrapperId());
      hash = (37 * hash) + WRAPPER_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + wrapperType_;
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static MessageWrapper parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MessageWrapper parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MessageWrapper parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MessageWrapper parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MessageWrapper parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MessageWrapper parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static MessageWrapper parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static MessageWrapper parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static MessageWrapper parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MessageWrapper parseFrom(
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
    public static Builder newBuilder(MessageWrapper prototype) {
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
     * Protobuf type {@code MessageWrapper}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MessageWrapper)
        MessageWrapperOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MessageWrapperDTO.internal_static_MessageWrapper_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MessageWrapperDTO.internal_static_MessageWrapper_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MessageWrapper.class, Builder.class);
      }

      // Construct using com.madchan.imserver.bean.wrapper.MessageWrapperDTO.MessageWrapper.newBuilder()
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
        wrapperId_ = 0L;

        wrapperType_ = 0;

        data_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MessageWrapperDTO.internal_static_MessageWrapper_descriptor;
      }

      public MessageWrapper getDefaultInstanceForType() {
        return MessageWrapper.getDefaultInstance();
      }

      public MessageWrapper build() {
        MessageWrapper result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MessageWrapper buildPartial() {
        MessageWrapper result = new MessageWrapper(this);
        result.wrapperId_ = wrapperId_;
        result.wrapperType_ = wrapperType_;
        result.data_ = data_;
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
        if (other instanceof MessageWrapper) {
          return mergeFrom((MessageWrapper)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MessageWrapper other) {
        if (other == MessageWrapper.getDefaultInstance()) return this;
        if (other.getWrapperId() != 0L) {
          setWrapperId(other.getWrapperId());
        }
        if (other.wrapperType_ != 0) {
          setWrapperTypeValue(other.getWrapperTypeValue());
        }
        if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
          setData(other.getData());
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
        MessageWrapper parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MessageWrapper) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long wrapperId_ ;
      /**
       * <pre>
       *包装器唯一值
       * </pre>
       *
       * <code>uint64 wrapper_id = 1;</code>
       */
      public long getWrapperId() {
        return wrapperId_;
      }
      /**
       * <pre>
       *包装器唯一值
       * </pre>
       *
       * <code>uint64 wrapper_id = 1;</code>
       */
      public Builder setWrapperId(long value) {
        
        wrapperId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *包装器唯一值
       * </pre>
       *
       * <code>uint64 wrapper_id = 1;</code>
       */
      public Builder clearWrapperId() {
        
        wrapperId_ = 0L;
        onChanged();
        return this;
      }

      private int wrapperType_ = 0;
      /**
       * <pre>
       *包装器类型
       * </pre>
       *
       * <code>.MessageWrapper.WrapperType wrapper_type = 2;</code>
       */
      public int getWrapperTypeValue() {
        return wrapperType_;
      }
      /**
       * <pre>
       *包装器类型
       * </pre>
       *
       * <code>.MessageWrapper.WrapperType wrapper_type = 2;</code>
       */
      public Builder setWrapperTypeValue(int value) {
        wrapperType_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *包装器类型
       * </pre>
       *
       * <code>.MessageWrapper.WrapperType wrapper_type = 2;</code>
       */
      public WrapperType getWrapperType() {
        WrapperType result = WrapperType.valueOf(wrapperType_);
        return result == null ? WrapperType.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       *包装器类型
       * </pre>
       *
       * <code>.MessageWrapper.WrapperType wrapper_type = 2;</code>
       */
      public Builder setWrapperType(WrapperType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        wrapperType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *包装器类型
       * </pre>
       *
       * <code>.MessageWrapper.WrapperType wrapper_type = 2;</code>
       */
      public Builder clearWrapperType() {
        
        wrapperType_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       *包装器数据
       * </pre>
       *
       * <code>bytes data = 3;</code>
       */
      public com.google.protobuf.ByteString getData() {
        return data_;
      }
      /**
       * <pre>
       *包装器数据
       * </pre>
       *
       * <code>bytes data = 3;</code>
       */
      public Builder setData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *包装器数据
       * </pre>
       *
       * <code>bytes data = 3;</code>
       */
      public Builder clearData() {
        
        data_ = getDefaultInstance().getData();
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


      // @@protoc_insertion_point(builder_scope:MessageWrapper)
    }

    // @@protoc_insertion_point(class_scope:MessageWrapper)
    private static final MessageWrapper DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MessageWrapper();
    }

    public static MessageWrapper getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MessageWrapper>
        PARSER = new com.google.protobuf.AbstractParser<MessageWrapper>() {
      public MessageWrapper parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new MessageWrapper(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MessageWrapper> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<MessageWrapper> getParserForType() {
      return PARSER;
    }

    public MessageWrapper getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MessageWrapper_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MessageWrapper_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\025message_wrapper.proto\"\332\001\n\016MessageWrapp" +
      "er\022\022\n\nwrapper_id\030\001 \001(\004\0221\n\014wrapper_type\030\002" +
      " \001(\0162\033.MessageWrapper.WrapperType\022\014\n\004dat" +
      "a\030\003 \001(\014\"s\n\013WrapperType\022\034\n\030WRAPPER_TYPE_U" +
      "NSPECIFIED\020\000\022\030\n\024WRAPPER_TYPE_MESSAGE\020\001\022\025" +
      "\n\021WRAPPER_TYPE_PING\020\002\022\025\n\021WRAPPER_TYPE_PO" +
      "NG\020\003B6\n!com.madchan.imserver.bean.wrappe" +
      "rB\021MessageWrapperDTOb\006proto3"
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
    internal_static_MessageWrapper_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MessageWrapper_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MessageWrapper_descriptor,
        new String[] { "WrapperId", "WrapperType", "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
