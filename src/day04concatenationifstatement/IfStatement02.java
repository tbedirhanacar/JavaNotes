package day04concatenationifstatement;

import java.util.Scanner;

public class IfStatement02 {
	
	//Ask user to enter a any day name, then print if it is "weekday" or "weekend" day 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Type a day name...");
		String dayName = sc.next();
		
		//Weekday
		if (dayName.equalsIgnoreCase("Monday")||dayName.equalsIgnoreCase("Tuesday")||dayName.equalsIgnoreCase("Wednesday")||dayName.equalsIgnoreCase("Thursday")||dayName.equalsIgnoreCase("Friday")) {
			
			System.out.println("Weekday");
		} 
	 
		
		//Weekend
		else if (dayName.equalsIgnoreCase("Saturday")||dayName.equalsIgnoreCase("Sunday")) {
			
			System.out.println("Weekend");
		} else {
			
			System.out.println("I don't think you typed a day name. Even if it was, I couldn't understand it.");
		}
		
		sc.close();
				
				
		
	}

}
