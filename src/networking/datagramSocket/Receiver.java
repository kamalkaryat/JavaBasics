package networking.datagramSocket;
import java.io.IOException;
import java.net.*;

public class Receiver extends Thread{
	public void run() {
		try {
			System.out.println("Receiver starts");	//Debug statement
			//3000->Port No
			DatagramSocket ds=new DatagramSocket(3000);
			byte[] buffer= new byte[1024];
			DatagramPacket dp=new DatagramPacket(buffer,1024);
			try {
				//Receiving the datagram/packet
				ds.receive(dp);
			} catch (IOException e) {
				e.printStackTrace();
			}
			//Fetching data from datagram/packet to a string variable
			String data=new String(dp.getData(),0,dp.getLength());
			System.out.println(data);
			//closing the socket
			ds.close();
			System.out.println("Receiver ends");	//Debug statement
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}	
}
