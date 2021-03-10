package tw.brad.java;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Brad52 {

	public static void main(String[] args) {
		String mesg = "Hello, World";
		byte[] buf = mesg.getBytes();
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(
					buf, buf.length,
					InetAddress.getByName("10.0.103.94"), 8888);
			socket.send(packet);
			socket.close();
			System.out.println("UDP send OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
