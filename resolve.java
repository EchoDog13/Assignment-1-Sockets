import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class resolve{
    public static void main(String[] args) {
        List<String> hostNameList = new ArrayList<String>();

        hostNameList.add("www.google.com");
        hostNameList.add("www.facebook.com");
        hostNameList.add("invalidname.waikato.ac.nz");
      for (String hostName : hostNameList) {
        try {
            InetAddress address = InetAddress.getByName(hostName);

            System.out.println(hostName + " : " + address.getHostAddress());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(hostName + " : " + e.getMessage());
        }}
    }
}