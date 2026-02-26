package LambdaExpression;

@FunctionalInterface
interface displayable{
	
	void show();	
}


public class LENoArg {

	public static void main(String[] args) {

		displayable s1 = () -> System.out.println("Hello World");
		
		s1.show();
	}

}
