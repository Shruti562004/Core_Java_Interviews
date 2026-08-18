package com.rays.program;

public class HarmoniSeries {
public static void main(String[] args) {
	
	double sum=0;
	for(int i=1;i<10;i++) {
	
	System.out.println("1/"+i);
	
	sum=sum+(1.0/i);
	
	}
	
	System.out.println("sum =" +sum );
}
}
