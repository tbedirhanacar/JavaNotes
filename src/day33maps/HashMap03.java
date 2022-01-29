package day33maps;

import java.util.HashMap;

public class HashMap03 {

	public static void main(String[] args) {
		
		//How HashMaps work in Java
		HashMap<String, Integer> hm1 = new HashMap<>();
		
		hm1.put("abc", 5);
		
		//Normally Java wants to create unique hashcodes
		//but sometimes HashCodes can be same, this is called HashMaps Collusion.
		System.out.println("FB".hashCode());//2236
		System.out.println("Ea".hashCode());//2236
		
		hm1.put(null, 12);
		
		
		

	}

}
