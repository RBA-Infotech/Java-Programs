package JavaIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class NIOCreateFile {
	public static void main(String[] args) {
		Path path = Paths.get("./src/JavaIO/exampleNio.txt");

		try {
			Files.createFile(path);
			System.out.println("File created - Absolute Path:  " + path.toAbsolutePath());
			//System.out.println("File created - Absolute Path:  " + path.relativize(path));
		} catch (IOException e) {
			System.out.println("File already exists or an error occurred.");
		}
	}
}
