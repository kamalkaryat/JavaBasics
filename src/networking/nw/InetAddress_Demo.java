package networking.nw;
import java.net.*;
public class InetAddress_Demo {
	public static void main(String[] args) {
		try {
			InetAddress ina=InetAddress.getByName("www.google.com");
			System.out.println("Host Address: "+ina.getHostAddress());
			System.out.println("Host Name: "+ina.getHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
}
