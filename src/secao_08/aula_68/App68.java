package secao_08.aula_68;

import java.util.Locale;
import java.util.Scanner;

import secao_08.aula_64.entities.Product;

public class App68 {

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

		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Product updated: " + product);

		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Product updated: " + product);

		sc.close();
	}

}
