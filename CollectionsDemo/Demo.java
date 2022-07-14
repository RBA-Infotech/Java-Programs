package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> al = new ArrayList<String>();
		
		/*
		 * Wrapper Class
		 * String
		 * int - Integer
		 * float - Float
		 * double - Double
		 */
		
		al.add("Anbu");  //al.add(123);  al.add(3.14f)
		al.add("Aishwarya");
		al.add("Deepa");
		al.add("Chandru");
		al.add("Deepa");
		
		
		//arrayList.add(100);
		
		System.out.println("Elements in arraylist");
		System.out.println(al);	
	
		System.out.println("\nPrinting object thru Iterator");
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() +"\t");
		}
		
		System.out.println("\n\n printing object via enhanced for loop");
		
		for(String obj : al) {
		System.out.println(obj);	
		}
	}

}
