package Java8Features;

class displayInfo implements I{

	@Override
	public void display() {
		System.out.println("This is abstract display method");
		
	}
	
	
	
}


public class DefaultMethodInInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		displayInfo d = new displayInfo();
		d.display();
		d.show1();
		d.show2();
		
	}

}
