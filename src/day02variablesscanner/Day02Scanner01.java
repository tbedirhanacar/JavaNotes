package day02variablesscanner;

import java.util.Scanner;

public class Day02Scanner01 {

	public static void main(String[] args) {
		
		//To go to a class we create object most of the times.
		//How will we create object from a class
		//a)Class Name b)Object Name c) =  d)new e)ClassName()
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Enter your age...");
//		
//		int age = scan.nextInt();
//		
//		System.out.println("Your age is " + age);
//		
//		System.out.println("Enter your first name...");
//		
//		//To get String from user you have 2 options i)next(): Gets just the first word
//		//											 ii)nextLine(): Gets all the words then moves to the next line	
//		
//		String firstName = scan.next();
//		
//		System.out.println("Your name is " + firstName);
		
		System.out.println("Enter your address...");
		String address = scan.nextLine();
		System.out.println("Your address is " + address);
		
		scan.close();
		
		
		
		
		
		
		
		
		
	}

}
