package day10loops;

import java.util.Scanner;

public class WhileLoop04 {
	
	/*
 	Type java code by using while loop
 	Write a program to count the factors of an integer which is enterd by user
 	Factors of 12 = 1, 2, 3, 4, 6, 12
 	Factors of 8  = 1, 2, 4, 8
	*/

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int num = Math.abs(sc.nextInt());
		
		String factors = "";
		
		int numOfFactors = 0;
		int i = 1;
		
		while (i < num+1) {
			if (num%i == 0) {
				factors = factors + i + " ";
				numOfFactors++;
			}
			i++;
		}
		
		sc.close();
		System.out.println("Num of positive factors is: " + numOfFactors);
		System.out.println("Num of negative factors is: " + numOfFactors);
		System.out.println("Num of all factors is: "	  + numOfFactors*2);
		//System.out.println(factors.trim());
	}

}
