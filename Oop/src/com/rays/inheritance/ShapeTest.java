package com.rays.inheritance;

public class ShapeTest {
public static void main(String[] args) {
	
	
	Circle c=new Circle();
	c.setColor("red");
	c.setBorderWidth(3);
	c.setRadius(2);
	c.area();
	
	System.out.println(c.getColor());
	System.out.println(c.getBorderWidth());
	System.out.println(c.getRadius());
	System.out.println(c.area());
	
	
	Rectangle r=new Rectangle();
	r.setColor("blue");
	r.setLength(2);
	r.setWidth(2);
	System.out.println(r.area());
	
	Triangle t=new Triangle();
	t.setColor("blue");
	t.setHeight(2);
	t.setBase(7);
	System.out.println(t.area());
}
}
