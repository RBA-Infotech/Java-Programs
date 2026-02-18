package JavaIO;

import java.io.*;
import java.net.*;

public class TCPServer {
	public static void main(String[] args) {
		try (ServerSocket serverSocket = new ServerSocket(5000)) {
			System.out.println("Server started. Waiting for client...");
			Socket socket = serverSocket.accept(); // Accept client connection
			System.out.println("Client connected.");

			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

			String message = in.readLine();
			System.out.println("Received: " + message);

			out.println("Hello from Server!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
