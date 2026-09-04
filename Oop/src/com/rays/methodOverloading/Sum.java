package com.rays.methodOverloading;

public class Sum {
	public int sum(int a) {
	return a;
	}
	
	public int sum(int a , int b) {
		return a+b;
		
	}
	
	public int sum(int a , int b,int c) {
		return a+b+c;
		
	}
	public static void main(String[] args) {
		
		Sum s=new Sum();
	System.out.println(	s.sum(5));
		System.out.println(s.sum(5, 9));
		System.out.println(s.sum(1, 2, 3));
	}

}
