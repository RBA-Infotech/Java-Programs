package CollectionsDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l1 = new ArrayList<String>();

		l1.add("Raju");
		l1.add("Poornima");
		l1.add("Bala Murthy");
		l1.add("Anand");
		

	
		String s1 =  l1.get(1);

		System.out.println(l1);

		for (String obj : l1) {
			System.out.println(obj);
		}
	}
}
