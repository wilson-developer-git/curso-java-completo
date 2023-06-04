package aulas.secao_08.aula_65;

import java.util.Locale;
import java.util.Scanner;

import aulas.secao_08.aula_65.entities.Triangle;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		System.out.println("Enter the measures of tringle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of tringle Y: "); 
		y.a = sc.nextDouble(); 
		y.b = sc.nextDouble(); 
		y.c = sc.nextDouble();
		
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		double areaX = t1.area(); 
		double areaY = t2.area();
		
		System.out.printf("Triangle X area %.4f%n", areaX);
		System.out.printf("Triangle y area %.4f%n", areaY);
	
		if(areaX > areaY) 
		{ 
			System.out.println("Larger area: X"); 
		}
		else 
		{
			System.out.println("Larger area: Y"); 
		}
		
		sc.close();

		
	}

}
