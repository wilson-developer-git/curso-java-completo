package aulas.secao_03.aula_23;

import java.util.Locale;

public class App {

	public static void main(String[] args) {

		
		// (%.2f) ponto flutuante
		//   (%d) digito inteiro
		//   (%s) String
		//   (%n) Quebra de linha
		
		Locale.setDefault(Locale.US);
		
		System.out.print("Olá Mundo! ");
		System.out.println("Bom dia! ");
		
		int y = 32;
		System.out.println(y);
		
		double x = 10.35789;
		System.out.printf("X = %.2f%n ", x);
		
		double metro = 10.5;
		System.out.println("Tamanho = "+ metro +" Metros");
		
		String nome = "Maria";
		int idade = 31;
		double renda = 1500.0;
		System.out.printf("%s tem %d anos e ganha %.2f reais.%n", nome, idade, renda);
		
		
		
	}

}
