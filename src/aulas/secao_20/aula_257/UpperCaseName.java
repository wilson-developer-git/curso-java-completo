package aulas.secao_20.aula_257;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
