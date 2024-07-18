import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class resolve {
    public static void main(String[] args) {
        // String line;
        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

        System.out.println("$ java resolve");

        List<String> hostNameList = new ArrayList<String>();

        for (String hostname : args) {

            hostNameList.add(hostname.trim());
        }

        for (String hostName : hostNameList) {
            try {
                InetAddress address = InetAddress.getByName(hostName);
                String ip = address.getHostAddress();

                System.out.println(hostName + " : " + ip);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(hostName + " : unknown host");
            }
        }
    }
}