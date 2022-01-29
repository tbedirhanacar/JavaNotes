package day22inheritance;

	/*
	 	1) "Private" class members cannot be accessed by child classes
	 	2) "Default" class members can be used by child classes if the childclass is in the same package with the parent calss
	 	3) "Protected" class members can be used by child classes
	 	4) "Public" class member can be used by child classes
	 	5) To use "static" class members, no need to create object, use them by class name
		6) "super()" is for calling parent constructor. If you don't type "super()" inside the constructor
			Java will put it as default but it will be invisible
		7) "super()" must be in the first line inside the constructor.
		8) "this()" and "super()" must be in the first line inside a constructor so "this()" and "super()" cannot
		 	be used at the same time in a constructor
		9) Java doesn't support multiple inheritance. A child class cannot have multpile parents
	 */


public class Animal {
	
	public Animal(String name) {
		System.out.println("String animal constructor");
	}
	
	public Animal() {
		System.out.println("No parameter animal Constructor");
	}
	
	int age;

	public void eat() {
		System.out.println("They eat...");
	}
	public void drink() {
		System.out.println("They drink...");
	}
	
}
