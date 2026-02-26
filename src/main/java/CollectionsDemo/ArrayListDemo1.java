package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l1 = new ArrayList<Integer>();

		l1.add(10);
		l1.add(24);
		l1.add(89);
		l1.add(10);

		for (Integer int1 : l1) {
			System.out.println(int1);
		}
		
		l1.add(1, 54);
		System.out.println("after addding in position 1");
		for (Integer int1 : l1) {
			System.out.println(int1);
		}

		System.out.println(" element in array position 3: " + l1.get(3));

		Integer int2 = 10;
		l1.remove(int2);

		System.out.println("After removing element 10");
		for (Integer int1 : l1) {
			System.out.println(int1);
		}

	}

}
