package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateNegate {

	public static void main(String[] args) {

		Predicate<Integer> isPositive = num -> num > 0;
		Predicate<Integer> isNegative = isPositive.negate();
		
		System.out.println(isPositive.test(1));
		System.out.println(isNegative.test(-4));
	}

}
