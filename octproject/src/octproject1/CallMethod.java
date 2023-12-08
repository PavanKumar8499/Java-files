package octproject1;

public class CallMethod {
	public static void main(String[] args) {
		SumLogic s = new SumLogic();
		int result = s.sum(12, 10);
		System.out.println("The Sum is " + result);

		AvgLogic a = new AvgLogic();
		System.out.println("The average is " + a.avg(12, 10));
	}
}
