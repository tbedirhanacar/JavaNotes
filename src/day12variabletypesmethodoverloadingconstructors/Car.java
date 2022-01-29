package day12variabletypesmethodoverloadingconstructors;

	/*
		1)Constructor is for creating object from a class
		2)Every class has a default constructor, default constructors are invisible
		3)When you create a constructor, Java removes the default constructor
		4)How to create our own constructor
			i)Type Access Modifier make it "public" most of the times
			ii)Type the class name
			iii)Open close parenthesis
			iv)Open close curly braces
		5)Default constructor is like; "public Car() {}"
		6)Constructors don't have "return type"
		7)Constructor name MUST MATCH with the Class Name
 	*/

public class Car {
	
	String make;
	String model;
	int price;
	int year;
	
	//Constructors can be overloaded as well
	public Car() {
	
		this.make = "Honda";
		this.model = "Pilot";
		this.price = 40000;
		this.year = 2021;	
		
	}
	
	public Car(String make, String model, int price, int year) {
		
		this.make = make;
		this.model = model;
		this.price = price;
		this.year = year;
		
	}

	public static void main(String[] args) {

		
		
	}

}
