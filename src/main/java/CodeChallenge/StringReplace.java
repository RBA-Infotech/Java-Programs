package CodeChallenge;

public class StringReplace {

	static void fix(String s) {
		s = s.replace(' ', '_');
	}

	public static void main(String args[]) {
		String x = "> This is a test <";
		fix(x);
		System.out.println(x);	
	}
}
