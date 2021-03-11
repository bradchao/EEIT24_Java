package tw.brad.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Brad59 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		while (set.size()<6) {
			int rand = (int)(Math.random()*49+1);
			set.add(rand);
		}
		
		for (Integer i : set) {
			System.out.println(i);
		}
	}

}
