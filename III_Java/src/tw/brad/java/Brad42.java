package tw.brad.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad42 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = 
					new FileOutputStream("dir1/dir2/brad.jpg");
			FileInputStream fin =
				new FileInputStream("dir1/coffee.jpg");
			int b;
			while ((b = fin.read()) != -1) {
				fout.write(b);
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
