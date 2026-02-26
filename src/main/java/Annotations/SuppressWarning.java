package Annotations;

import java.util.ArrayList;

public class SuppressWarning {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list=new ArrayList();  
		list.add("Elango");  
		list.add("Frank");  
		list.add("Harrish");  
		  
		for(Object obj:list)  
		System.out.println(obj);  
	}

}
