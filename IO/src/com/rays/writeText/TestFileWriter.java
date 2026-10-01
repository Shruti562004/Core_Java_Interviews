//char by char write
package com.rays.writeText;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
public static void main(String[] args) throws IOException {
	
	FileWriter writer=new FileWriter("D:\\Core_Java_Interviews\\IO\\hello.txt");
	
    writer.write("Hello Java");
    writer.write("\n");
    writer.write("I am learning File IO");
	
    writer.close();
    System.out.println("Data written successfully");
}
}
