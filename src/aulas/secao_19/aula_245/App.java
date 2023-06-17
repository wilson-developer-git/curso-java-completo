package aulas.secao_19.aula_245;

import java.util.Set;
import java.util.TreeSet;

import aulas.secao_19.aula_245.entities.Product;

public class App {

	public static void main(String[] args) {

		Set<Product> set = new TreeSet<>();
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		for (Product p : set) {
			System.out.println(p);
		}

	}

}
