package com.demo;

import java.util.Scanner;

public class Test4 {
//	Test4() {
//		System.out.println("This is Constructor");
//	}
//	{
//		System.out.println("Hey this is blockkkkkkkkk");
//	}
//
//	static {
//		System.out.println("Hello Frnd");
//	}
//
//	void abc() {
//		System.out.println("I Can Do Anything ");
//	}
//
//	public static void main(String[] args) {
//		Test4 t = new Test4();
//		t.abc();
//
//	}

//	public static void main(String[] args) {
//		for(int i =1; i<=4; i++) {
//			for(int j=1; j<=4; j++) {
//				if(i==1||j==1||i==4||j==4) {
//					System.out.print("* ");
//				}else {System.out.print("  ");}
//			}
//			System.out.println(" ");
//		}
//	}
//	public static void main(String[] args) {
//		for( int i=1; i<=4; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println(" ");
//		}
//	

//	public static void main(String[] args) {
//		for (int i = 4; i >= 1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println("O ");
//		}
//	}
//	public static void main(String[] args) {
//		for (int i = 4; i >= 1; i--) {
//			for (int j = 1; j <= i - 1; j++) {
//				System.out.print("O ");
//			}
//			for (int p =4; p>= i; p--) {
//				System.out.print("* ");
//			}
//			System.out.println(" ");
//		}
//	}
//	public static void main(String[] args) {
//		for (int i =5; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println(" ");
//		}
//	}
//	public static void main(String[] args) {
//		int num = 1;
//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print(num + " ");
//				num++;
//			}
//			System.out.println(" ");
//		}
//	}
//public static void main(String[] args) {
//	for (int i =1; i<=4; i++) {
//		for(int j=1; j<=i; j++) {
//			if((i+j)%2 ==0) {
//				System.out.print("1 ");
//			}else {
//				System.out.print("0 ");
//			}
//			
//		}
//		System.out.println(" ");
//	}
//}
//	public static void main(String[] args) {
//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			int spc = 2 * (n - i);
//			for (int j = 1; j <= spc; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		// lower half
//		for (int i = n; i >= 1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			int spc = 2 * (n - i);
//			for (int j = 1; j <= spc; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//}

	// o/p * *
//	**      **
//	***    ***
//	****  ****
//	**********
//	**********
//	****  ****
//	***    ***
//	**      **
//	*        *

//	public static void main(String args[]) {
//		int n = 4;
//
//		// upper part
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//
//			int spaces = 2 * (n - i);
//			for (int j = 1; j <= spaces; j++) {
//				System.out.print(" ");
//			}
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
////upper part
//		for (int i = n; i >= 1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//
//			int spaces = 2 * (n - i);
//			for (int j = 1; j <= spaces; j++) {
//				System.out.print(" ");
//			}
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//
//	}
//	//op 
//	*       * 
//	* *     * * 
//	* * *   * * * 
//	* * * * * * * * 
//	* * * * * * * * 
//	* * *   * * * 
//	* *     * * 
//	*       * 
//public static void main(String[] args) {
//	for(int i = 1; i<=5; i++) {
//		for(int j=4; j>=i;j--) {
//			System.out.print("  ");
//		}
//		for(int j=1; j<=5;j++) {
//			System.out.print("* ");
//		}
//		System.out.println("  ");
//	}
//}
//	public static void main(String[] args) {
//		for (int i =1; i<=5; i++) {
//			for(int j=5; j>=i-1;j--) {
//				System.out.print(" ");
//				
//			}
//			for(int j=1; j<=i;j++) {
//		 		System.out.print(i+" ");
//			}
//			System.out.println();
//		}
//	}
	// o/p
//	    1 
//     2 2 
//    3 3 3 
//   4 4 4 4 
//  5 5 5 5 5 

//	public static void main(String[] args) {
//
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5 - i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = i; j >= 1; j--) {
//				System.out.print(j + "");
//			}
//			for (int j = 2; j <= i; j++) {
//				System.out.print(j + "");
//			}
//
//			System.out.println();
//		}
//	}
//O/P
//	 	1
//	   212
//	  32123
//	 4321234
//	543212345

//	public static void main(String[] args) {
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= 4 - i; j++) {
//				System.out.print("  ");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			for (int j = 2; j <= i; j++) {
//				System.out.print("* ");
//			}
//
//			System.out.println();
//		}
//		for (int i = 4; i >= 1; i--) {
//			for (int j = 1; j <= 4 - i; j++) {
//				System.out.print("  ");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			for (int j = 2; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
//O/P ---------

//       * 
//     * * * 
//   * * * * * 
// * * * * * * * 
// * * * * * * * 
//   * * * * * 
//     * * * 
//       * 

//	public static void main(String[] args) {
//		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
//		System.out.print("These are even num = ");
//
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] % 2 == 0)
//				System.out.print(a[i] + ", ");
//		}
//	}

//	public static void main(String[] args) {
//		String s = "Java by Kiran";
//		int check  = 0 ; 
//		for (int i = 0; i < s.length(); i++) {
//			for (int j = 0; j < s.length(); j++) {
//				if(s.charAt(i)==s.charAt(j)&&i!=j) {
//					check =1;
//					break;
//				}
//			}
//		}
//		
//		if (check==1) {
//			System.out.println("String done not have all uniqeu char");
//		} else {System.out.println("String have all unique char");
//
//		}
//	}

//	public static void main(String[] args) {
//		System.out.println("hi");
//		String s = "pavan";
//		int a = s.length();
//		String rev = "";
//		for (int i =a-1; i >=0 ; i--) {
//			rev += s.charAt(i);
//		}
//		System.out.println(rev);
//
//	}

//	public static void main(String[] args) {
//		String s = "Pavan Sudhakar Pophale";
//		int a = s.length();
//		String name = "";
//		for (int i = 0; i <=a-1; i++) {
//			name +=s.charAt(i);
//		}
//		System.out.println(name);
//	}

//	public static void main(String[] args) {
//		int n,r,sum=0 ;
//		System.out.println("Enter any num");
//		Scanner s = new Scanner(System.in);
//		 n = s.nextint();
//	while (n>0) {
//			r = n%10;
//			sum= sum+r;
//			n=n/10;
//		}
//	System.out.println(sum);
//	}

//	public static void main(String[] args) {
//		int n = 321;
//		int sum = 0;
//		int temp=0 ;
//		while (n > 0) {
//			temp = n % 10;
//			sum = sum + temp;
//			n = n / 10;
//		}
//		System.out.println(sum);
//	}

	/*
	 * public static void main(String[] args) { int n =143; int sum =0; int temp;
	 * while (n>0) { temp = n%10; System.out.print(temp); n=n/10;
	 * 
	 * } } // to reverse the int
	 * 
	 */

//	public static void main(String[] args) {
//		int p = 11032000;
//		int sum =0;
//		int t ;
//		while (p>0) {
//			t = p%10;
//			sum +=t;
//			p =p/10;
//			
//		}
//		System.out.println(sum);
//	}
//	
//	public static void main(String[] args) {
//		int n = 143;
//		int sum =0;
//		int tmp;
//		while (n>0) {
//			tmp = n%10;
//			System.out.print(tmp);
//			n = n/10;
//			
//		}
//	}
//	

//	public static void main(String[] args) {
//
//		String x = "PavanKumar";
//		int n = x.length();
//		for (int i = n - 1; i >= 0; i--) {
//			System.out.print(x.charAt(i));
//		}
//	}
// i think i achive 2 question for interview nothing else but it was very easy thank u god to increase my focus

//	    public static void main(String[] args) {
//	        String p = "PavanKumar Chaturvedi";
//	        String r = new StringBuilder(p).reverse().toString();
//	        System.out.println("Original string: " + p);
//	        System.out.println("Reversed string: " + r);
//	    }
//	public static void main(String[] args) {
//		String k = "Pavan Money";
//		String s = new StringBuilder(k).reverse().toString();
//		System.out.println(k+"\n"+s);
//	}
//public static void main(String[] args) {
//	for (int i = 0; i <3; i++) {
//		System.out.println(" I want to be a Master in this programming ");
//		
//	}
//}
//

//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int a = s.nextInt();
//		int b = s.nextInt();
//
//		int[][] num = new int[a][b];
////input
//		for (int i = 0; i < a; i++) {
//			// colom
//			for (int j = 0; j < b; j++) {
//				num[a][b] = s.nextInt();
//			}
//
//		}
//
//	}

//	public static void main(String[] args) {
//		for (int i = 1; i <=9; i++) {
//			for (int j = 1;  j <=9; j++) {
//				if((j>=(6-i)&&j<=(4+i))&&(j>=(i-4)&&j<=(14-i))) {
//					System.out.print("*");
//				}
//			}
//			System.out.println(" ");
//		}
//	}
//	
//	public static void main(String[] args) {
//		System.out.println("This are the num which are div by 5 from this array");
//		int a[] = { 10, 28, 30, 45, 65, 55, 60, 76 };
//		int b = a.length;
//		for (int i = 0; i < b-1; i++) {
//			if (a[i] % 5 == 0&& a[i]%2==0) {
//				System.out.print(a[i]+" ");
//			}
//		}
//	}
	
//	public static void main(String[] args) {
//		int a =0;
//		for (int i = 1; i <=10; i++) {
//			a=i*2;
//			System.out.println("2 X "+i+" = "+a+" " );
//		}
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
	

