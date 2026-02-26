package StringPrgms;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "TCS";

		
		
		/********* String Methods *************
		1. length() - find the length of string
		2. trim() = removes start and end of the white spaces of the string
		3. toUpperCase() - converts to upper case
		4. toLowserCase() = convert to lower case
		5. replace() - replaces the single character
		6. replayeFirst()
		7. replaceAll() - 
		8. isEmpty() - checks if string is empty
		9. equals() - checks if both string are equals. ex. s1=java, s2=java
		10. equalsIgnoreCase() -  ignore the cases of both the string, then compare, s1=Java, s2=java  
		11. contains() - check if string contain another string, Ex. Wipro contains pr.
		12. substring() - will give sub-string of the given string, Ex. substring(3, 8)
		13. lastLndexOf() - return position of last occurance of char // java a -> 3
		14. split() - return the splitted string matchings. s1.split(",");
		15. charAt() = return the character at specified position
		16. comparTo() - compares tho string object lexicographically order  s1=Anbu, s2=Amru 
		17. concat() - appends string with another string
		18. join() - joins one or more strings with specified seperator - ********
		19. toCharArray() - string will be converted to char array
		20. valueOf - converts any data type to String
		21. startWith() - check given string starts with the char sequence
		22. toString() - return the value of String Object
		  
		
		************/
		
		System.out.println("**********  compareTo   *************");
		// compareTo
		String s1 = "A";
		String s2 = "D"
		System.out.println("comparTo method " + s1 + " - " + s2 +"  - > "+ s1.compareTo(s2));
		
		
		System.out.println("**********  charAt   *************");
		// charAt
		s1 = "selenium training";
		System.out.println("charAt method 3nd positions in \"" + s1 + "\" is: "+ s1.charAt(3));
		
		System.out.println("**********  replace   *************");
		//replace 
		System.out.println("Replace method \'e\' in " + s1 + " by \'a\' is: " + s1.replace('e', 'a'));
		
		System.out.println("**********  replaceAll   *************");
		// replaceAll
		s1 = "Trainer is Training";
		System.out.println("replaceAll method \'Tra\' by \'abc\' is: " + s1.replaceAll("Tra", "abc"));
	
	
	
	
	
	
	}

}
