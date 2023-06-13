package aulas.secao_17.aula_218;

import java.io.File;

public class App {

	public static void main(String[] args) {

		String path = "C:\\Users\\Wilson\\Desktop";
		
		File file = new File(path);
	
		File[] folders = file.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = file.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File f : files) {
			System.out.println(f);
		}
	
		boolean success = new File(path + "\\subdir").mkdir();
		System.out.println("Directory created successfully "+ success);
		
	}

}
