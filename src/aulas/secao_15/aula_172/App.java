package aulas.secao_15.aula_172;

import java.io.File;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\Wilson\\Desktop\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(java.io.FileNotFoundException ex) {
			System.out.println("Error opening file: "+ ex.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
			System.out.println("Finnaly block executed!");
		}
		
	}

}
