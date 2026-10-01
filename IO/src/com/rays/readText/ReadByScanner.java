package com.rays.readText;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadByScanner {
public static void main(String[] args) throws IOException {
	FileReader f=new FileReader("D:\\Core_Java_Interviews\\IO\\output.txt");
	Scanner sc=new Scanner(f);
	while(sc.hasNext()) {
		
		System.out.println(sc.nextLine());
	}
	sc.close();
	f.close();
}
}
