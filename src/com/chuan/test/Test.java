package com.chuan.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

import com.chuan.sort.KuaiSu;

public class Test {

	public static void ks(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 9, 15, 3, 7, 2, 1, 7, 3 };
		Test.ks(array);
		System.out.println(Arrays.toString(array));

		// int[] array = {};
		Object[] o = new Object[] { 1, 2 };
		ArrayList[] arrayList = new ArrayList[8];
		Vector<String> vector = new Vector<String>();
		List<String> list = new ArrayList<String>();
		String str = new String("str");
		HashMap<String, String> hashMap = new HashMap<String, String>();
		Hashtable<String, String> hashTable = new Hashtable<String, String>();
		TreeMap<String, Object> treeMap = new TreeMap<String, Object>();

		Map<String, String> map = Collections.<String, String> synchronizedMap(hashMap);
		ConcurrentHashMap conMap = new ConcurrentHashMap();
	}
}
