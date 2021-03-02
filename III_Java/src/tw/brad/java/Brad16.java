package tw.brad.java;

public class Brad16 {

	public static void main(String[] args) {
		int[] p = new int[7];	// p[0]=0, p[1]=0, ...p[5]=0, p[6]=0
		for (int i=0; i<1000000; i++) {
			int point = (int)(Math.random()*9+1);	// 1 - 9
			
//			p[point>6?point-3:point]++;
			
			if (point == 7) {
				point = 5;
			}else if (point >= 8) {
				point = 6;
			}
			p[point]++;
			
		}
		for (int i=1; i<p.length; i++) {
			System.out.printf("%d點出現%d次\n", i, p[i]);
		}
	}

}
