package JavaIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class NIOCreateDir {
	public static void main(String[] args) {
		Path path = Paths.get("exampleDir");

		try {
			Files.createDirectory(path);
			System.out.println("Directory created: " + path.toAbsolutePath());
		} catch (IOException e) {
			System.out.println("Directory already exists or an error occurred.");
		}
	}
}
