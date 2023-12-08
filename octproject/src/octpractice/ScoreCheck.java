package octpractice;

import java.util.Scanner;

public class ScoreCheck {
//	Write a Java program to calculate and display the grade of a student based on their score. Use an if-else statement to assign grades (A, B, C, etc.) based on score ranges.
//	public void tp() {
//		for (int i = 0; i <= 10; i++) {
//			System.out.println("Focus");
//		}
//	}
	Scanner s = new Scanner(System.in);
	float score =s.nextFloat();
	public void checkScore() {
		
		if(score <45) {
			System.out.println("Score is "+score+" Then Your Grade is C");
		}else if(score >60) {
			System.out.println("Score is "+score+" Then Your Grade is B");
		}else if(score>75) {
			System.out.println("Score is "+score+" Then Your Grade is A");
		}else {System.out.println("Yon Need to go for Top University");}
	}
	public static void main(String[] args) {
		System.out.println("Enter Your Score");
		ScoreCheck m = new ScoreCheck();
		m.checkScore();
		
	}
}
