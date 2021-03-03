package tw.brad.java;

import tw.brad.myclass.Bike;

public class Brad21 {

	public static void main(String[] args) {
		Bike myBike, urBike;
		//myBike = new Bike(); 
		urBike = new Bike(1.23, 3.14);
		//System.out.println(myBike.getSpeed());
		System.out.println(urBike.getSpeed());
		
		//myBike.upSpeed();myBike.upSpeed(2);myBike.upSpeed(3);
		urBike.upSpeed();urBike.upSpeed();urBike.downSpeed();
		
		//System.out.println(myBike.getSpeed());
		System.out.println(urBike.getSpeed());
		
//		myBike.speed = 10.1;
//		System.out.println(myBike.speed);
		
	}

}
