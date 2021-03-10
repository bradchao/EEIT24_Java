package tw.brad.java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Brad47 {
	public static void main(String[] args) {
		try {
//			FileInputStream fin = 
//				new FileInputStream("dir1/maskdata.csv");
//			InputStreamReader isr = 
//				new InputStreamReader(fin);
//			BufferedReader reader = 
//				new BufferedReader(isr);
			
//			BufferedReader reader =
//				new BufferedReader(
//					new InputStreamReader(
//						new FileInputStream("dir1/maskdata.csv")));

			BufferedReader reader = 
				new BufferedReader(
					new FileReader("dir1/maskdata.csv"));
			
			String line;
			reader.readLine();
			while ( (line = reader.readLine()) != null) {
				String[] data = line.split(",");
				
				System.out.println(data[1] +":" + data[3] +":"+
				data[4]+":"+data[5]);
			}
			reader.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
