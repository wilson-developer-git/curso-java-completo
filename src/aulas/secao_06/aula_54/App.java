package aulas.secao_06.aula_54;

import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Conversao de temperatura C para F");
		
		char resp;
		do {
			System.out.print("Digite a temperatura em Celcius: ");
			double C = sc.nextDouble();
			double F = 9 * C / 5.0 + 32.0;
			
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n) ?");
			resp = sc.next().charAt(0);
		}while(resp != 'n');
		
		sc.close();
	}
}
