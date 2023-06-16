package aulas.secao_19.aula_241;

import java.util.ArrayList;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		List<? extends Number> list = intList;
		Number x = list.get(0);
		//list.add(20); // erro de compilacao no add
		System.out.println(x);
		
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);
		//Number x = myNums.get(0); // erro de compilacao no get
		
	}

}
