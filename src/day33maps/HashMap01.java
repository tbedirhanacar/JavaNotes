package day33maps;

import java.util.HashMap;
	
	/*
	 	How to count the number of occurences of the word in a sentence
	 	For example: "Java is easy. Type codes to learn Java. To earn money learn Java."
	 				  Java=3, is=1, easy=1, Type=1, ... , learn=2, ...
	 */

	


public class HashMap01 {

	public static void main(String[] args) {
		
		String sentence = "Java is easy. Type codes to learn Java. To earn money learn Java.";
		sentence = sentence.replaceAll("\\p{Punct}", "").toLowerCase();
		System.out.println(sentence);
		
		String[] splittedSentence = sentence.split(" ");
		
		HashMap<String, Integer> words = new HashMap<>();
		for (String w : splittedSentence) {
			Integer value = words.putIfAbsent(w, 1);
			if (value!=null) words.put(w, words.get(w) + 1);
		}
		System.out.println(words);
		
		
		
	}

}
