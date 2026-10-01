package com.rays.serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int num;
	String name;
	
	public Student(int num ,String name) {
		this.num=num;
		this.name=name;
	}
	
}

public class TestStudent{
	
	public static void main(String[] args) throws Exception {
		Student s=new Student(1, "Shruti");
		//serialization---------------
		ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("D:\\Core_Java_Interviews\\IO\\Shruti.txt"));
		
		os.writeObject(s);
		
		os.close();
		System.out.println("Saved");
		
		System.out.println(s.name);
		
		System.out.println("================================");
		//deserialization
		
		
		ObjectInputStream os1=new ObjectInputStream(new FileInputStream("D:\\Core_Java_Interviews\\IO\\Shruti.txt"));
		
		Student  s1= (Student) os1.readObject();
		
		os1.close();
		
		System.out.println(s1.num);
		
	}

}
