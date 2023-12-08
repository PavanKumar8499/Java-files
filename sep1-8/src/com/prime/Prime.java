package com.prime;

import java.util.Scanner;

public class Prime {

	// Enter any number and check is it prime or not....
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please Enter Your num = ");
//		int num = sc.nextInt();
//		for (int i = 2; i < num; i++) {
//		if (num % i != 0) {
//				System.out.println("It is not Prime num");
//			} if(num/num==0&&num/1==0) {
//				System.out.println("It is a Prime num");
//				break;
//			}
//		}
//	}

//	public static void main(String[] args) {
//		int n;
//		int count = 0;
//		System.out.println("Enter Any Num");
//		Scanner r = new Scanner(System.in);
//		n = r.nextInt();
//
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				count++;
//			}
//		}
//		if (count == 2) {
//			System.out.println("Prime Num");
//		} else {
//			System.out.println("Not Prime Num");
//		}
//
//	}
//

	// Print prime num if it is prime or not.......

//	public static void main(String[] args) {
//		System.out.println("Enter Your Num");
//		int num, count = 0;
//		Scanner s = new Scanner(System.in);
//		num = s.nextInt();
//		for (int i = 1; i <= num; i++) {
//			if (num % i == 0) {
//				count++;
//			}
//		}
//		if (count == 2) {
//			System.out.println("Prime num");
//		} else {
//			System.out.println("Not Prime num");
//		}
//	}
//	
//	print 1 to 100 prime num........

	public static void main(String[] args) {
		for (int j = 1; j <=100; j++) {
			
		
		int n = j, count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if(count==2) {System.out.println(j+" = Prime num ");
		}
	} 
	}
//
////	
//public static void main(String[] args) {
//	
//
//	  Scanner sc = new Scanner(System.in);
//      int size = sc.nextInt();
//      int numbers[] = new int[size];
//
//
//      for(int i=0; i<size; i++) {
//          numbers[i] = sc.nextInt();
//      }
//
//
//      //print the numbers in array
//      for(int i=0; i<numbers.length; i++) {
//          System.out.print(numbers[i]+" ");
//      }
//  }
	
	
//	 public static void main(String args[]) {
//	      Scanner sc = new Scanner(System.in);
//	      int size = sc.nextInt();
//	      String names[] = new String[size];
//
//
//	      //input
//	      for(int i=0; i<size; i++) {
//	          names[i] = sc.next();
//	      }
//	     
//	      //output
//	       for(int i=0; i<names.length; i++) {
//	           System.out.println("name " + (i+1) +" is : " + names[i]);
//	       }
//	      
//	   }
//	 public static void main(String args[]) {
//	      Scanner sc = new Scanner(System.in);
//	      int size = sc.nextInt();
//	      int numbers[] = new int[size];
//
//
//	      //input
//	      for(int i=0; i<size; i++) {
//	          numbers[i] = sc.nextInt();
//	      }
//
//
//	      int max = Integer.MIN_VALUE;
//	      int min = Integer.MAX_VALUE;
//	     
//	       for(int i=0; i<numbers.length; i++) {
//	           if(numbers[i] < min) {
//	               min = numbers[i];
//	           }
//	           if(numbers[i] > max) {
//	               max = numbers[i];
//	           }
//	       }
//
//
//	       System.out.println("Largest number is : " + max);
//	       System.out.println("Smallest number is : " + min);
//	      
//	   }
	}
//
//	
//
//
