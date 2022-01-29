package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {

	//Check if array elements are sorted or not
	
	public static void main(String[] args) {
		
		String s1[] = {"A", "C", "T"};
		String s2[] = Arrays.copyOf(s1, s1.length);
		
		/*
		 	If you use "String s2[] = s1;" instead of using "copyOf()" method
		 	everytime you will get "Array is sorted" message. Because when you sort s1, s2 will be sorted as well
		 	When you do direct assignment, Java does not create a new container to save memory.
		 	But copyOf() method makes Java create a new container even the arrays are same.
		 */
		
		Arrays.sort(s2);	
		boolean isSorted = Arrays.equals(s1, s2);
		
		System.out.println(isSorted ? "Array is sorted" : "Array is not sorted");
		
 


	}

}
