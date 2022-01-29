package day10loops;

import java.util.Scanner;

public class WhileLoop06 {
	
	//Get String from user and print just vowels(aeiou) inside String on the console

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String...");
		String s = sc.nextLine();
		
		int idx = 0;
		
		//1.Way:
		while (idx<s.length()) {
			
			char c = s.charAt(idx);
			
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				System.out.print(s.charAt(idx));
			}
	
			idx++;
		}
		//2.Way:	
		String s1 = s.replaceAll("[^aeiouAEIOU]", "");	
		System.out.println(s1);	
		
		sc.close();
	}
}
