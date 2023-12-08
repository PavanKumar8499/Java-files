package octpractice19;

public class SwitchCases {
private int day;
private String Letter;
//	Write a Java program that takes a day of the week as an integer (1 for Monday, 2 for Tuesday, etc.) and uses a switch statement to print the name of the day.

  SwitchCases( int day) {
	this.day=1;
	switch (day) {
	case 1: System.out.println("Monday");
	break;
	case 2: System.out.println("Tuesday");
	break;
	case 3: System.out.println("Wednesday");
	break;
	case 4: System.out.println("Thursday");
	break;
	case 5: System.out.println("Friday");
	break;
	case 6: System.out.println("Saturday");
	break;
	case 7: System.out.println("Sunday");
	break;

	default: System.out.println("ohh u entered Wrong Num");
		break;
	}
	
}
  
//  Create a Java program that takes a single character as input and uses a switch statement to determine whether it is a vowel (a, e, i, o, u) or a consonant.

  SwitchCases( String Letter) {
		this.Letter="a";
		switch (Letter) {
		case "a": 
		
		case "e": 
		
		case "i": 
		
		case "o": 
		
		case "u": System.out.println("It is Vowel ");
		break;

		default: System.out.println("It is not Vowel ");
			break;
		}
  }
  public static void main(String[] args) {
	SwitchCases sc = new SwitchCases("b");
//	sc.switchEx();
}
}
