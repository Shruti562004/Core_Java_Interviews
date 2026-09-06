package com.rays.checked;

import java.io.FileReader;
import java.io.IOException;

public class CheckedEx2 {

    public static void main(String[] args) throws IOException {
    	System.out.println("ghg");
        m1();
    }

    static void m1() throws IOException {
        m2();
    }

    static void m2() throws IOException {
        FileReader file = new FileReader("abc.txt");
    }
}
