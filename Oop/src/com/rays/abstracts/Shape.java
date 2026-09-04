package com.rays.abstracts;

abstract class ShapeTest {
	abstract void area();

}

class Circle extends ShapeTest{
    public int radius;
	public Circle(int radius) {
	this.radius=radius;
}
	@Override
	void area() {
		double area=3.14*radius*radius;
		System.out.println("area circle " +area);
	}
}
	
	class Rectangle extends ShapeTest{
		public int length;
		public int width;
		
	 public Rectangle(int length , int width) {
			this.length=length;
			this.width=width;
		}
			@Override
			void area() {
				double area=length*width;
				System.out.println("area Rectangle  " +area);
			}
	}
	
	public class Shape{
		public static void main(String[] args) {
			ShapeTest ts=new Circle(4) ;
			ShapeTest ts1=new Rectangle(2, 0);
			ts.area();
			ts1.area();
			
		}
	}
	

