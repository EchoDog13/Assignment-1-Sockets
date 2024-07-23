import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This program resolves the hostname to IP address using the InetAddress class
 * in Java
 * To use the program, provide the hostname as an argument
 */
public class resolve {

    /**
     * @param args takes agurment of a hostname
     */
    public static void main(String[] args) {

        // List to store hostnames
        List<String> hostNameList = new ArrayList<String>();

        // Add hostnames to the list from provided arguments
        for (String hostname : args) {
            // Add hostname/s to list and trims extra content
            hostNameList.add(hostname.trim());
        }

        for (String hostName : hostNameList) {
            try {
                // Create instance of InetAddress to get IP of the host name
                InetAddress address = InetAddress.getByName(hostName);

                // Get the IP address of the hostname
                String ip = address.getHostAddress();
                // Print the hostname and IP address
                System.out.println(hostName + " : " + ip);
            } catch (Exception e) {
                // Handle exception if the hostname can not be resolved
                System.out.println(hostName + " : unknown host");
            }
        }
    }
}