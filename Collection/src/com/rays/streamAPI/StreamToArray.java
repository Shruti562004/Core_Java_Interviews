package com.rays.streamAPI;

import java.util.stream.Stream;

public class StreamToArray {
    public static void main(String[] args) {

        Stream<String> s = Stream.of("Ram", "Shyam", "Mohan");

        String[] arr = s.toArray(e -> new String[e]);  //→ creates a new String array of the required size.

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
