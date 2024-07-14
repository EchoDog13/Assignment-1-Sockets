import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class reverse {
    public static void main(String[] args) {
        List<String> hostNameList = new ArrayList<String>();

        hostNameList.add("10.250.24.30");
        hostNameList.add("130.217.208.16");
        hostNameList.add("127.0.0.2");
        try {

            for (String hostName : hostNameList) {
                InetAddress address = InetAddress.getByName(hostName);
                String name = address.getHostName();
                if (name.compareTo(hostName) == 0) {
                    System.out.println(hostName + " : no name");
                    
                }else{
                    System.out.println(hostName + " : " + address.getHostName());
                }
            }
        }

        catch (Exception e) {
            // TODO: handle exception
            //System.out.println( + " : " + e.getMessage());
        
        }}}

