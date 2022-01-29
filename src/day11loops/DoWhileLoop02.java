package day11loops;

import java.util.Scanner;

public class DoWhileLoop02 {
	
	/*
	 	Ask user to enter an integer
	 	If the integer is less than 100, tell user "Won!"
	 	Otherwise tell user "Lost!"
	*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		do {
			System.out.println("Enter an integer...");
			
			n = sc.nextInt();
			
			if (n<100) {
				System.out.println("You won!");
			}
		}while(n < 100);
			
		System.out.println("Game Over");
		sc.close();
	}

}
