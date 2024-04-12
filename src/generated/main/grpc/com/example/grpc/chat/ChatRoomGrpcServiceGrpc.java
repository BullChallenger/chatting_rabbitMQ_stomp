package com.example.grpc.chat;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: chatting.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ChatRoomGrpcServiceGrpc {

  private ChatRoomGrpcServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "token.ChatRoomGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.chat.ChatRoomRequest,
      com.example.grpc.chat.ChatRoomResponse> getCreateChatRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateChatRoom",
      requestType = com.example.grpc.chat.ChatRoomRequest.class,
      responseType = com.example.grpc.chat.ChatRoomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.chat.ChatRoomRequest,
      com.example.grpc.chat.ChatRoomResponse> getCreateChatRoomMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.chat.ChatRoomRequest, com.example.grpc.chat.ChatRoomResponse> getCreateChatRoomMethod;
    if ((getCreateChatRoomMethod = ChatRoomGrpcServiceGrpc.getCreateChatRoomMethod) == null) {
      synchronized (ChatRoomGrpcServiceGrpc.class) {
        if ((getCreateChatRoomMethod = ChatRoomGrpcServiceGrpc.getCreateChatRoomMethod) == null) {
          ChatRoomGrpcServiceGrpc.getCreateChatRoomMethod = getCreateChatRoomMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.chat.ChatRoomRequest, com.example.grpc.chat.ChatRoomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateChatRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.chat.ChatRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.chat.ChatRoomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ChatRoomGrpcServiceMethodDescriptorSupplier("CreateChatRoom"))
              .build();
        }
      }
    }
    return getCreateChatRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.chat.ChatRoomIdRequest,
      com.example.grpc.chat.ChatRoomResponse> getEnterChatRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnterChatRoom",
      requestType = com.example.grpc.chat.ChatRoomIdRequest.class,
      responseType = com.example.grpc.chat.ChatRoomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.chat.ChatRoomIdRequest,
      com.example.grpc.chat.ChatRoomResponse> getEnterChatRoomMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.chat.ChatRoomIdRequest, com.example.grpc.chat.ChatRoomResponse> getEnterChatRoomMethod;
    if ((getEnterChatRoomMethod = ChatRoomGrpcServiceGrpc.getEnterChatRoomMethod) == null) {
      synchronized (ChatRoomGrpcServiceGrpc.class) {
        if ((getEnterChatRoomMethod = ChatRoomGrpcServiceGrpc.getEnterChatRoomMethod) == null) {
          ChatRoomGrpcServiceGrpc.getEnterChatRoomMethod = getEnterChatRoomMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.chat.ChatRoomIdRequest, com.example.grpc.chat.ChatRoomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnterChatRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.chat.ChatRoomIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.chat.ChatRoomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ChatRoomGrpcServiceMethodDescriptorSupplier("EnterChatRoom"))
              .build();
        }
      }
    }
    return getEnterChatRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.chat.AgentIdRequest,
      com.example.grpc.chat.ChatRoomListResponse> getFindAllByAgentIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindAllByAgentId",
      requestType = com.example.grpc.chat.AgentIdRequest.class,
      responseType = com.example.grpc.chat.ChatRoomListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.chat.AgentIdRequest,
      com.example.grpc.chat.ChatRoomListResponse> getFindAllByAgentIdMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.chat.AgentIdRequest, com.example.grpc.chat.ChatRoomListResponse> getFindAllByAgentIdMethod;
    if ((getFindAllByAgentIdMethod = ChatRoomGrpcServiceGrpc.getFindAllByAgentIdMethod) == null) {
      synchronized (ChatRoomGrpcServiceGrpc.class) {
        if ((getFindAllByAgentIdMethod = ChatRoomGrpcServiceGrpc.getFindAllByAgentIdMethod) == null) {
          ChatRoomGrpcServiceGrpc.getFindAllByAgentIdMethod = getFindAllByAgentIdMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.chat.AgentIdRequest, com.example.grpc.chat.ChatRoomListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindAllByAgentId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.chat.AgentIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.chat.ChatRoomListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ChatRoomGrpcServiceMethodDescriptorSupplier("FindAllByAgentId"))
              .build();
        }
      }
    }
    return getFindAllByAgentIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.chat.ClientIdRequest,
      com.example.grpc.chat.ChatRoomListResponse> getFindAllByClientIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindAllByClientId",
      requestType = com.example.grpc.chat.ClientIdRequest.class,
      responseType = com.example.grpc.chat.ChatRoomListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.chat.ClientIdRequest,
      com.example.grpc.chat.ChatRoomListResponse> getFindAllByClientIdMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.chat.ClientIdRequest, com.example.grpc.chat.ChatRoomListResponse> getFindAllByClientIdMethod;
    if ((getFindAllByClientIdMethod = ChatRoomGrpcServiceGrpc.getFindAllByClientIdMethod) == null) {
      synchronized (ChatRoomGrpcServiceGrpc.class) {
        if ((getFindAllByClientIdMethod = ChatRoomGrpcServiceGrpc.getFindAllByClientIdMethod) == null) {
          ChatRoomGrpcServiceGrpc.getFindAllByClientIdMethod = getFindAllByClientIdMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.chat.ClientIdRequest, com.example.grpc.chat.ChatRoomListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindAllByClientId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.chat.ClientIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.chat.ChatRoomListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ChatRoomGrpcServiceMethodDescriptorSupplier("FindAllByClientId"))
              .build();
        }
      }
    }
    return getFindAllByClientIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.chat.ChatRoomIdRequest,
      com.example.grpc.chat.ExitChatRoomResponse> getExitChatRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExitChatRoom",
      requestType = com.example.grpc.chat.ChatRoomIdRequest.class,
      responseType = com.example.grpc.chat.ExitChatRoomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.chat.ChatRoomIdRequest,
      com.example.grpc.chat.ExitChatRoomResponse> getExitChatRoomMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.chat.ChatRoomIdRequest, com.example.grpc.chat.ExitChatRoomResponse> getExitChatRoomMethod;
    if ((getExitChatRoomMethod = ChatRoomGrpcServiceGrpc.getExitChatRoomMethod) == null) {
      synchronized (ChatRoomGrpcServiceGrpc.class) {
        if ((getExitChatRoomMethod = ChatRoomGrpcServiceGrpc.getExitChatRoomMethod) == null) {
          ChatRoomGrpcServiceGrpc.getExitChatRoomMethod = getExitChatRoomMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.chat.ChatRoomIdRequest, com.example.grpc.chat.ExitChatRoomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExitChatRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.chat.ChatRoomIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.chat.ExitChatRoomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ChatRoomGrpcServiceMethodDescriptorSupplier("ExitChatRoom"))
              .build();
        }
      }
    }
    return getExitChatRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.chat.ChatRoomRequest,
      com.example.grpc.chat.ChatRoomValidationResult> getIsChatRoomOpenedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsChatRoomOpened",
      requestType = com.example.grpc.chat.ChatRoomRequest.class,
      responseType = com.example.grpc.chat.ChatRoomValidationResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.chat.ChatRoomRequest,
      com.example.grpc.chat.ChatRoomValidationResult> getIsChatRoomOpenedMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.chat.ChatRoomRequest, com.example.grpc.chat.ChatRoomValidationResult> getIsChatRoomOpenedMethod;
    if ((getIsChatRoomOpenedMethod = ChatRoomGrpcServiceGrpc.getIsChatRoomOpenedMethod) == null) {
      synchronized (ChatRoomGrpcServiceGrpc.class) {
        if ((getIsChatRoomOpenedMethod = ChatRoomGrpcServiceGrpc.getIsChatRoomOpenedMethod) == null) {
          ChatRoomGrpcServiceGrpc.getIsChatRoomOpenedMethod = getIsChatRoomOpenedMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.chat.ChatRoomRequest, com.example.grpc.chat.ChatRoomValidationResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsChatRoomOpened"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.chat.ChatRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.chat.ChatRoomValidationResult.getDefaultInstance()))
              .setSchemaDescriptor(new ChatRoomGrpcServiceMethodDescriptorSupplier("IsChatRoomOpened"))
              .build();
        }
      }
    }
    return getIsChatRoomOpenedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChatRoomGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChatRoomGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChatRoomGrpcServiceStub>() {
        @java.lang.Override
        public ChatRoomGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChatRoomGrpcServiceStub(channel, callOptions);
        }
      };
    return ChatRoomGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChatRoomGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChatRoomGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChatRoomGrpcServiceBlockingStub>() {
        @java.lang.Override
        public ChatRoomGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChatRoomGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return ChatRoomGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChatRoomGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChatRoomGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChatRoomGrpcServiceFutureStub>() {
        @java.lang.Override
        public ChatRoomGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChatRoomGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return ChatRoomGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createChatRoom(com.example.grpc.chat.ChatRoomRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.chat.ChatRoomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateChatRoomMethod(), responseObserver);
    }

    /**
     */
    default void enterChatRoom(com.example.grpc.chat.ChatRoomIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.chat.ChatRoomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnterChatRoomMethod(), responseObserver);
    }

    /**
     */
    default void findAllByAgentId(com.example.grpc.chat.AgentIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.chat.ChatRoomListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllByAgentIdMethod(), responseObserver);
    }

    /**
     */
    default void findAllByClientId(com.example.grpc.chat.ClientIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.chat.ChatRoomListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllByClientIdMethod(), responseObserver);
    }

    /**
     */
    default void exitChatRoom(com.example.grpc.chat.ChatRoomIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.chat.ExitChatRoomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExitChatRoomMethod(), responseObserver);
    }

    /**
     */
    default void isChatRoomOpened(com.example.grpc.chat.ChatRoomRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.chat.ChatRoomValidationResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsChatRoomOpenedMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ChatRoomGrpcService.
   */
  public static abstract class ChatRoomGrpcServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ChatRoomGrpcServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ChatRoomGrpcService.
   */
  public static final class ChatRoomGrpcServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ChatRoomGrpcServiceStub> {
    private ChatRoomGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatRoomGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChatRoomGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void createChatRoom(com.example.grpc.chat.ChatRoomRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.chat.ChatRoomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateChatRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enterChatRoom(com.example.grpc.chat.ChatRoomIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.chat.ChatRoomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnterChatRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllByAgentId(com.example.grpc.chat.AgentIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.chat.ChatRoomListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllByAgentIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllByClientId(com.example.grpc.chat.ClientIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.chat.ChatRoomListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllByClientIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exitChatRoom(com.example.grpc.chat.ChatRoomIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.chat.ExitChatRoomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExitChatRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isChatRoomOpened(com.example.grpc.chat.ChatRoomRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.chat.ChatRoomValidationResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsChatRoomOpenedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ChatRoomGrpcService.
   */
  public static final class ChatRoomGrpcServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ChatRoomGrpcServiceBlockingStub> {
    private ChatRoomGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatRoomGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChatRoomGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.chat.ChatRoomResponse createChatRoom(com.example.grpc.chat.ChatRoomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateChatRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.chat.ChatRoomResponse enterChatRoom(com.example.grpc.chat.ChatRoomIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnterChatRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.chat.ChatRoomListResponse findAllByAgentId(com.example.grpc.chat.AgentIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllByAgentIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.chat.ChatRoomListResponse findAllByClientId(com.example.grpc.chat.ClientIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllByClientIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.chat.ExitChatRoomResponse exitChatRoom(com.example.grpc.chat.ChatRoomIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExitChatRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.chat.ChatRoomValidationResult isChatRoomOpened(com.example.grpc.chat.ChatRoomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsChatRoomOpenedMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ChatRoomGrpcService.
   */
  public static final class ChatRoomGrpcServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ChatRoomGrpcServiceFutureStub> {
    private ChatRoomGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatRoomGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChatRoomGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.chat.ChatRoomResponse> createChatRoom(
        com.example.grpc.chat.ChatRoomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateChatRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.chat.ChatRoomResponse> enterChatRoom(
        com.example.grpc.chat.ChatRoomIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnterChatRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.chat.ChatRoomListResponse> findAllByAgentId(
        com.example.grpc.chat.AgentIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllByAgentIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.chat.ChatRoomListResponse> findAllByClientId(
        com.example.grpc.chat.ClientIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllByClientIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.chat.ExitChatRoomResponse> exitChatRoom(
        com.example.grpc.chat.ChatRoomIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExitChatRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.chat.ChatRoomValidationResult> isChatRoomOpened(
        com.example.grpc.chat.ChatRoomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsChatRoomOpenedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CHAT_ROOM = 0;
  private static final int METHODID_ENTER_CHAT_ROOM = 1;
  private static final int METHODID_FIND_ALL_BY_AGENT_ID = 2;
  private static final int METHODID_FIND_ALL_BY_CLIENT_ID = 3;
  private static final int METHODID_EXIT_CHAT_ROOM = 4;
  private static final int METHODID_IS_CHAT_ROOM_OPENED = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CHAT_ROOM:
          serviceImpl.createChatRoom((com.example.grpc.chat.ChatRoomRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.chat.ChatRoomResponse>) responseObserver);
          break;
        case METHODID_ENTER_CHAT_ROOM:
          serviceImpl.enterChatRoom((com.example.grpc.chat.ChatRoomIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.chat.ChatRoomResponse>) responseObserver);
          break;
        case METHODID_FIND_ALL_BY_AGENT_ID:
          serviceImpl.findAllByAgentId((com.example.grpc.chat.AgentIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.chat.ChatRoomListResponse>) responseObserver);
          break;
        case METHODID_FIND_ALL_BY_CLIENT_ID:
          serviceImpl.findAllByClientId((com.example.grpc.chat.ClientIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.chat.ChatRoomListResponse>) responseObserver);
          break;
        case METHODID_EXIT_CHAT_ROOM:
          serviceImpl.exitChatRoom((com.example.grpc.chat.ChatRoomIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.chat.ExitChatRoomResponse>) responseObserver);
          break;
        case METHODID_IS_CHAT_ROOM_OPENED:
          serviceImpl.isChatRoomOpened((com.example.grpc.chat.ChatRoomRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.chat.ChatRoomValidationResult>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateChatRoomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.chat.ChatRoomRequest,
              com.example.grpc.chat.ChatRoomResponse>(
                service, METHODID_CREATE_CHAT_ROOM)))
        .addMethod(
          getEnterChatRoomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.chat.ChatRoomIdRequest,
              com.example.grpc.chat.ChatRoomResponse>(
                service, METHODID_ENTER_CHAT_ROOM)))
        .addMethod(
          getFindAllByAgentIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.chat.AgentIdRequest,
              com.example.grpc.chat.ChatRoomListResponse>(
                service, METHODID_FIND_ALL_BY_AGENT_ID)))
        .addMethod(
          getFindAllByClientIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.chat.ClientIdRequest,
              com.example.grpc.chat.ChatRoomListResponse>(
                service, METHODID_FIND_ALL_BY_CLIENT_ID)))
        .addMethod(
          getExitChatRoomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.chat.ChatRoomIdRequest,
              com.example.grpc.chat.ExitChatRoomResponse>(
                service, METHODID_EXIT_CHAT_ROOM)))
        .addMethod(
          getIsChatRoomOpenedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.chat.ChatRoomRequest,
              com.example.grpc.chat.ChatRoomValidationResult>(
                service, METHODID_IS_CHAT_ROOM_OPENED)))
        .build();
  }

  private static abstract class ChatRoomGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChatRoomGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.chat.ChatRoomProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChatRoomGrpcService");
    }
  }

  private static final class ChatRoomGrpcServiceFileDescriptorSupplier
      extends ChatRoomGrpcServiceBaseDescriptorSupplier {
    ChatRoomGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class ChatRoomGrpcServiceMethodDescriptorSupplier
      extends ChatRoomGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ChatRoomGrpcServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ChatRoomGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChatRoomGrpcServiceFileDescriptorSupplier())
              .addMethod(getCreateChatRoomMethod())
              .addMethod(getEnterChatRoomMethod())
              .addMethod(getFindAllByAgentIdMethod())
              .addMethod(getFindAllByClientIdMethod())
              .addMethod(getExitChatRoomMethod())
              .addMethod(getIsChatRoomOpenedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
