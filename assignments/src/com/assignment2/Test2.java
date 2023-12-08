package com.assignment2;

public class Test2 {
	public static void main(String[] args) {
		Acc a = new Acc();
		a.m1("7558467627", "PavanKumar", 1000);
		System.out.println("Account holder name plzz "+a.owner);
		System.out.println("Acc number plzz " +a.accno);
		System.out.println("Initial Current Bal "+a.bal );
	
		a.deposite(50000.0);
		System.out.println("Current bal is "+ a.bal);
		a.withdraw(10000.0);
		System.out.println("Current Bal "+a.bal);
		a.withdraw(4654546);
		a.withdraw(21000);
		System.out.println("Current Bal "+ a.bal+" Thank u for use our service ");
	}
}
