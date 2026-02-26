package JavaIO;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {

		String fileName = "src\\JavaIO\\input.txt";
		
		try {
		FileReader fr = new FileReader(fileName);
		int ch;
		while((ch=fr.read()) != -1) {
			System.out.print((char)ch);
		}
		}catch(IOException ioe) {
			System.out.println("Unable to read file");
		}
	
	}

}
