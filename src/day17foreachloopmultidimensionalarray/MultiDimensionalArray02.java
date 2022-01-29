package day17foreachloopmultidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray02 {

	public static void main(String[] args) {

		//Print the elements which have "a" from a 2 dimensional String array
		String arr1[][] = {{"learn", "java", "it"}, {"is", "easy"}};
		
		for (String[] w : arr1) {
			for (String x : w) {
				if (x.contains("a") || x.contains("A")) {
					System.out.print(x + " ");
				}
			}
		}
		
		System.out.println();
		
		//Convert a 2 dimensional array to 1 dimensional array
		int arr2[][] = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9, 10}};
		
		int length = 0;
	
		for (int[] w : arr2) {
			length += w.length;
		}
		
		int arr3[] = new int[length];
		int count = 0;
		
		for (int[] w : arr2) {
			for (int x : w) {
				arr3[count] = x;
				count++;
			}
		}
		
		System.out.println(Arrays.toString(arr3));
		
	}
}
