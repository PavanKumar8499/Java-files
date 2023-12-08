package com.assignment2;

public class Acc {
	public String accno;
	public String owner;
	public double bal;

	public void m1(String Accountnum, String name, double balance) {
		this.accno = Accountnum;
		this.owner = name;
		this.bal = balance;
	}

	public void deposite(double amt) {
		if (amt > 0) {
			bal = amt + bal;
			System.out.println(" Money is Deposited " + amt);
		} else {
			System.out.println("Whatsapp sir u've enterd invalid amt");
		}
	}
	
	public void withdraw(double amt) {
		if(amt<bal) {
			bal=bal-amt;
			System.out.println("Your amt is debited "+amt);
		}else {System.out.println("Please enter valid amt ");}
	}
}
