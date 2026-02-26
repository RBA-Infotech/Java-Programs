package JavaIO;

	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;
	import java.io.IOException;

	public class NIODeleteFile {
	    public static void main(String[] args) {
	        Path path = Paths.get("exampleNio.txt");

	        try {
	            Files.delete(path);
	            System.out.println("File deleted: " + path.toAbsolutePath());
	        } catch (IOException e) {
	            System.out.println("Failed to delete file or it does not exist.");
	        }
	    }
	}

