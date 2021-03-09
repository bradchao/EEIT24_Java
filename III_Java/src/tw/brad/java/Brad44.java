package tw.brad.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad44 {

	public static void main(String[] args) {
		File source = new File("dir1/coffee.jpg");
		File target = new File("dir1/dir2/brad.jpg");
		try {
			FileInputStream fin =
					new FileInputStream(source);
			byte[] buf = new byte[(int)source.length()];
			fin.read(buf);
			fin.close();
			
			FileOutputStream fout = 
					new FileOutputStream(target);
			fout.write(buf);
			fout.flush();
			fout.close();
			
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
