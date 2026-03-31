package networking.datagramSocket;
import java.io.IOException;
import java.net.*;
public class Sender extends Thread{
	public void run() {
		try {
			System.out.println("Sender starts");
			DatagramSocket ds=new DatagramSocket();
			//Message sended by sender to receiver
			String data="I am the sender socket & trying to send some data";
			try {
				InetAddress ip=InetAddress.getByName("localhost");
				//creating a datagram/packet
				DatagramPacket dp=new DatagramPacket(data.getBytes(),data.length(),ip,3000);
				//sending the packet
				ds.send(dp);
			} catch (IOException e) {
				e.printStackTrace();
			}
			//closing the socket
			ds.close();
			System.out.println("Sender ends");
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
}