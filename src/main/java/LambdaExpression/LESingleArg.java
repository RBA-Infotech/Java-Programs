package LambdaExpression;

@FunctionalInterface
interface SquareInterface {
	int square(int x);
}

public class LESingleArg {

	public static void main(String[] args) {

		SquareInterface si = x -> x * x; 
		
		int square = si.square(6);
		System.out.println(square);
	}

}
