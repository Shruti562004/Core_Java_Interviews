package com.rays.polymorphism;


public class ShapeTestWithParentRef {
	
	public static void main(String[] args) {
		
		
		ShapeWithParentRef s1=new Circle();
		ShapeWithParentRef s2=new Triangle();
		
		s1.color();
		s2.color();
				
				
	}

}
