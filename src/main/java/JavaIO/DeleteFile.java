package JavaIO;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
	public static void main(String[] args) {
		File file = new File("./src/JavaIO/example.txt");

		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("File exits: " + file.exists());
		
		if (file.delete()) {
			System.out.println("File deleted successfully.");
		} else {
			System.out.println("File does not exist, so Failed to delete the file.");
		}
	}
}
