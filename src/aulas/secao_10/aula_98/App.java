package aulas.secao_10.aula_98;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println("Size: "+ list.size());
		System.out.println("================= Listar com for each");
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("================= Listar com filtro");
		
		List<String> result = list.stream()
								  .filter(x -> x.charAt(0) == 'A')
						   	      .collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("================= Buscar um elemento com filtro");
		
		String name = list.stream()
								  .filter(x -> x.charAt(0) == 'B')
						   	      .findFirst().orElse(null);
		System.out.println(name);
		System.out.println("================= Retornar indice");
		
		int index = list.indexOf("Bob");
		System.out.println("Index of Bob: "+ index);
		System.out.println("================= Remover por indice");
		
		list.remove(1);
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("================= Remover por objeto");
		
		list.remove("Anna");
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("================= Remover com predicado");
		
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		
	}
}
