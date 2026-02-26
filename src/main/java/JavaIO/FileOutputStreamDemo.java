package JavaIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {

		String fileName = "src\\JavaIO\\output1.txt";
		String data = "In this training 36 pax are there \nit is almost for 3 months";

		try {
		FileOutputStream fos = new FileOutputStream(fileName); 
		
		fos.write(data.getBytes());
		
		fos.close();
		
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		System.out.println("Program is completed");
	}

}
