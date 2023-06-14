package aulas.secao_18.aula_233.entities;

public class ConcreteScanner extends Device implements Scanner{

	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("ConcreteScanner processing: "+ doc);
	}
	
	@Override
	public String scan() {
		return "Scanned content";
	}

}