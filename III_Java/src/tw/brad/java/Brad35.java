package tw.brad.java;

public class Brad35 {
	public static void main(String[] args) {
		House h = new House();
	}
}
class House {
	private Window w1;
	House(){
		System.out.println("House()");
		Window w2 = new Window(2);
		w1 = new Window(1);
	}
	private Window w3 = new Window(3);
}
class Window {
	Window(int i){
		System.out.println("Window():" + i);
	}
	void m1() {}
}