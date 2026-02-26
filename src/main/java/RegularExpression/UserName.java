package RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserName {

	
	
	static String emailRegEx = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";

	public static void main(String[] args) {

		char ch;

		//System.out.println("senthil\"s Result");
		
		Scanner sc = new Scanner(System.in);
		String userName;
		
		do {
			System.out.println("Enter Username");
			userName = sc.next();
			
			isValidEmail(userName);
			
			System.out.println("Do you want to continue");
			ch = sc.next().charAt(0);
			
		}while(ch!='n');
	}
	
	public static void isValidEmail(String userName) {
		
		Pattern pattern = Pattern.compile(emailRegEx);
		Matcher matcher = pattern.matcher(userName);
		
		System.out.println("The Username \"" + userName + "\" is valid?: " + matcher.matches());
	}

}
