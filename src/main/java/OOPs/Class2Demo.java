package OOPs;

class DisplayMessage{
	
int empNo = 123;
	
	void displayEmpNo() {
		System.out.println("Emp No: "+ empNo);
	}
	
}

public class Class2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DisplayMessage displayMessage = new DisplayMessage();
		
		System.out.println("The value is: " + displayMessage.empNo);
		displayMessage.displayEmpNo();
		
	}

}
