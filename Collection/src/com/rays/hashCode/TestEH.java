package com.rays.hashCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestEH {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "abc", 100);

		Employee e2 = new Employee(1, "abc", 100);

		System.out.println(e1.equals(e2));

		System.out.println("equals:"   + e1.equals("abc"));

		System.out.println(e1.hashCode());

		System.out.println(e2.hashCode());

		System.out.println("------------Set------------");

		Set set = new HashSet();

		set.add(e1);

		set.add(e2);

		System.out.println(set.size());

		System.out.println("set: " + set);

		System.out.println("------------List------------");

		List list = new ArrayList();

		list.add(e1);

		list.add(e2);

		System.out.println("list: " + list);

		System.out.println("list: " + list.remove(new Employee(1, "abc", 100)));

		System.out.println("list: " + list);

		System.out.println("---------Map-----------");

		Map map = new HashMap();

		map.put(e1, "one");
		map.put(e2, "two");

		System.out.println("map: " + map);
		System.out.println("size: " + map.size());
	}

}