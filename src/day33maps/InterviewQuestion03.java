package day33maps;

import java.util.Scanner;

public class InterviewQuestion03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int numOfRows = sc.nextInt();
		int numOfSpaces = 0;
		int numOfStars = 2*numOfRows-1;
		
		for(int i = numOfRows; i>0; i--) {
			for(int j = numOfSpaces; j>0; j--) {
				System.out.print(" ");
			}
			for (int j = numOfStars; j > 0 ; j--) {
				System.out.print("* ");
			}
			numOfStars-=2;
			numOfSpaces+=2;
			System.out.println();
			
		}
		
		sc.close();

	}

}
