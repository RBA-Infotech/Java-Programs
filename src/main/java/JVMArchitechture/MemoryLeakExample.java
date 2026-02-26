package JVMArchitechture;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeakExample {
	private static List<byte[]> leak = new ArrayList<>();

	public static void main(String[] args) {
		while (true) {
			byte[] b = new byte[1024 * 1024]; // Allocate 1MB
			leak.add(b); // Retain the object in the static list
			System.out.println("Allocated memory: " + leak.size() + " MB");
		}
	}
}
