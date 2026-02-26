package Mulithreading;

class SharedResource {
	private int item = 0; // Shared resource
	private boolean hasItem = false;

	public synchronized void produce() throws InterruptedException {
		while (hasItem) {
			wait(); // Wait until the consumer consumes the item
		}
		item++;
		System.out.println("Produced item: " + item);
		hasItem = true;
		notify(); // Notify the consumer that an item is available
	}

	public synchronized void consume() throws InterruptedException {
		while (!hasItem) {
			wait(); // Wait until the producer produces an item
		}
		System.out.println("Consumed item: " + item);
		hasItem = false;
		notify(); // Notify the producer that the item is consumed
	}
}

public class InterThreadCommunication {
	public static void main(String[] args) {
		SharedResource resource = new SharedResource();

		Thread producer = new Thread(() -> {
			try {
				for (int i = 0; i < 5; i++) {
					resource.produce();
					Thread.sleep(500); // Simulate production time
				}
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		});

		Thread consumer = new Thread(() -> {
			try {
				for (int i = 0; i < 5; i++) {
					resource.consume();
					Thread.sleep(1000); // Simulate consumption time
				}
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		});

		producer.start();
		consumer.start();
	}

}
