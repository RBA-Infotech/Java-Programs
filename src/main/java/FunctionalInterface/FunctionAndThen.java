package FunctionalInterface;

import java.util.function.Function;

public class FunctionAndThen {

	public static void main(String[] args) {

		Function<Integer, Integer> square = x -> x * x;
		Function<Integer, Integer> doubleValue = x -> 2 * x;
		Function<Integer, Integer> minus10 = x -> x - 10;

		System.out.println(square.andThen(doubleValue).apply(3));
		System.out.println(square.andThen(doubleValue).apply(6));
		System.out.println(square.andThen(doubleValue).andThen(minus10).apply(5));
		System.out.println(square.andThen(minus10).apply(6));
	}

}
