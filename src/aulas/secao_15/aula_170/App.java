package aulas.secao_15.aula_170;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
		
			String[] vect = sc.nextLine().split(" ");
			int p = sc.nextInt();
			System.out.println(vect[p]);
		
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Invalid Position!");
		}
		catch(InputMismatchException ex) {
			System.out.println("Input error!");
		}
		
		System.out.println("end of program");
		
		sc.close();
		
	}

}
