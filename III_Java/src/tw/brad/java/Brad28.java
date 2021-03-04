package tw.brad.java;

public class Brad28 {
	public static void main(String[] args) {
		new Brad281();
		new Brad281();
		new Brad281();
		new Brad281();
	}
}

class Brad281 {
	int a = 10;
	Brad281(){
		System.out.println("Brad281()");
	}
	void m1() {System.out.println("Brad281:m1()");}
	static void m2() {System.out.println("Brad281:m2()");}
	{
		System.out.println("{}" +a);
	}
	static {
		System.out.println("static{}");
	}
}
class Brad282 extends Brad281 {
	
}
