package JavaIO;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class NIOFileAttributes {
	public static void main(String[] args) {
		Path path = Paths.get("exampleNio.txt");
		
		try {
			Files.createFile(path);
			//new FileWriter("exampleNio.txt").write("All in SDET is performing good");
			BasicFileAttributes attrs = Files.readAttributes(path, BasicFileAttributes.class);
			System.out.println("Creation Time: " + attrs.creationTime());
			System.out.println("Last Modified Time: " + attrs.lastModifiedTime());
			System.out.println("Size: " + attrs.size() + " bytes");
		} catch (IOException e) {
			System.out.println("Error reading file attributes.");
			e.printStackTrace();
		}
	}
}
