package Java8Features;


interface printable{	
	void display(int i);  // sam

	}

class Employee implements printable{

	public void display(int i) {
		System.out.println("display method inside class");
	}
}

public class LamdaExpression {

	public static void main(String[] args) {
	
		printable p;
		
		p = (i) -> System.out.println("display method: " + i);
	
		p.display(7);
	}

}
