package tw.brad.java;

import tw.brad.myclass.TWId;

public class Brad26 {

	public static void main(String[] args) {
		TWId id = new TWId(true, 0);
		String strId = id.getId();
		System.out.println(id.getId());
		if (TWId.checkID(strId)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
	}

}
