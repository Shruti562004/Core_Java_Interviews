package com.rays.readText;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReadLineByConsole {
public static void main(String[] args) throws IOException {
	  System.out.println("Enter lines:");
	BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	
	String s=b.readLine();
	
	while(s!=null) {
		//System.out.println(s);
		  System.out.println("You entered: " + s);
		 s=b.readLine();
	}
	
	b.close();
}
}
