package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample2 {

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(3,6,1,4,8,5);
		
		l1.stream().filter(x -> x % 2 ==0)
		.forEach(System.out::println);
		//.collect(Collectors.toList());
	}

}
