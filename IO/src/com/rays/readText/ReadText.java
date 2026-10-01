package com.rays.readText;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadText {
public static void main(String[] args) throws IOException {
	
	
	FileReader reader=new FileReader("D:\\Core_Java_Interviews\\IO\\hello.txt");
	
	int i=reader.read();
	
	while(i!=-1) {  //value nh mila -1 
		//System.out.println(i); //ascii code
		System.out.print((char) i);
		i=reader.read();
	}
	reader.close();

	
	
	
}
}
