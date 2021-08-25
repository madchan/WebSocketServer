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
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.ChannelMatchers;
import io.netty.handler.codec.http.*;
import io.netty.handler.codec.http.websocketx.*;

import static io.netty.handler.codec.http.HttpMethod.GET;
import static io.netty.handler.codec.http.HttpResponseStatus.*;

/**
 * 处理握手和消息
 */
public class ProtobufHandler extends SimpleChannelInboundHandler<MessageWrapperDTO.MessageWrapper> {

    private static final String TAG = "ProtobufHandler";
    private static final String WEBSOCKET_PATH = "/websocket";

    private WebSocketServerHandshaker handshaker;
    private final ChannelGroup group;

    public ProtobufHandler(ChannelGroup group) {
        this.group = group;
    }

    /**
     * 当有传入的消息都会回调；
     * @param ctx
     * @param msg
     */
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MessageWrapperDTO.MessageWrapper msg) throws Exception {
        System.out.println(TAG + " channelRead0: msg = " + msg);
        switch (msg.getWrapperType()) {
            case WRAPPER_TYPE_PING:
                System.out.println("WRAPPER_TYPE_PING");
                break;
            case WRAPPER_TYPE_MESSAGE:
                System.out.println("WRAPPER_TYPE_MESSAGE");
                break;
        }
    }

    /**
     * 当前是批量读取中的最后一条消息时回调
     *
     * @param ctx
     */
    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.flush();
    }

    private void handleHttpRequest(ChannelHandlerContext ctx, FullHttpRequest req) {
        // Handle a bad request.
        if (!req.decoderResult().isSuccess()) {
            sendHttpResponse(ctx, req, new DefaultFullHttpResponse(req.protocolVersion(), BAD_REQUEST,
                    ctx.alloc().buffer(0)));
            return;
        }

        // Allow only GET methods.
        if (!GET.equals(req.method())) {
            sendHttpResponse(ctx, req, new DefaultFullHttpResponse(req.protocolVersion(), FORBIDDEN,
                    ctx.alloc().buffer(0)));
            return;
        }

        // Send the demo page and favicon.ico
        if ("/".equals(req.uri())) {
            ByteBuf content = WebSocketServerBenchmarkPage.getContent(getWebSocketLocation(req));
            FullHttpResponse res = new DefaultFullHttpResponse(req.protocolVersion(), OK, content);

            res.headers().set(HttpHeaderNames.CONTENT_TYPE, "text/html; charset=UTF-8");
            HttpUtil.setContentLength(res, content.readableBytes());

            sendHttpResponse(ctx, req, res);
            return;
        }

        if ("/favicon.ico".equals(req.uri())) {
            FullHttpResponse res = new DefaultFullHttpResponse(req.protocolVersion(), NOT_FOUND,
                    ctx.alloc().buffer(0));
            sendHttpResponse(ctx, req, res);
            return;
        }

        // Handshake
        WebSocketServerHandshakerFactory wsFactory = new WebSocketServerHandshakerFactory(
                getWebSocketLocation(req), null, true, 5 * 1024 * 1024);
        handshaker = wsFactory.newHandshaker(req);
        if (handshaker == null) {
            WebSocketServerHandshakerFactory.sendUnsupportedVersionResponse(ctx.channel());
        } else {
            handshaker.handshake(ctx.channel(), req);
        }
    }

    private void handleWebSocketFrame(ChannelHandlerContext ctx, WebSocketFrame frame) {

        // 关闭帧
        if (frame instanceof CloseWebSocketFrame) {
            handshaker.close(ctx.channel(), (CloseWebSocketFrame) frame.retain());
            return;
        }
        // Ping帧
        if (frame instanceof PingWebSocketFrame) {
            ctx.write(new PongWebSocketFrame(frame.content().retain()));
            return;
        }
        // 对于文本帧和二进制数据帧，将数据简单地回送给了远程节点。
        if (frame instanceof TextWebSocketFrame) {
//            ctx.write(frame.retain());
            group.writeAndFlush(frame.retain(), ChannelMatchers.isNot(ctx.channel()));
            return;
        }
        if (frame instanceof BinaryWebSocketFrame) {
//            ctx.write(frame.retain());
            group.writeAndFlush(frame.retain(), ChannelMatchers.isNot(ctx.channel()));
        }
    }

    private static void sendHttpResponse(ChannelHandlerContext ctx, FullHttpRequest req, FullHttpResponse res) {
        // Generate an error page if response getStatus code is not OK (200).
        HttpResponseStatus responseStatus = res.status();
        if (responseStatus.code() != 200) {
            ByteBufUtil.writeUtf8(res.content(), responseStatus.toString());
            HttpUtil.setContentLength(res, res.content().readableBytes());
        }
        // Send the response and close the connection if necessary.
        boolean keepAlive = HttpUtil.isKeepAlive(req) && responseStatus.code() == 200;
        HttpUtil.setKeepAlive(res, keepAlive);
        ChannelFuture future = ctx.write(res); // Flushed in channelReadComplete()
        if (!keepAlive) {
            future.addListener(ChannelFutureListener.CLOSE);
        }
    }

    /**
     * 在读取操作期间，有异常抛出时会调用。
     * <p>
     * 在这里我们记录了异常并关闭了连接。虽然一个更加完善的应用程序也许会尝试从异常中恢复，
     * 但在这个场景下，只是通过简单地关闭连接来通知远程节点发生了错误。
     *
     * @param ctx
     * @param cause
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        // 打印异常栈跟踪
        cause.printStackTrace();
        // 关闭该Channel
        ctx.close();
    }

    private static String getWebSocketLocation(FullHttpRequest req) {
        String location = req.headers().get(HttpHeaderNames.HOST) + WEBSOCKET_PATH;
        if (WebSocketServer.SSL) {
            return "wss://" + location;
        } else {
            return "ws://" + location;
        }
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt == WebSocketServerProtocolHandler.ServerHandshakeStateEvent.HANDSHAKE_COMPLETE) {
            // 通知所有已经连接的WebSocket 客户端新的客户端已经连接上了
            group.writeAndFlush(new TextWebSocketFrame("Client " + ctx.channel() + " joined"));
            // 将新的WebSocket Channel添加到ChannelGroup 中，以便它可以接收到所有的消息
            group.add(ctx.channel());
        } else {
            super.userEventTriggered(ctx, evt);
        }
    }
}
