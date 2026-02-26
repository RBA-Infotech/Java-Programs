package StaticDemo;


class StaticDemo{
	
	static int empNo = 1000;
	
	void incrementValue() {
		System.out.println(empNo++);
	}
}

public class AcrossObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticDemo sd1 = new StaticDemo();
		sd1.incrementValue();
		
		StaticDemo sd2 = new StaticDemo();
		sd2.incrementValue();
		
		StaticDemo sd3 = new StaticDemo();
		sd3.incrementValue();
		
		
	}
	
	void show1() {
		System.out.println(StaticDemo.empNo);
	}

}
