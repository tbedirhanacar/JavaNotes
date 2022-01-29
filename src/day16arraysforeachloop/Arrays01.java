package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
	
	//Check if 2 arrays are same or not
	//If 2 arrays are same; same elements must be in the same index

	public static void main(String[] args) {

		int arr1[] = {5, 12, 32, 11};
		int arr2[] = {5, 12, 32, 11};
		
		//1.Way: I typed my code to check if the arrays or same or not
		boolean isSame = true;
		
		if(arr1.length == arr2.length) {
			for(int idx = 0; idx<arr1.length; idx++) {
				if(arr1[idx] != arr2[idx]) {
					isSame = false;
					break;
				}
			}
		}else {
			isSame = false;
		}	
		System.out.println(isSame == true ? "Arrays are same" : "Arrays are not same");
		
		//2.Way: There is a build in method in Arrays Class to check if the arrays are same or not
		isSame = Arrays.equals(arr1, arr2);
		System.out.println(isSame == true ? "Arrays are same" : "Arrays are not same");
		
		//1.03
		
		
		
	}

}
