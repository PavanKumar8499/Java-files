package mypractice;

import java.util.*;

public class Myfirstcalender {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int button = s.nextInt();
		
		switch (button) {
		case 1:
			System.out.println("this is january");
			break;
		case 2:
			System.out.println("this is feb");
			break;
		case 3: 
			System.out.println("this is march");
			break;
		case 4: 
			System.out.println("this is april");
			break;
		case 5: 
			System.out.println("this is may");
			break;
		case 6:
			System.out.println("this is june");
			break;
		case 7:
			System.out.println("this july");
			break;
		case 8:
			System.out.println("this augast");
			break;
		case 9:
			System.out.println("this sep");
			break;
		case 10:
			System.out.println("this oct");
			break;
		case 11:
			System.out.println("this nov");
			break;
		case 12:
			System.out.println("this dec");
			break;
		default: System.out.println("just be aggressive abt coding be master in coading");

		}
	}
}