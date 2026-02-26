package Mulithreading;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

		Thread writerThread = new Thread(() -> {
			map.put("A", 1);
			map.put("B", 2);
			map.put("C", 3);
			System.out.println("Writer added entries.");
		});

		Thread readerThread = new Thread(() -> {
			map.forEach((key, value) -> System.out.println(key + ": " + value));
		});

		writerThread.start();
		readerThread.start();
	}
}
