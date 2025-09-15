package practice.java.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileExceptions {

	public static void main(String[] args) {
		

		String fileName="testing.csv";
		Path path=Paths.get(fileName);
//		try {
//			List<String> lines=Files.readAllLines(path);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		File file= new File(fileName);
		if(!file.exists()) {
			System.out.println("Quitting application as file not exists.");
			return;
		}
		System.out.println("File found!");

	}

}
