package com.rays.readText;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadByLine {
	public static void main(String[] args) throws IOException  {
		BufferedReader r1=new BufferedReader(new FileReader("D:\\Core_Java_Interviews\\IO\\output.txt"));
		
		String s=r1.readLine();
		
		while(s!=null) {
			System.out.println(s);
			s=r1.readLine();
		}
		r1.close();
	}

}
