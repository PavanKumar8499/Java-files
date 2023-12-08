package octpractice;

public class OddEven {
//	Write a Java program that checks if a given number is even or odd using an if-else statement.

	int a;// Declare the variable a

	OddEven(int a) {
		this.a = a;
	}

	public void checkEvenOdd() {
		if (a % 2 == 0) {
			System.out.println("The num is even " + a);

		} else {
			System.out.println("The Num is Odd " + a);
		}

	}

	public static void main(String[] args) {
		OddEven c = new OddEven(88);
		c.checkEvenOdd();// call the logic of if else
	}
}

// odd even by method calling 
