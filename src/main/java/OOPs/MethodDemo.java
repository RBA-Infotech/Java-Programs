package OOPs;

public class MethodDemo {
	
	public void showMsg() {   // called method
		System.out.println("showing message");
	}
	

	void showStrMsg(String s1) {
		System.out.println(s1);
	}
	
	int add(int a, int b) {
		int c= a+ b;
		return c;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Selenium";
		int a=10, b=20;
		
		MethodDemo m1 = new MethodDemo();
		
		m1.showMsg();  // calling method
		m1.showStrMsg(s1);
		
		int x = m1.add(a,b);
		System.out.println(x);
	}

}
