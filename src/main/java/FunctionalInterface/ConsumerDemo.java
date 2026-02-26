package FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		Consumer<String> print = str -> System.out.print("\nHello " + str);
		Consumer<String> warmWelcome = str -> System.out.print(str);
		print.accept("Senthil");

		print.andThen(warmWelcome).accept("Mariya");
	}

}
