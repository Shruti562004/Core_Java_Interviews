package com.rays.writeText;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteLineByLineByPrintWriter {
public static void main(String[] args) throws IOException {
	
	FileWriter w=new FileWriter("D:\\Core_Java_Interviews\\IO\\output.txt");
	PrintWriter p=new PrintWriter(w);
	
	p.println("good morning");
	p.println("good night");
	
	p.close();
	w.close();
}
}
