package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ChallengePrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList newList = new ArrayList();
		newList.add(2);
		newList.add("java");
		newList.add("ILP");
		newList.add(6);
		newList.add(4);
		newList.add("GEC");

		Collections.rotate(newList,4);
		System.out.println(newList);

		
		
	}

}
