package com.example.chatting.api.service;

import java.util.List;
import java.util.function.Function;

import org.springframework.stereotype.Service;

import net.devh.boot.grpc.client.inject.GrpcClient;

import com.example.chatting.domain.chatRoom.ChatRoom;
import com.example.grpc.account.AccountServiceGrpc;
import com.example.grpc.account.GetAccountReq;
import com.example.grpc.chat.ChatRoomGrpcServiceGrpc;
import com.example.grpc.chat.ChatRoomInfoResponse;

@Service
public class ChatRoomGrpcService extends ChatRoomGrpcServiceGrpc.ChatRoomGrpcServiceImplBase {

	@GrpcClient(value = "account-server")
	private AccountServiceGrpc.AccountServiceBlockingStub accountServiceBlockingStub;

	public String getNicknameFromAccountServer(String accountId) {
		return accountServiceBlockingStub.getAccount(
			GetAccountReq.newBuilder().setAccountId(accountId).build()
		).getAccount().getNickname();
	}

}
