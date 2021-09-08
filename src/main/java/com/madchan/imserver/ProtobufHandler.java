package com.madchan.imserver;

import com.madchan.imserver.bean.wrapper.MessageWrapperDTO;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.ChannelMatchers;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;

/**
 * 处理握手和消息
 */
public class ProtobufHandler extends SimpleChannelInboundHandler<MessageWrapperDTO.MessageWrapper> {

    private static final String TAG = "ProtobufHandler";

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
                MessageWrapperDTO.MessageWrapper messageWrapper = MessageWrapperDTO.MessageWrapper.newBuilder()
                        .setWrapperId(msg.getWrapperId())
                        .setWrapperType(MessageWrapperDTO.MessageWrapper.WrapperType.WRAPPER_TYPE_PONG)
                        .build();
                group.writeAndFlush(new BinaryWebSocketFrame(Unpooled.wrappedBuffer(messageWrapper.toByteArray())).retain(), ChannelMatchers.is(ctx.channel()));
                break;
            case WRAPPER_TYPE_MESSAGE:
                System.out.println("WRAPPER_TYPE_MESSAGE");
                group.writeAndFlush(new BinaryWebSocketFrame(Unpooled.wrappedBuffer(msg.toByteArray())).retain(), ChannelMatchers.isNot(ctx.channel()));
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
