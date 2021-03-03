package tw.brad.java;

import tw.brad.myclass.Bike;

public class Brad24 {

	public static void main(String[] args) {
		String s1 = new String("Brad");
		String s2 = new String("Brad");
		System.out.println(s1);
		System.out.println(s2);
		Bike b1 = new Bike("Red");
		System.out.println(b1);
		
		System.out.println(s1.equals(s2));
		int a = 10, b = 10;
		System.out.println(a == b);
		
	}

}
