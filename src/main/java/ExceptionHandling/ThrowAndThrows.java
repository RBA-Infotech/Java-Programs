package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowAndThrows {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		System.out.println("Throw keword demo");
		//throwDemo();

		System.out.println("Throws keword demo");
		throwsDemow();
	}

	static void throwDemo() {

		throw new ArithmeticException();
	}
	
	static void throwsDemow() throws FileNotFoundException{
		//int[] intArray = new int[10];
		System.out.println("Handling File Not Found Exception via throws keyword");
		FileInputStream fis = new FileInputStream("src\\ExceptionHandling\\InputData.xlsx");
		
	}

}
