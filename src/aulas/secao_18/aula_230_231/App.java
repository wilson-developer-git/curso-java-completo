package aulas.secao_18.aula_230_231;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import aulas.secao_18.aula_230_231.entities.Contract;
import aulas.secao_18.aula_230_231.entities.Installment;
import aulas.secao_18.aula_230_231.services.ContractService;
import aulas.secao_18.aula_230_231.services.PaypalService;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
				
		System.out.println("Entre com o numero de parcelas");
		int parcelas = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, parcelas);
		
		System.out.println("PARCELAS");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		
		sc.close();
				
	}

}
