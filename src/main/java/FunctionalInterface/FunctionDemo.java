package FunctionalInterface;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		Function<String, Integer> strLength = str -> str.length();
		System.out.println(strLength.apply("Wipro SDET"));
	}

}
