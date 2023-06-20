package aulas.secao_20.aula_252;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Product> produtos = new ArrayList<>();
		produtos.add(new Product("TV", 900.0));
		produtos.add(new Product("Notebook", 1200.0));
		produtos.add(new Product("Tablet", 450.0));
	
		//produtos.sort(new MyComparator());
	
		/*
		 * Comparator<Product> comparator = new Comparator<Product>() {
		 * 
		 * @Override public int compare(Product p1, Product p2) { return
		 * p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); } };
		 */
		
		/*
		 * Comparator<Product> comparator = (p1 , p2) -> { return
		 * p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); };
		 */
		
		/*
		 * Comparator<Product> comparator = (p1 , p2) -> p1.getName().toUpperCase()
		 * .compareTo(p2.getName().toUpperCase());
		 */
		
		produtos.sort((p1 , p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (Product product : produtos) {
			System.out.println(product);
		}
		
	}

}
