package day18multidimensionalarraylists;

import java.util.Arrays;
import java.util.Comparator;


public class MultiDimensionalArrays02 {
	
	//Find the greatest element in 2 dimensional array
	
	/*
		1)Convert 2 dimensional array to 1 dimensional array then sort the elements in ascending orfer and get the last element
		
		2)We will get the lowest value then if a value is greater than the lowest value, I will assign the value to the lowest one
	 */

	public static void main(String[] args) {
		
		//1)Convert 2 dimensional array to 1 dimensional array then sort the elements in ascending orfer and get the last element
		int a[][] = {{11, 21}, {-5, 34}, {65, 22, 31}};		
		int length = 0;	
		for (int[] w : a) {
			length += w.length;
		}	
		Integer b[] = new Integer[length];
		int count = 0;
		for (int[] w : a) {
			for (int x : w) {
				b[count] = x;
				count++;
			}
		}				
		Arrays.sort(b, Comparator.reverseOrder());
		System.out.println("The greatest element is "  + b[0]);
		
		//2)We will get the lowest value then if a value is greater than the lowest value, I will assign the value to the lowest one
		int grtVal = Integer.MIN_VALUE;
		
		for (int[] w : a) {
			for (int x : w) {
				if (grtVal < x) {
					grtVal = x;
				}
			}
		}
		System.out.println(grtVal);
		
		//Homework: Type the code to find the lowest value in a 2 dimensional array
		
		int lowVal = Integer.MAX_VALUE;
		
		for (int[] w : a) {
			for (int x : w) {
				if (lowVal > x) {
					lowVal = x;
				}
			}
		}
		System.out.println(lowVal);
		
	}

}
