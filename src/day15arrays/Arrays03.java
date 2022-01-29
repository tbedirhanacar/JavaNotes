package day15arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		//[0, 2, 3, 0, 12, 0] put the zeros to the end
		
		int arr1[] = {0, 2, 3, 0, 12, 0};
		System.out.println(Arrays.toString(arr1));
		int arr2[] = new int[arr1.length];
		
		int idx = 0;
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i]!=0) {
			arr2[idx] = arr1[i];
			idx++;	
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
}
