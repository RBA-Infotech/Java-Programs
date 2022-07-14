package Annotations;

class A{

	void displayMsg1() {
		System.out.println("Message 1");
	}

	@Deprecated
	void displayMsg2() {
		System.out.println("Message 2");
	}
}

public class DeprecatedAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1 = new A();
		
		a1.displayMsg2();
	}

}
