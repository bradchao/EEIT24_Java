package tw.brad.java;

public class Brad30 {
	public static void main(String[] brad) {
		Brad301 obj1 = new Brad301(2);
		Brad302 obj2 = new Brad302();
		obj2.m1();
		obj2.m1((byte)2);
		byte b1 = 12, b2 = 13;
		obj2.m1(b1);
		//obj2.m1(b1, b2);
	}
}

class Brad301 {
	Brad301(int a){}
	void m1() {
		System.out.println("Brad301:m1()");
	}
	private void m3() {
		System.out.println("Brad301:m3()");
	}
}
class Brad302 extends Brad301 {
	Brad302(){
		// super();
		super(1);
	}
	Brad302(int a){
		this();
	}
	Brad302(String b){
		this(2);
	}
	void m1() {
		//super.m1();
		System.out.println("Brad302:m1()");
		//super.m1();
	}
//	void m1(int gear) {
//		System.out.println("Brad302:m1(int)");
//	}
	void m1(byte b) {
		System.out.println("Brad302:m1(byte)");
	}
	
	void m1(byte b1, int a1) {
		System.out.println("Brad302:m1(byte,int)");
	}
	void m1(int a1, byte b1) {
		System.out.println("Brad302:m1(int,byte)");
	}
	
	private void m3() {
		//super.m3() x
	}
}
