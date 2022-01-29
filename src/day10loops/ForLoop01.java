package day10loops;

import java.util.Scanner;

public class ForLoop01 {
	
	/*
	 	Get the number of rows and columns from user
	 	Create a rectangle
	 	rows = 3 and column = 5
	 */
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int numOfRows = sc.nextInt();
		System.out.println("Enter number of columns");
		int numOfColumns = sc.nextInt();
		
		for (int j = 0; j < numOfRows; j++) {
			for (int i = 0; i < numOfColumns; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
			
		sc.close();
	
		
	}

}
