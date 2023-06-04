package aulas.secao_07.aula_60;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		showResult(higher);
				
		sc.close();
	}

	private static int max(int a, int b, int c) {
		int aux;
		if(a > b && a > c) {
			aux = a;
		}
		else if(b > c) {
			aux = b;
		}
		else {
			aux = c;
		}
		return aux;
	}
	
	private static void showResult(int higher) {
		System.out.println("Higher: "+ higher);
	}

}
