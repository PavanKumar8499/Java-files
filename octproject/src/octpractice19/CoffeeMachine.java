package octpractice19;

public class CoffeeMachine {
//Create a CoffeeMachine class with private attributes like coffeeType, sugarLevel, and milkLevel. Implement methods to dispense coffee, ensuring that the sugar and milk levels are within acceptable limits.

	private String coffeeType;
	private int sugarLevel;
	private int milkLevel;

	public CoffeeMachine(String coffeeType, int sugarLevel, int milkLevel) {
		this.coffeeType = coffeeType;
		this.sugarLevel = sugarLevel;
		this.milkLevel = milkLevel;
	}
	void coffeeMachine(int sugar_g, int milk_ml,String coffeeType) {
		sugarLevel = sugar_g;
		milkLevel = milk_ml;
		this.coffeeType=null;
		if (sugarLevel>0 && milkLevel >0) {
			System.out.println("its acceptable");
		} else {
			System.out.println("its Not Acceptable");	}
	}
public static void main(String[] args) {
	CoffeeMachine cm = new CoffeeMachine ("Best",25,20);
	
cm.coffeeMachine(25,20,"Best");
}
}
