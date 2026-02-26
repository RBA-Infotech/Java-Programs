package JVMArchitechture;

public class StackOverFlowError {

	static void display() {
		System.out.println("Display");
		display();
	}

	public static void main(String[] args) {

		display();

	}

}
