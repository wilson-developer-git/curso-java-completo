package secao_08.aula_64.entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public double addProducts(int quantity) {
		return this.quantity += quantity;
	}

	public double removeProducts(int quantity) {
		return this.quantity -= quantity;
	}

	@Override
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
