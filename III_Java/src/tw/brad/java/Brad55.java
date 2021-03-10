package tw.brad.java;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Brad55 {

	public static void main(String[] args) {
		try {
			Socket socket = 
				new Socket(InetAddress.getByName("10.0.103.94"), 7777);
			socket.close();
			System.out.println("TCP Send OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
