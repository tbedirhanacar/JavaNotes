package day08loops;

import java.util.Scanner;

public class StringManipulation01 {

	/*
	 	Ask user to enter SSN (9 digits)
	 	Print the SSN on the console after converting first 5 digits to *
	 	Ex: 123456789 ==> *****6789
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your social security number");
		String ssn = sc.next();
		
		if (ssn.length() == 9) {
			
			System.out.println("*****" + ssn.substring(5));
			
		} else {

			System.out.println("SSN should be 9 digits");
			
		}
		
		sc.close();
		
		
	}

}
