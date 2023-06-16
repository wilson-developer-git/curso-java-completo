package aulas.secao_19.aula_242;

import aulas.secao_19.aula_242.entities.Client;

public class App {

	public static void main(String[] args) {

		/*
		 * String a = "Maria"; String b = "Alex"; System.out.println(a.equals(b));
		 * System.out.println(a.hashCode()); System.out.println(b.hashCode());
		 */
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
	}

}
