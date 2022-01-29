package day06nestedternaryswitchstring;

public class StringManipulation01 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a string...");
//		String str = sc.nextLine();
//		
//		//Print the first and last character of the given string on the console. "Java is easy" ==> Jy
//			
//		int strLength = str.length();
//		
//		if (strLength==1) {
//			System.out.println(str.charAt(0));		
//		} else {
//			System.out.println("" + str.charAt(0) + str.charAt(strLength-1));
//		}
//		
//		//Print the index of first occurence of 'a' if 'a' exists. Otherwise print 'no a'.	
//		System.out.println(str.contains("a") ? str.indexOf('a') : "no a");
//		
//		//Print the index of last occurence of a spesfic character
//		System.out.println(str.contains("a") ? str.lastIndexOf('a') : "no a");
//		
//		//Check if a given character is unique in a String or not?
//		int frstIdx = str.indexOf('a');
//		int lastIdx = str.lastIndexOf('a');
//		
//		System.out.println(frstIdx == -1 
//				? "Couldn't find in string"		
//				: frstIdx == lastIdx ? "Unique" : "Not Unique");
//		
//		//Get the initals of first name and last name of the user
//		int lastNameIdx = str.indexOf(' ') + 1;
//		System.out.println("" + str.charAt(0) + str.charAt(lastNameIdx));
//		
//		//Get the character from index 3 to index y from a String
//		System.out.println(str.length() > 7  ? str.substring(3, 8) : "Not long enough");
//		
//		//Get the character form index 3 to the end from a String
//		System.out.println(str.length() > 2  ? str.substring(3) : "Not long enough");

		/*
		 	String shirtPrice = "$12.99";
		 	String trousersPrice = "$25.99";
		 	Type code to calculate the sum of the shirt and the trousers prices
		*/
		
	 	String shirtPrice = "$12.99";
	 	String trousersPrice = "$25.99";

	 	String updatedShirtPrice = shirtPrice.replace("$","").replace(".","");
	 	System.out.println(updatedShirtPrice);
	 	String updatedTrousersPrice = trousersPrice.replace("$","").replace(".","");
	 	System.out.println(updatedTrousersPrice);
	 	
	 	System.out.println((Integer.valueOf(updatedShirtPrice) + Integer.valueOf(updatedTrousersPrice))/100.0);
	 	
	 	
	}

}
