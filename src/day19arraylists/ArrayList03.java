package day19arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {
	
	/*
	 	Ask user to enter a letter
	 	If the letter exists in list1 convert it to "Got it"
	 	otherwise add the element which user entered into the list
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a letter...");
		String s = sc.next().substring(0,1).toUpperCase();
		
		List<String> list = new ArrayList<>();
		list.add("M");
		list.add("S");
		list.add("P");

		if(list.contains(s)) {
			list.set(list.indexOf(s), "Got it");
		}else {
			list.add(s);
		}
		
		System.out.println(list);
		
		sc.close();
		
		
		
	}

}
