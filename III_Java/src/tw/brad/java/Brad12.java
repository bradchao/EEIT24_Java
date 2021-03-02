package tw.brad.java;

public class Brad12 {
	public static void main(String[] args) {
		int a = 1;
		for (initFor();  ; drawLine() ) {
			System.out.println(a++);
		}
		//System.out.println("----");
		//System.out.println(a);
	}
	
	static void initFor() {
		System.out.println("Brad");
		System.out.println("OK");
	}
	static void drawLine() {
		System.out.println("---");
	}
	
	
}
