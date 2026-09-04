package com.rays.constructor;

class Parent {

    String name;

    public Parent(String name) {
        this.name = name;
        System.out.println("Parent Constructor: " + name);
    }
}

class Child extends Parent {

    int age;

    public Child(String name, int age) {
        super(name);   // calls Parent(String)
        this.age = age;

        System.out.println("Child Constructor: " + age);
    }
}

	public class CallParentFromChild {

	    public static void main(String[] args) {
	        Child c = new Child("Shruti", 22);
	    }
	
}
