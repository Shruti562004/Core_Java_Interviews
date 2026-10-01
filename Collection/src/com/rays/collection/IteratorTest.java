package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
public static void main(String[] args) {
	
	ArrayList<String> list = new ArrayList<>();

	list.add("A");
	list.add("B");
	list.add("C");

	Iterator<String> it = list.iterator();

	while (it.hasNext()) {
		//it.remove(); //illegalstateException
	    System.out.println(it.next());
	    it.remove(); //remove all 
	  //  break; // remove A only
	}
	
	System.out.println(list);
}
}
