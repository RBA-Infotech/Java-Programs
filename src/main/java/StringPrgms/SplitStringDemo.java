package StringPrgms;

public class SplitStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "1-24 of over 70,000 results for"; 
		System.out.println(s1);
		
		//String[] resultStr = new String[];
		
		String[] resultStr = s1.split(" ");
		
		for (String str : resultStr) {
			System.out.println(str);
		}
		
		System.out.println("Total no of strings = " + resultStr.length);
	}

}
