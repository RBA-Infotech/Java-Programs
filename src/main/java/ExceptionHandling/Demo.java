package ExceptionHandling;

import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 0, c = 0;
			try{
				c = a / b;
			}catch(ArithmeticException ae) {
				System.out.println("it is divided by zero error, pls give correct input");
			}
		System.out.println("Addtion done successfull");
	}
}
