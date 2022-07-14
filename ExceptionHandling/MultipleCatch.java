package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.*;
public class MultipleCatch {

	public static void main(String[] args) throws FileNotFoundException, ArithmeticException  {
		// TODO Auto-generated method stub

		int a=10, b=0, c;
		int[] arr = new int[10];
		File file;
		FileInputStream fis;
		
		try {
		// code related to Arithmetic Exception
		c=a/b;
		}catch(ArithmeticException ae) {
			System.out.println("it is divided by zero error, please correct it");
		}
		
		try {
		System.out.println("Array value in 12th Position: " + arr[11]);
		}catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("Array Index Out of Bounds");
		}
		
		
		try {
		file = new File("D:/RBA Infotech/3. Course Contents/Eclipse/Java Programs/Basic Programs/ExceptionHandling/ReadData.xlsx");
		fis = new FileInputStream(file);
		}catch(FileNotFoundException fnf) {
			System.out.println(" File not found");
		}
//		

		
		System.out.println("this is line is after exception line");
		
	}
	
}	