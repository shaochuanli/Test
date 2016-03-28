package com.chuan.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		int[] array = {};
		Object o = new Object();
		ArrayList[] arrayList = new ArrayList[8];
		Vector<String> vector = new Vector<String>();
		List<String> list = new ArrayList<String>();
		String str = new String("str");
		HashMap<String, String> hashMap = new HashMap<String, String>();
		Hashtable<String, String> hashTable = new Hashtable<String, String>();
		TreeMap<String, Object> treeMap = new TreeMap<String, Object>();

		Map<String, String> map = Collections.<String, String> synchronizedMap(hashMap);
	}
}
