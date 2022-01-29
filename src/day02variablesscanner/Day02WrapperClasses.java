package day02variablesscanner;

public class Day02WrapperClasses {
	
	/*
	 	Wrapper Class: Non-primitive classes have many useful methods but primitive classes don't.
	 				   But having useful methods is very good. 
	 				   Because of that, Java created new "Non-Primitive Data" types which have methods for primitive values.
	 		  		   That new data types  are called "Wrapper Classes"
	 	
	 					Primitive Data			Wrapper Classes
	 						boolean					Boolean
	 						char					Character
	 						byte					Byte
	 						short					Short
	 						int						Integer
	 						long					Long
	 						float					Float
	 						double					Double
	 						 						
	 */

	public static void main(String[] args) {

		boolean primitiveBoolean = true;
		
				
		Boolean nonPrimitiveBooelan = true;
		System.out.println(nonPrimitiveBooelan.equals(true));//true
		System.out.println(nonPrimitiveBooelan.equals(false));//false
		
		char c1 = 'A';
		
		Character c2 = 'A';
		System.out.println(c2.charValue());//A
		
		byte b1 = 12;
		
		Byte b2 = 12;
		System.out.println(b2.MAX_VALUE);//127
		System.out.println(b2.MIN_VALUE);//-128
		
		short s1 = 123;
		
		Short s2 = 123;
		Short s3 = 120;
		System.out.println(s2.compareTo(s3));
		
		Integer i1 = 1234;
		System.out.println(i1.MIN_VALUE);//-2147483648
		
		Long l1 = 12345L;
		System.out.println(l1.BYTES);//8	
		
		Float f1 = 1.34F;
		System.out.println(f1.BYTES);//4
		
		Double d1 = 23.456;
		System.out.println(d1.MAX_VALUE);//1.7976931348623157E308
		
			
		
		
		
		
	}

}
