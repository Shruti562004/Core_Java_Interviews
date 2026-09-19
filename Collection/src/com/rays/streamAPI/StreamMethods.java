package com.rays.streamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamMethods {
public static void main(String[] args) {
	
	List<String> li=Arrays.asList("one","two","one","four");
	li.stream().sorted().forEach(System.out::println); //sort ascending
	System.out.println("===============================================================");
	li.stream().map(e->e.toUpperCase()).forEach(n->System.out.println(n)); //upper
	
	System.out.println("===============================================================");
	
	li.stream().filter(e->e.startsWith("t")).forEach(n->System.out.println(n)); //filter
	System.out.println("===============================================================");
	
	li.stream().distinct().forEach(n->System.out.println(n));//unique
	
	System.out.println("===============================================================");
	
	li.stream().limit(2).forEach(n->System.out.println(n));  //limit
	
	System.out.println("===============================================================");
	
	li.stream().skip(2).forEach(n->System.out.println(n));   //skip
}
}
