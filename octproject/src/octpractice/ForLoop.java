package octpractice;

import java.util.Iterator;
import java.util.Scanner;

public class ForLoop {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a non-negative integer: ");
    int number = scanner.nextInt();
    
    if (number < 0) {
        System.out.println("Factorial is not defined for negative numbers.");
    } else if (number == 0) {
        System.out.println("The factorial of 0 is 1.");
    } else {
        long factorial = 1;  // Use long to handle larger factorials
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
    }
    
    scanner.close();


}
}
