package com.rays.constructor;

public class Circle  extends Shape{
	
	public int radius;
	
	public Circle(int radius) {
		this.radius=radius;
	}

	public double area() {
		return 3.14*radius*radius;
	}
}
