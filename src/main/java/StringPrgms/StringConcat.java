package StringPrgms;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "TCS";
		
		// first way to concat
		String s2 = s1 + " is IT Company";
		System.out.println(s2);
		
		// second way to concat
		String s3 =" is in Siruseri";
		String s4 = s1.concat(s3);
		System.out.println(s4);
	}

}
