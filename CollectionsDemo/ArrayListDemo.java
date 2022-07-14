package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

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
		al.add("Bala");
		al.add("Chandru");
		al.add("Deepa");
		al.add("Ezhil");
		al.add("Deepa");
		//al.add("Deepa");
		
		
		
		//arrayList.add(100);
		
//		System.out.println("Elements in arraylist");
//		System.out.println(al);
//		
//		System.out.println("\nOne way of displaying items in the ArrayList\n");
//		System.out.println("Printing elements via Iterator");
//		
//		Iterator itr = al.iterator();  //syntax 
//		while(itr.hasNext()) {
//			System.out.println(itr.next()); 
//		}
//			
//		System.out.println("\n");
		
		System.out.println("Printing elements with Enhanced for loop");
		
		Collections.rotate(al, 1);
		
		for(String s1 : al) {   // for(datatype varname : object)
			System.out.println(s1);
		}
				
//		al.remove("Deepa"); //arrayList.remove(1)
//		
//		System.out.println("\n\nAfter removing first Deepa the Element");
//		
//		for(String s1 : al)
//			System.out.println(s1);			
//		
//		al.add(1, "Bala");  
//		
//		System.out.println("\nAfter adding Bala in the 1st Index");
//		for(String s1 : al)
//			System.out.println(s1);		
//		
//		// getting the element from specified index position
//		System.out.println("\n Element at 3rd position : " +al.get(2));
//		
//		// getting the size of the al object
//		System.out.println("\n The Size of the al object is : " + al.size());
//		
//		// checking if element is present in al
//		System.out.println("\n Is element Anbu there : " + al.contains("Anbu"));
		
	}
}
