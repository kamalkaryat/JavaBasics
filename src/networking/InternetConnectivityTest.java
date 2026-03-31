package networking;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class InternetConnectivityTest {
    public static void main(String[] args) {
        URL url;
        try {
            url = new URL("http://www.google.com");
            URLConnection conn=url.openConnection();
            conn.connect();
            System.out.println("Internet is available");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
