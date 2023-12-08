package com.assignment2;

public class BankAcc {
	private String accnum;
	private double balance;
	private String Ownername;

	public BankAcc(String accountNumber, double balance, String ownerName) {
		this.accnum = accountNumber;
		this.balance = balance;
		this.Ownername = ownerName;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: $" + amount);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			this.balance = balance - amount;
			System.out.println("Withdrawn: $" + amount);
		} else {
			System.out.println("Insufficient funds or invalid withdrawal amount.");
		}
	}

	public double getBalance() {
		return balance;
	}
	public String getOwnerName() {
        return Ownername;
    }
	
	public String getaccnum() {
        return accnum;
    }

	
}
