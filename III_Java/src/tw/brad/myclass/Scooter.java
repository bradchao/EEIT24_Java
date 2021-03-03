package tw.brad.myclass;

public class Scooter extends Bike {
	public Scooter() {
		super(1,2);
		System.out.println("Scooter()");
	}
	
	public void upSpeed() {
		speed = speed < 1? 2: speed*2;
	}
}
