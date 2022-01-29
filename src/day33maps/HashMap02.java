package day33maps;

import java.util.HashMap;

/*
	 	How to count the number of occurences of the letters() in a sentence
		For example: "Java is easy. Type codes to learn Java. To earn money learn Java."
	 */
	

public class HashMap02 {

	public static void main(String[] args) {
		
		String str = "Java is easy. Type codes to learn Java. To earn money learn Java.";
		str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
		System.out.println(str);
		
		
		String[] letters = str.split("");
		
		HashMap<String, Integer> letterCounter = new HashMap<>();
		
		for (String w : letters) {
			Integer value = letterCounter.putIfAbsent(w, 1);
			if (value!=null) letterCounter.put(w, letterCounter.get(w) + 1);
		}
		
		System.out.println(letterCounter);
		
		
		
		
	}

}
