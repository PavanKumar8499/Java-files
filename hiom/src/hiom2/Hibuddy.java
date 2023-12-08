package hiom2;

public class Hibuddy {
private int add (int a, int b) {
	System.out.println( a+b);
	return a+b;
	
}
void avg (int a, int b) {
	Hibuddy h1 = new Hibuddy();
	int x =h1.add(a, b);
	int y = x/2;
	System.out.println(y);

}
public static void main(String[] args) {
	Hibuddy h = new Hibuddy();
	h.add(10, 20);
}
}
