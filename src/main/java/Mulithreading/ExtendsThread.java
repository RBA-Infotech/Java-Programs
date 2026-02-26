package Mulithreading;

	// Java code for thread creation by extending the Thread class
	class MultithreadingDemo1 extends Thread {
		public void run()
		{
			System.out.println(Thread.currentThread().getName()+ " is running");
		}
	}

	// Main Class
	public class ExtendsThread {
		public static void main(String[] args)
		{
			int n = 5; // Number of threads
			for (int i = 0; i < n; i++) {
				MultithreadingDemo1 object = new MultithreadingDemo1();
				object.start();
			}
		}
	}


