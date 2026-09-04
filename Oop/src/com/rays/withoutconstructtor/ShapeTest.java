package com.rays.withoutconstructtor;

public class ShapeTest {
	
	public static void main(String[] args) {
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		
		Shape[] s=new Shape[2];
		
		s[0]=c;
		s[1]=r;
				
	
		c.setRadius(5);
	  r.setLength(2);
	  r.setWidth(2);
	  
	  for(Shape sp:s) {
		System.out.println(sp.area());  
	  }
	}

}
