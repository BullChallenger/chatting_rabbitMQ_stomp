package com.example.grpc.auth;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: token.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ValidateTokenServiceGrpc {

  private ValidateTokenServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "token.ValidateTokenService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.auth.ValidateTokenRequest,
      com.example.grpc.auth.ValidationResult> getValidateTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateToken",
      requestType = com.example.grpc.auth.ValidateTokenRequest.class,
      responseType = com.example.grpc.auth.ValidationResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.auth.ValidateTokenRequest,
      com.example.grpc.auth.ValidationResult> getValidateTokenMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.auth.ValidateTokenRequest, com.example.grpc.auth.ValidationResult> getValidateTokenMethod;
    if ((getValidateTokenMethod = ValidateTokenServiceGrpc.getValidateTokenMethod) == null) {
      synchronized (ValidateTokenServiceGrpc.class) {
        if ((getValidateTokenMethod = ValidateTokenServiceGrpc.getValidateTokenMethod) == null) {
          ValidateTokenServiceGrpc.getValidateTokenMethod = getValidateTokenMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.auth.ValidateTokenRequest, com.example.grpc.auth.ValidationResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.auth.ValidateTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.auth.ValidationResult.getDefaultInstance()))
              .setSchemaDescriptor(new ValidateTokenServiceMethodDescriptorSupplier("ValidateToken"))
              .build();
        }
      }
    }
    return getValidateTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ValidateTokenServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValidateTokenServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValidateTokenServiceStub>() {
        @java.lang.Override
        public ValidateTokenServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValidateTokenServiceStub(channel, callOptions);
        }
      };
    return ValidateTokenServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ValidateTokenServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValidateTokenServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValidateTokenServiceBlockingStub>() {
        @java.lang.Override
        public ValidateTokenServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValidateTokenServiceBlockingStub(channel, callOptions);
        }
      };
    return ValidateTokenServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ValidateTokenServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValidateTokenServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValidateTokenServiceFutureStub>() {
        @java.lang.Override
        public ValidateTokenServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValidateTokenServiceFutureStub(channel, callOptions);
        }
      };
    return ValidateTokenServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void validateToken(com.example.grpc.auth.ValidateTokenRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.auth.ValidationResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateTokenMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ValidateTokenService.
   */
  public static abstract class ValidateTokenServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ValidateTokenServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ValidateTokenService.
   */
  public static final class ValidateTokenServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ValidateTokenServiceStub> {
    private ValidateTokenServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValidateTokenServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValidateTokenServiceStub(channel, callOptions);
    }

    /**
     */
    public void validateToken(com.example.grpc.auth.ValidateTokenRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.auth.ValidationResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ValidateTokenService.
   */
  public static final class ValidateTokenServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ValidateTokenServiceBlockingStub> {
    private ValidateTokenServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValidateTokenServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValidateTokenServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.auth.ValidationResult validateToken(com.example.grpc.auth.ValidateTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ValidateTokenService.
   */
  public static final class ValidateTokenServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ValidateTokenServiceFutureStub> {
    private ValidateTokenServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValidateTokenServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValidateTokenServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.auth.ValidationResult> validateToken(
        com.example.grpc.auth.ValidateTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VALIDATE_TOKEN = 0;

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
        case METHODID_VALIDATE_TOKEN:
          serviceImpl.validateToken((com.example.grpc.auth.ValidateTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.auth.ValidationResult>) responseObserver);
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
          getValidateTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.auth.ValidateTokenRequest,
              com.example.grpc.auth.ValidationResult>(
                service, METHODID_VALIDATE_TOKEN)))
        .build();
  }

  private static abstract class ValidateTokenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ValidateTokenServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.auth.TokenProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ValidateTokenService");
    }
  }

  private static final class ValidateTokenServiceFileDescriptorSupplier
      extends ValidateTokenServiceBaseDescriptorSupplier {
    ValidateTokenServiceFileDescriptorSupplier() {}
  }

  private static final class ValidateTokenServiceMethodDescriptorSupplier
      extends ValidateTokenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ValidateTokenServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ValidateTokenServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ValidateTokenServiceFileDescriptorSupplier())
              .addMethod(getValidateTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
