package com.rays.readText;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteInAnotherFile {
public static void main(String[] args) throws IOException {
	FileReader f1=new FileReader("D:\\Core_Java_Interviews\\IO\\hello.txt");
	FileWriter w1=new FileWriter("D:\\Core_Java_Interviews\\IO\\output.txt");
	
	int i=f1.read();
	while(i!=-1) {
		System.out.print((char) i);
		w1.write(i);
		i=f1.read();
	}
	
	f1.close();
	w1.close();
}
}
