package DemoExamples;
 final class Month{
	
	final int jan = 31;
	
	final void displayMonth() {
		
		jan = 32;
		System.out.println("Days in Jan Month: " + jan);
	}
}

class FinalMethod extends Month{
	
	void displayMonth() {
		
	}
}

public class FinalKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Month mon = new Month();
		mon.displayMonth();
	}

}
