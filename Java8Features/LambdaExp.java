package Java8Features;

interface interf1 {

	void showMsg();
}

class LambdaDemo implements interf1 {

	public void showMsg() {
		System.out.println("show message in class");
	}
}

public class LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		interf1 i1;

		i1 = () -> {
			System.out.println("show msg in main method");
		
		};

		i1.showMsg();

	}

}
