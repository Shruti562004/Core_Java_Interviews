package com.rays.encapsulation;

public class Account {
	
public String  number;
public String type;
public double balance;

public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

public double deposit(double amount) {
	return balance=balance+amount;
	
	
}


public double withdraw(double amount) {
	
	return balance=balance-amount;
}

public void transfer(double amount, Account account) {

    if (amount > 0 && amount <= balance) {

        balance = balance - amount;

        account.balance = account.balance + amount;

        System.out.println("Amount transferred successfully");
        System.out.println("Transferred Amount: " + amount);
        System.out.println("Remaining Balance: " + balance);

    } else {
        System.out.println("Insufficient balance");
    }
}

}
