package aulas.secao_08.aula_63;

import java.util.Locale;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC;
		System.out.println("Enter the measures of tringle X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		System.out.printf("Triangle X area %.4f%n", areaX);
	
		sc.close();
	}
}

/* , yA, yB, yC */

/*
 * System.out.println("Enter the measures of tringle Y: "); yA =
 * sc.nextDouble(); yB = sc.nextDouble(); yC = sc.nextDouble();
 */

/*
 * p = (yA + yB + yC) / 2.0; double areaY = Math.sqrt(p * (p - yA) * (p - yB) *
 * (p - yC));
 */

/*
 * System.out.printf("Triangle y area %.4f%n", areaY);
 * 
 * if(areaX > areaY) { System.out.println("Larger area: X"); } else {
 * System.out.println("Larger area: Y"); }
 */



