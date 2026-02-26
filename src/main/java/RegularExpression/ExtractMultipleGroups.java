package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractMultipleGroups {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("(\\w+)@(\\w+).com");
		Matcher m = p.matcher("sen@gmail.com");

		if (m.find()) {
		    System.out.println(m.group(1)); // sen
		    System.out.println(m.group(2)); // gmail
		}

	}

}
