package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundException1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

	
		
		File file = new File("D:\\RBA Infotech\\3. Course Contents\\Eclipse\\Java Programs\\"
				+ "Basic Programs\\ExceptionHandling\\InputData.xlsx");

//			FileInputStream fis = new FileInputStream(file);
			
//		try {
		FileInputStream fis = new FileInputStream(file);
//		}catch(FileNotFoundException fnf) {
//			System.out.println("The file not does not exist");
//		}
		
	}

}
