package BasicPrograms;

public class Oper_Precedence {

	public static void main(String[] args) {

		int a = 5; 
		int b = 10; 
		int c = 20; 
		int result = (a * b) - (c + 50) / 40 * ++b; 
		System.out.println(result);
	}

}
