package JavaIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {

		String fileName = "src\\JavaIO\\outputdata.txt";
		FileWriter fw;
		
		try {
		fw = new FileWriter(fileName, true);
		
		fw.write("We are from AP and Telungana\n");
		fw.write("After Internship, we will in projects\n");
		fw.close();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

}
