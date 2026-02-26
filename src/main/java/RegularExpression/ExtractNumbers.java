package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumbers {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("\\d,\\d+");
		Matcher m = p.matcher("Showing 1 – 24 of 2,459"); //Showing 1 – 24 of 2,459 results //Order123 ready

		while (m.find()) {
		    System.out.println(m.group());
		}

	}

}
