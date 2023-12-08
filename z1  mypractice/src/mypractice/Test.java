package mypractice;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		
		
		mypractice1 mp = new mypractice1();
		mp.stud(4, 3);
		mp.sub(3, 1);
		mp.mul(1, 2);
		mp.star(1);

		// variables
		int a = 10;
		int b = 20;
		int x = a + b;
		System.out.println("this addition = " + x);
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println(name);
		
		//tables
		 Scanner dd = new Scanner (System.in);
			// 2 ka table
			int z = dd.nextInt();
			int aa = z * 1;
			int bb = z * 2;
			int cc = z * 3;
			int d = z * 4;
			int zz = z * 5;
			int ee = z * 6;
			int ff = z * 7;
			int gg = z * 8;
			int hh = z * 9;
			int ii = z * 10;
			System.out.println(aa);
			System.out.println(bb);
			System.out.println(cc);
			System.out.println(d);
			System.out.println(zz);
			System.out.println(ee);
			System.out.println(ff);
			System.out.println(gg);
			System.out.println(hh);
			System.out.println(ii);
			int v = dd.nextInt();
			if (v % 2 == 0) {
				System.out.println("This is an Even number ");

			} else {
				System.out.println("this is an Odd number");
			}
		
	}

}
