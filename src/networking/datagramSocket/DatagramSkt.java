package networking.datagramSocket;
import java.net.*;
/**
 *	DatagramSocket is based on UDP 
 *	Msg is exchanged in the form of Datagrams/Packets
 */
public class DatagramSkt {
	public static void main(String[] argv) {
		Sender s= new Sender();
		Receiver r= new Receiver();
		s.start();
		r.start();
	}
}
