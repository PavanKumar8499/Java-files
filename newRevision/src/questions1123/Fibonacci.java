package questions1123;


public class Fibonacci {

	public static void main(String[] args) {
//Write a Java Program to generate Fibonacci Triangle.

//	Scanner s = new Scanner(System.in);
		int c = 0;
		int a = 0, b = 1;
		int []num = new int[10] ;
//	s.nextInt();
		for (int i = 0; i <= 10; i++) {
//			System.out.print(c + " ");
			num[i]=c;
			a = b;
			b = c;
			c = a + b;
			
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
	}
}
