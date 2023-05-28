
package aulas.secao_04.aula_27;

public class App {

	public static void main(String[] args) {

		//FORMULA DE BASCARA
		double delta, a = 2, b = 5, c = 2, x1, x2;
		
		delta = Math.pow(b, 2) - 4*a*c; 
		System.out.println("DELTA: "+ delta);
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("X1 = "+ x1);
		System.out.println("X2 = "+ x2);
		
	}
}
