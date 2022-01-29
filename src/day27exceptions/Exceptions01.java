package day27exceptions;

public class Exceptions01 {

	public static void main(String[] args) {
		
		
		String s1 = "Aliye Can";
		String t1 = "Ali";
		divideLengths4(s1, t1);//3
		
		String s2 = "";
		String t2 = "Ali";
		divideLengths4(s2, t2);//0
		
		String s3 = "Aliye Can";
		String t3 = "";
		divideLengths4(s3, t3);//ArithmeticException
		
		String s4 = null;//NullPointerException: If you use "length()" with the "null" object you will get "NullPointerException"
		String t4 = "Ali";
		divideLengths4(s4, t4);
		
		String s5 = "Aliye Can";
		String t5 = "Ali";
		divideLengths4(s5.substring(9), t5);
		
		String s6 = "Aliye CanXXX";
		String t6 = "Ali";
		divideLengths4(s6, t6);//StringIndexOutOfBoundsException
	}
	
	//Create a method to divide the lengths of 2 given Strings
	public static void divideLengths(String s, String t) {
		
		int result; 
		
		try {
			if (s.equals("Aliye CanXXX")) {
			result = s.substring(13).length() / t.length();	

			}else {
			result = s.length() / t.length();	
			}
			System.out.println(result);	
		} catch (ArithmeticException e) {
			System.out.println("Do not divide by zero - " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Do not try to count the number of characters for null object - " + e.getMessage());
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Do not use indexes greater than the length - " + e.getMessage());
		}	
	}
	
	public static void divideLengths2(String s, String t) {
		
		int result; 
		
		try {
			if (s.equals("Aliye CanXXX")) {
			result = s.substring(13).length() / t.length();	

			}else {
			result = s.length() / t.length();	
			}
			System.out.println(result);
			
		} catch (RuntimeException e) {
			System.out.println("There is an issue in the try block... - " + e.getMessage());
		}	
	}
	
	public static void divideLengths3(String s, String t) {
		
		int result; 
		
		try {
			if (s.equals("Aliye CanXXX")) {
			result = s.substring(13).length() / t.length();	
			}else {
			result = s.length() / t.length();	
			}
			System.out.println(result);	
		} catch (ArithmeticException e) {
			result = 1;
			System.out.println(result);
		} catch (NullPointerException e) {
			result = 0;
			System.out.println(result);
		} catch (IndexOutOfBoundsException e) {
			result = -1;
			System.out.println(result);
		}
		
	}
	
	//If ArithmeticException occurs make the result 11, for the other Exceptions make the result 0
	//Note: ıf you use multiple "catch blocks" which have "parent-child" relationship
	//put the child at the top
	public static void divideLengths4(String s, String t) {
		
		int result; 
		
		try {
			if (s.equals("Aliye CanXXX")) {
			result = s.substring(13).length() / t.length();	
			}else {
			result = s.length() / t.length();	
			}
			System.out.println(result);
			
		} catch (ArithmeticException e) {
			result = 11;
			System.out.println(result);
		} catch (Exception e) {
			result = 0;
			System.out.println(result);
		} 
				
	}
	
	
	//Even you get Exception or not, I want to see "Mission is completed" message on the console
	//Note: try-block usage:
	//	1) try+single catch 2)try+multiple catch 3)try + single catch + finally 4)try + multiple catch + finally 5)try + finally
	public static void divideLengths5(String s, String t) {
		int result; 
		
		try {
			if (s.equals("Aliye CanXXX")) {
			result = s.substring(13).length() / t.length();	

			}else {
			result = s.length() / t.length();	
			}	
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Do not divide by zero - " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Do not try to count the number of characters for null object - " + e.getMessage());
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Do not use indexes greater than the length - " + e.getMessage());
		} finally {
			System.out.println("Mission is completed");
		}	
	}
	

}
