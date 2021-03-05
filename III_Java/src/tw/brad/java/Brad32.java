package tw.brad.java;

public class Brad32 {
	public static void main(String[] args) {
		Brad321 obj1 = new Brad322();
		Brad321 obj2 = new Brad323();
		doSomething(obj1);
		doSomething(obj2);
	}
	
	static void doSomething(Brad321 obj) {
		obj.m1();
		obj.m2();
	}
}
abstract class Brad321 {
	void m1() {System.out.println("Brad321:m1()");}
	abstract void m2();
	final void m3() {System.out.println("Brad321:m3()");}
}
class Brad322 extends Brad321 {
	void m2() {System.out.println("Brad322:m2()");}
	// void m3() {}
}
class Brad323 extends Brad321 {
	void m2() {System.out.println("Brad323:m2()");}
}
