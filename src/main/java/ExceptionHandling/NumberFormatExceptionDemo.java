package ExceptionHandling;

public class NumberFormatExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abc";  // "100"
		int i = Integer.valueOf(s);
		
		System.out.println("Integer value is : " + i);
				
	}

}
