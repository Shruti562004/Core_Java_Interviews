package com.rays.streamAPI.filter;

import java.util.Arrays;
import java.util.List;

public class TestEven {
public static void main(String[] args) {
	List <Integer>l=Arrays.asList(10,4,3,2,8,7,9);
	
	l.stream().filter(n->n%2==0).forEach(System.out::println);
}
}
