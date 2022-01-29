package day05nestedifternary;

public class Ternary01 {
	
	/*
	 	If an integer is positive print "The integer is positive" otherwise print "The integer is not positive"
	 */
	
	public static void abs(int value) {
		
		int absval = value<0 ? value*(-1) : value;
		System.out.println(absval);
		
	}

	public static void main(String[] args) {
		
		int num = 12;
		
		//Solve by using if-else
		if(num>0) {
			System.out.println("The integer is positive");
		}else {
			System.out.println("The integer is not positive");
		}
		

		//Solve by using ternary
		System.out.println(num>0 ? "The integer is positive" : "The integer is not positive");
		
		int n1 = 25, n2 = 23;
		System.out.println(n1<n2 ? n1 : n2);
		
		//Write a program to print absoulte value of an integer entered by user
		abs(69);
		
	
		
	}

}
