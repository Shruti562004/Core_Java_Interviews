package com.rays.program;

@FunctionalInterface
public interface FunctionalInt {

	public int sum(int a, int b);

	public static void sub(int a, int b) {
		System.out.println(a - b);
	}

	public default void multi(int a, int b) {
		System.out.println(a * b);
	}

}