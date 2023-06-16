package aulas.secao_19.aula_240;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {

		/*
		 * List<Object> myObjs = new ArrayList<Object>(); 
		 * List<Integer> myNumbers = new ArrayList<Integer>(); 
		 * myObjs = myNumbers; // erro de compilação
		 */

		/*
		 * List<?> myObjs = new ArrayList<Object>(); 
		 * List<Integer> myNumbers = newArrayList<Integer>(); 
		 * myObjs = myNumbers;
		 */

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);

	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
