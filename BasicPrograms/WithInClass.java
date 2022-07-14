package BasicPrograms;

public class WithInClass {

	int firstValue=10;
	
	void displayMsg() {
		System.out.println("The value of firstVal is " + firstValue);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WithInClass withInClass = new WithInClass();
		
		System.out.println("The value is: " + withInClass.firstValue);
		
		withInClass.displayMsg();
	}

}
