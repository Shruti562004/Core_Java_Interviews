package com.rays.unchecked;

public class UncheckedEx2 {
	public static void main(String[] args) {
		m1();
		System.out.println(" m1 hello");
	}

	static void m1() {
		System.out.println(" m2 hello");
		m2();

	}

	static void m2() {
		int a = 10 / 0;
		System.out.println("hello");
	}
}
