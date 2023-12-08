package mypractice;

public class Test2 {
	public static void main(String[] args) {
		int n = 150;
		for (int i = 1; i <= n; i++) {

			if (i % 9 == 0 && i % 2 != 0) {
				System.out.println(i + " This odd num are divisible by 9 ");
			}
		}
	}
}
