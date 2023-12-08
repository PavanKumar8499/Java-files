package spcl;

public class Spcl2 {
	public static void main(String[] args) {
		int x =1;
		int y=0;
		int z=0;
		for (int i = 0; i <=10; i++) {
		z	=x+y;
		x=y;
		y=z;
			System.out.print(x+" ");
		}
		
}
}
      //0 1 1 2 3 5 8 13 21 34 55 89 144 