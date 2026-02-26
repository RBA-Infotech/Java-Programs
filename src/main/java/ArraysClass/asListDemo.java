package ArraysClass;

import java.util.Arrays;
import java.util.List;

public class asListDemo {

	public static void main(String[] args) {

		int[] arr = { 42, 1, 59, 41, 6, 98, 36 };

		List<Integer> l2 = Arrays.asList(4, 6, 4, 22);

		List<int[]> l1 = Arrays.asList(arr);

		System.out.println("Elements as Integer Array");
		for (int[] is : l1) {
			System.out.println(is);
		}

	}
}
