package aulas.secao_04.aula_25;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nome = sc.next();
		
		//sc.nextLine();
		//sc.nextInt();
		//sc.nextDouble();
		//sc.nextLong();
		
		System.out.println("Você digitou: " + nome);
		
		sc.close();
		
	}

}
