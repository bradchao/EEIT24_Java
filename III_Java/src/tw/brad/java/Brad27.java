package tw.brad.java;

public class Brad27 {

	public static void main(String[] args) {
		String a = "Brad";
		String b = a.concat("Chao");
		System.out.println(b);
		System.out.println(a);
		String c = a.replace('a', 'x');
		System.out.println(c);
		System.out.println(a);
		System.out.println("-----");
		StringBuffer sb = new StringBuffer("Brad");
		System.out.println(sb);
		sb.append("Chao");
		sb.append("Hello");
		sb.replace(1, 3, "XX");
		System.out.println(sb);
		
		
	}

}
