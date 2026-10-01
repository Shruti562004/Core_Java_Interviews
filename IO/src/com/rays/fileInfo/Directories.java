
//all file inside directory
package com.rays.fileInfo;

import java.io.File;

public class Directories {
public static void main(String[] args) {
	
	File d =new File("D:\\Core_Java_Interviews\\IO");
	
	String[] s=d.list();
	for(String f:s) {
		System.out.println(f); //all  file name print
	}
	System.out.println("===================================================");
	File file=new File("D:\\Core_Java_Interviews\\IO","test");  //directry
	file.mkdir();
	System.out.println("create directory");
	

	System.out.println("===================================================");
	File f1 = new File("D:\\Core_Java_Interviews\\IO\\java.txt");

	f1.renameTo(new File("D:\\Core_Java_Interviews\\IO\\hello.txt"));

	System.out.println(f1.getName()); //java.txt old file kyuki original only change
	f1.delete();
System.out.println("deleted successfully");


f1.deleteOnExit();
System.out.println("Delete scheduled on JVM exit");
	System.out.println("===================================================");
}
}
