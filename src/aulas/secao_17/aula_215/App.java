package aulas.secao_17.aula_215;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		String path = "C:\\Users\\Wilson\\Desktop\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("error: " + e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
