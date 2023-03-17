package secao_08.aula_70;

import java.util.Locale;
import java.util.Scanner;

import secao_08.aula_70.util.Calculator;

public class App70 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();

		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();

		double c = calc.circunference(radius);
		double v = calc.volume(radius);

		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);

		sc.close();
	}

}
