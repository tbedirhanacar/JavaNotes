package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

	//Check if spesific element exists in an array
	
	public static void main(String[] args) {
		
		int arr[] = {12, 21, 34};
		int lookFor = 12;
		
		//1.Way:
		boolean exists = false;
		
		for(int i = 0;  i < arr.length ; i++) {
			if(arr[i] == lookFor) {
				exists = true;
				break;
			}
		}
		
		System.out.println(exists ? (lookFor + " exists in array") : (lookFor + " does not exist in array"));
		
		//2.Way:
		/*
		 	a) binarySearch() returns the index of the expected element if the element exists
		 	b) binarySearch() returns negatice integers for non-existing elements. The value represents the order number
		 	   if the element exists
		 	c) Before using binarySearch() method you have to use sort() otherwise the output won't have any meaning
		 	d) binarSearch() does not give stable outputs for repeated values
		 */
		
		Arrays.sort(arr);

		if(Arrays.binarySearch(arr, lookFor)<0) {
			exists = false;
		}else {
			exists = true;
		}
		
		System.out.println(exists ? (lookFor + " exists in array") : (lookFor + " does not exist in array"));
			
		
	}

}
