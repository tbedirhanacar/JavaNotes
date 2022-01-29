package day02variablesscanner;

import java.util.Scanner;

public class Day02MyDiscordBot {

	public static void main(String[] args) {
		
		//To go to a class we create object most of the times.
		//How will we create object from a class
		//a)Class Name b)Object Name c) =  d)new e)ClassName()
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your age...");
		
		int age = scan.nextInt();
		
		System.out.println("Enter your first name...");
		
		String firstName = scan.next();
		
		System.out.println("Enter your last name");
		
		String lastName = scan.next();
		 
		firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
		
		lastName = lastName.toUpperCase();
		char lastInitial = lastName.charAt(0);
				
		System.out.println("Your discord nick has been changed as " + firstName + " " + lastInitial + ".(" + age + ")");
		
		scan.close();
	}

}
