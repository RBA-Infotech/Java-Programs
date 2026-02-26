package JavaIO;

import java.nio.ByteBuffer;

public class BufferDemo {
	public static void main(String[] args) {
		ByteBuffer buffer = ByteBuffer.allocate(1024); // Allocate a buffer

		// Write data into buffer
		buffer.put("Hello, NIO!".getBytes());

		// Prepare for reading
		buffer.flip();

		// Read data from buffer
		while (buffer.hasRemaining()) {
			System.out.print((char) buffer.get());
		}
	}
}
