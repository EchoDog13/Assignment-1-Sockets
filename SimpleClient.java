import java.net.*;
import java.io.*;

public class SimpleClient {
    public static void main(String[] args) {
        InetAddress ia;
        try {
            // Reads hostname arugment from command line
            String hostName = args[0];
            // Gets the IP address of the hostname
            ia = InetAddress.getByName(hostName);
            // Handles any errors and prints them to the console
        } catch (UnknownHostException e) {
            System.err.println("Unknown name for ip");
            return;
        }



        try {
            // Reads socket number from the command line
            int socket = Integer.parseInt(args[1]);

            // Attempts to connect to the server
            Socket sock = new Socket(ia, socket);
 
           // print the response from the server
            BufferedReader read = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            read.lines().forEach(System.out::println);
            // Closes the socket
            sock.close();
        } catch (IOException e) {
            System.err.println(("IO Execption" + e));
            return;
        }
    }
}
