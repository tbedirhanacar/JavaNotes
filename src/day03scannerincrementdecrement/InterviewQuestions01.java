package day03scannerincrementdecrement;

import java.util.Scanner;

public class InterviewQuestions01 {
	
	/*
		Get 2 numbers from user then swap the numbers
		User ==> a = 2 and b = 5
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
		
		System.out.println("Hey user, welcome :)");
		pause(2000);
		System.out.println("I need 2 numbers, 'A' and 'B'");
		pause(2000);
		System.out.println("Remember both numbers should be 'whole' numbers");
		pause(2000);
		System.out.println("Enter number A...");
		int a = scan.nextInt();
		System.out.println("Great! Now I need the second number");
		pause(2000);
		System.out.println("Enter number B...");
		int b = scan.nextInt();
		System.out.println("Ok, so your numbers are like this: A = " + a + " and B = " + b);
		pause(3000);
		System.out.println("Now lets see the magic :)");
		
		//1.Way: By using 3rd container...
//		int container;
//		container = a;
//		a = b;
//		b = container;
//		pause(3000);
//		System.out.println("I did some trolling and swapped your numbers :)");
//		pause(2000);
//		System.out.println("A = " + a + " B = " + b);
//		pause(2000);
//		System.out.println("Hope you enjoyed. Now f*** off :D");
		
		//2.Way: Without using 3rd container...
		a = a + b;
		
		b = a - b;
		
		a = a - b;

				
	    pause(3000);
		System.out.println("I did some trolling and swapped your numbers :)");
		pause(2000);
		System.out.println("A = " + a + " B = " + b);
		
		scan.close();
		
	}
	
	

}
