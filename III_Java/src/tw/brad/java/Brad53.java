package tw.brad.java;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Brad53 {

	public static void main(String[] args) {
		while (true) {
			byte[] buf = new byte[1024];
			try {
				DatagramSocket socket = new DatagramSocket(8888);
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				socket.close();
				
				byte[] data = packet.getData();
				int len = packet.getLength();
				String mesg = new String(data,0,len);
				InetAddress urip = packet.getAddress();
				System.out.println(urip + ":" + mesg);
				
				if (mesg.contains("quit")) {
					break;
				}
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
