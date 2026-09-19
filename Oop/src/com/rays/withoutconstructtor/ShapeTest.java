package com.rays.withoutconstructtor;

public class ShapeTest {
	
	public static void main(String[] args) {
		
		
		Shape[] s=new Shape[2];
		
		s[0]=new Circle();
		s[1]=new Rectangle();
				
	Circle c=(Circle) s[0];
	Rectangle r=(Rectangle) s[1];
		c.setRadius(5);
	  r.setLength(2);
	  r.setWidth(2);
	  
	  for(Shape sp:s) {
		System.out.println(sp.area());  
	  }
	}

}
