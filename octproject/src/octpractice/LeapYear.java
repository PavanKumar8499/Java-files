package octpractice;
 
import java.util.Scanner;

public class LeapYear {
	Scanner s = new Scanner(System.in);
	int year = s.nextInt();
	void checkLeap() {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("This is Leap Year");
		} else {
			System.out.println("This is not Leap year");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter Here ");
		LeapYear l = new LeapYear();
		l.checkLeap();
	}
}
