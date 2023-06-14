package aulas.secao_18.aula_230_231.services;

public interface OnlinePaymentService {

	double paymentFee(double amount);
	double interest(double amount, int months);
	
}
