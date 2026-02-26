package CollectionsDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class GenericNon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l1 = new ArrayList();

		l1.add(10);
		l1.add("Abcd");
		l1.add(3.14f);
		l1.add('a');
		//l1.add(null);

		String s1 = (String) l1.get(1);
		int i1 = (int)l1.get(0);
		
		System.out.println(l1);

		for (Object obj : l1) {
			System.out.println(obj);
		}

	}
}
