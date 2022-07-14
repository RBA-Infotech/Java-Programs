package BasicPrograms;

public class MemoryForDatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean bool = true; // false
		char ch = 'b';  	//2 byte
		byte b = 127;    	//1 byte - 8 bit - 2 power of 8
		short s = 534; 		//2 byte
		int  i = 54245634;		//4 byte
		long l = 6744534l; 	//8 byte
		
		float f = 3.14f;	//4 byte     // 7 precision
		double d = 3.565;	//8 byte	 // 15 precision
		
		String s1 ="Se34534^$#";		// String
		
		int[] a = new int[10];    // Array
		
		float f1 = i;
		System.out.println("Int to Float: " + f1);
		
		int i1 = (int) f;
		System.out.println("Float to Int: "+ i1);
	}

}
