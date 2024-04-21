package com.example.chatting.global.config;

import com.example.chatting.global.interceptor.CircuitBreakerClientInterceptor;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.grpc.ClientInterceptor;
import net.devh.boot.grpc.client.interceptor.GrpcGlobalClientInterceptor;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class InterceptorConfig {

    protected final CircuitBreakerRegistry circuitBreakerRegistry;

    public InterceptorConfig(CircuitBreakerRegistry circuitBreakerRegistry) {
        this.circuitBreakerRegistry = circuitBreakerRegistry;
    }

    @GrpcGlobalClientInterceptor
    ClientInterceptor circuitBreakerClientInterceptor() {
        return new CircuitBreakerClientInterceptor(circuitBreakerRegistry.circuitBreaker("GET_NICKNAME_FROM_ACCOUNT_SERVER"));
    }

}

