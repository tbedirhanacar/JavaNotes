package day03scannerincrementdecrement;

public class Increment01 {
	
	public static void main(String[] args) {
		
		int age = 12;
		System.out.println("Before increment: " + age);
		
		
		//1.Way:
		age = age + 5;
		System.out.println("After 1st increment: " + age);
		
		age = age + 4;
		System.out.println("After 2st increment: " + age);
		
		age = age*2;
		System.out.println("After 3rd increment: " + age);
	
		//2.Way:
		age+=5;//This is same with age = age + 5
		System.out.println("After 4th increment: " + age);
		
		age*=2;
		System.out.println("After 5th increment: " + age);
		
		//3.Way: This way can be used just to increase by 1
		age++;
		System.out.println("After 6th increment: " + age);
		
		
		
		
		
		
	}

}
