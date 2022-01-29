package day03scannerincrementdecrement;

import java.util.Scanner;

public class Scanner04 {

	/*
		Get the first name, middle name, last name, SSN from  user then print them like the following
		Ali Mert Can
		123456789	
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first name...");
		String fName = scan.next();
		
		System.out.println("Enter middle name...(If no middle name press enter)");
		String mName = scan.next();
		
		System.out.println("Enter last name...");
		String lName = scan.next();
		
		System.out.println("Enter SSN...");
		String ssn = scan.next();
		
		System.out.println(fName.toUpperCase()+" "+mName.toUpperCase()+" "+lName.toUpperCase());
		System.out.println(ssn);
		
		scan.close();


	}

}
