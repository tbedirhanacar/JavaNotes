package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulation02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name...");
		String fulName = sc.nextLine();
		
		System.out.println(fulName);
		
		//1)Remove spaces from beginning and end when user entered the name fulName.trim();
		System.out.println(fulName.trim());
		
		//2)Check if the String is empty String
		System.out.println(fulName.isEmpty());
		
		//4)Check if the String is blank
		System.out.println(fulName.isBlank());
		
		//Check the products if there is any product which has no price.
		
		sc.close();
	}
}
