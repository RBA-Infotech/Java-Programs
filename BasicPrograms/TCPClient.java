package JavaIO;

import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            out.println("Hello from Client!");
            System.out.println("Server replied: " + in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
