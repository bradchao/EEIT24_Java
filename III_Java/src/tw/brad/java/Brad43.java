package tw.brad.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad43 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = 
					new FileOutputStream("dir1/dir2/brad.jpg");
			FileInputStream fin =
				new FileInputStream("dir1/coffee.jpg");
			byte[] buf = new byte[4*1024]; int len = 0;
			while ((len = fin.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			fin.close();
			
			fout.flush();
			fout.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
