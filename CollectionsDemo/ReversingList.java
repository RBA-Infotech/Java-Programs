package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReversingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> a1 = new ArrayList<String>();

		/*
		 * Wrapper Class String Integer - int Float - float Double - double
		 */

		a1.add("Anbu"); // a1.add(123); a1.add(3.14f)
		a1.add("Raju");
		a1.add("Deepa");
		a1.add("Chandru");
		a1.add("Deepa");

		// arrayList.add(100);

		System.out.println("\nElements in arraylist");
		System.out.println(a1);

		System.out.println("\nPrinting elements in ascending order");

		Collections.sort(a1);
		for (String s1 : a1) { // for(datatype varname : object)
			System.out.println(s1);
		}

		System.out.println("\nPrinting elements in descending order");

		Collections.reverse(a1);
		for (String s1 : a1) { 
			System.out.println(s1);
		}
	}
}
