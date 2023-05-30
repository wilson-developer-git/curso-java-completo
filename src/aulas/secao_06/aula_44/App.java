package aulas.secao_06.aula_44;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		int soma = 0;
		
		x = sc.nextInt();
		while(x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		sc.close();
		
	}
}
