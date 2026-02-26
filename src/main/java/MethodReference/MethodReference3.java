package MethodReference;

import java.util.function.Consumer;

class InstanceMethodReference {
	public void printMessage(String message) {
		System.out.println("Message: " + message);
	}
}

	public class MethodReference3 {

		public static void main(String[] args) {
			InstanceMethodReference obj = new InstanceMethodReference();

			// Method reference to an instance method
			Consumer<String> messagePrinter = obj::printMessage;
			messagePrinter.accept("Hello, World!");
		}
	}


