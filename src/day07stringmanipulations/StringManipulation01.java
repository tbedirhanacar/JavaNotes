package day07stringmanipulations;

public class StringManipulation01 {
	
	/*
	 	Regex(Regular Expression): Regex is used to declare a group of characters
	 	i) All lower case letters ==> [a-z]
	 	ii)All upper case letters ==> [A-Z]
	 	iii)All upper case and lower case letters ==> [a-zA-z]
	 	iv)Allcharacters different from space character ==> \\S
	 	v) Space characters ==> \\s
	 	vi)All characters different from digits ==> \\D
	 	vii) All digits ==> \\d
	 	viii) Non alphabetical characters ==> [^a-zA-Z]
	 */

	public static void main(String[] args) {
		
//		//1)Type a code to find the number of space characters in a String
//		String s1 = "Ali went to the school.";
//		
//		String updateds1 = s1.replaceAll("\\S","");
//		System.out.println(updateds1.length());
//		
//		//2)Type code to find the number of characters different from space character
//		
//		//1.Way: Number of all characters - Number of space characters = Number of characters different from space
//		int numOfCharsDiffFromSpace = s1.length() - updateds1.length();
//		System.out.println(numOfCharsDiffFromSpace);
//		
//		//2.Way: Find the characters different from space directly
//		String updated2s1 = s1.replaceAll("\\s","");
//		System.out.println(updated2s1.length());
//		
//		//3)Type code to find the number of digits, number of letters and characters different from digits and numbers
//		String s2 = "Ali Can: 1234567890 !!! ? .";
//		int numberOfDigits = s2.replaceAll("\\D", "").length();//"\\D" and "[^0-9]" have same meaning
//		System.out.println(numberOfDigits);//10
//		int numberOfLetters = s2.replaceAll("[^a-zA-Z]", "").length();
//		System.out.println(numberOfLetters);
//		int numberOfCharDiffDigitLettrs = s2.replaceAll("[a-zA-Z0-9]", "").length();
//		System.out.println(numberOfCharDiffDigitLettrs);
		
		/*
		 	4)Check the password according to the given rule
		 	a)No space character at the beginning and at the end
		 	b)It must contain at least 1 digit
		 	c)It must contain at least 1 lowercase letter
		 	d)It must contain at least 1 uppercase letter
		 	e)It must contain at least 1 character different from digits and letters
		*/
		
		String pwd = "bc!";
		boolean isFirstCharSpace = pwd.startsWith(" ");
		boolean isLastCharSpace = pwd.endsWith(" ");
		
		int numOfDigitChars = pwd.replaceAll("\\D","").length();
		
		int numOfLowerCaseChars = pwd.replaceAll("[^a-z]", "").length();
		
		int numOfUpperCaseChars = pwd.replaceAll("[^A-Z]", "").length();
		
		int numOfNonAlphaChars = pwd.replaceAll("[^a-zA-Z0-9] ", "").length();
		
		if (isFirstCharSpace) {
			System.out.println("Password can't start with space");
		}
		if (isLastCharSpace) {
			System.out.println("Password can't end with space");
		}
		if (numOfDigitChars == 0) {
			System.out.println("Password should contain at least one digit");
		}
		if (numOfLowerCaseChars == 0) {
			System.out.println("Password should contain at least one lowercase character");
		}
		if (numOfUpperCaseChars == 0) {
			System.out.println("Password should contain at least one uppercase character");
		}
		if (numOfNonAlphaChars == 0) {
			System.out.println("Password should contain at least one special character");
		}
		
		
	}
}
