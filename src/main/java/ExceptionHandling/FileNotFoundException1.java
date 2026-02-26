package ExceptionHandling;

import java.io.FileInputStream;

public class FileNotFoundException1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		String fileName = "D:\\RBA Infotech\\4. Course Contents\\Eclipse_2021_12\\Java Programs\\src\\ExceptionHandling\\InputData.xlsx";
		// below line should be used user defined method, then only it show compile time exception
		FileInputStream fis = new FileInputStream(fileName);
		
	}
}
