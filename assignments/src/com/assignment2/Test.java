package com.assignment2;

public class Test {
    public static void main(String[] args) {
    	BankAcc b=new BankAcc("1234567890", 1000.0, "John Doe");
    	
    	System.out.println("Account Owner: " + b.getOwnerName());
        System.out.println("Account Number: " + b.getaccnum());
        System.out.println("Initial Balance: $" + b.getBalance());

        b.deposit(500.0);
        System.out.println("Current Balance: $" + b.getBalance());

        b.withdraw(200.0);
        System.out.println("Current Balance: $" + b.getBalance());

        b.withdraw(1500.0);
        System.out.println("Current Balance: $" + b.getBalance());
   
    }
}

