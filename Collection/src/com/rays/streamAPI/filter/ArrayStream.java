package com.rays.streamAPI.filter;

import java.util.Arrays;

public class ArrayStream {
public static void main(String[] args) {
	
	int[] a= {6,8,9,34,6,9};
	
	Arrays.stream(a).filter(n->n>1).forEach(System.out::println);
}
}
