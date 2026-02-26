package JVMArchitechture;

public class MinAndMaxHeap {
	
	public static void main(String[] args) {
	
		long initialHeapSize = Runtime.getRuntime().totalMemory();
		long maxHeapSize = Runtime.getRuntime().maxMemory();

		System.out.println("Initial Heap Size: " + initialHeapSize + " Bytes");
		System.out.println("Initial Heap Size: " + initialHeapSize / (1024 * 1024) + " MB");
		System.out.println("Max Heap Size: " + maxHeapSize + " Bytes");
		System.out.println("Max Heap Size: " + maxHeapSize / (1024 * 1024) + " MB");

	}
}
