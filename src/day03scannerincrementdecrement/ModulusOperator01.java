package day03scannerincrementdecrement;

import java.util.Scanner;

public class ModulusOperator01 {
	 
	//When do we need the remainder in division operation we use "modulus operator".
	//The symbol of "modulus operator" is "%"
	
	/*
	 	Ask user to enter two integer values, the first will be greater than the second.
	 	The remainder when you divide the first by the second will be the width,
	 	and the sum of the two numbers will be the lenght of a rectangle.
	 	Then calculate the area and the perimeter of the rectangle, and print them
	 	on the console.
	 */

	public static void main(String[] args) {
		
		int greaterNumber;
		int lessNumber;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		if  (n1 > n2) {
			
			greaterNumber = n1;
			lessNumber = n2;
							
		}else {
			greaterNumber = n2;
			lessNumber = n1;
		}
		
		int width = greaterNumber % lessNumber;
		int length = greaterNumber + lessNumber;
		
		System.out.println("The area of your rectangle :" + width*length);
		System.out.println("The perimeter of your rectange: " + 2 * (width  + length));
		
		scan.close();
		
		
		

	}

}
