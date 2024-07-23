import java.io.*;
import java.net.*;

public class SimpleServer {

    /**
     * @param args
     */
    public static void main(String[] args) {

        try {
            // Constant of port number
            final int port = 31446;
            // Create a server socket
            ServerSocket server = new ServerSocket(port);
            // Outputs to console the port the server is listening on
            System.out.println("Server listening on port" + port);

            // Loop to accept client connections forever
            while (true) {
                // Accept client connection
                Socket s = server.accept();
                // Create a reader to read data from the client
                BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));

                // Gets Inet address of the client
                InetAddress clientAddress = s.getInetAddress();
                // Gets IP of the client
                String clientIP = clientAddress.getHostAddress();
                // Gets hostname of the client
                String clientHostname = clientAddress.getHostName();

                // Prints the IP and hostname of the client to the console of the client
                PrintWriter writer = new PrintWriter(s.getOutputStream(), true);
                writer.println("Hello, " + clientHostname);
                writer.println("Your IP is " + clientIP);
                writer.close();

            }
        } catch (Exception e) {
            // Handle unexpected exceptions
            System.out.println("Error:" + e.getMessage());
        }

    }
}
