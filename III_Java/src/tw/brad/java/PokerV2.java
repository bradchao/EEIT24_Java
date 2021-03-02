package tw.brad.java;

public class PokerV2 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int[] poker = new int[52];	// poker[0] ~ poker[51]
		boolean isRepeat;
		int rand;
		for (int i=0; i<poker.length; i++) {
			do {
				rand = (int)(Math.random()*52);	// 0 - 51;
				// 檢查機制
				isRepeat = false;
				for (int j=0; j<i; j++) {
					if (poker[j] == rand) {
						isRepeat = true;
						break;
					}
				}
			}while (isRepeat);
			
			poker[i] = rand;
			System.out.println(poker[i]);
		}
		System.out.println("------");
		System.out.println(System.currentTimeMillis() - start);
	}

}
