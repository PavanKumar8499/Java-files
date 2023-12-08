package todayspract9;

import todayspract5.variable1;

public class prac7 {
	public void arofangle() {
		variable1 v = new variable1();
		int x = v.a;
		int y = v.b;
		int z =  x *( y/2);
		System.out.println("here is are of angle " + z);
	}
	public static void main(String[] args) {
		prac7 p = new prac7();
		p.arofangle();
	}
}
