package LambdaExpression;

@FunctionalInterface
interface printInterface {
	void display(int i);

	// non-abstract method
	default void show() {
		System.out.println("this is default method 1 in interface");
	}

	default void show1() {
		System.out.println("this is default method 2 in interface ");
	}

}

//class Employee1 implements printInterface{
//	public void display(int i) {
//		System.out.println("printing via class method implementation = " + i);
//	}
//}

public class LEDefaultMethods {

	public static void main(String[] args) {

		printInterface p = i -> System.out.println("printing via lambda expression = " + i);

		p.display(15);
		p.show();
		p.show1();
	}

}
