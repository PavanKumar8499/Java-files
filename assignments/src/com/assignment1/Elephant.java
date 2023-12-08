package com.assignment1;

public class Elephant extends Animal {
	public Elephant(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeSound() {
		System.out.println("Name "+this.name + "age "+ this.age);
		System.out.println("Trumpet...ssss ");
		System.out.println();

	}
}
