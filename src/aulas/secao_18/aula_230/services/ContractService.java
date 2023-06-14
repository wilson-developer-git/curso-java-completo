package aulas.secao_18.aula_230.services;

import aulas.secao_18.aula_230.entities.Contract;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		
	}
	
}
