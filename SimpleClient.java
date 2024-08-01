import java.net.*;
import java.io.*;

/**
 * This program works with simple client to communicate with the server and
 * print hostnames and IP addresses
 */
public class SimpleClient {
    /**
     * 
     * Kyle Barker
     * Student ID: 1630724
     * 
     * @param args Takes the hostname and port number as arguments
     * 
     */
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java SimpleClient <hostname> <port>");
            System.exit(1);
        }

        InetAddress ia;
        try {
            // Reads hostname arugment from command line from first argument
            String hostName = args[0];
            // Gets the IP address of the hostname
            ia = InetAddress.getByName(hostName);
            // Handles any errors and prints them to the console
        } catch (UnknownHostException e) {
            System.err.println("Unknown name for ip");
            return;
        }

        try {
            // Reads socket number from the command line from second argument
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
