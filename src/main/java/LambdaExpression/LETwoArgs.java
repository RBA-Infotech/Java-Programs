package LambdaExpression;

@FunctionalInterface
interface AddInterface {
	void add(int a, int b);
}

public class LETwoArgs {

	public static void main(String[] args) {
		
		AddInterface a1 = (a, b) ->System.out.println(a+b); 
		
		 a1.add(10, 20);
	}

}
