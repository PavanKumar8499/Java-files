package avaragepro;

public class wapaverage {
	
	double average(int a, int b){
		
		double x = a+b;
		double y = x/2;
		return y;
	}
public static void main(String[] args) {
	wapaverage wp = new wapaverage();
	
	double y=wp.average(5, 6);
	System.out.println(y);
}
}


