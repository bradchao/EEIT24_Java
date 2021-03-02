package tw.brad.java;

import java.util.Scanner;

public class Brad03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("a = ? ");
		int a = scanner.nextInt();
		System.out.print("b = ? ");
		int b = scanner.nextInt();
		
		int v1 = a + b;
		int v2 = a - b;
		int v3 = a * b;
		int v4 = a / b;
		int v5 = a % b;
		System.out.println(
				String.format("%d + %d = %d", a, b, v1));
		System.out.println(
				String.format("%d - %d = %d", a, b, v2));
		System.out.println(
				String.format("%d x %d = %d", a, b, v3));
		System.out.println(
				String.format("%d / %d = %d ... %d", a, b, v4, v5));
	}

}
