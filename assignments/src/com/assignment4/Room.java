package com.assignment4;

import java.util.Date;
import java.lang.String;

public class Room {
	private int roomNumber;
	private int capacity;
	private int pricePerNi8;
	private boolean check;

	Room(int roomNumber, int capacity, int pricePerNi8) {
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.pricePerNi8 = pricePerNi8;
		this.check = false;

	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getPricePerNi8() {
		return pricePerNi8;
	}

	public boolean checkAvailability() {
		return !check;
	}

	public void reservation() {
		check = true;
	}

	public void reservation(int Extra) {
		check = false;
	}
	
	public String toString() {
		return "Room = "+roomNumber+" Capacity = "+capacity+" pricePerni8 = "+pricePerNi8;
}}
