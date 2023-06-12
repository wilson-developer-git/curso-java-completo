package aulas.secao_17.aula_214;

import java.io.File;
import java.io.IOException;
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
		}catch(IOException ex) {
			System.out.println("error: "+ ex.getMessage());
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
		
	}

}
