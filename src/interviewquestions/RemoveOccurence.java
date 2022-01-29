package interviewquestions;

import java.util.*;

public class RemoveOccurence {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>(Arrays. asList(1, 2, 1, 2, 1));
		
		System.out.println(arr);
		remove(arr ,2, 1);
		System.out.println(arr);
		
	}
	
	
	public static void remove(ArrayList arr, int num, int element) {
		int removeCounter = 0;
		while (removeCounter != num) {
			arr.remove(arr.indexOf(element));
			removeCounter++;
		}	
		
		

		
	
	}

}
