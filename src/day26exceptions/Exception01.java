package day26exceptions;

	/*
	 	1) Exception is "unexpected issue"
	 	2) If there is any Exception
	 		i)Stpos execution
	 		ii)Throws Exception
	 	3) try-block cannot be used alone
	 	4) After try-block we can use multiple catch-block
	 	5) When you use multiple catch block, if there is parent-child relationship between the Exception Classes
	 	   child class must be at the top.
	 	   But if there is no parent-child relationship order is not important
	 */

public class Exception01 {

	public static void main(String[] args) {
				
		System.out.println(division(12,3));	
		System.out.println(division(10, 10));
		System.out.println(division(0, 10));	
		System.out.println(division(10, 0));
		System.out.println("Hello");
		
		int arr[] = {2, 3, 7, 1, 5};	
		System.out.println(addTwoConsecutiveArrayElement(arr, 0));		
		System.out.println(addTwoConsecutiveArrayElement(arr, 1));
		System.out.println(addTwoConsecutiveArrayElement(arr, 2));
		System.out.println(addTwoConsecutiveArrayElement(arr, 3));
		System.out.println(addTwoConsecutiveArrayElement(arr, 4));
		
		int brr[] = {12, 6, 0, 1, 1};
		System.out.println(divideTwoConsecutiveArrayElements(brr, 0));
		System.out.println(divideTwoConsecutiveArrayElements(brr, 1));
		System.out.println(divideTwoConsecutiveArrayElements(brr, 2));
		System.out.println(divideTwoConsecutiveArrayElements(brr, 3));
		System.out.println(divideTwoConsecutiveArrayElements(brr, 4));



	}
	
	public static double division(int a, int b) {
		int result = 0;
		try {
			result = a/b ;
		} catch(ArithmeticException e) {
			System.out.println("Do not divide by zero - " + e.getMessage());
		}		
		return result;
		
	}
	
	public static int addTwoConsecutiveArrayElement(int arr[], int index) {
		
		int result = 0;
		
		try {
			result = arr[index] + arr[index+1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Paramethers are out of bounds - " + e.getMessage());
		}
		
		return result;
	}
	
	public static double divideTwoConsecutiveArrayElements(int arr[], int index) {
		
		double result = 0;
		
		try {		
			result = arr[index] / arr[index+1];
		}catch (ArithmeticException e) {
			System.out.println("Do not try to divide by zero - " + e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Do not use non-existing indexes - " + e.getMessage());
		}
		
		
		return result;

	}
}	