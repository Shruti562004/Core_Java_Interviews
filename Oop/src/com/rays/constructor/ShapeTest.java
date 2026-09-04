package com.rays.constructor;

public class ShapeTest {
	public static void main(String[] args) {
		
		
		Shape[] s=new Shape[2];
		s[0]=new Circle(3);
		s[1]=new Rectangle(2, 2);
		
		for(Shape sh:s) {
		System.out.println(sh.area());
		}
		
	}

}
