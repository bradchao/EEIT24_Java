package tw.brad.java;

public class Brad25 {

	public static void main(String[] args) {
		String s1 = "Brad";
		String s2 = "Brad";
		System.out.println(s1 == s2);
		String s3 = new String("Brad");
		String s4 = new String("Brad");
		System.out.println(s3 == s4);
		System.out.println(s3 == s1);
	}

}
