package com.assignment4;

import java.util.Date;

public class Hotel {
	public static void main(String[] args) {
		Room r1 = new Room(121, 3, 79);
		Room r2 = new Room(122, 7, 99);
		System.out.println(r1);
		System.out.println(r2);

		if (r1.checkAvailability()) {
			r1.reservation();
			System.out.println("Reservation for = " + r1.getRoomNumber() + "\n*******is confirmed welcome to PavanKumar's Hotel*******");
		} else {
			System.out.println("Room" + r1.getRoomNumber() + "is already reserverd sorry");
		}

		if (r2.checkAvailability()) {
			r2.reservation(499);
			System.out.println("Reservation for= " + r2.getRoomNumber() + " is confirmed");
		} else {
			System.out.println("Room" + r2.getRoomNumber() + "is not allowed to book its vip");
		}

	}

}
