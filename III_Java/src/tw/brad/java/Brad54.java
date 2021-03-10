package tw.brad.java;

import java.net.ServerSocket;
import java.net.Socket;

public class Brad54 {

	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(7777);
			Socket socket = server.accept();
			server.close();
			System.out.println("TCP Receive OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
