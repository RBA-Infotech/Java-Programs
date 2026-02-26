package ExceptionHandling;

public class CodeChallenge1 {

	public static void main(String[] args) {

	public static double SquareRoot(double value) throws ArithmeticException {
	if (value >= 0) 
		return Math.sqrt(value);
	else 
		throw new ArithmeticException();
	}
	
	public static double func(int x) {
	double y = (double) x;
	try {
	y = SquareRoot( y );
	} catch(ArithmeticException e) {
	y = 0;
	} finally {
	--y;
	}
	return y;
	}
	}
}
