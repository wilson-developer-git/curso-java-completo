package aulas.secao_20.aula_258;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.5));
		list.add(new Product("HD Case", 80.9));
		
		ProductService ps = new ProductService();
		//double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		double sum = ps.filteredSum(list, p -> p.getPrice() < 100.0);
		
		System.out.printf("Sum = %.2f%n", sum);
		
	}

}