package octpractice;

import java.util.Scanner;

public class GuessTheNum {
//	Develop a Java program that simulates a simple guessing game. Generate a random number between 1 and 100, and then use a while loop to prompt the user to guess the number. Provide hints (higher or lower) until the user guesses correctly.

//	public static void main(String[] args) {
//		double a = Math.random() * 100;
//		long b = Math.round(a);
//		System.out.println(b);
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Your Num ");
//		double c = sc.nextInt();
//		if (b < 1) {
//		}
//	}
//}

//	Write a Java program that declares an array of integers and initializes it with the numbers 1 to 5. Then, use a loop to print each element of the array.

//	public static void main(String[] args) {
//// to declare array or initialize array
//		int a[] = { 1, 2, 3, 4, 5 };
//
////to read array
//		for (int i = 0; i < a.length; i++){
//			System.out.print(a[i]+" ");
//		}
//	}
//	Create a Java program that takes input from the user to populate an array of strings. After the array is filled, use a loop to print each element.
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//
//		System.out.println("Enter Array size u want to make");
//		int num = s.nextInt();  s.nextLine();//input by user
//
//		String[] names = new String[num]; //size of array declaration
//		System.out.println("You have enter " + num + " so enter that nums");
//// to change array memory for diff nums
//		for (int i = 0; i < num; i++) { 
//			names[i] = s.nextLine();
//		}// to populate integers at diff arrays
////
//		// to Display diff arrays declaration we need for loop
//		for (int i = 0; i < names.length; i++) {
//			System.out.print(names[i]+", ");
//		}
//	}
//
//}
//	Write a Java program to find and print the largest element in an array of integers. You can assume the array contains at least one element.
//public static void main(String[] args) {
//	int[]array= {1,3,4,4,3,9,4,6,3,1,96,7,6};
//	int max=array[0];
//	for (int i = 0; i < array.length; i++) {
//		if(array[i]>max) {
//			max=array[i];
//		}
//	}
//	System.out.println("this is max num in above array "+max);
//
//}
//}

//	public static void main(String[] args) {
//		int[] numbers = { 78, 55, 22, 33, 66, 99, 55, 68, 94, 641, 5, 4, 8, 4564, 3545, 4, 8645, 4954, 548, 53, 900000000 };
//
//		int max=numbers[0];
//		
//		for (int i = 0; i < numbers.length; i++) {
//			if(numbers[i]>max) {
//				max=numbers[i];
//				
//			}
//		}
//		System.out.println("This is the Max num in above arraylist : "+max);
//		
//	}
//}
//	public static void main(String[] args) {
////	Develop a Java program that calculates and prints the average of values in an array of doubles. Allow the user to specify the size of the array and input its elements.
//		double[] values = { 10.0, 23, 50.0, 45.56, 69.23, 16.2, 78.65 };
//		double sum = 0.0;
//		for (double value : values) {
//			sum += value;
//		}
//		System.out.println(sum / values.length + " This is average");
//
//	}

//	public static void main(String[] args) {
////		Create a Java program that initializes an array with some names (strings) and then searches for a specific name entered by the user. If the name is found in the array, print a message indicating that it was found; otherwise, print a message saying it wasn't found.
//		String[] names = { "Mauli", "Samu", "Shiv", "Aditi", "Rutu", "Adwait" };
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter Your Fav Name");
//		String enter = s.nextLine();
//		boolean check = false;
//		for (int i = 0; i < names.length; i++) {
//			if (names.equals(enter)) {
//				check = true;
//				break;
//			}
//		}
//		if (check) {
//			System.out.println("We found that name " + enter);
//		} else {
//			System.out.println("We didn't found ur name " + enter);
//		}
//	}
}