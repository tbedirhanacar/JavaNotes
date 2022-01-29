package day04concatenationifstatement;

import java.util.Scanner;

public class IfStatement01 {
	
	/*
	 	"If it rains, I will cancel the picnic" in English
	 	"if (it rains){ I will cancel the picnic } in Java
	 	
	 	
	 */
	
	public static void pause(int ms) {
	    try {
	        Thread.sleep(ms);
	    } catch (InterruptedException e) {
	        System.err.format("IOException: %s%n", e);
	    }
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("I need a number...");
		int num = scan.nextInt();
		System.out.println("Enter one more number...");
		int num2 = scan.nextInt();
		
		//1st Example: Get a number from user. If the number is even, print "Even" on the console.
		if (num % 2 == 0) {
			
			System.out.println(num + " is an even num");
			
		}	
		
		//2nd Example: Get a number from user. If the number is odd, print "Odd" on the console.
		
		if (num % 2 != 0) {
			
			System.out.println(num + " is an odd num");
		
			
		}		
		
		//3rd Example: Get 2 numbers from user. If ther equal to each other, print "Square" on the console.
		
		if (num == num2) {
		
			System.out.println("Square");
			
		}
		
		scan.close();
		
	}

}
