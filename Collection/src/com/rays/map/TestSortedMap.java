package com.rays.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TestSortedMap {

	public static void main(String[] args) {

		SortedMap<Integer, String> m = new TreeMap<Integer, String>(); 

		m.put(2, "one");
		m.put(1, "two");
		m.put(3, "three");
		m.put(4, "four");
		
		System.out.println(m);
		System.out.println(m.lastKey());
		System.out.println(m.firstKey());
		System.out.println(m.tailMap(2));
		System.out.println(m.subMap(2, 4));
		System.out.println(m.entrySet());
		System.out.println(m.headMap(3));

//		System.out.println(m);
	}
}