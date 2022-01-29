package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Fp03 {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>(Arrays.asList("Ali","Ali","Mark","Amanda","Christopher","Jackson","Mariano","Alberto","Tucker","Benjamin"));
		printInUpperCases01(l);
//		printInUpperCases02(l);
		printElementsSortedByLength(l);
		printElementsReversedSortedByLength(l);
		sortElementsByLastChar(l);
		sortElementsByLengthThenLexographically(l);
//		removeIfTheLengthIsGreaterThanFive(l);
//		removeIfLengthBwn8n10orEndingWithO(l);
		System.out.println(checkLengthsLessThan12(l));
		
	}

	//1)Create a method to print all list elements in uppercase
	//1.Way:
	public static void printInUpperCases01(List<String> l) {
		l.stream().map(String::toUpperCase).forEach(Utils::printInTheSameLineWithSpace);
		System.out.println();
	}
	//2.Way:
//	public static void printInUpperCases02(List<String> l) {
//		l.replaceAll(String::toUpperCase);
//		System.out.println(l);
//	}
	
	//2)Create a method to print the elements after ordering according to their lengths
	public static void printElementsSortedByLength(List<String> l) {
		l.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::printInTheSameLineWithSpace);
		System.out.println();
	}
	
	//3)Create a method to print the elements after ordering according to their lengths (In reverse order)
	public static void printElementsReversedSortedByLength(List<String> l) {
		l.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::printInTheSameLineWithSpace);	
		System.out.println();
	}
	
	//4)Create a method to sort the distinct elements by using their last characters
	public static void sortElementsByLastChar(List<String> l) {
		l.stream().distinct().sorted(Comparator.comparing(Utils::lastChar)).forEach(Utils::printInTheSameLineWithSpace);
		System.out.println();
	}
	
	//5)Create a method to sort the elements according to their lentgths then according to their first character
	public static void sortElementsByLengthThenLexographically(List<String> l) {
		l.stream()
				.sorted(Comparator.comparing(String::length)
				.thenComparing(Comparator.naturalOrder()))
				.forEach(Utils::printInTheSameLineWithSpace);
		System.out.println();
	}
	
//	//6)Remove the elements if the length of the element is greater than 5
//	public static void removeIfTheLengthIsGreaterThanFive(List<String> l) {
//		l.removeIf(t->t.length()>5);
//		System.out.println(l);
//	}
	
//	//8)Remove the elements if the length is between 8 and 10 or ending with 'o'
//	public static void removeIfLengthBwn8n10orEndingWithO(List<String> l) {
//		Predicate<String> checkCondition = t->(t.length()>7&&t.length()<11)||t.endsWith("o");
//		l.removeIf(checkCondition);
//		System.out.println(l);
//	}
	
	//9)Create a method to check if the lengths of all elements are less than 12
	public static boolean checkLengthsLessThan12(List<String> l) {
		return l.stream().allMatch(t->t.length()<12);
	}
	
	//10)Create a method to check if the initial of any element is not 'X'
	public static boolean checkNotToStartWithX(List<String> l) {
		return l.stream().noneMatch(t->t.startsWith("X"));
	}
	
	//11)Create a method to check if at least one of the elements ending with "R"
	public static boolean checkAnyoneEndsWithR(List<String> l) {
		return l.stream().anyMatch(t->t.charAt(t.length()-1)=='R');
	}
	
	
	
	
	
	
	
}
