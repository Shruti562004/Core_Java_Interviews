package com.rays.encapsulation;

public class AccountTest {
public static void main(String[] args) {
	
	
	Account acc=new Account();
	
	acc.setNumber("677656544");
	acc.setType("Saving");
	acc.setBalance(5000.0);
	
	System.out.println("num =" +acc.getNumber());

	System.out.println("type =" +acc.getType());
	
	System.out.println("balance =" +acc.getBalance());
	
	System.out.println("deposit " + acc.deposit(300) );
	System.out.println("withdrawn " + acc.withdraw(500));
	
	
    Account account = new Account();

    account.setNumber("123456789");
    account.setType("Saving");
    account.setBalance(3000.0);

    acc.transfer(2000, account);
}
}
