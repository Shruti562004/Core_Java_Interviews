package com.rays.streamAPI.map;

import java.util.Arrays;

public class ArrayTest {
public static void main(String[] args) {
	
	int[] a = {6, 6, 88, 8, 0, 3, 55};

	Arrays.stream(a)
	      .map(n -> n * 2)
	      .forEach(n -> System.out.println(n));
}
}
