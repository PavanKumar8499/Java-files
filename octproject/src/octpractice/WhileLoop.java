package octpractice;

public class WhileLoop {
	//Fibonacci Series
	public static void main(String[] args) {
		int a = 0,i = 0, b = 1;
		while ( i < 11 ) {

			System.out.print(a + " ");
			int sum = a + b;
			a = b;
			b = sum;
			i++;
		}
	}
}

//	Write a Java program that generates and prints the Fibonacci sequence using a while loop. Allow the user to specify how many terms of the sequence to display.
//int x = 1;
//int y= 0;
//int z=0;
//	public void ex() {
//		int i=0;
//		while ( i <= 10) {
//			z=i+z;
//			x=y;
//			y=x;
//			System.out.print(x+" ");
//i++;
//		}
//	}
//	public static void main(String[] args) {
//		WhileLoop wl =new WhileLoop();
//		wl.ex();
//	}
//}
