package tw.brad.java;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Brad49 {

	public static void main(String[] args) {
		try (ObjectInputStream oin = 
				new ObjectInputStream(
					new FileInputStream("dir1/s1.brad"))){
			Object obj = oin.readObject();
			Student s2 = (Student)obj;
			System.out.println(s2.score() +":" +s2.avg());
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
