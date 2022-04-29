package com.revature;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		run();
		treeMap();
	}


	private static void run() {
		int i=1;
		Map<String, Integer> a = new HashMap<String, Integer>();
		a.put(null, 1);
		a.put(i+"", 2);
		a.put(null, 3);
		a.put("i", 4);
		a.put("i"+1, 5);
		System.out.println(a.get("i")+" "+a.get(null));
	}
	private static void treeMap() {
		int i=1;
		Map<Integer, String> stu = new TreeMap<>();
		stu.put(3, "Jack");
		stu.put(6, "Kim");
		stu.put(3, "john");
		stu.put(7, "Amy");
		for (Integer key: stu.keySet()) {
		System.out.println(stu.get(key)); }
		
	}
	
	
}
