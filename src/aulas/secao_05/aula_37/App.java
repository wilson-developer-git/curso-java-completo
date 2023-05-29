package aulas.secao_05.aula_37;

import java.util.Locale;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qtd minutos utilizada: ");
		int minutos = sc.nextInt();
		
		double conta = 50.00;
		if(minutos > 100) {
			conta += (minutos - 100) * 2;
		}
		
		System.out.println("==================================");
		System.out.printf("O valor da conta foi R$ %.2f%n", conta);
		sc.close();
		
	}
}
