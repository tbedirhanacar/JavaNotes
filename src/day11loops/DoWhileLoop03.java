package day11loops;

public class DoWhileLoop03 {
	
	/*
	 	For the String "1234_?!abcdef", type a code to count the number of letters,
	 	the number of digits and number of others by using do while loop
	 */

	public static void main(String[] args) {
		
		String s = "1234_?!abcdef";
		
		//1.Way:
		s = s.toLowerCase();
		
		int digitCounter = 0;
		int letterCounter = 0;
		int othersCounter = 0;
		
		int idx = 0;
		
		do {
			if(s.charAt(idx)>='a' && s.charAt(idx)<='z') {
				letterCounter++;
			}else if (s.charAt(idx)>='0' && s.charAt(idx)<='9') {
				digitCounter++;
			}else {
				othersCounter++;
			}
			
			idx++;

		} while(idx<s.length());
		
		System.out.println("Digits: " + digitCounter);
		System.out.println("Letters: " + letterCounter);
		System.out.println("Others: " + othersCounter);
		
		//2.Way
		String t = "1234_?!abcdef";
		
		String digits = t.replaceAll("[^0-9]", "");
		System.out.println("Number of digits: " + digits.length());
		
		String letters = t.replaceAll("[^a-zA-Z]", "");
		System.out.println("Number of letters: " + letters.length());
		
		String others = t.replaceAll("[a-zA-Z0-9]", "");
		System.out.println("Number of others: " + others.length());
	}

}
