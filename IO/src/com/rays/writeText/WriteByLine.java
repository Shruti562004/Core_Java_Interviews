package com.rays.writeText;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteByLine {
	
	public static void main(String[] args) throws IOException {
		BufferedWriter w=new BufferedWriter(new FileWriter(("D:\\Core_Java_Interviews\\IO\\output.txt")));
		
		w.write("hello");
		w.newLine();
		w.write("Shruti");
		w.newLine();
		System.out.println("Write liine by line");
		
		w.close();
	}

}
