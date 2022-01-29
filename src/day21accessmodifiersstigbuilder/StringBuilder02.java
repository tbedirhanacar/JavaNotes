package day21accessmodifiersstigbuilder;

public class StringBuilder02 {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("Java");
		StringBuilder sb2 = new StringBuilder("Java");

		
		System.out.println(sb1.charAt(2));
		
		//compareTo() compares the StringBuilders lexicographically
		//0 means completely same
		//"-" means mean first StringBuilder is  before the second one in aplhabetical order
		//"+" means mean first StringBuilder is  before the second one in aplhabetical order
		System.out.println(sb1.compareTo(sb2));
		
		sb1.delete(1, 3);
		System.out.println(sb1);//Ja
		
		sb2.deleteCharAt(3);
		
		System.out.println(sb2.equals(sb1));//false
		
		System.out.println(sb2.indexOf("v"));//2
		
		System.out.println(sb2.indexOf("a", 1));
		
		//insert(2, "s"); it will insert "s" at index 2 without removing any character
		sb2.insert(2,"s");
		System.out.println(sb2);
		
		sb2.insert(4, "W");
		
		sb2.insert(1, "WYMUMKL", 2, 5);
		System.out.println(sb2);
		
		System.out.println(sb2.lastIndexOf("M"));
	
		System.out.println(sb2.lastIndexOf("W", 3));
		
		StringBuilder sb3 = new StringBuilder("hollo world hello");
		System.out.println(sb3.lastIndexOf("o", 7));
		
		sb3.replace(5, 7, "-");
		System.out.println(sb3);
		
		sb3.reverse();
		System.out.println(sb3);
		
		sb3.setCharAt(10, '!');
		System.out.println(sb3);
		
		System.out.println(sb3.subSequence(6,10));
		
		System.out.println(sb3.substring(6, 10));		
	
		//toString() method converts "StringBuilder" to "String"
//		String s1 = sb3.toString().replaceAll("o", "*");
//		System.out.println(s1);//*lleh dlr*!*ll*h
//		
//		sb3 = new StringBuilder(s1);
//		System.out.println(sb3);
		
		sb3 = new StringBuilder(sb3.toString().replaceAll("o", "*"));
		System.out.println(sb3);
		
	}

}
