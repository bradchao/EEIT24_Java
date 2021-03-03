package tw.brad.myclass;

public class Bike extends Object{
	// 屬性
	private double speed, speed2;
	private String color;
	
	// 建構式
//	public Bike() {
//		System.out.println("Bike()");
//		color = "White";
//	}
	public Bike(double speed, double speed2) {
		super();
		System.out.println("Bike(double,double)");
		this.speed = speed;
		this.speed2 = speed2;
		//speed = s;
	}
	public Bike(String initColor) {
		super();
		color = initColor;
	}
	public Bike(double speed, String initColor) {
		super();
		this.speed = speed;
		color = initColor;
	}
	// 方法
	public void upSpeed() {
		speed = speed < 1? 1 : speed * 1.2;
	}
	public void upSpeed(double rate) {
		speed = speed < 1? 1 : speed * rate;
	}
	public void downSpeed() {
		speed = speed < 1? 0 : speed * 0.7;
	}
	public double getSpeed() {
		return speed;
	}
	public String getColor() {
		return color;
	}
	
}
