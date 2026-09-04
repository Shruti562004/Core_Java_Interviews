package com.rays.clonning;

class Student implements Cloneable {

    int id;
    String name;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student s1 = new Student();

        s1.id = 101;
        s1.name = "Shruti";

        Student s2 = (Student) s1.clone();

        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}