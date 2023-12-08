package com.lovecal;

import java.util.Scanner;

public class X {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String myname = sc.nextLine();
		System.out.println("Enter Your Love one's ");
		String lovername = sc.next();
		int perct = (int) (Math.random() * 100) ; //+1 to got 100%
		System.out.println(lovername + " " + perct + " % Loves u " + myname);

	}
}
