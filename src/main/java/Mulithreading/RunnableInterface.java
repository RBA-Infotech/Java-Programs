package Mulithreading;

class BikeGame implements Runnable {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " value " + i);
		}
	}
}

public class RunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BikeGame bikeGame1 = new BikeGame();
		BikeGame bikeGame2 = new BikeGame();

		// creating thread
		Thread thread1 = new Thread(bikeGame1);
		Thread thread2 = new Thread(bikeGame2);

		thread1.start();
		thread2.start();
	}

}
