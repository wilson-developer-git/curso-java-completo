package aulas.secao_10.aula_89;

import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] prodVect = new Product[n];
		
		for(int i = 0; i < prodVect.length; i ++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			prodVect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for(int x = 0; x < prodVect.length; x++) {
			sum += prodVect[x].getPrice();
		}
		
		double avg = sum / prodVect.length;
		System.out.printf("AVERAGE PRICE: %.2f%n", avg);
		
		sc.close();
		
	}
}

/** CLASS ANINHADA */
class Product{
	
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}