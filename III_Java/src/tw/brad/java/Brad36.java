package tw.brad.java;
public class Brad36 {
	public static void main(String[] args) {
		Brad363 obj1 = new Brad363();
		obj1.m1();
	}
}
class Brad361 {
	static{System.out.println("Brad361:static{}");}
	{System.out.println("Brad361:{}");}
	Brad361(){System.out.println("Brad361()");}
}
class Brad362 extends Brad361 {
	static{System.out.println("Brad362:static{}");}
	Brad362(){System.out.println("Brad362()");}
	{System.out.println("Brad362:{}");}
}
class Brad363 extends Brad362 {
	Brad363(){System.out.println("Brad363()");}
	{System.out.println("Brad363:{}");}
	void m1() {
		int i = 10;
		System.out.println(i);
		{
			int j = 3;
			System.out.println(j);
		}
		//System.out.println(j);
	}
}