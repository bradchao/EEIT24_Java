package tw.brad.java;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPReceiver {
	public static void main(String[] args) {
		while (true) {
			try {
				ServerSocket server = new ServerSocket(9999);
				System.out.println("Server wait...");
				Socket socket = server.accept();
	
				InetAddress urip = socket.getInetAddress();
				
				FileOutputStream fout = new FileOutputStream("dir1/dir2/" + urip + ".jpg");
	
				InputStream in = socket.getInputStream();
				byte[] buf = new byte[4*1024*1024];	// buf[0] = 0, ...buf[n]=0
				int len = 0;
				while ( (len = in.read(buf)) != -1) {
					// buf, 0, len
					fout.write(buf, 0, len);
				}
				in.close();
				
				fout.flush();
				fout.close();
				
				server.close();
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
