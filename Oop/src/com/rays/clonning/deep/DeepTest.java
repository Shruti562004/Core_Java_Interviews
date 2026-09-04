package com.rays.clonning.deep;
class Deep implements  Cloneable{
	int age=78;

	public Object clone() throws CloneNotSupportedException {
	Deep d=	(Deep) super.clone();
		return d;
	}
}
public class DeepTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		
	
	int age=78;
Deep d1=new Deep();

Deep d2= (Deep) d1.clone();

System.out.println("before " +d1.age);
System.out.println("before " +d2.age);

d2.age=708;
System.out.println("after" +d1.age);
System.out.println("afterS " +d2.age);
}
	
	
}