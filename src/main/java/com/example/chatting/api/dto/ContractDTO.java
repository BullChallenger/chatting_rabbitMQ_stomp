package com.example.chatting.api.dto;

import lombok.Builder;
import lombok.Getter;

public class ContractDTO {

	@Getter
	public static class MakeContractRequestDTO {
		private final String clientId;
		private final String agentId;

		public MakeContractRequestDTO(String clientId, String agentId) {
			this.clientId = clientId;
			this.agentId = agentId;
		}
	}

	@Getter
	public static class MakeContractResponseDTO {
		private final String contractId;

		public MakeContractResponseDTO(String contractId) {
			this.contractId = contractId;
		}
	}

}
