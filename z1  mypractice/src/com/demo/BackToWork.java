package com.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Scanner;

public class BackToWork {

//write a program of prime num 1 TO 1000
//	public static void main(String[] args) {
//		for (int i = 1; i <= 1000; i++) {
//			int count = 0;
//			for (int j = 1; j <= i; j++) {
//
//				if (i % j == 0) {
//					count++;
//				}
//			}
//			if (count == 2) {
//				System.out.print(i + " ");
//			}
//		}
//
//	}

	// How to reverse String in java....

//	public static void main(String[] args) {
//		String name = "Code";
//		String rev = "";
//		int length = name.length();
//		for (int i = length-1; i >=0; i--) {
//			rev = rev+name.charAt(i);
//		}
//		System.out.println(rev);
//	}

	// How to reverse String

//	public static void main(String[] args) {
//		String name = "pAVAN";
//		int length = name.length();
//		String rev = "";
//		for (int i = length-1; i >=0; i--) {
//			rev = rev+name.charAt(i);
//		}
//		System.out.println(rev);
//	}

//	public static void main(String[] args) {
//		int num = 755846762;
//		int rev =0;
//		while (num!=0) {
//			rev= rev*10+num%10;
//			num = num/10;
//		}
//		System.out.println(rev);
//	}

//	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer(String.valueOf(786));
//		StringBuffer rev= sb.reverse();
//		System.out.println(rev);
//	}

//	public static void main(String[] args) {
//		StringBuilder sbl = new StringBuilder();
//		sbl.append(789);
//		System.out.println(sbl.reverse());
//	}

//	public static void main(String[] args) {
//		String name = "pavan";
//		String rev = "";
//		int length= name.length();
//		for (int i = length-1; i>=0; i--) {
//			rev = rev +name.charAt(i);
//		}
//		System.out.println(rev);
//	}

	// reverse Using char array
//	public static void main(String[] args) {
//		
//	String str = "Pavan";
//	String rev ="";
//	
//	char a [] = str.toCharArray();
//	int len = a.length;
//	
//	for ( int i=len-1;i>=0; i--) {
//		rev = rev +a[i];
//	}
//	System.out.println(rev);
//	
//	
//	}

// using String Buffer class

//	public static void main(String[] args) {
//		String text = "Geeta";
//		StringBuffer sb = new StringBuffer(text);
//		System.out.println(sb.reverse());
//	}

// Swapping Value by 3rd Variable...
	static String remDigit(String str) {
		return str.replaceAll("\\d", "");
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
//		String str = "1234343Pavan43 4343Kumar";
//		System.err.println(remDigit(str));

//		int a =10,b=20;
//		int t;
//		System.out.println("before swapping a : b "+a+" : "+b);
//		t=a;
//		a=b;
//		b=t;
//		System.out.println("after swapping a : b "+a+" "+b);

		// swapping without third variable
		// a=10//b=20
//		b=b-a;
//		a=a+a;
//		
//		System.out.println("after swapping a : b = "+a+" : "+b);

		// get letters and digits sep

		// fibonacci sequence

//		int a =0;
//		int b=1;
//		int c = 0;
//		for (int i = 0; i <=10; i++) {
//			System.out.print(a+", ");
//			a=b;
//			b=c+a;
//			c=a;
//		}

		// Lets Find Factorial Number
//		int n =  4;
//		int factorial = 1;
//		for (int i = 1; i<=n; i++) {
//			factorial = factorial*i;
//		}
//		System.out.println("this is factorial num "+ factorial);

		// Lets Find Armstrong Number
//		int n = 153, rem = 0,temp;
//		double result =0;
//		temp = n;
//
//		while(temp!=0) {
//			rem = temp%10;
//			result= result+Math.pow(rem, 3);
//			temp = temp/10;
//			System.out.print(rem);// here by this steps we can print reverse int
//		}
//			System.out.println();
//		if(n==temp) {
//			System.out.println(n+" is a Armstrong Num");
//		}
//		else {System.out.println(n+" is a Armstrong Num");}

		// 5) Write a program for sum of digits 123 - 6

//		int n = 789 ,Xvalue, temp, result =0;
//		Xvalue = n;
//		while(Xvalue>0) {
//			temp =Xvalue%10;
//			result = temp+result;
//			Xvalue=Xvalue/10;
//		}
//		System.out.println("Sum of "+n +" is "+result);

		// 6) Write a program for reverse a number 123 -- 321

//		int n = 123,temp,result =0;
//		while (n>0) {
//			temp = n%10;
//			System.out.print(temp);			
//			n = n/10;
//		}

//		7) Write a program for writing any digit in word

		// 8) Write a program for 240 - two four zero

//		String check []= {"zero","one","two","three","four","five","six","seven","eight","nine","ten"}; 
//		String num = check[temp];
//		System.out.println(num);

//        int number = 240;
//        String words = convertNumberToWords(number);
//        System.out.println(words);
//    }
//
//    public static String convertNumberToWords(int number) {
//        if (number < 0 || number > 999) {
//            return "Number out of range (0-999)";
//        }
//
//        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//        String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
//        String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
//
//        StringBuilder result = new StringBuilder();
//
//        int hundreds = number / 100;
//        int tensDigit = (number % 100) / 10;
//        int unitsDigit = number % 10;
//
//        if (hundreds > 0) {
//            result.append(units[hundreds]).append(" hundred ");
//        }
//
//        if (tensDigit == 1 && unitsDigit > 0) {
//            result.append(teens[unitsDigit]).append(" ");
//        } else {
//            result.append(tens[tensDigit]).append(" ").append(units[unitsDigit]).append(" ");
//        }
//
//        return result.toString().trim();

		// 9) Write a program to generate any pattern of your wish.

		
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
