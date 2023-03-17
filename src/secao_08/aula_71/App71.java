package secao_08.aula_71;

import java.util.Locale;
import java.util.Scanner;

import secao_08.aula_71.util.Calculator2;

public class App71 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();

		double c = Calculator2.circunference(radius);
		double v = Calculator2.volume(radius);

		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator2.PI);

		sc.close();
	}

}
