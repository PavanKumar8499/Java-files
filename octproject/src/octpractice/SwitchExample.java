package octpractice;

import java.util.Scanner;

public class SwitchExample {
//	Write a Java program that takes a month number (1 for January, 2 for February, etc.) and a year as input. Use a switch statement to display the number of days in that month. Account for leap years.
	public static int month;
	public static int year;
	public static int daysInMonth;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Month as 1 for jan 2 for feb");
		month = sc.nextInt();
		System.out.println("Enter a year to get info");
		year = sc.nextInt();

		SwitchExample se = new SwitchExample();
		se.getMonth();
		System.out.println("Your " + year + " year have " + daysInMonth + " days in this " + month + " month");

	}

	public int getMonth() {
		switch (month) {
		case 1:
//			System.out.println("January");

		case 3:
//			System.out.println("March");

		case 5:
//			System.out.println("May");

		case 7:
//			System.out.println("July");

		case 8:
//			System.out.println("Aug");

		case 10:
//			System.out.println("Oct");

		case 12:
//			System.out.println("Dec");

			daysInMonth = 31;
			break;

//days In Month 31

		case 4:
//			System.out.println("April");

		case 6:
//			System.out.println("june");

		case 9:
//			System.out.println("Sep");

		case 11:
//			System.out.println("Nov");
			daysInMonth = 30;
			break;
//days in month 30

		case 2:
			if ((year % 4 == 0 && year % 100 == 0) || (year % 400 == 0)) {
				System.out.println("Feb");
				daysInMonth = 29;
			} else {
				daysInMonth = 28;
			}
			break;
//days in month 28

		default:
			System.out.println("U've entered wrong num");
			break;
		}
		return daysInMonth;
	}

}
