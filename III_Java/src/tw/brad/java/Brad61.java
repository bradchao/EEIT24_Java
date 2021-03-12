package tw.brad.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Brad61 {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("name", "Brad");
		map.put("gender", true);
		map.put("weight", 80);
		System.out.println(map.size());
		System.out.println(map.get("name"));
		map.put("name", "Andy");
		System.out.println(map.get("name"));
		Set keys = map.keySet();
		for (Object key : keys) {
			System.out.println(key +":" + map.get(key));
		}
		
		
	}

}
