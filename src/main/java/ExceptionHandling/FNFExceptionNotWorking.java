package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FNFExceptionNotWorking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "D:/RBA Infotech/3. Course Contents/Eclipse/Java Programs/Basic Programs"
				+ "/ExceptionHandling/ReadData.xlsx";

		FileInputStream fis = new FileInputStream(fileName);
		
	}

}
