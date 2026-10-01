package com.rays.race;



 class Account1 {

    private int balance = 0;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(String name, int amount) {

        int total = getBalance() + amount;

        setBalance(total);

        System.out.println(name + " " + getBalance());
    }
}
 
 
  class Racing1 extends Thread {

	    String name = null;

	    public static Account1 account = new Account1();

	    public Racing1(String name) {
	        this.name = name;
	    }

	    @Override
	    public void run() {

	        for (int i = 1; i <= 5; i++) {
	            account.deposit(name, 1000);
	        }
	    }
	}
public class ProblemRace {
	  public static void main(String[] args) {

	        Racing1 t1 = new Racing1("Ram");
	        Racing1 t2 = new Racing1("Shyam");

	        t1.start();
	        t2.start();
	    }
}


/*Maan lo balance 0 hai.

Dono threads ek saath balance read kar sakte hain:

Ram

Balance read karta hai = 0

Shyam

Balance read karta hai = 0

Ram calculate karta hai: 0 + 1000 = 1000

Shyam calculate karta hai: 0 + 1000 = 1000

Final balance = 1000

Expected balance ₹2000 tha, lekin ek update lost ho gaya.

Isko Race Condition kehte hain.*/
