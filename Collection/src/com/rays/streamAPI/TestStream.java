package com.rays.streamAPI;

import java.util.*;

public class TestStream {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        list.stream()
            .forEach( System.out::println);
    }
}