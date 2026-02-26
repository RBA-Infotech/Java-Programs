package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {

		/************************************
		 * 1. Intermediate Operation filter() map() sorted()
		 * 2. Aggregate or Terminal Operation forEach() reduce() collect() 
		 * count() min() max() findFirst() anyMatch() allMatch()
		 ************************************/

		List<Integer> list = Arrays.asList(1, 8, 3, 4, 2, 5, 6);

	
		// below code on how to use filter - is used to select elements from a stream based on a specified condition
		list.stream()
			.filter(x -> x % 2 == 0)  // (8, 4, 2, 6)
			.forEach(x -> System.out.println(x));
		//.forEach(System.out::println);

		
		// below code on how to use map - is used to transform elements in a stream by applying a function to each element 
		list.stream()
		.map(x -> x * x)
		.forEach(x -> System.out.println(x));
		 //.forEach(System.out::println);

		
		// below code on how to use reduce -  is used to combine elements of a stream into a single result.
		int total = list.stream()  // (1, 8, 3, 4, 2, 5, 6)
						.reduce(0, (e1, e2) -> e1 + e2); // (0, 9),(9,3),(12, 4),(16, 2),(18, 5),(23, 6) 
		System.out.println(total);

		
		// below code on how to use sort
		list.stream()
			.sorted()
			.forEach(x -> System.out.println(x));
		// .forEach(System.out::println);


		long cnt = list.stream()
						.count();

		System.out.println(cnt);

		List<Integer> oddNo = list.stream()
				.filter(x -> x % 2 != 0)
				.collect(Collectors.toList());
		
		oddNo.forEach(x -> System.out.println(x));

		// to find max 
		int maxNo = list.stream().max(x);
	}

}
