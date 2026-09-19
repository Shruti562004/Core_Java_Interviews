package com.rays.comparable;

public class FirstLast  implements Comparable<FirstLast>{

	String first;
	String last;
	
	public  FirstLast(String first , String last) {
	this.first=first;
	this.last=last;
	
	}
	@Override
	public int compareTo(FirstLast o) {
	if(this.first.equals(o.first)) {
		return this.last.compareTo(o.last);
	}
		return this.first.compareTo(o.first);
	}
	
	public String toString() {
		return first + " " + last;
		
		
	}

}
