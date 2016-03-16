package com.chuan.jd.jd2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ContainTest {
	public void getRepeat() {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Job");
		map1.put(2, "Tom");
		map1.put(3, "Jerry");
		map1.put(5, "John");

		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(1, "Job");
		map2.put(3, "Steve");
		map2.put(4, "Jason");
		map2.put(5, "John");
		map2.put(2, "Tom");

		Set<Integer> set1 = map1.keySet();
		Set<Integer> set2 = map2.keySet();
		set1.retainAll(set2);

		Set<Integer> romveSet = new HashSet<Integer>();
		Iterator<Integer> it = set1.iterator();
		while (it.hasNext()) {
			int i = it.next();
			if (map1.get(i).equals(map2.get(i))) {
				romveSet.add(i);
			}
		}
		System.out.println(romveSet);
	}

	public static void main(String[] args) {
		new ContainTest().getRepeat();
	}
}
