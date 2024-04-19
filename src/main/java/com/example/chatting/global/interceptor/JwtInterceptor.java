// package com.example.chatting.global.interceptor;
//
// import static io.grpc.Metadata.*;
//
// import org.springframework.stereotype.Component;
//
// import net.devh.boot.grpc.client.inject.GrpcClient;
// import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
//
// import com.example.grpc.auth.AuthCheckReq;
// import com.example.grpc.auth.AuthCheckResp;
// import com.example.grpc.auth.AuthServiceGrpc;
// import com.example.grpc.auth.ValidateTokenRequest;
// import com.example.grpc.auth.ValidateTokenServiceGrpc;
// import com.example.grpc.auth.ValidationResult;
//
// import io.grpc.Context;
// import io.grpc.Contexts;
// import io.grpc.Metadata;
// import io.grpc.ServerCall;
// import io.grpc.ServerCallHandler;
// import io.grpc.ServerInterceptor;
// import io.grpc.Status;
// import lombok.extern.slf4j.Slf4j;
//
// @Slf4j
// @GrpcGlobalServerInterceptor
// @Component
// public class JwtInterceptor implements ServerInterceptor {
//
// 	@GrpcClient(value = "test-auth-server")
// 	private ValidateTokenServiceGrpc.ValidateTokenServiceBlockingStub validateTokenServiceBlockingStub;
//
// 	@Override
// 	public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> serverCall, Metadata metadata,
// 		ServerCallHandler<ReqT, RespT> next) {
// 		String bearerToken = metadata.get(Metadata.Key.of("Authorization", ASCII_STRING_MARSHALLER));
//
// 		if (bearerToken != null) {
// 			log.info("Token : {}", bearerToken);
// 			String token = bearerToken.split("Bearer ")[1];
// 			ValidationResult result = validateTokenServiceBlockingStub.validateToken(
// 				ValidateTokenRequest.newBuilder().setToken(token).build());
//
// 			// true false
// 			if (result.getResult()) {
// 				return Contexts.interceptCall(Context.current(), serverCall, metadata, next);
// 			}
// 		}
//
// 		serverCall.close(Status.UNAUTHENTICATED.withDescription("JWT Authorization Failed"), metadata);
// 		return new ServerCall.Listener<>() {
//
// 		};
// 	}
//
// }
//
