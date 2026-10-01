package com.rays.email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestCorrectEmail {
public static void main(String[] args) throws IOException {
	
	
	BufferedReader b1=new BufferedReader(new FileReader("D:\\Core_Java_Interviews\\IO\\email.txt"));
	FileWriter w1=new FileWriter("D:\\Core_Java_Interviews\\IO\\emailWriter.txt");
	PrintWriter p=new PrintWriter(w1);
	
	String emailReg="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	String email=b1.readLine();
	while(email!=null) {
		if(email.matches(emailReg)) {
		System.out.println(email);
		w1.write(email);
		p.println();
	}
	email=b1.readLine();
		
	}
	b1.close();
	w1.close();
	p.close();
	
}
}
