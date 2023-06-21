package aulas.secao_20.aula_257;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		/*
		 * List<String> list2 = list.stream().map( new
		 * UpperCaseName()).collect(Collectors.toList());
		 */

		/*
		 * List<String> list2 = list.stream().map(
		 * Product::staticUpperCaseName).collect(Collectors.toList());
		 */

		/*
		 * Function<Product, String> func = p -> p.getName().toUpperCase(); List<String>
		 * list2 = list.stream().map(func).collect(Collectors.toList());
		 */

		List<String> list2 = list.stream()
				.map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

		list2.forEach(System.out::println);

	}

}
