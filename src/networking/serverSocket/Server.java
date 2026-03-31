package networking.serverSocket;
import java.io.IOException;
import java.net.*;
/*	Server side socket	*/
public class Server extends Thread{
	public void run() {
		try {
			System.out.println("Sender starts");	//Debug statement
			//ServerSocket ss=new ServerSocket();
			DatagramSocket ds=new DatagramSocket();
			String data="I am the sender socket & trying to send some data";
			try {
				InetAddress ip=InetAddress.getByName("localhost");
				DatagramPacket dp=new DatagramPacket(data.getBytes(),data.length(),ip,3000);
				ds.send(dp);
			} catch (IOException e) {
				e.printStackTrace();
			}
			ds.close();
			System.out.println("Sender ends");	//Debug statement
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}