package tw.brad.java;

public class Brad08 {

	public static void main(String[] args) {
		int score = (int)(Math.random()*101);
		System.out.println(score);
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		}else if (score >= 70) {
			System.out.println("C");
		}else if (score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
		
		//if (score >= 60) System.out.println("OK");
		
		
	}

}
