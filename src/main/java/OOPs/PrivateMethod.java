package OOPs;

interface MyInterface {
	default void performTask() {
		doTask();
	}

	private void doTask() {
		System.out.println("Performing the task");
	}
}

class MyClass implements MyInterface {
}

// Main class to test the implementation
public class PrivateMethod {
	public static void main(String[] args) {
		MyInterface obj = new MyClass();
		obj.performTask(); // This will call the public method, which in turn calls the private method

	}
}