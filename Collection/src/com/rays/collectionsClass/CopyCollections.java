package com.rays.collectionsClass;

import java.util.ArrayList;
import java.util.Collections;

public class CopyCollections {

	    public static void main(String[] args) {

	        ArrayList<Integer> source = new ArrayList<>();

	        source.add(10);
	        source.add(20);
	        source.add(30);

	        ArrayList<Integer> destination = new ArrayList<>();

	        destination.add(7);
	        destination.add(0);
	        destination.add(0);
	        destination.add(7);

	        Collections.copy(destination, source);

	        System.out.println("Source: " + source);
	        System.out.println("Destination: " + destination);
	    }
}