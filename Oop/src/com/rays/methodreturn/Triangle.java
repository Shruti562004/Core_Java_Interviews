package com.rays.methodreturn;



public class Triangle  extends Shape{
	
	int base;
	int height;
	
	public Triangle(int base,int height) {
		
		this.base=base;
		this.height=height;
	}
	
	public double area() {
	 double area=0.5*height*base;
	 return area;
	
	}

}
