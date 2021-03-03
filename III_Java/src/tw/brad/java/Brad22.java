package tw.brad.java;

import tw.brad.myclass.Scooter;

public class Brad22 {

	public static void main(String[] args) {
		Scooter scooter = new Scooter();
		scooter.upSpeed();
		scooter.upSpeed();
		System.out.println(scooter.getSpeed());
		scooter.downSpeed();
		System.out.println(scooter.getSpeed());
	}

}
