package com.assignment3;

public class Test2 {

	public static void main(String[] args) {
Circle c= new Circle();
Rectangle r = new Rectangle();
Triangle t = new Triangle ();


double a=c.calculateArea();
double b=c.calculateperimeter();
double g=r.calculateArea();
double d=r.calculateperimeter();
double e=t.calculateArea();
double f=t.calculateperimeter();

System.out.println("Calculated Area of Circle = "+a+"\n"+"calculated perimeter of circle = "+b+"\n "+"Calculated Area of Rectangle = "+g+"\n "+"Calculated perimeter of Rectangle = "+d+"\n "+"Calculated Area of Triangle= "+ e+"\n"+"Calculated Perimeter of Triangle"+ f);

	}

}
