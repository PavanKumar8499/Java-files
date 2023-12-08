package com.assignment3;

public class Circle implements Shape {
	double pi=22/7;
	double r=1;

@Override
public double calculateArea() {
	double o =pi*(r*r);
	return o;
}
@Override
	public double calculateperimeter() {
	double o = 2*pi*r;
		return o;
	}
}
