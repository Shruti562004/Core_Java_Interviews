package com.rays.serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Marksheet implements Serializable {

    public int id =0;
    public String name = null;
    public int maths = 0;
    public int physics = 0;
    public int chemistry =0;
    public transient int total = 0;
    public transient double percentage = 0;
    public  transient int temp=0;
    public int getTotal() { //total ka value serialize nahi hua, but getTotal() method available raha, aur usne total ko dobara calculate kar diya.
    	 total=maths+physics+chemistry;
    	 return total;
    }
    
    public double getPercentage() {
    	
    	percentage =total/3;
    	return percentage;
    }
}
public class TestMarksheet {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Marksheet m=new Marksheet();
	m.id=1;
	m.name="shruti";
	m.maths=89;
	m.physics=77;
	m.chemistry=99;
	
	
	ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("D:\\Core_Java_Interviews\\IO\\marks.txt"));
	
	os.writeObject(m);
	os.close();
	
	System.out.println("name "+m.name);
	System.out.println(m.getTotal());
	System.out.println(m.getPercentage());

	

	ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\Core_Java_Interviews\\IO\\marks.txt"));
	
	Marksheet m1= (Marksheet) in.readObject();
	
	in.close();
	
	System.out.println("name "+m1.name);
	System.out.println(m1.getTotal());
	System.out.println(m1.getPercentage());
	/*So getTotal() serialize nahi hua, 
	 * but Marksheet class ka method hone ki wajah se m1.getTotal() call kar sakte ho,
	 *  aur woh total ko dobara calculate karta hai.*/
}
}
