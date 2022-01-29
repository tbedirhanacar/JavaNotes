package day05nestedifternary;

import java.util.Scanner;

public class IfElse01 {
	
	/*
	 	Type java code by using if-else if() statement.
	 	Write a program to check if a year is leap year or not
	 	If the year is divisible by 100 then it must be divisible by 400.
	 	If a year is not divisible by 100 then is must be divisible by 4.
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Type year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if (year<0) {
			System.out.println("The year must be more than zero");
		}else if (year%100==0 && year%400==0) {
			System.out.println(year + " is a leap year");
		}else if (year%100!=0 && year%4==0) {
			System.out.println(year + " is a leap year");
		}else {
			System.out.println(year + " is not a leap year");
		}
		sc.close();
	}

}
