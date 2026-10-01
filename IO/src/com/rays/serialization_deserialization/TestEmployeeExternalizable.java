package com.rays.serialization_deserialization;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

 class Employee1 implements Externalizable {

	public transient int id;
	public String name;

	public Employee1() {

	}           

	public Employee1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(id);       // 👈 id manually write kar diya

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		id = in.readInt();

	}

	public String toString() {
		return "id: " + id + " name: " + name;
	}

}
public class TestEmployeeExternalizable {

	public static void main(String[] args) throws Exception {

		Employee1 e = new Employee1(1, "Ram");

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\Core_Java_Interviews\\IO\\marks.txt"));

		out.writeObject(e);

		out.close();

		System.out.println("object serialized successfully");

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\Core_Java_Interviews\\IO\\marks.txt"));

		Employee1 e1=(Employee1) in.readObject();
		
		   System.out.println(e1.id);

		in.close();

	}
}