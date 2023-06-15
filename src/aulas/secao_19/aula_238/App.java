package aulas.secao_19.aula_238;

import java.util.Scanner;

import aulas.secao_19.aula_238.services.PrintService;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = ps.first();
		System.out.println("First: " + x);
		
		sc.close();
		
	}
	
}
