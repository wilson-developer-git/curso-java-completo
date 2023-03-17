package secao_08.aula_67;

import java.util.Locale;
import java.util.Scanner;

import secao_08.aula_64.entities.Product;

public class App67 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();
		System.out.println("Enter Product data: ");

		System.out.println("Name: ");
		product.name = sc.nextLine();

		System.out.println("Price: ");
		product.price = sc.nextDouble();

		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();

		System.out.println(product);

		sc.close();
	}

}
