package aulas.secao_05.aula_34;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas horas: ");
		int hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("Bom dia!");
		}else if(hora < 18) {
			System.out.println("Boa tarde!");
		}else {
			System.out.println("Boa noite!");
		}
		
		
		sc.close();
	}

}
