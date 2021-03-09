package tw.brad.java;

public class Brad38 {

	public static void main(String[] args) {
		int[] c = {1,2,3};
		int a = 10, b = 0;
		try {
			System.out.println(a / b);
			System.out.println(c[7]);
		}catch(ArithmeticException e) {
			System.out.println("not much");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("debug");
		}
		System.out.println("finish");
	}

}
