package com.rays.collectionsClass;

import java.util.ArrayList;
import java.util.Collections;

public class SortCollection {
public static void main(String[] args) {
	
	ArrayList<Integer> list = new ArrayList<>();

	list.add(30);
	list.add(10);
	list.add(20);

	Collections.sort(list);

	System.out.println(list);
}
}
