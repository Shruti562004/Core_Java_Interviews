package com.rays.clonning.deep;

public class BankAccountDetails implements Cloneable {
double balance;

public Object clone() throws CloneNotSupportedException {
	return super.clone();
}
}