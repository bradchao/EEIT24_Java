package tw.brad.java;

public class Brad33 {
	public static void main(String[] args) {

	}
}

interface Brad331 {
	void m1();
	void m2();
}
class Brad332 implements Brad331 {
	public void m1() {}
	public void m2() {}
}
interface Brad333 {
	void m3();
	void m4();
}
abstract class Brad334 implements Brad331, Brad333 {
	public void m1() {}
	public void m2() {}
	public void m3() {}
	//public void m4() {}
}
class Brad335 extends Brad334 {
	public void m4() {}
}



