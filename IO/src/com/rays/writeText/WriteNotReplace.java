package com.rays.writeText;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNotReplace {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter w=new FileWriter("D:\\Core_Java_Interviews\\IO\\output.txt",true);  // last me add, Yahan true = append mode
		w.write("Happy Bday");
		
		w.close();
	}

}
