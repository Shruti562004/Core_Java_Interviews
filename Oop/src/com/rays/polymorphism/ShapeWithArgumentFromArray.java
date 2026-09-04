package com.rays.polymorphism;

class Shape {
    public double area() {
        return 0;
    }
}

class CircleArea extends Shape {
    private double radius;

    public CircleArea(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

public class ShapeWithArgumentFromArray {

    public static double totalArea(Shape[] shapes) {

        double total = 0;

        for (Shape s : shapes) {
            total = total + s.area();
        }

        return total;
    }
    

    public static void main(String[] args) {

        Shape[] shapes = new Shape[2];
        shapes[0]=new CircleArea(4);
        shapes[1]=new Rectangle(6, 7);
        
            


        System.out.println("Total Area = " + totalArea(shapes));
    }
}