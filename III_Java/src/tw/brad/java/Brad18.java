package tw.brad.java;

public class Brad18 {

	public static void main(String[] args) {
		// 1 + 2 + ... + 10 = ?
		int i = 1;
		int end = 9487;
		int sum = 0;
//		while (i <= end) {
//			sum += i++;
//		}
		
		for (;i<=end;) {
			sum += i++;
		}
		System.out.println(sum);
		
	}

}
