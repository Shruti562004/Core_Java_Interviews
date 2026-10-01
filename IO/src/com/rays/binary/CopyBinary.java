package com.rays.binary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBinary {
public static void main(String[] args) throws IOException {
	
	
	FileInputStream f1=new FileInputStream("D:\\Core_Java_Interviews\\IO\\semi.jpg");
	FileOutputStream f2=new FileOutputStream("D:\\Core_Java_Interviews\\IO\\semiCopy.jpg");
	int i=f1.read();
	while(i!=-1) {
		System.out.println(i);
		f2.write(i);
		i=f1.read();
	}
	
	System.out.println("Successfully copy");
	f1.close();
	f2.close();
}
}
