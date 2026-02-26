package OOPs;

interface MyInter1 {
	default void performTask() {
		doStaticTask();
	}

	private static void doStaticTask() {
		System.out.println("Performing static task");
	}
}

class MyClass1 implements MyInter1 {
	
	public void performTask() {
		System.out.println("default method in MyClass1");
	}
	
	
}

public class PrivateStaticMethod {

	public static void main(String[] args) {
		MyInter1 obj = new MyClass1();
		obj.performTask(); // This will call the public method, which in turn calls the private static
							// method
	}
}
