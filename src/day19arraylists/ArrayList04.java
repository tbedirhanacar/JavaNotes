package day19arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {
	
	//Find the closest 2 integers in the given list

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(13);
		list1.add(31);
		list1.add(21);
		list1.add(12);
		list1.add(16);
		list1.add(67);
		list1.add(35);
		list1.add(120);
		list1.add(168);
		
		Collections.sort(list1);

		int minDiff = Integer.MAX_VALUE;
		
		for (int i = 1; i<list1.size(); i++) {
			
			minDiff =  Math.min(minDiff, list1.get(i) - list1.get(i-1));
			
		}
		
		System.out.println(minDiff);
		
		for (int i = 1; i<list1.size(); i++) {
			
			if (minDiff == list1.get(i) - list1.get(i-1)) {
				System.out.println(list1.get(i) + " and " + list1.get(i-1));
			}
			
		}

		
	}

}
