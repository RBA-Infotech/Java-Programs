package StringPrgms;

public class StringMemoryLocation {

	public static void main(String[] args) {

		String s1 = "Java";  //2000
		String s2 = "Java";
		String s3 = "java";
		String s4 = new String("Java");
		//Employee e1 = new Employee();
		
		
		//s1 = s1 + " is the OOPs Concept";  // 3000
		//System.out.println("S1 after changing = " + s1);
		
		System.out.println("with equals() method = " + s1.equals(s4));
		System.out.println("equalsIgnoreCase() method = " + s1.equalsIgnoreCase(s3));
		
		System.out.println("compareTo() method = " + s1.compareTo(s3));
		
		if(s1==s4)
			;
		else
			System.out.println("memory address of S1 and S4 are different");
		
		
		// Employee class
		
		//Employee e1 = new Employee();

		System.out.println(System.identityHashCode(s1) + "\n" + System.identityHashCode(s4));
	}

}
