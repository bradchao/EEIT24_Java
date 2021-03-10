package tw.brad.java;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Brad55 {

	public static void main(String[] args) {
		try {
			Socket socket = 
				new Socket(InetAddress.getByName("10.0.103.94"), 7777);
			//---------------------------------------
			BufferedWriter writer = 
				new BufferedWriter(
					new OutputStreamWriter(socket.getOutputStream()));
			writer.write("Hello, III");
			writer.flush();
			writer.close();
			//---------------------------------------------------
			socket.close();
			System.out.println("TCP Send OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
