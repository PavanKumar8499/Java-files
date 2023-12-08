package com.assignment1;

public class Lion extends Animal {

	public Lion(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeSound() {
		System.out.println("Name "+this.name + "age "+ this.age);
		System.out.println("Roars...ssss ");
		System.out.println();

	}
}
