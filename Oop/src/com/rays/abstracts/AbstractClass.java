package com.rays.abstracts;

abstract class Vehicle {

    abstract void start();   // abstract method

    void stop() {            // concrete method
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

public class AbstractClass {
    public static void main(String[] args) {

        Vehicle v = new Car();

        v.start();
        v.stop();
    }
}