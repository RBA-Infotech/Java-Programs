package ExceptionHandling;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10, b=0, c=0;
		
		try {
		c = a/b;
		}catch(ArithmeticException a1) {
			a1.printStackTrace(); 
			//System.out.println("Divided by Zero error is occuredd, pls correct it");
		}
		
		System.out.println("The value of c is : " + c);
		
	}

}
