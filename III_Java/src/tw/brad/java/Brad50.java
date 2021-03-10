package tw.brad.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad50 {

	public static void main(String[] args) {
		Brad503 obj = new Brad503();
		try {
			ObjectOutputStream oos = 
				new ObjectOutputStream(
					new FileOutputStream("dir1/obj1.brad"));
			oos.writeObject(obj);
			oos.flush();
			oos.close();
			System.out.println("save ok");
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("-----------------");
		try {
			ObjectInputStream oin = 
				new ObjectInputStream(
					new FileInputStream("dir1/obj1.brad"));
			Object obj1 = oin.readObject();
			oin.close();
			System.out.println("read OK");
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
class Brad501 implements Serializable {
	Brad501(){System.out.println("Brad501()");}
}
class Brad502 extends Brad501 {
	Brad502(){System.out.println("Brad502()");}
}
class Brad503 extends Brad502 {
	private Brad brad = new Brad();
	Brad503(){System.out.println("Brad503()");}
}
class Brad implements Serializable {
	
}
