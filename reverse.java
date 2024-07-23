import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class reverse {

    /**
     * @param args args takes agurment of a ip address/s to resolve to a hostname
     */
    public static void main(String[] args) {
        // List to store ip addresses to resolve
        List<String> ipList = new ArrayList<String>();

        // Add ip addresses to the list from provided arguments and trims extra content
        for (String ip : args) {
            ipList.add(ip.trim());
        }

        // Try catch to catch resolution errors
        try {

            // Loop through the list of ip addresses and resolve them to hostnames
            for (String hostName : ipList) {
                InetAddress address = InetAddress.getByName(hostName);
                String name = address.getHostName();
                // If resolve hostname is the same as the ip address, print no name
                if (name.compareTo(hostName) == 0) {
                    System.out.println(hostName + " : no name");
                    // If the hostname is not the same as the ip address, print the hostname
                } else {
                    System.out.println(hostName + " : " + address.getHostName());
                }
            }
        }
        // Catch exception if the hostname can not be resolved and prints the error
        catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
