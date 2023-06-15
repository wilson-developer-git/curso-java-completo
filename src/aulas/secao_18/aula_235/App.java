package aulas.secao_18.aula_235;

import java.util.Locale;
import java.util.Scanner;

import aulas.secao_18.aula_235.entities.InterestService;
import aulas.secao_18.aula_235.entities.UsaInterestService;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		Double amount = sc.nextDouble();
		System.out.print("Months: ");
		Integer months = sc.nextInt();
		
		InterestService bs = new UsaInterestService(1.0);
		Double payment = bs.payment(amount, months);
		
		System.out.println("Payment after "+ months +" months");
		System.out.println(String.format("%.2f", payment));
		
		sc.close();

	}

}
