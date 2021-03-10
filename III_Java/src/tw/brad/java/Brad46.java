package tw.brad.java;

import java.io.FileWriter;
import java.io.IOException;

public class Brad46 {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("dir1/brad2.txt");
			writer.write("您好, 全世界");
			writer.flush();
			writer.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
