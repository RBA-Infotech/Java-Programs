package StringPrgms;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Welcome";  // 1000
		int i;
		//System.out.println("first s1 address: " + s1.hashCode() + hashCode(s1.hashCode()));
		
		s1 = s1 + " to RBA Infotech"; // 2000
		
		System.out.println(s1 + " \t" + s1.hashCode() );
		
		s1 = s1.concat(" at Chennai"); // 3000
				
		System.out.println(s1 + "\t" + s1.hashCode());
	}

}
