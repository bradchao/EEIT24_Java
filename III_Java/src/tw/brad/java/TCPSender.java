package tw.brad.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPSender {

	public static void main(String[] args) {
		try {
			File source = new File("dir1/coffee.jpg");
			FileInputStream fin = 
				new FileInputStream(source);
			byte[] buf = new byte[(int)source.length()];
			fin.read(buf);
			fin.close();
			//--------------------------
			Socket socket = new Socket(
				InetAddress.getByName("10.0.103.94"), 9999);
			OutputStream os =  socket.getOutputStream();
			os.write(buf);
			os.flush();
			os.close();
			socket.close();
			System.out.println("TCP Send OK");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
