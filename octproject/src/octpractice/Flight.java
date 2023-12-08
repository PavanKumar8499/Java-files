package octpractice;

import java.util.Scanner;

public class Flight {
private static int flightNumbers, origin, seatAvailable=100;
private String destination= "USA";

//Implement a flight class with private contrubute  like flightNumber, origin. destinatoion amd seatsAvailable / provide methods to book and cancel seats, making sure that the number of available seats is updated accordingly. 

public Flight() {
	this.flightNumbers=flightNumbers;
	this.origin= origin;
	this.destination= destination;
	this.seatAvailable= seatAvailable;
}

int seats;
String country ;
int cancel;
public int book() {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Nums you want to book seats ");
	 seats = s.nextInt();

	return seatAvailable;
}
public void destination () {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Entire Your Country ");
	country =s.nextLine();
	System.out.println("Thank You ur destination is booked for "+seats+" for the this country "+country);
}

public int cancelSeats() {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Nums you want to cancel that seats ");
	 cancel = s.nextInt();
	seatAvailable -=cancel;
	System.out.println(" You have succefully canceled "+cancel +" tc now only "+seatAvailable +" seats available ");
	return seatAvailable;
	
}

public static void main(String[] args) {
	Flight f = new Flight();
	f.book();
	f.destination();
	f.cancelSeats();
}
}
