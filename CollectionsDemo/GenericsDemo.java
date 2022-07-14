package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsDemo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			List list = new ArrayList();
			
			list.add(23);
			list.add("Selenium");
			list.add(3.45f);
			
			System.out.println("ArrayList with any objects");
			for(Object s1 : list)
				System.out.print(s1 + "\n");		
		}
	}


