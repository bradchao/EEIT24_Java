package tw.brad.java;

import java.util.HashSet;
import java.util.Iterator;

import tw.brad.myclass.Bike;

public class Brad58 {

	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<>();
		set.add("Brad");
		set.add(123);	// 123 = new Integer(123) ==> auto-boxing
		set.add(new Bike("Yellow"));
		set.add("Brad");
		set.add(12.3);
		System.out.println(set.size());
		System.out.println(set);
		
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		
		
		
		
	}

}
