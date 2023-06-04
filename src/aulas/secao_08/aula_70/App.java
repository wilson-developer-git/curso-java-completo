package aulas.secao_08.aula_70;

import java.util.Locale;
import java.util.Scanner;

import aulas.secao_08.aula_70.util.Calculator;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius); 
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f", calc.PI);
		
		sc.close();
				
	}

}
