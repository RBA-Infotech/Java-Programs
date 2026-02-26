package ExceptionHandling;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 0, c;

		try {
			c = a / b;
			System.out.println(a + " diveded by " + b + " is = " + c);
		} catch (ArithmeticException ae) {
			System.out.println("There is a line of code which gives divided by zero error");
		}
		
		System.out.println("if this msg is displayed, that means exception has been caught successfully");
	}

}
