package StringPrgms;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Welcome";
		
		s1.
		
		// converting string to char array
		char[] c = s1.toCharArray();
		
		System.out.println("Elements of char array");
		for(int i=0; i<s1.length(); i++) {
			System.out.println(c[i]);
		}
		
		for(int i=0; i<s1.length(); i++)
			System.out.print(s1.charAt(i));
		
		System.out.println();
		
		for(int i=s1.length()-1; i>=0; i--)
			System.out.print(s1.charAt(i));
		
		System.out.println();
		
		s1="Senthil";
		System.out.println(s1);
		
//		StringBuffer sb = new StringBuffer("Selenium");
//		System.out.println(sb);
//		sb = "Training";
//		System.out.println(sb);
		}
}
