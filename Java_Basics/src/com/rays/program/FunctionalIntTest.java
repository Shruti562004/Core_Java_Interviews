package com.rays.program;

public class FunctionalIntTest {
public static void main(String[] args) {
		//1. First code — Anonymous Inner Class
		FunctionalInt f = new FunctionalInt() {
			
			@Override
			public int sum(int a, int b) {
				return a+b;
			}
		};
		
		int a = 20;
		int b = 20;
		
		System.out.println(f.sum(a, b));
		
		FunctionalInt.sub(a, b);
		
		f.multi(a, b);

	}
}


