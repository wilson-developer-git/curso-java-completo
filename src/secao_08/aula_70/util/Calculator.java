package secao_08.aula_70.util;

public class Calculator {

	public final double PI = 3.14159;

	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

	public double circunference(double radius) {
		return 2.0 * PI * radius;
	}

}
