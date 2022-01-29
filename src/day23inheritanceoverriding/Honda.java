package day23inheritanceoverriding;

	/*
 		1) The method inside the child class (Overriden) cannot have narrower access modifier. It means the method in child class can
 		   have same or wider acces modifier. Otherwise, you will get compile time error.
 		   
 		   Note: The method inside the parent class is called "Overriding" method 
 		
 		   Note: If the method in parent class has
 		   i)"default" access modifier then overriden method can have "default", "protected", "public"
 		   ii)"protected" access modifier then overriden method can have "protected, "public"
 		   iii)"public" access modifer then overriden method can have "public"
 		   
 		2) "private" methods cannot be overriden
 		
 		3) i) If the return type in the "Overriding Method" is void "Overridden method" must have "void" as return type
 		   ii) If the return type in the "Overriding Method" is primitve "Overridden method" must have same return type
 		   iii) If the return type is "non-primitive", you must have IS-A relationship from the return type of "Overridden Method"
 		   to return type of "Overriding Method"
 		   iv) ıf the return type is "Wrapper Class", you cannot use different return type in overriding because Java did not
 		   create a "IS-A" relationship between "Wrapper Classes"

 		4) "Static" methods cannot be overridden because implementation of a static method is common for all objects. You cannot specify
 		   the implementation for a single class.
 		     
		5) "final method" means, implementation(codes inside the body) cannot be changed. But we override a method to change
		   the codes inside the body. This is contradiction because of that Java does not let us to override final method
		   
		   "final Variable" means, the value of the variable cannot be changed.
		   final int age = 41;
		   age = 42; ==> That code gives Compile Time Error
		   
		   "final class" cannot have any child class
		   If a class is a "final class", no class can extend to it.
		   "final class" cannot be "parent class", it can be child class
		   
		   "finalize" means, process Garbage Collector applies before destroying objects
		   
	 */

public class Honda extends Car {
	
	public void havingHybridEngine() {
		System.out.println("Honda cars have hybrid engine option...");
	}

	@Override
	public void move() {		
		System.out.println("Honda moves fast...");	
	}

	@Override
	public int price() {
		return 30000;
	}

	@Override
	public Honda name() {
		return new Honda();
	}

	@Override
	public Integer age() {
		return 1;
	}
	
	
	
	
	
	
	
}
