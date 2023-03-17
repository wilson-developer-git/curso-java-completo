package secao_10.aula_91;

import java.util.Locale;
import java.util.Scanner;

public class Aula_91 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			System.out.println("DIGITE O TAMANHO DO ARRAY: ");
			int n = sc.nextInt();
			
			System.out.println("DIGITE OS VALORES: ");
			double[] vector = new double[n];
			
			for(int i = 0; i < n; i++) {
				vector[i] = sc.nextDouble();
			}
		
			double sum = 0.0;
			for(int i=0; i < n; i++) {
				sum += vector[i];
			}
			
			double avg = sum / n;
			System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
			
			
			
		sc.close();
	}

}
