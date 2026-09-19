package com.rays.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class FirstLastTest {
	public static void main(String[] args) {

		ArrayList<FirstLast> l = new ArrayList<FirstLast>();

		l.add(new FirstLast("Neeraj", "Mewada"));
		l.add(new FirstLast("Neeraj", "Mewada"));
		l.add(new FirstLast("Rishabh", "Chauhan"));
		l.add(new FirstLast("Rishabh", "Shrivastava"));

		l.add(new FirstLast("Rishabh", "Shrivastava"));
		l.add(new FirstLast("Ajay", "Kumar"));
		
		
		Collections.sort(l);
		for(FirstLast e : l) {
			System.out.println(e);
		}
	}

}
