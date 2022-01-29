package day22inheritance;

public class Dog extends Mammal {
	
	public Dog() {
		super(true);
		System.out.println("Boolean dog constructor");
	}
	
	public Dog(int age) {
		super();
		System.out.println("Integer dog Constructor");
	}
	
	public void bark() {
		System.out.println("Dogs bark...");
	}
	
	

}
