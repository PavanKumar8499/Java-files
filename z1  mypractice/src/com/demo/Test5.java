package com.demo;

public class Test5 {

	public static void main(String[] args) {
		// 1st
		System.out.println("1st Pattern......\n");
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		System.out.println("2nd Pattern.......\n");

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		System.out.println("3rd pattern......\n");
		for (int i = 3; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

		System.out.println("4th Pattern.......\n");

		for (int i = 0; i <=3; i++) {
			for (int j = 2; j >=i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <=i; j++) {
				System.out.print("* ");
			}
			
			System.out.println(" ");
		}
		
		System.out.println(" 5th Pattern....\n");
		for (int i = 0; i <=3; i++) {
			for (int j = 2; j >=i; j--) {
				System.out.print("  ");
			}
			for (int j = 0; j <=i; j++) {
				System.out.print("* ");
			}
			
			System.out.println("  ");
		}
	}
}
