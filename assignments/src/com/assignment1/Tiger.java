package com.assignment1;

public class Tiger extends Animal{
		public Tiger(String name, int age) {
			super(name, age);
		}

		@Override
		public void makeSound() {
			System.out.println("Name "+this.name + "age "+ this.age);
			System.out.println("Moan...ssss");
			System.out.println();
		}
	}
