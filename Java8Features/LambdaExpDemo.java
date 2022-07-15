package Java8Features;

interface interf1 {

	void showMsg();
	
	default void displayDefault1() {
		System.out.println("This is default method 1");
	}
	
	default void displayDefault2() {
		System.out.println("This is default method 2");
	}
}

class LambdaDemo implements interf1 {

	public void showMsg() {
		System.out.println("show message in class");
	}
}

public class LambdaExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		interf1 i1;

		i1 = () -> {
			System.out.println("show msg in main method");
		
		};

		i1.showMsg();
		i1.displayDefault1();
		i1.displayDefault2();

	}

}
