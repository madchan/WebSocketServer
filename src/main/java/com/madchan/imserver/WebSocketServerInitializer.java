/*
 * Copyright 2014 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.madchan.imserver;

import com.madchan.imserver.bean.wrapper.MessageWrapperDTO;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.codec.http.websocketx.extensions.compression.WebSocketServerCompressionHandler;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import io.netty.handler.ssl.SslContext;

/**
 */
public class WebSocketServerInitializer extends ChannelInitializer<SocketChannel> {

    private static final String WEBSOCKET_PATH = "/websocket";
    private final SslContext sslCtx;
    private final ChannelGroup channelGroup;

    public WebSocketServerInitializer(SslContext sslCtx, ChannelGroup channelGroup) {
        this.sslCtx = sslCtx;
        this.channelGroup = channelGroup;
    }

    @Override
    public void initChannel(SocketChannel ch) throws Exception {
        // 每个Channel 都拥有一个与之相关联的ChannelPipeline，其持有一个ChannelHandler 的实例链。
        // 在默认的情况下，ChannelHandler 会把对它的方法的调用转发给链中的下一个Channel-Handler。
        ChannelPipeline pipeline = ch.pipeline();
        if (sslCtx != null) {
            pipeline.addLast(sslCtx.newHandler(ch.alloc()));
        }
        pipeline.addLast(new HttpServerCodec());
        pipeline.addLast(new HttpObjectAggregator(65536));
        pipeline.addLast(new WebSocketServerCompressionHandler());
        pipeline.addLast(new WebSocketServerProtocolHandler(WEBSOCKET_PATH, null, true));
        pipeline.addLast(new WebSocketServerHandler(channelGroup));
        pipeline.addLast(new ProtobufDecoder(MessageWrapperDTO.MessageWrapper.getDefaultInstance()));
        pipeline.addLast(new ProtobufVarint32LengthFieldPrepender());
        pipeline.addLast(new ProtobufHandler(channelGroup));
        pipeline.addLast(new ProtobufEncoder());
    }
}
