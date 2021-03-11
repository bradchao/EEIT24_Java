package tw.brad.java;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Brad57 {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://pdfmyurl.com/?url=http://www.gamer.com.tw");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();

			FileOutputStream fout = new FileOutputStream("dir1/gamer.pdf");
			InputStream in = conn.getInputStream();
			byte[] buf = new byte[4*1024];
			int len;
			while ( (len = in.read(buf)) != -1) {
				// buf, 0, len
				fout.write(buf,0,len);
			}
			in.close();
			fout.flush();
			fout.close();
			
			System.out.println("download OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
