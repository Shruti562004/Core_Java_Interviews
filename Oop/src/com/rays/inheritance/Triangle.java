package com.rays.inheritance;

public class Triangle  extends  Shape{
	
	public int base;
	public int height;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public double area() {
		
		return 0.5*(base*height);
	}
}
