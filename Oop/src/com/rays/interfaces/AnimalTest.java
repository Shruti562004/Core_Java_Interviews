package com.rays.interfaces;


 interface Animal{
	 int num=89;
	public void eat();
	
}
 
 class Dog implements Animal{
	 
	 public void eat() {
		 System.out.println("eat Dog " +Animal.num);
	 }
 }
 
 
public class AnimalTest {
public static void main(String[] args) {
	
	Animal an=new Dog();
	an.eat();
	System.out.println(Animal.num);
}
}
