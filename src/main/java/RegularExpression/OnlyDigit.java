package RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OnlyDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String digit = "^([0-9])$+";

		System.out.println("Enter any digits");
		Scanner sc = new Scanner(System.in);
		String no = sc.nextLine();

		if (no.matches(digit)) {
			System.out.println("This is only digits");
		} else {
			System.out.println("it contains non digit");
		}

//		Pattern pattern = Pattern.compile("[0-9]+");   
//	    Matcher matcher = pattern.matcher(no);
//	   //System.out.println("The output: " + matcher.matches());
//	   
//		if(matcher.matches()) {
//			System.out.println("This is only digits");
//		}else {
//			System.out.println("it contains non digit");
//		}
	}

}
