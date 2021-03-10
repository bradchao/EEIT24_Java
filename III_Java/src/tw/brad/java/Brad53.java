package tw.brad.java;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Brad53 {

	public static void main(String[] args) {
		byte[] buf = new byte[1024];
		try {
			DatagramSocket socket = new DatagramSocket(8888);
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			socket.receive(packet);
			socket.close();
			System.out.println("UDP Receive OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
