package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorVsListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		
		list.add("Anbu");
		list.add("Bala");
		list.add("Chandru");
		list.add("Devagi");
		
		
		Iterator itr = list.iterator();
		
		System.out.println("Printing Elements based on Iterator");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ListIterator listItr = list.listIterator();
		
		System.out.println("\nPrinting Elements in forward direction");
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		
		System.out.println("\nPrinting Elements in backward direction");
		//System.out.println(listItr.hasPrevious());
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		
	}

}
