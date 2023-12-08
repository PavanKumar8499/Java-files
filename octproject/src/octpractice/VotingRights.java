package octpractice;

import java.util.Scanner;

public class VotingRights {
//	Create a Java program that takes a user's age as input and uses an if-else statement to determine if they are eligible to vote (age 18 and older) or not.

//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter username");
//		String userName = s.nextLine();
//		System.out.println("Username is : "+ userName);
		
//		System.out.println("Enter Your Age  ");
//		int i =s.nextInt();
//		System.out.println("Your Age is : "+i);
//		System.out.println("Enter Your Birth Date DD/MM/YY ");
		
//	}
//-------------------------

	Scanner s = new Scanner(System.in);
	int age = s.nextInt();

	public void checkAge() {
		
		if(age<=17) {
			System.out.println("Your age is "+age+ " So You are not Eligible for Vote");
		}else {System.out.println("Your age is "+age+ " So You are Eligible for Vote");}
	}
	public static void main(String[] args) {
		System.out.println("Enter Your Age here : ");
		VotingRights a= new VotingRights();
		a.checkAge();
	}
}
