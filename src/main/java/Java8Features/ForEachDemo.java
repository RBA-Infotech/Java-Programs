package Java8Features;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<String> l1 = new ArrayList<String>();
		
		List<String> list = Arrays.asList("Bala", "Raju", "Anbu", "Kumar", "Sathish");
		
		// normal for look
		// enhanced for loop
		
		
		// forEach method
	
		list.stream()
			.forEach(System.out::println);
		// System.out.println()
		
	}

}
