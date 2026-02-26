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
		 * Wrapper Class  Integer a = 10
		 * String
		 * int - Integer
		 * float - Float
		 * double - Double
		 * char - Character
		 * long - Long
		 * boolean - Boolean
		 * 
		 */
		
		
		al.add("Anbu");  //al.add(123);  al.add(3.14f)
		al.add("Bala");
		al.add("Chandru");
		al.add("Deepa");
		al.add("Ezhil");
		al.add("Deepa");
		al.add(null);  // null is not allowed
		
		//al.add("Deepa");
		
		// to retrive the element
		//String s1 = al.get(3);
		


		al.sort(null);
		
		for(String s2 : al) {   // for(datatype varname : object)
			System.out.println(s2);
		}
		
		//arrayList.add(100);
		
		
		System.out.println("Printing elements with Enhanced for loop");
		
		//Collections.rotate(al, 1);
		
//		for(String s1 : al) {   // for(datatype varname : object)
//			System.out.println(s1);
//		}
				
		al.remove("Deepa"); //arrayList.remove(1)
		
		System.out.println("\n\nAfter removing first Deepa the Element");
		
		for(String s1 : al)
			System.out.println(s1);			
		
		// to add object 
		al.add(1, "Bala");  
		
		System.out.println("\nAfter adding Bala in the 1st Index");
		for(String s1 : al)
			System.out.println(s1);		
		
		// getting the element from specified index position
		System.out.println("\n Element at 3rd position : " +al.get(2));
		
		// getting the size of the al object
		System.out.println("\n The Size of the al object is : " + al.size());
		
		// checking if element is present in al
		System.out.println("\n Is element Anbu there : " + al.contains("Anbu"));
		
	}
}
