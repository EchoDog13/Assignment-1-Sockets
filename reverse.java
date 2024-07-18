import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class reverse {
    public static void main(String[] args) {
        List<String> ipList = new ArrayList<String>();

        for (String ip : args) {
            ipList.add(ip.trim());
        }

        try {

            for (String hostName : ipList) {
                InetAddress address = InetAddress.getByName(hostName);
                String name = address.getHostName();
                if (name.compareTo(hostName) == 0) {
                    System.out.println(hostName + " : no name");

                } else {
                    System.out.println(hostName + " : " + address.getHostName());
                }
            }
        }

        catch (Exception e) {
            // TODO: handle exception
            // System.out.println( + " : " + e.getMessage());

        }
    }
}
