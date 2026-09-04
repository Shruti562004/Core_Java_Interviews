package com.rays.constructor;

public class ConstructorOverloading {

    String name;
    int age;

    // No-argument constructor
    ConstructorOverloading() {
        System.out.println("No argument constructor");
    }

    // One parameter
    ConstructorOverloading(String name) {
        this.name = name;
        System.out.println(name);
    }

    // Two parameters
    ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name +"   "+age);
    }
}