package day33maps;

import java.util.*;

	/*
	 	Ask user to enter the number of lines of a pyramide
	 	Type a program to create the pyramide
	 	For example if the number of lines is 5, the pyramide will be like;			*
	 																			  * * *
	 																			* * * * *
	 																		  * * * * * * * 
	 																		* * * * * * * * *		
	 */


public class InterviewQuestion02 {

	public static void main(String[] args) {
		
		//Number of stars at the last row 2n-1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int numOfRows = sc.nextInt();
		int numOfSpaces = 2*numOfRows-2;
		int numOfStars = 1;
		
		for(int i = 0; i<numOfRows; i++) {
			for(int j = 0; j<=numOfSpaces; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < numOfStars ; j++) {
				System.out.print("* ");
			}
			numOfStars+=2;
			numOfSpaces-=2;
			System.out.println();
			
		}
		
		sc.close();
		
		

	}

}
