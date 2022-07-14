package Mulithreading;

class A extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("A");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("B");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultithreadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1 = new A();
		B b1 = new B();

		a1.start();
		b1.start();

	}

}
