package aulas.secao_07.aula_58;

public class App {

	public static void main(String[] args) {

		String original = "   abcde FGHIJ ABC abc DEFG  ";
		
		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		String s3 = original.trim();
		String s4 = original.substring(5);
		String s5 = original.substring(5, 13);
		String s6 = original.replace('a', '?');
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		
		System.out.println("Original: -"+ original +"-");
		System.out.println("toLowerCase: -"+ s1 +"-");
		System.out.println("toUpperCase: -"+ s2 +"-");
		System.out.println("trim: -"+ s3 +"-");
		System.out.println("substring[5]: -"+ s4 +"-");
		System.out.println("substring[5,13]: -"+ s5 +"-");
		System.out.println("substring[a,?]: -"+ s6 +"-");
		
		System.out.println("Index of 'bc': "+ i);
		System.out.println("Last index of 'bc': "+ j);
		
		
		String s = "potato apple lemon orange";
		String[] vect = s.split(" ");
		
		System.out.println(s);
		System.out.println(vect.length);
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		
		
		
		
		
	}

}
