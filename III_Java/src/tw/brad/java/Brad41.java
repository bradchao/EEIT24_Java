package tw.brad.java;

import java.io.FileOutputStream;

public class Brad41 {

	public static void main(String[] args) {
		String data = "1234567\n";
		try {
			FileOutputStream fout = 
				new FileOutputStream("dir1/brad2.txt", true);
			fout.write(data.getBytes());
			fout.flush();
			fout.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
