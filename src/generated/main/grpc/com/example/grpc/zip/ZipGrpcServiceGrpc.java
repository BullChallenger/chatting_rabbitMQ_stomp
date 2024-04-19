package com.example.grpc.zip;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: zip.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ZipGrpcServiceGrpc {

  private ZipGrpcServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "zip.ZipGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.zip.GetZipsByAgentIdRequest,
      com.example.grpc.zip.GetZipsByAgentIdResponse> getGetZipsByAgentIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZipsByAgentId",
      requestType = com.example.grpc.zip.GetZipsByAgentIdRequest.class,
      responseType = com.example.grpc.zip.GetZipsByAgentIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.zip.GetZipsByAgentIdRequest,
      com.example.grpc.zip.GetZipsByAgentIdResponse> getGetZipsByAgentIdMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.zip.GetZipsByAgentIdRequest, com.example.grpc.zip.GetZipsByAgentIdResponse> getGetZipsByAgentIdMethod;
    if ((getGetZipsByAgentIdMethod = ZipGrpcServiceGrpc.getGetZipsByAgentIdMethod) == null) {
      synchronized (ZipGrpcServiceGrpc.class) {
        if ((getGetZipsByAgentIdMethod = ZipGrpcServiceGrpc.getGetZipsByAgentIdMethod) == null) {
          ZipGrpcServiceGrpc.getGetZipsByAgentIdMethod = getGetZipsByAgentIdMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.zip.GetZipsByAgentIdRequest, com.example.grpc.zip.GetZipsByAgentIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetZipsByAgentId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.zip.GetZipsByAgentIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.zip.GetZipsByAgentIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZipGrpcServiceMethodDescriptorSupplier("GetZipsByAgentId"))
              .build();
        }
      }
    }
    return getGetZipsByAgentIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.zip.GetZipDetailRequest,
      com.example.grpc.zip.GetZipDetailResponse> getGetZipDetailByMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZipDetailBy",
      requestType = com.example.grpc.zip.GetZipDetailRequest.class,
      responseType = com.example.grpc.zip.GetZipDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.zip.GetZipDetailRequest,
      com.example.grpc.zip.GetZipDetailResponse> getGetZipDetailByMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.zip.GetZipDetailRequest, com.example.grpc.zip.GetZipDetailResponse> getGetZipDetailByMethod;
    if ((getGetZipDetailByMethod = ZipGrpcServiceGrpc.getGetZipDetailByMethod) == null) {
      synchronized (ZipGrpcServiceGrpc.class) {
        if ((getGetZipDetailByMethod = ZipGrpcServiceGrpc.getGetZipDetailByMethod) == null) {
          ZipGrpcServiceGrpc.getGetZipDetailByMethod = getGetZipDetailByMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.zip.GetZipDetailRequest, com.example.grpc.zip.GetZipDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetZipDetailBy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.zip.GetZipDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.zip.GetZipDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZipGrpcServiceMethodDescriptorSupplier("GetZipDetailBy"))
              .build();
        }
      }
    }
    return getGetZipDetailByMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ZipGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ZipGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ZipGrpcServiceStub>() {
        @java.lang.Override
        public ZipGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ZipGrpcServiceStub(channel, callOptions);
        }
      };
    return ZipGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ZipGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ZipGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ZipGrpcServiceBlockingStub>() {
        @java.lang.Override
        public ZipGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ZipGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return ZipGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ZipGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ZipGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ZipGrpcServiceFutureStub>() {
        @java.lang.Override
        public ZipGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ZipGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return ZipGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getZipsByAgentId(com.example.grpc.zip.GetZipsByAgentIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.zip.GetZipsByAgentIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetZipsByAgentIdMethod(), responseObserver);
    }

    /**
     */
    default void getZipDetailBy(com.example.grpc.zip.GetZipDetailRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.zip.GetZipDetailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetZipDetailByMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ZipGrpcService.
   */
  public static abstract class ZipGrpcServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ZipGrpcServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ZipGrpcService.
   */
  public static final class ZipGrpcServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ZipGrpcServiceStub> {
    private ZipGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZipGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ZipGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void getZipsByAgentId(com.example.grpc.zip.GetZipsByAgentIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.zip.GetZipsByAgentIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetZipsByAgentIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getZipDetailBy(com.example.grpc.zip.GetZipDetailRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.zip.GetZipDetailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetZipDetailByMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ZipGrpcService.
   */
  public static final class ZipGrpcServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ZipGrpcServiceBlockingStub> {
    private ZipGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZipGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ZipGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.zip.GetZipsByAgentIdResponse getZipsByAgentId(com.example.grpc.zip.GetZipsByAgentIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetZipsByAgentIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.zip.GetZipDetailResponse getZipDetailBy(com.example.grpc.zip.GetZipDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetZipDetailByMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ZipGrpcService.
   */
  public static final class ZipGrpcServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ZipGrpcServiceFutureStub> {
    private ZipGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZipGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ZipGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.zip.GetZipsByAgentIdResponse> getZipsByAgentId(
        com.example.grpc.zip.GetZipsByAgentIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetZipsByAgentIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.zip.GetZipDetailResponse> getZipDetailBy(
        com.example.grpc.zip.GetZipDetailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetZipDetailByMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ZIPS_BY_AGENT_ID = 0;
  private static final int METHODID_GET_ZIP_DETAIL_BY = 1;

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
        case METHODID_GET_ZIPS_BY_AGENT_ID:
          serviceImpl.getZipsByAgentId((com.example.grpc.zip.GetZipsByAgentIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.zip.GetZipsByAgentIdResponse>) responseObserver);
          break;
        case METHODID_GET_ZIP_DETAIL_BY:
          serviceImpl.getZipDetailBy((com.example.grpc.zip.GetZipDetailRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.zip.GetZipDetailResponse>) responseObserver);
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
          getGetZipsByAgentIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.zip.GetZipsByAgentIdRequest,
              com.example.grpc.zip.GetZipsByAgentIdResponse>(
                service, METHODID_GET_ZIPS_BY_AGENT_ID)))
        .addMethod(
          getGetZipDetailByMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.zip.GetZipDetailRequest,
              com.example.grpc.zip.GetZipDetailResponse>(
                service, METHODID_GET_ZIP_DETAIL_BY)))
        .build();
  }

  private static abstract class ZipGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ZipGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.zip.ZipProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ZipGrpcService");
    }
  }

  private static final class ZipGrpcServiceFileDescriptorSupplier
      extends ZipGrpcServiceBaseDescriptorSupplier {
    ZipGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class ZipGrpcServiceMethodDescriptorSupplier
      extends ZipGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ZipGrpcServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ZipGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ZipGrpcServiceFileDescriptorSupplier())
              .addMethod(getGetZipsByAgentIdMethod())
              .addMethod(getGetZipDetailByMethod())
              .build();
        }
      }
    }
    return result;
  }
}
