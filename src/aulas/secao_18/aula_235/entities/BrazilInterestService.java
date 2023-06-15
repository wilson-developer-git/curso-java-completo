package aulas.secao_18.aula_235.entities;

public class BrazilInterestService implements InterestService{

	private Double interestRate;

	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
}
