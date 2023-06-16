package aulas.secao_19.aula_243;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {

		//Mais rapido, mais não garante a ordem dos elementos
		Set<String> set1 = new HashSet<>();
		
		//Mais lento, mais garante a ordem dos elementos
		Set<String> set2 = new TreeSet<>();
		
		//Mantem a ordem em que os elementos foram inseridos
		Set<String> set3 = new LinkedHashSet<String>();
		
		set3.add("TV");
		set3.add("Notebook");
		set3.add("Tablet");
		
		
		//set3.remove("TV");
		//set3.removeIf(x -> x.charAt(0) == 'T');
		//set3.removeIf(x -> x.length() > 3);
		//set3.removeIf(x -> x.equals("TV"));
		
		
		System.out.println(set3.contains("Notebook"));
		
		for (String p : set3) {
			System.out.println(p);
		}

	}

}
