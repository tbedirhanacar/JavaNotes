package day06nestedternaryswitchstring;

import java.util.Scanner;

public class NestedTernary01 {
	
	/*
	 	Type a java code by using nested ternary.
	 	Write  a program to check if a year is leap year or not.
	 	If the year isdivisible by 100 then it must be divisible by 400.
	 	If a year is not divisible  by 100 then it must be divisible by 4.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year...");
		int year = sc.nextInt();
		
		if (year>0) {
		String result= (year%100==0) ? ((year%400==0) ? ("a") : ("not a")) : ((year%4==0) ? ("a") : ("not a"));
		
		System.out.println(year + " is " + result + " leap year.");
		}else {
			System.out.println("Year must be greater than 0");
			System.out.println("");
		}
		sc.close();
	}	
	

}
