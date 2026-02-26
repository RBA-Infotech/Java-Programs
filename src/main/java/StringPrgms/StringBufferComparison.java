package StringPrgms;

public class StringBufferComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb1 = new StringBuffer("Selenium");
		StringBuffer sb2 = new StringBuffer("elenium");
		
		System.out.println(sb1.toString().equals(sb2.toString()));
		System.out.println("sb1 = " +sb1 +"\nsb2 = "+sb2);
		
	}

}
