package questions1123;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args)  {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int num,index=0;
		int arr []=new int[10];
		System.out.println("Enter Decimal Num :- ");
		num= s.nextInt();
		while (num>0) {
			arr[index]=num %2;
			index++;
			num = num /2;
		}
		System.out.println("The Binary num is :- ");
		for (int i=index-1; i>0; i--) {
			System.out.print(arr[i]);
		}
	}
}
//import java.util.Scanner;
//
//public class DecimalToBinary {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a decimal number: ");
//        int decimalNumber = scanner.nextInt();
//
//        String binaryRepresentation = convertDecimalToBinary(decimalNumber);
//
//        System.out.println("Binary representation: " + binaryRepresentation);
//
//        scanner.close();
//    }
//
//    private static String convertDecimalToBinary(int decimalNumber) {
//        StringBuilder binary = new StringBuilder();
//
//        while (decimalNumber > 0) {
//            int remainder = decimalNumber % 2;
//            binary.insert(0, remainder); // Add remainder to the beginning of the string
//            decimalNumber /= 2;
//        }
//
//        // If the input decimal number is 0
//        if (binary.length() == 0) {
//            binary.append("0");
//        }
//
//        return binary.toString();
//    }
//}
