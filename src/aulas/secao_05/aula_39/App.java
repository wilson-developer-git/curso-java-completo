package aulas.secao_05.aula_39;

public class App {

	public static void main(String[] args) {
		
		
		double preco = 34.50;
		double desconto;
		
		desconto = (preco < 20.00 ? preco * 0.01 : preco * 0.05);
		
		System.out.println(desconto);
		
	}

}
