import java.net.*;
import java.io.*;

public class SimpleClient {
    public static void main(String[] args) {
        InetAddress ia;
        try {
            ia = InetAddress.getByName("lab-rg06-26.cms.waikato.ac.nz");
        } catch (UnknownHostException e) {
            System.err.println("Unknown name for ip");
            return;
        }

        Socket sock;

        try {
            sock = new Socket(ia, 31447);
            PrintWriter writer = new PrintWriter(sock.getOutputStream(), true);
            writer.println(args[0]);
            BufferedReader read = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            read.lines().forEach(System.out::println);

            sock.close();
        } catch (IOException e) {
            System.err.println(("IO Execption" + e));
            return;
        }
    }
}