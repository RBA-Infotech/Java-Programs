package LambdaExpression;

@FunctionalInterface
interface showable {
	public void showMsg();   // SAM -> Single Abstract Method
	
	// if more than one abstract method is there, need to remove @Functional Interface
	//public void dispMsg();
	
	default void displayDefault1() {
		System.out.println("This is default method 1");
	}
	
	default void displayDefault2() {
		System.out.println("This is default method 2");
	}
}

@FunctionalInterface
interface addable{
	public int add(int a, int b);
}


public class LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ShowMessage s1 = new ShowMessage();
//		s1.showMsg();
		
		
		showable s2 = () -> System.out.println("displaying message");		
		s2.showMsg();
		s2.displayDefault1();
		s2.displayDefault2();
		
		addable a1 = (a, b) ->  a+b; 

		int a = 10, b = 20;
		System.out.println("The addition of a and b is = " + a1.add(a, b));
		
	}

}
