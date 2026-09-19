package com.rays.clonning.deep;


class Customer implements Cloneable {

    String name;
    BankAccountDetails acc;

    public Customer(String name) {
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {

        Customer c = (Customer) super.clone();

        // Deep cloning
     //c.acc = (BankAccountDetails) acc.clone(); // remove clone same op bankAccount ka

        return c;
    }
}

public class CustomerTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Customer cus = new Customer("shruti");
       
        cus.acc = new BankAccountDetails();
        cus.acc.balance = 500;
        Customer cus1 = (Customer) cus.clone();  //  remove clone same op both obj and primitive

  

        System.out.println("before");

        System.out.println(cus.name);
        System.out.println(cus.acc.balance);

        System.out.println(cus1.name);
        System.out.println(cus1.acc.balance);
cus1.name="chinu";
        cus1.acc.balance = 899;

        System.out.println("after");

        System.out.println(cus.name);
        System.out.println(cus.acc.balance);

        System.out.println(cus1.name);
        System.out.println(cus1.acc.balance);
    }
}
