package com.rays.hashCode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestEHC {
	

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "abc", 100);

		Employee e2 = new Employee(1, "abc", 100);

		Employee e3 = new Employee(3, "Aman", 4000);

		Employee e4 = new Employee(1, "Ram", 5000);

		System.out.println(".....................ArrayList.......................");

		List list = new ArrayList();

		list.add(e1);
		list.add(e2);
		list.add(e4);

		System.out.println(list);

		System.out.println(list.contains(e1));

		System.out.println(list.remove(e4));

		System.out.println(list);

		System.out.println(list.size());

		System.out.println("...................Set.........................");

		Set s = new HashSet();

		s.add(e1);
		s.add(e2);
		s.add(e4);
		System.out.println("/////////");
		System.out.println(s.size());

		System.out.println(s.contains(e2));

		System.out.println(s.remove(e4));

		System.out.println(s);

		System.out.println("....................Map.........................");

		Map m = new HashMap();

		m.put(e1, "one");
		m.put(e2, "two");
		m.put(e4, "three");

		System.out.println(m);

		System.out.println(m.containsKey(e1));

		System.out.println(m.remove(e2));

		System.out.println(m);

		System.out.println("....................String.........................");

		String s1 = "Anand";

		String s2 = "Raju";

		System.out.println(s1.equals(s2));

		System.out.println(s1);
		System.out.println(s2);

		System.out.println(e1.equals(e2));

	}

}