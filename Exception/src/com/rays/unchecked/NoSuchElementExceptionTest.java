package com.rays.unchecked;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class NoSuchElementExceptionTest {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");

        Iterator<String> itr = list.iterator();

        System.out.println(itr.next()); // Java
        System.out.println(itr.next()); // Python

        try {
            System.out.println(itr.next()); // No element available
        } catch (NoSuchElementException e) {
            System.out.println("No element available");
            e.printStackTrace();
        }

        System.out.println("Program continues");
    }
}