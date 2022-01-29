package day14statickeyword;

import java.util.Arrays;

/*
	 	1) Arrays are for storing multpile data in a single container
	 	2) An array can accept just a single data type
	 	3) Arrays can accept just "primitives" and "references" as element, it doesn't accept "non-primitives"
	 	4) Arrays are non-primitive
	 	5) When you create an Array, you have to declare the maximum number of elemets(capacity)
	*/

public class Arrays01 {

	public static void main(String[] args) {
		
		//How to create an Array
		int arr1[] = new int[5];// int[] arr1 = new int[5]; and int []arr1 = new int[5];
		
		//How to print an Array on the console
		System.out.println(Arrays.toString(arr1));//[0, 0, 0, 0, 0]
		
		//How to add elements into an Array
		arr1[1] = 11;
		System.out.println(Arrays.toString(arr1));//[0, 11, 0, 0, 0]

		arr1[4] = 25;
		System.out.println(Arrays.toString(arr1));//[0, 11, 0, 0, 25]
		
		arr1[0] = 23; arr1[2] = 32; arr1[3] = 12;
		System.out.println(Arrays.toString(arr1));//[23, 11, 32, 12, 25]

		//How to read spesific element from an Array
		System.out.println(arr1[2]);//32
		
		//System.out.println(arr1[5]); //No red underline so no Compile Time Error
									   //ArrayIndexOutOfBoundsException: If you get that kind of error messsages
									   //on the console after running the code, it is called "Runtime Time Error"

		//How to get the number of elements in an Array
		System.out.println(arr1.length);//5 ==> In String we used "length()", in Arrays we are using "length"
		
		
		//How to get last element from an Array dynamically
		System.out.println(arr1[arr1.length-1]);//25
		
	}

}
