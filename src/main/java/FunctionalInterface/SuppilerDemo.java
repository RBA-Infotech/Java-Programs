package FunctionalInterface;

import java.util.function.Supplier;

public class SuppilerDemo {

	public static void main(String[] args) {

		Supplier<String> msg = () -> "Hello World";
		Supplier<Integer> printNumber = () -> 1234;
		
		System.out.println(msg.get());
		System.out.println(printNumber.get());
	}

}
