package aulas.secao_18.aula_233;

import aulas.secao_18.aula_233.entities.ComboDevice;
import aulas.secao_18.aula_233.entities.ConcretePrinter;
import aulas.secao_18.aula_233.entities.ConcreteScanner;

public class App {

	public static void main(String[] args) {

		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My Letter");
		p.print("My Letter");
		
		System.out.println();
		ConcreteScanner sc = new ConcreteScanner("2003");
		sc.processDoc("My E-mail");
		System.out.println("Scan result: "+ sc.scan());
		
		System.out.println();
		ComboDevice cd = new ComboDevice("2081");
		cd.processDoc("My Dissertation");
		cd.print("My Dissertation");
		System.out.println("Combo scan result: "+ cd.scan());
		
	}

}