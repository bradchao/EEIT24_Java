package tw.brad.java;

public class Brad31 {
	public static void main(String[] args) {
		Brad311 obj1 = new Brad311();
		Brad312 obj2 = new Brad312();
		obj1.m1();
		obj2.m1();
		obj2.m2();
		Brad311 obj3 = new Brad312();
		obj3.m1();
		Brad312 obj4 = (Brad312)obj3;
		obj4.m1();
		obj4.m2();
		Brad311 obj5 = new Brad312();
		Brad314 obj6 = (Brad314)obj5;
		
	}
}
class Brad311 {
	Brad311(){System.out.println("Brad311()");}
	void m1() {System.out.println("Brad311:m1()");}
}
class Brad312 extends Brad311 {
	Brad312(){System.out.println("Brad312()");}
	void m1() {System.out.println("Brad312:m1()");}
	void m2() {System.out.println("Brad312:m2()");}
}
class Brad313 extends Brad312 {
	
}
class Brad314 extends Brad311 {
	Brad314(){System.out.println("Brad314()");}
	void m1() {System.out.println("Brad314:m1()");}
	void m2() {System.out.println("Brad314:m2()");}
}
