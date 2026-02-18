package JavaIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.stream.Stream;

public class NIOListFiles {
	public static void main(String[] args) {
		Path path = Paths.get("./src/JavaIO");

		try (Stream<Path> files = Files.list(path)) {
			files.forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println("Error reading directory or it does not exist.");
		}
	}
}
