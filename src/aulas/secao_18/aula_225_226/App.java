package aulas.secao_18.aula_225_226;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import aulas.secao_18.aula_225_226.model.entities.CarRental;
import aulas.secao_18.aula_225_226.model.entities.Vehicle;
import aulas.secao_18.aula_225_226.model.services.BrazilTaxService;
import aulas.secao_18.aula_225_226.model.services.RentalService;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
		LocalDateTime retirada = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
		LocalDateTime retorno = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental carRental = new CarRental(retirada, retorno, new Vehicle(carModel));
		
		System.out.print("Entre com o preço por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(carRental);
		
		System.out.println("FATURA");
		System.out.println("Pagamento basico: "+ carRental.getInvoice().getBasicPayment());
		System.out.println("Imposto: "+ carRental.getInvoice().getTax());
		System.out.println("Pagamento total: "+ carRental.getInvoice().getTotalPayment());
		
		sc.close();
		
	}

}
