package com.example.chatting.global.interceptor;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.utils.CircuitBreakerUtil;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ClientInterceptors.CheckedForwardingClientCall;
import io.grpc.ForwardingClientCallListener.SimpleForwardingClientCallListener;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.Status.Code;
import io.grpc.StatusRuntimeException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CircuitBreakerClientInterceptor implements ClientInterceptor {

    private final CircuitBreaker circuitBreaker;

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method,
                                                               CallOptions callOptions, Channel next) {
        return new CheckedForwardingClientCall(next.newCall(method, callOptions)) {

            @Override
            protected void checkedStart(ClientCall.Listener responseListener, io.grpc.Metadata headers) {
                if (CircuitBreakerUtil.isCallPermitted(circuitBreaker)) {
                    this.delegate().start(new CircuitBreakerClientInterceptor.Listener(responseListener, System.nanoTime()), headers);
                }
            }
        };
    }

    private final class Listener extends SimpleForwardingClientCallListener {
        private final long startedAt;
        private final Set<Code> serverErrorStatusSet = Set.of(
                Status.Code.DATA_LOSS,
                Status.Code.UNKNOWN,
                Status.Code.INTERNAL,
                Status.Code.UNIMPLEMENTED,
                Status.Code.UNAVAILABLE,
                Status.Code.DEADLINE_EXCEEDED
        );

        public Listener(io.grpc.ClientCall.Listener delegate, long startedAt) {
            super(delegate);
            this.startedAt = startedAt;
        }

        @Override
        public void onClose(Status status, io.grpc.Metadata trailers) {
            long elapsed = System.nanoTime() - startedAt;

            if (!serverErrorStatusSet.contains(status.getCode())) {
                CircuitBreakerClientInterceptor.this.circuitBreaker.onSuccess(elapsed, TimeUnit.NANOSECONDS);
            } else {
                CircuitBreakerClientInterceptor.this.circuitBreaker.onError(elapsed, TimeUnit.NANOSECONDS,
                        new StatusRuntimeException(status, trailers));
            }

            super.onClose(status, trailers);
        }
    }

}
