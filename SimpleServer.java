import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {

        try {

            ServerSocket server = new ServerSocket(31467);
            System.out.println("Server listening on : port 31147");

            while (true) {
                Socket s = server.accept();
                BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));

                InetAddress clientAddress = s.getInetAddress();
                String clientIP = clientAddress.getHostAddress();

                String clientHostname = clientAddress.getHostName();

                // respond to client with client IP and hostname to the client

                // System.out.println("Client IP:" + clientIP);
                PrintWriter writer = new PrintWriter(s.getOutputStream(), true);
                writer.println("Hello, " + clientHostname);
                writer.println("Your IP is: " + clientIP);
                String in = reader.readLine();
                writer.println("You said: " + in);

            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
