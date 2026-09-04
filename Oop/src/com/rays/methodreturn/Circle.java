package com.rays.methodreturn;

public class Circle extends Shape {
	public int radius;

	public Circle(int radius) {
	this.radius=radius;
	
		
	}
	
	public double area() {
		double area=3.14*radius*radius;
		return area;
	}
	
	
	

}
