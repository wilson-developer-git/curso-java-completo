package secao_10.aula_89;

import java.util.Locale;
import java.util.Scanner;

public class Aula_89 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			int n = sc.nextInt();
			
			int[] vect = new int[n];
			
			for(int i = 0; i < vect.length; i++) {
				vect[i] = sc.nextInt();
			}
		
			System.out.println("NUMEROS NEGATIVOS: ");
			
			for(int i=0; i < vect.length; i++) {
				if(vect[i] < 0) {
					System.out.println(vect[i]);
				}
			}
			
		sc.close();
	}

}
