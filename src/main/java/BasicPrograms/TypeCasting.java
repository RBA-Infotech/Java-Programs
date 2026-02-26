package BasicPrograms;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		byte b1 = 23, b2;
		
		int i1=343, i2, i3, i4, i5;
		short s1=3423, s2;
		// storing short to int && int to short
		i2 = s1;
		s2 = (short)i1;
		
		double d1 = 345643.453445, d2;
		
		//storing int to float && float to int
		float f1 = 3.14f, f2;
		f2 = i1;
		i2 = (int)f1;
		
		// storing string to int
		String str1 = "14";
		i3 = (int)str1;
		
		// storing char to int && int to char;
		char ch = 'A', ch2;
		i5 = ch;
		System.out.println("char -> int = " +i5);
		ch2 = 100;
		System.out.println("int -> char = " + ch2);
		
	}

}
