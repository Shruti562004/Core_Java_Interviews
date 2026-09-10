package com.rays.unchecked;

public class ArrayIndexOutOfBoundsExTest {
public static void main(String[] args) {
	
	int[] a= {2,4,6,8};
	System.out.println("Arrayyy");
	
	try {
		System.out.println(a.length);
	System.out.println(a[6]);
	}
	catch (ArrayIndexOutOfBoundsException e) {
	e.printStackTrace();
	}
	
	System.out.println("ArrayIndexOutOfBoundsException");
}
}
