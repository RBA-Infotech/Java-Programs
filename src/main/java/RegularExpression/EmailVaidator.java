package RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailVaidator {

	
	static String emailRegEx = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9]+\\.)+[a-zA-Z]{2,7}$";
	
	static String emailRegEx1 = "^[A-Za-z][A-Za-z0-9._+&*-]+@[A-Za-z]+\\.[A-Za-z]+";
	public static void main(String[] args) {

		char ch;

		//System.out.println("senthil\"s Result");
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter email");
			String email = sc.next();
			
			isValidEmail(email);
			
			System.out.println("Do you want to continue");
			ch = sc.next().charAt(0);
			
		}while(ch!='n');
	}
	
	public static void isValidEmail(String email) {
		
		Pattern pattern = Pattern.compile(emailRegEx);
		Matcher matcher = pattern.matcher(email);
		
		System.out.println("The email \"" + email + "\" is valid: " + matcher.matches());
		
	}

}
