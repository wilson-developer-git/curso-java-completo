package aulas.secao_20.aula_256;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
