package com.assignment3;

public class Rectangle implements Shape{
	double l=10, b=20;
	
@Override
public double calculateArea() {
	double x = l*b;
	return x;
}
@Override
	public double calculateperimeter() {
	double y = 2*(l+b);
		return y;
	}
}
