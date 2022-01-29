package day10loops;

import java.util.Scanner;

public class ForLoops02 {
	
	/*
	 	Get the number of rows from user then draw a right triangle by using asterixes
	 	Number of rows = 4 ==> *
	 						   * *	
	 						   * * *
	 						   * * * *
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type number of rows...");
		int numOfRows = sc.nextInt();
		String asterixes = "* ";
		
		for (int i = 0; i < numOfRows; i++) {
			System.out.println(asterixes);
			asterixes = asterixes + "* ";
		}
		
		sc.close();
	
	}
}
