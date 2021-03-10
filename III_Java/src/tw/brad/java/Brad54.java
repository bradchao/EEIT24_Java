package tw.brad.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad54 {

	public static void main(String[] args) {
		while (true) {
			try {
				ServerSocket server = new ServerSocket(7777);
				Socket socket = server.accept();
				//-----------------------
				InetAddress urip = socket.getInetAddress();
				BufferedReader reader = 
					new BufferedReader(
						new InputStreamReader(
							socket.getInputStream()));
				String line; StringBuffer sb = new StringBuffer();
				while ( (line = reader.readLine()) != null) {
					sb.append(line + "\n");
				}
				reader.close();
				//-----------------------
				server.close();
				
				System.out.println(urip + ":" + sb);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
