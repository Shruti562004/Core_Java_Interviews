package com.rays.split;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SplitFile2Line {
public static void main(String[] args) throws IOException {
	
	BufferedReader re=new BufferedReader(new FileReader("D:\\Core_Java_Interviews\\IO\\Shruti.txt"));
	
	int fileNo=1;
	
	String line=re.readLine();
	
	while(line!=null) {
		BufferedWriter w=new BufferedWriter(new FileWriter("D:\\Core_Java_Interviews\\IO\\File" +fileNo +".txt"));
		
		for(int i=1;i<=2;i++) {
			w.write(line);
			w.newLine();
			
			line=re.readLine();
		}
		
		w.close();
        System.out.println("Create file" + fileNo);
        fileNo++;
	}
	
	
	
re.close();
	
	
}
}
