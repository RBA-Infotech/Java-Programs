package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("^[(+]?1?-? ?\\d{3}[-). ]?[-]?\\d{3}[-. ]?\\d{4}$");   
	    Matcher matcher = pattern.matcher("1-212-456-7890");
	   System.out.println("The output: " + matcher.matches()); 
	}

}
