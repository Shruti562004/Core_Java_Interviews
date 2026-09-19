package com.rays.comparable;

import java.util.*;

class Student implements Comparable<Student> {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }

    public String toString() {
        return id + " " + name;
    }
}

public class StudentTest {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(3, "Rahul"));
        list.add(new Student(1, "Amit"));
        list.add(new Student(2, "Shruti"));

        Collections.sort(list);

        System.out.println(list);
    }
}

/*    // Student objects
Student s1 = new Student(3, "Rahul");
Student s2 = new Student(1, "Amit");
Student s3 = new Student(2, "Shruti");

// Add objects into list
list.add(s1);
list.add(s2);
list.add(s3);*/