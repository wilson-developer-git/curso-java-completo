import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe um numero: ");
		int num = sc.nextInt();
		
		System.out.printf("%n");
		
		System.out.println("Multiplos de: "+ num);
		
		for(int i = 1; i <= num; i++) {
			System.out.println( num +" x "+ i +" = " + num*i );
		}
	}
}
