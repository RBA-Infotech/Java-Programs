package JavaMCQ;

public class PrePostIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 20;
		int a = 5;
		int b = 10;
		
		int z = ++x + ++y - ++a * b-- / x;
		System.out.println("Output is " + z);
	}

}
