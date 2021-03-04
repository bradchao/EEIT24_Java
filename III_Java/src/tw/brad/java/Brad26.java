package tw.brad.java;

import tw.brad.myclass.TWId;

public class Brad26 {

	public static void main(String[] args) {
		TWId id1 = new TWId();
		TWId id2 = new TWId(true);
		TWId id3 = new TWId(21);
		TWId id4 = new TWId(false, 12);
		TWId id5 = TWId.createTWId("A123456780");
		if (id5 != null) {
			System.out.println("create ok");
		}else {
			System.out.println("create failure");
		}
		
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
		
//		if (TWId.checkID(strId)) {
//			System.out.println("OK");
//		}else {
//			System.out.println("XX");
//		}
	}

}
