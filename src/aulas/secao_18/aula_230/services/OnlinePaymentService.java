package aulas.secao_18.aula_230.services;

public interface OnlinePaymentService {

	double paymentFee(double amount);
	double interest(double amount, int months);
	
}
