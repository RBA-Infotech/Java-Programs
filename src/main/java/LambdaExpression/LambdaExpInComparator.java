package LambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExpInComparator {

	public static void main(String[] args) {

		List<Integer> sortedList = Arrays.asList(4,8,1,42,9,7,3);
		
		Collections.sort(sortedList, (a,b) -> a-b); // ascending order
		System.out.println(sortedList);
		
	}

}
