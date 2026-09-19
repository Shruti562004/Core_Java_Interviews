package com.rays.polymorphism;

public class Circle1 extends Shape1{
	int radius;
	public static final double PI=3.14;
	
	public Circle1(int radius) {
		this.radius=radius;
		
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return PI*radius*radius;
	}

}
