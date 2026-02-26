package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorDemo {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<>();
		
		l1.add("Gyanendra");
		l1.add("Larance");
		l1.add("Maggi");
		l1.add("Nancy");
		
		//enhanced for loop
		
		System.out.println("Printing the elements via Enhanced for loop");
		for (String str : l1) {
			System.out.println(str);
		}
		
		
		System.out.println("\nPrinting the elements via Iterator");
		// to loop thru the elements via iterator
		Iterator itr = l1.iterator();
				
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//remove() method should be used after next() method, otherwise it will throw IlleagalStateExcetpion
		System.out.println("\n Displaying after removing element");
		// to loop thru the elements via iterator
		itr = l1.iterator();
				
		while(itr.hasNext()) {
			//itr.remove();
			Object s1 =  itr.next(); // or itr.next().toString
			if(s1.equals("Larance"))
				itr.remove();
		}
		
		System.out.println(l1);
	}

}
