package StringPrgms;

import java.util.Scanner;

public class StringComparison {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="CTS";  // 1000 - CTS  
		
		String s3 = "CTS";
		
		String s2 = new String("CTS");  //2000 - CTS  CtS
		
		String s4 = "CTS";
		
		System.out.println("Char at 0 position: "+ s1.charAt(2));
		
		if(s1.equals(s2)) {    // comparing contents
			s1.equalsIgnoreCase(s2);  // CTS == cTs
		System.out.println("s1 =" + s1 + " and s2= " + s2 + " are same");
		}
		
		if(s1==s2) {   // compares the reference i.e memory locations
			System.out.println("s1 and s2 - Same memory");
		}
		else
			System.out.println("s1 and s2 - Memory are different");	
	
		if(s1==s3) {   // compares the reference i.e memory locations
			System.out.println("s1 and s3 - Same memory");
		}
		else
			System.out.println("s1 and s3 - Memory are different");	

		System.out.println("Comparing String lexicographically");
		System.out.println(s1 + "\t" + s4);
		System.out.println(s1.compareTo(s4));
		
		System.out.println("s1 = "+ Integer.toHexString(s1.hashCode()));
		System.out.println("s2 = "+ Integer.toHexString(s2.hashCode()));
		System.out.println("s3 = "+ Integer.toHexString(s3.hashCode()));
	}

	
}
