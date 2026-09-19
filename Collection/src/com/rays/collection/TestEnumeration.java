package com.rays.list.vector;



import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {

    public static void main(String[] args) {

        Vector v = new Vector();

        v.add("Java");
        v.add("Python");
        v.add("C");
        v.add("JavaScript");

        Enumeration e = v.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}