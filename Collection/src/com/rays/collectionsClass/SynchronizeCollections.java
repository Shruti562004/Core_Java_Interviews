package com.rays.collectionsClass;

import java.util.*;

public class SynchronizeCollections {
    public static void main(String[] args) {

        Collection<String> c = new ArrayList<>();

        c.add("A");
        c.add("B");
        c.add("C");

        Collection<String> sync =
                Collections.synchronizedCollection(c);

        System.out.println(sync);
    }
}
