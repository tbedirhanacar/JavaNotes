package day06nestedternaryswitchstring;

import java.util.Scanner;

public class Switch02 {

	/*
	 	Ask user to enter month number
	 	Your code will print all month names starts with the month whose number is given by user
	 	11==>November December
	 	9 ==>September October November December
	 */
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month number...");
		int monthNumber = sc.nextInt();
		
		switch (monthNumber) {
		
			case 1:
				System.out.println("January");
			case 2:
				System.out.println("February");				
			case 3:
				System.out.println("March");	
			case 4:
				System.out.println("April");
			case 5:
				System.out.println("May");
			case 6:
				System.out.println("June");
			case 7:
				System.out.println("July");
			case 8:
				System.out.println("August");
			case 9:
				System.out.println("September");
			case 10:
				System.out.println("October");
			case 11:
				System.out.println("November");
			case 12:
				System.out.println("December");
				break;
			default:
				System.out.println("I don't think I can relate this number with a month");
		}
			sc.close();
	}
}
