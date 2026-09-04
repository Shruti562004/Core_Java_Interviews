package com.rays.objectCreate;


public class ObjectCreateUsingClone implements Cloneable {
	public void display() {
		System.out.println("Object created using clone()");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		
		try {
		ObjectCreateUsingClone original = new ObjectCreateUsingClone();
		
		ObjectCreateUsingClone clone = (ObjectCreateUsingClone) original.clone();
		
		clone.display();
		
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}