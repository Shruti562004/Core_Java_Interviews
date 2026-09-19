package com.rays.streamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {
public static void main(String[] args) {
	
	String[] str= {"hs","goop","call","hs"};
Arrays.stream(str).sorted().forEach(System.out::println);
	
	
}
}
