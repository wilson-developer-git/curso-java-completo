package aulas.secao_17.aula_217;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		String path = "C:\\Users\\Wilson\\Desktop\\out.txt";
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
