package day04concatenationifstatement;

import java.util.Scanner;

public class IfStatement03 {
	
	/*
	 	Type code to print the seasons after getting month names from user
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey, type current month...");
		String month = sc.next();
		
		
		if (month.equalsIgnoreCase("December")||month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February")){
			
			month = month.substring(0,1).toUpperCase() + month.substring(1).toLowerCase();
			System.out.println(month + " is in winter");
		}
		else if (month.equalsIgnoreCase("March")||month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May")){
			
			month = month.substring(0,1).toUpperCase() + month.substring(1).toLowerCase();
			System.out.println(month + " is in spring");
		}
		else if (month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")){
			
			month = month.substring(0,1).toUpperCase() + month.substring(1).toLowerCase();
			System.out.println(month + " is in summer");
		}
		else if (month.equalsIgnoreCase("September")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")){
			
			month = month.substring(0,1).toUpperCase() + month.substring(1).toLowerCase();
			System.out.println(month + " is in autumn");
		}
		else {
			
			System.out.println("I don't think '"+month+"' is a month. Even if it was, I couldn't understand it.");			

		}
		
		sc.close();
	}
}
