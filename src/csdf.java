import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.util.Date;

public class csdf {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println(String.valueOf(InetAddress.getLocalHost()));
    }
}
