package Mulithreading;

class FirstThread extends Thread {
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

class SecondThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("B");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class TwoThreadsExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstThread a1 = new FirstThread();
		SecondThread b1 = new SecondThread();

		System.out.println("Watch out what order the thread is executed");
		a1.start();
		b1.start();

	}

}
