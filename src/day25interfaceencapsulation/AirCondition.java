package day25interfaceencapsulation;

	/*
	 	1)Interface is not a class, interface is interface
	 	2)We need interface to be able to create "multiple interface parents" for a class
	 	3)All methods must be "abstract" in interface, because of that "interfaces" are used for "fully abstraction"
	 	  Note: We can use "abstract" and "concrete" method together in "abstract classes" because of that using "abstract class" is called
	 	        "partial abstraction".
	 	4)Do not use "abstract" keyword when you create interface. Because Java knows interfaces are abstract.
	 	5)All methods are "abstract" as default in interface, because of that using "abstract" keyword is optional in interfaces.
	 	  I mean "public abstract void electronicAc();" and "public void electronicAc();" are completely same for Java
	 	6)All methods are "public" as default in interface. Because of that using access modifier is optional for methods in an interface.
	 	  "public void climateAc();" and "void climateAc();" are completely same
	 	7)If you  make an "interface" parent of a class, do not use "extends" use "implements" 
	 	8)In different parent interfaces you can use same methods with the same name 
	 	  But pay attention to return types
	 	9)All variables in an interface are "public","static(class variable)","final" as default  
	 	  Note 1: You cannot create object by using "interfaces" because interfaces are "fully abstract" and they do not have "constructors"
	 	  Note 2: "abstract class" have "constructors" but the constructors are not used to create objects. 
	 	  		  We cannot create objects from abstract classes. 
	   10)Java knows all variables in an interface are "public","static(class variable)","final" as default therefore declaring "public", "static(class variable)", "final" for variables is optional.    
	   11)In different parent interfaces, you can create variables with the same name, it will not be problem because every time when you call a variable you have to use interface name
	   12)For abstract classes, it is not must to override the methods from interfaces. It is optional
	   13)Concrete class must override all abstract methods from all parents, otherwise you will get Compile Time Error
	      Note: If any abstract method is overriden by any parent class, it will not be must to override it by concrete child class.
	   14)Concrete Class ==> Interface: Implements
	      Abstract Class ==> Interface: Implements
	      Interface ==> Interface: Extends
	      ***** Interface ==> Concrete Class: This is not allowed in Java, class cannot be parent of an interface
	      ***** Interface ==> Abstract Class: This is not allowed in Java, class cannot be parent of an interface
	      Concrete Class ==> Concrete Class: Extends 
	      Abstract Class ==> Concrete Class: Extends
	      Concrete Class ==> Abstract Class: Extends
	      Abstract Class ==> Abstract Class: Extends

	      
	
	   		  
	 	  
	 */
	

public interface AirCondition extends Vehicle {
	
	String MAKE = "Samsung";
	
	public abstract void electronicAc();
	
	public void climeateAc();
	
	void bacteriaKiller();
	
	void run();
}
