package com.rays.collectionsClass;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EmptyCollections {


    public static void main(String[] args) {

      List<String> c = Collections.emptyList();

        System.out.println(c);
        System.out.println(c.size());
        //c.add("y"); exception
    }
}