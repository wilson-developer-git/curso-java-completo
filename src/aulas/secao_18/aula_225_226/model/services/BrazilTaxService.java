package aulas.secao_18.aula_225_226.model.services;

public class BrazilTaxService {

	public double tax(double amount) {
		if(amount <= 100) {
			return amount * 0.20;
		}
		else {
			return amount * 0.15;
		}
	}
	
}
