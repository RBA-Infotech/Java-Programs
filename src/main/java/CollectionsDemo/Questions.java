package CollectionsDemo;

import java.util.ArrayList;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		ArrayList listStr = list;
		ArrayList listBuf = list;
		
		listStr.add(0, "Selenium");
		
		String buff = (String)listBuf.get(0);
		System.out.println(buff);
		
	}

}
