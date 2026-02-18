package JavaIO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "src\\JavaIO\\input1.txt";
		
		try {
			FileInputStream fis = new FileInputStream(fileName);
		
			int ch;
			
			while((ch=fis.read()) != -1){
				System.out.print((char)ch);
			}
			fis.close();
		}catch (IOException ioe) {
			ioe.printStackTrace();
			
		}
	}

}
