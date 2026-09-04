package com.rays.withoutconstructtor;


public class Circle extends Shape {
	
	private int radius;
	
	public static final double PI = 3.14;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double area() {
		
		double cArea = PI * radius * radius;
		
		System.out.println("Area Of Circle = "+ cArea);
		
		return cArea;
		
	}

}