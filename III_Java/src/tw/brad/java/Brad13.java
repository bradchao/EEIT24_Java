package tw.brad.java;

public class Brad13 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int j=0; j<=9; j++) {
			for (int i=1; i<=10; i++) {
				int n = i + j * 10;
				// �ˬd�O�_�����
				boolean isPrime = true;
				for (int k = 2; k<n; k++) {
					if (n % k == 0) {
						// �ˬd��F, �Qk���㰣
						isPrime = false;
						break;
					}
				}
				System.out.print(n + (isPrime?"*":" ") + " ");
			}
			System.out.print("\n");
		}
		System.out.println(System.currentTimeMillis() - start);
	}

}
