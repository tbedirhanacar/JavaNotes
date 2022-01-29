package day33maps;

import java.util.*;

	/*
	 	Get a String and a character from user
	 	Count the number of characters between the first occurence and the last occurence of the given character in the String
	 	Do not count the space characters
	 	If the character which user selected is displayed just once in the String return -1
	 	If the character which user selected does not exist in the String return -1
	 	For example; "Java is easy" - 'a' ==> 5
	 				 "Java is easy" - 'w' ==> -1
	 				 "Java is easy" - 'e' ==> -1 
	 */
	

public class InterviewQuestions01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		System.out.println("Enter char");
		char ch = sc.next().toLowerCase().charAt(0);
		System.out.println(findDifferenceBetweenChars(str, ch));		
		sc.close();
		
		
		
	}
	
	public static int findDifferenceBetweenChars(String str, char ch) {
		String cs = "" + ch; 
		str = str.toLowerCase().replaceAll("[^a-z]", "");
		if (!str.contains(cs)) {
			return -1;
		}else if (str.indexOf(cs) == str.lastIndexOf(cs)) {
			return -1;
		}else {
			return str.lastIndexOf(cs) - str.indexOf(cs) - 1;
		}
		
	}
	
	

}
