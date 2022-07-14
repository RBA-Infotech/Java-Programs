package ExceptionHandling;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10, b=0, c;
		d=10;
		
		try {
		c=a/b;
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}finally{
			System.out.println("This is the last statement");
		}
	}

}
