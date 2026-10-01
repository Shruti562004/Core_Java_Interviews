package com.rays.fileInfo;

import java.io.File;
import java.util.Date;

public class AccessFileInfo {
	
	public static void main(String[] args) {
		
		File f=new File("D:\\Core_Java_Interviews\\IO\\java.txt");
		if(f.exists()) {
		System.out.println("Name " +f.getName());  //name
		
		System.out.println("Path "+f.getAbsolutePath());
		
		System.out.println("Writable " +f.canWrite());
		System.out.println("Readable " +f.canRead());
		
		System.out.println("length "+f.length());
		
		System.out.println("Is File " +f.isFile());
		
		System.out.println("Is Directory "+f.isDirectory());
		
		Date d=new Date(f.lastModified());
		
		System.out.println("last modified "+d);
		}
		else {
			System.out.println("File does not exist");
		}
	}

}
