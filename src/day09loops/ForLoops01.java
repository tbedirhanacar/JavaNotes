package day09loops;

public class ForLoops01 {

	public static void main(String[] args) {
		
		//1)Type code to print unique characters on the console
		String s1 = "Anna Maria";
		
		for (int i = 0; i < s1.length() ; i++) {
		
			char c = s1.charAt(i);
			
			if (s1.indexOf(c) ==  s1.lastIndexOf(c)) {
				
				System.out.print(c);
				
			}
		}
		
		System.out.println();
		
		//2)Type code to print a String in reverse order after removing spaces
		String s2 = "Ozgur Acar";
		String reverseds2 = "";
		
		for (int i = s2.length()-1; i > -1 ; i-- ) {
			
			char c = s2.charAt(i);
			
			if (c != ' ') {
				reverseds2  = reverseds2 + c;
			}
		}
		
		System.out.println(reverseds2);
		
		//3)Type code to find the sum of the integers from 12 to 231
		
		int sum = 0;
		
		for (int i = 12; i < 232 ; i++) {
			
			sum = sum + i;
		}
		
		System.out.println(sum);
				
		//4)Type code to find the multiplication of the integers from 3 to 7
		
		int multi = 1;
		
		for (int i = 3; i < 8; i++) {
			
			multi = multi * i;
			
		}
		
		System.out.println(multi);
	
		//5)Type code to check if a given String is palindrome
		String str = "Anna";
		str = str.toLowerCase();
		String reversedstr = "";
		
		for (int i = str.length()-1; i > -1 ; i-- ) {
			char c = str.charAt(i);
			reversedstr = reversedstr + c;
		}
		
		if (str.equals(reversedstr)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		
		//6)Type code to find the sum of the digits of an integer.
		int sumOfDigits = 0;	
		for (int n = 124; n > 0; n = n / 10) {		
			sumOfDigits = sumOfDigits + n%10;			
		}
		System.out.println(sumOfDigits);
		
		
		//7)Type code to find the sum of the unique digits of an integer.
		String num1s = "1351";
		int sumOfUniDigits = 0;	
		
		for (int i = 0; i < num1s.length() ; i++) {
			
			char c = num1s.charAt(i);
			String sc = "";
			
			if (num1s.indexOf(c) ==  num1s.lastIndexOf(c)) {
				
				sc = "" + c;
				sumOfUniDigits = sumOfUniDigits + Integer.valueOf(sc);
			}
		}	
		System.out.println(sumOfUniDigits);
		
		
	}
}
