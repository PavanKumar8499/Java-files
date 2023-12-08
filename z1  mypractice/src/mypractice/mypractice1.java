package mypractice;

import java.util.*;

// this is our practice page here we learn new things....!
// lets see....!

public class mypractice1 {
// code start from here 

	void stud(int a, int b) {
		System.out.println("hi world");
		System.out.print(" this is new one method");
		System.out.println(" this is how we get letters in same lin ");

		int x = a + b;
		System.out.println("Hey hi pavankumar your addition is = " + x);
	}

	void sub(int a, int b) {

		int x = a - b;
		System.out.println("here we get subtraction of two numbers = " + x);
		System.out.println("hello world PavanKumar this side\nfrom INDIA");
		System.out.println("hello hi \n now \n by");

	}

	void mul(int a, int b) {

		int need = a * b;
		System.out.println("hi there is must of print word for run or show output = " + need);
	}

	// keep in mind always remember to get op u should complete any lil code with
	// syso print

	void star(int a) {

		int z = a * 1;
		System.out.println("hey hi i want to print star program =" + z);
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("here we are getting * print in single line by using  --- \n*\n**\n***\n****\n*****");
	}

// end of work the public static void is just java will print from there ok
// this is how we print result  just preshhh;;;s alt+shift+x and after that j ok...!
	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		// int a = sc.nextInt();
		// int b = sc.nextInt();
		// int sum = a + b;
		// System.out.println("hi here we got addition " + sum);
		// Make a program that takes the radius of a circle as input,
		// calculates its radius and area and prints it as output to the user

		// Scanner ss = new Scanner(System.in);
		// int x = ss.nextInt();
		// int diam = x * 2;
		// System.out.println("here is the total diameter of circle " + diam);
		// Make a program that prints the table of a number that is input by the user.
		// (HINT - You will have to write 10 lines for this but as we proceed in the
		// course you will be studying about ‘LOOPS’ that will simplify your work A
		// LOT!)

		Scanner f = new Scanner(System.in);

		int age = f.nextInt();

		if (age > 17) {
			System.out.println("He/She is a Adult...");

		} else {

			System.out.println("He/She is not a Adult...!");
		}

		Scanner t = new Scanner(System.in);
		// int x = t.nextInt();
		// int c = t.nextInt();
		// if (x == c) {
		// //System.out.println("EQUAL");
		// } else if (x > c) {
		// System.out.println("x is greateree");
		// } else {
		// System.out.println("x is lesser");
		// }
		int button = t.nextInt();

		if (button == 1) {
			System.out.println("Hello My upcoming career");
		} else if (button == 2) {
			System.out.println("Namste to my past life");
		} else if (button == 3) {
			System.out.println("hardwork is key of success");
		} else {
			System.out.println("forget abt past");
		}
		// this program is ended
		int button2 = t.nextInt();
		if (button2 == 8) {
			System.out.println("Hi new chance");
		} else if (button2 == 9) {
			System.out.println("there is hope there is way");
		} else if (button2 == 7)

		{
			System.out.println("do or die patil last chance to boom your life");
		} else {
			System.out.println("focus");
		}
	}

}
// 2 nd program of equal and greater

//last bracket	
