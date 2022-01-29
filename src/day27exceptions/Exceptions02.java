package day27exceptions;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {

		try {
			getPrintAge();
		} catch (IllegalArgumentException e) {
			System.out.println("Hey do not you know age cannot be negative...");
		}
	}

	//Create a method to get student's age and print it on the console
	public static void getPrintAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age...");
		int age = sc.nextInt();
		sc.close();		
				
		if(age>=0) {
			System.out.println("Your age is " + age);
		}else {
			throw new IllegalArgumentException();
		}		
		
	}

}
