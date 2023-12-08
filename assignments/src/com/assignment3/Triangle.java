package com.assignment3;

public class Triangle implements Shape {
	double x=1,y=1, a= 1;
@Override
public double calculateArea() {
	double z=x*y/2;
	
	return z;
}	

@Override
	public double calculateperimeter() {
	double b = x+y+a;
		return b;
	}
}
