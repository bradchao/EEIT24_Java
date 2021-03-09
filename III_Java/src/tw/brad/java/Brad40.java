package tw.brad.java;

import java.io.File;
import java.io.FileInputStream;

public class Brad40 {

	public static void main(String[] args) {
		try {
			File file = new File("dir1/brad1.txt");
			FileInputStream fin = 
					new FileInputStream(file);
			
//			int c; 
//			while ( (c = fin.read()) != -1 ) {
//				System.out.print((char)c);
//			}
			
//			byte[] buf = new byte[10]; int len=0;
//			while ( (len = fin.read(buf)) != -1) {
//				System.out.print(new String(buf, 0, len));
//			}

			byte[] buf = new byte[(int)file.length()];
			fin.read(buf);
			System.out.println(new String(buf));
			
			fin.close();
			//System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
