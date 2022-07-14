package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> arrayList = new ArrayList<String>();
//		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Chander");
		arrayList.add("Deva");
		arrayList.add("Elango");
		arrayList.add("Franklin");
		
		Iterator itr = arrayList.iterator();
		
		while(itr.hasNext())
			System.out.print(itr.next() + " ");
		
		System.out.println();
		
		arrayList.remove("Deva");
		
		for(String list: arrayList)
		System.out.print(list+" ");
		
		
	}

}
