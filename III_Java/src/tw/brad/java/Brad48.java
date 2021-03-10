package tw.brad.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad48 {

	public static void main(String[] args) {
		Student s1 = new Student(90, 87, 74);
		System.out.println(s1.score() +":" + s1.avg());
		
//		try(FileOutputStream fout = new FileOutputStream("dir1/s1.brad");
//				ObjectOutputStream oos = new ObjectOutputStream(fout)) {
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(
					new FileOutputStream("dir1/s1.brad"))) {
			oos.writeObject(s1);;
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}

class Student implements Serializable {
	private int ch, math, eng;
	Student(int ch, int math, int eng){
		this.ch = ch; this.math = math; this.eng = eng;
	}
	int score() {return ch + math + eng;}
	double avg() {return score() / 3.0;}
}