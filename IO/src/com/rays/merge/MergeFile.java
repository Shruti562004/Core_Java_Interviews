package com.rays.merge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeFile {

    public static void main(String[] args) throws IOException {
    	
    	FileWriter fw=new FileWriter("D:\\Core_Java_Interviews\\IO\\hello.txt");
    	
    	BufferedReader br=new BufferedReader(new FileReader("D:\\Core_Java_Interviews\\IO\\Shruti.txt"));
    	
    	String line=br.readLine();
    	
    	while(line!=null) {
    		fw.write(line);
    		fw.write("\n");
    		line=br.readLine();
    		
    	}
    	
    	br.close();
    	
    	br=new BufferedReader(new FileReader("D:\\Core_Java_Interviews\\IO\\output.txt"));
    	
    	String line1=br.readLine();
    	
    	while(line1!=null) {
    		fw.write(line1);
    		fw.write("\n");
    		
    		line1=br.readLine();    		
    	}
    	
    	br.close();
    	fw.close();
System.out.println("succesfully write");
    }

}