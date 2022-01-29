package day06nestedternaryswitchstring;

import java.util.Scanner;

public class MyOwnStringManipulation {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text...");
		String txt = sc.nextLine();
		System.out.println("Which phrase you need to find?");
		String trgt = sc.nextLine();
		sc.close();
		int idx;
				
		//------------------------
		System.out.println("Should I ignore case? [Only type 'Y' for Yes, or 'N'  for No]");
		char ignStr = sc.next().toUpperCase().charAt(0);
		
		if (ignStr != 'Y') {
			if(ignStr != 'N') {
			System.out.println("Unvalid option");
			main(null);
			}
		}
		//------------------------
		System.out.println("Do you need first or last occurence? [Only type 'F' for First, or 'L'  for Last]");
		char firstLast = sc.next().toUpperCase().charAt(0);
		
		if (firstLast != 'F') {
			if(firstLast != 'L') {
			System.out.println("Unvalid option");
			main(null);
			}
		}
		//------------------------
		if (ignStr == 'Y') {
			
			txt = txt.toLowerCase();
			trgt = trgt.toLowerCase();
			
			if (firstLast == 'F') {
				
				idx = txt.indexOf(trgt);
				
			} else {
				
				idx = txt.lastIndexOf(trgt);
				
			}
			
		//-------------------------	
			
		} else {

			if (firstLast == 'F') {
				
				idx = txt.indexOf(trgt);
				
			} else {
				
				idx = txt.lastIndexOf(trgt);
				
			}
			
		}
		
		System.out.println(idx == -1 ? "This phrase doesn't exist in your text" : "Your phrase starts at character " + (idx+1));

		
	}

}
