package aulas.secao_05.aula_38;

import java.util.Scanner;

public class Aula {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um dia da semana de 1 a 7: ");
		int valor = sc.nextInt();
		
		String dia;
		switch (valor) {
		case 1:
			dia = "Domingo"; break;
		case 2:
			dia = "Segunda";break;
		case 3:
			dia = "Terça";break;
		case 4:
			dia = "Quarta";break;
		case 5:
			dia = "Quinta";break;
		case 6:
			dia = "Sexta";break;
		case 7:
			dia = "Sabado";break;
		default:
			dia = "Valor inválido";break;
		}
		System.out.println(dia);
		sc.close();
	}
}
