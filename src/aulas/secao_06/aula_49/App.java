package aulas.secao_06.aula_49;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = 0;
		int soma = 0;
		
		N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		sc.close();
	}
}
