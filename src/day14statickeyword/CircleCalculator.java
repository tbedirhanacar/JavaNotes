package day14statickeyword;

	/*
		Static Block: 1) Static block is a code block, it is used to initialize "static(class) variables"
					  2) If you use "static block" to initialize "static variables", they will be initialized before everything inside the class	
					  3) If you have multiple static blocks, Java will execute them from top to down
	*/

public class CircleCalculator {
	
	static String nameOfTheShape = "Circle";
	int value;
	static double pi;
	static String unit;
	
	static {
		pi = 3.14;
		System.out.println("Static block 1");
	}
	
	static {
		unit = "cm";
		System.out.println("Static block 2");
	}

	public CircleCalculator() {
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
		add();
		CircleCalculator cc = new CircleCalculator();
	}
	
	public static void add() {
		System.out.println("Add method...");
	}

}
