package com.rays.abstracts;


abstract class Animal{
	public int num=3;
	abstract void eat();
	public void sleep() {
		System.out.println("sleeepiinnggggggggggggggggggggggg/..");
	}
}
	class Dog extends Animal{
		public void eat() {
			System.out.println("dog is eating");
		}
		
		public void sound() {
			System.out.println("barks");
		}
		
	}
	
public class AnimalTest {

	public static void main(String[] args) {
		
		Animal ani=new Dog();
		ani.eat();
		//ani.sound(); error
		
		Dog d=new Dog();
		
		
		
		
		
		
		
		
		
		
		d.sound();
	System.out.println(ani.num);
		
	}
	
	
}
