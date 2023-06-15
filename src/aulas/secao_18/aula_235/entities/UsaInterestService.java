package aulas.secao_18.aula_235.entities;

import java.security.InvalidParameterException;

public class UsaInterestService implements InterestService{

	private Double interestRate;

	public UsaInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
}
