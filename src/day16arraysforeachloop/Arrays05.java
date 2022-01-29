package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {

	public static void main(String[] args) {
		//Find the longest word in a String	
		
		String s = "Ali Can went to school to learn";
		String words[] = s.split(" ");
		
		Arrays.sort(words, Comparator.comparingInt(String::length).reversed());
		System.out.println(Arrays.toString(words));
		System.out.println("The longest word is: " + words[0]);
			
		//Get just the year from date in the "mm/dd/yyyy" format
		String date = "11/09/2001";
		String dateArray[] = date.split("/");
		System.out.println(dateArray[2]);
		
		//Get the initials of the student names
		String t = "Ali Can, Veli Han, Mary Star went to school by bus";
		String u[] = t.split(", ");
		
		System.out.println(Arrays.toString(u));
		int spaceIdx = 0; 
		
		for(int i = 0; i<u.length; i++) {
			spaceIdx = u[i].indexOf(' ');
			System.out.print("" + u[i].charAt(0) + u[i].charAt(spaceIdx+1) + " ");
		}

		
		
	}

}
