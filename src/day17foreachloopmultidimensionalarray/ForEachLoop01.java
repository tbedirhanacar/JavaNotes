package day17foreachloopmultidimensionalarray;

import java.util.Scanner;

public class ForEachLoop01 {
	
	public static void main(String[] args) {
		
		//1.Example: Find the vowels in a String by using arrays
		String s = "Learn Java, earn money";
		String chars[] = s.split("");
		
		for(String w : chars) {
			if (w.equalsIgnoreCase("a") || w.equalsIgnoreCase("e") || w.equalsIgnoreCase("i")  || w.equalsIgnoreCase("o") || w.equalsIgnoreCase("u") ) {
				System.out.print(w + " ");
			}
		}
		
		System.out.println();
		
		//2.Example: Print the words ending with "n"
		String t = "Learn Java, earn money.";
		String words[] = t.split(" ");
		
		for (String w : words) {
			w = w.replaceAll("\\p{Punct}", "");
			 
			if (w.endsWith("n") || w.endsWith("N")) {
				System.out.print(w + " ");
			}

		}
		
		System.out.println();
		
		//3.Example: Find the sum of the digits of an integer given by user by using arrays
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer...");
		String n = sc.next();
		
		String digits[] = n.split("");
		
		int sum = 0;
		
		for (String w : digits) {
			sum = sum + Integer.valueOf(w);			
		}
		
		System.out.println(sum);	
		
		sc.close();
		
	}
}
