package tw.brad.java;

public class PokerV1 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int[] poker = new int[52];	// poker[0] ~ poker[51]
		for (int i=0; i<poker.length; i++) {
			int rand = (int)(Math.random()*52);	// 0 - 51;
			// 檢查機制
			boolean isRepeat = false;
			for (int j=0; j<i; j++) {
				if (poker[j] == rand) {
					isRepeat = true;
					break;
				}
			}
			if (!isRepeat) {
				poker[i] = rand;
				System.out.println(poker[i]);
			}else {
				i--;
			}
		}
		System.out.println("------");
		System.out.println(System.currentTimeMillis() - start);
	}

}
