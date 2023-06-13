package aulas.secao_18.aula_225;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import aulas.secao_18.aula_225.model.entities.CarRental;
import aulas.secao_18.aula_225.model.entities.Vehicle;

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
		
		sc.close();
		
	}

}
