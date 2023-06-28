package aulas.secao_20.aula_259;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 7, 10);
		//Stream<Integer> st1 = list.stream();
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.asList(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.asList(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.asList(st3.limit(10).toArray()));
		
	}

}