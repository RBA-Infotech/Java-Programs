package BasicPrograms;

public class DatatypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b, b1;
		b = 10;
		short sh, sh1, sh2;
		sh2 = 126;
		
		sh1 = b;   // byte - -127 - +127  - 1 byte
					// short - -32,767 - 32,767  - 2 byte
		
		b1 = (byte) sh2;  
		
		System.out.println("Short --> Byte: " + b1);
		
		int i = 1236;  // 4 byte
		long l = 344345464l;  // 8 byte
		char ch = 'A';
		float f = 3.14f;
		double d = 653.234;
		boolean flag = true;
		
		String s1 = "Selenium";
		String s2 ="100";
		String s3 = "100.23";
		String s4 = "100.5678";
		
		
		
		int StoI = Integer.valueOf(s2);
		float StoF = Float.valueOf(s3);
		double StoD = Double.valueOf(s4);
		
		String ItoS = String.valueOf(i);  // Integer.toString(i);
		String FtoS = String.valueOf(f);  // Float.toString(f); 
		String DtoS = String.valueOf(d);  // Double.toString(d); 
		
		int CtoI;
		
		System.out.println("String -> Integer : " + StoI);
		System.out.println("String -> Float : " + StoF);
		System.out.println("String -> Double : " + StoD);
		
		
		System.out.println("Interger -> String: " + ItoS);
		System.out.println("Float -> String: " + FtoS);
		System.out.println("Double -> String: " + DtoS);
		
	}

}
