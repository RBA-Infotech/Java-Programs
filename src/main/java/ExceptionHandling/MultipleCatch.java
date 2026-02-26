package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.*;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 0, c;
		int[] arr = new int[10];
		File file;
		FileInputStream fis;

		try {
			// below code throws Arithmetic Exception
			c = a / b;

			// below code throws ArrayIndexOutOfBound Exception
			System.out.println("Array value in 12th Position: " + arr[10]);

			// below code throws File not found exception
			file = new File(
					"D:\\RBA Infotech\\4. Course Contents\\Eclipse_2021_12\\Java Programs\\src\\ExceptionHandling\\ReadData.xlsx");
			fis = new FileInputStream(file);

		} catch (ArithmeticException ae) {
			System.out.println("it is divided by zero error, please correct it");
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("Array Index Out of Bounds");
		} catch (FileNotFoundException fnf) {
			System.out.println(" File not found");
		} catch (Exception e) {
			System.out.println("None of the above excetpion occure");
		}

		System.out.println("this is line is after exception line");

	}

}