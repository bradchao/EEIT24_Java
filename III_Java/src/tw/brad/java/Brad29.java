package tw.brad.java;

public class Brad29 {

	public static void main(String[] args) {
		m1();
		new Brad29().m2();
	}
	
	public void main(int[] args) {
		m1();
		m2();
	}
	
	static void m1() {
		System.out.println("m1()");
	}

	void m2() {
		System.out.println("m2()");
	}
}
