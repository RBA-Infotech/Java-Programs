package Mulithreading;


	public class VolatileDemo {

	    private volatile boolean running = true; // Volatile boolean flag

	    public void start() {
	       new Thread(() -> {
	            while (running) {
	                // Do some work
	                System.out.println("Worker thread is running...");
	                try {
	                    Thread.sleep(800);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	            System.out.println("Worker thread stopped.");
	        }).start();
	    }

	    public void stop() {
	        running = false; // Setting volatile variable from another thread
	    }

	    public static void main(String[] args) throws InterruptedException {
	        VolatileDemo example = new VolatileDemo();
	        example.start();

	        Thread.sleep(3000);
	        System.out.println("Stopping worker thread...");
	        example.stop();

	    }
	}

