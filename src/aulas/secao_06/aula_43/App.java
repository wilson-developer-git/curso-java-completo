package aulas.secao_06.aula_43;

import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a largura: ");
		double largura = sc.nextDouble();
		
		System.out.print("Insira o comprimento: ");
		double comprimento = sc.nextDouble();
		
		System.out.print("Insira valor do metro quadrado: ");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PREÇO = %.2f%n", preco);
		sc.close();
		
	}
}
