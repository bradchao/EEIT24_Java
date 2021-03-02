package tw.brad.java;

public class Brad20 {

	public static void main(String[] args) {
		int[] a = {10, 3};
		int c;
		c = a[0];
		a[0] = a[1];
		a[1] = c;
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
