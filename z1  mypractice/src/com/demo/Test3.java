package com.demo;

public class Test3 
{
public static void main(String[] args) 
{ int n=5;
	for(int i=0 ;i<n;i++)//outer for loop -> represent no. of rows
	{
		for(int j=2*(n-i) ;j>=0;j--)//inner1 for loop -> represent no. of columns
		{
			System.out.print(" ");
		}
		for(int j=0 ;j<=i;j++)//inner2 for loop -> represent no. of columns
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
