package StringBufferDemo;

public class StringBufferFirst {

	public static void main(String[] args) {

		
		String s1 = new String("OOPs");
		String s2 = new String("OOPs");
		
		
		StringBuffer sb1 = new StringBuffer("Java");
		StringBuffer sb2 = new StringBuffer("Java");
		StringBuffer sb3 = sb1;
		
		if(sb2.equals(sb1))
			System.out.println("Same String");
		else
			System.out.println("Different String");
		
		//System.out.println(sb);
		
	}

}
