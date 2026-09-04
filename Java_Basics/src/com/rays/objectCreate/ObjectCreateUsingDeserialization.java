package com.rays.objectCreate;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectCreateUsingDeserialization implements Serializable {

	public void display() {
		System.out.println("Object created using deserialization");
	}

	public static void main(String[] args) {
		try {
			// Serialize the object
			ObjectCreateUsingDeserialization original = new ObjectCreateUsingDeserialization();
			FileOutputStream fos = new FileOutputStream("objectcreateusingdeserialization.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(original);
			oos.close();

			// Deserialize the object
			FileInputStream fis = new FileInputStream("objectcreateusingdeserialization.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ObjectCreateUsingDeserialization deserialized = (ObjectCreateUsingDeserialization) ois.readObject();
			ois.close();

			deserialized.display();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}