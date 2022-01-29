package lambda_functional_programming;

import java.util.*;
import java.util.stream.Collectors;

public class Fp01 {
	
	/*
	 	1)Lambda is functional programming, we started to use Lambda after Java 8
	 	2)Functional Programming focuses on "What to do?" but Structured Programming
	 	  spends time on "How to do?"
	 	3)Functional Programming can be used just with Collections and Arrays
	 	4)We cannot use Functioonal Programming in Maps directly but if you convert Maps to Sets
	 	  by using entrySet() method then you can use Functional Programming
	 */

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>(Arrays.asList(8, 9, 131, 10, 9, 10, 2, 8, 15));
		printElementsStructured(l);
		System.out.println();
		printElementsFunctional(l);
		System.out.println();
		printEvenElementsStructured(l);
		System.out.println();
		printEvenElementsFunctional(l);
		System.out.println();
		printSquareOfOddElements(l);
		System.out.println();
		printCubeOfDistinctElements(l);
		System.out.println();
		sumOfSquaresOfDistincEvenElements(l);
		productCubesOfDistinctEvenElements(l);
		getMaxElement01(l);
		getMaxElement02(l);
		getMinElement01(l);
		getMinElement02(l);
		getMinGreaterThanSeven(l);
		getHalfOfDistinctElementsInReverseOrder(l);
	}
	
	//1)Create a method to print the list elements on the console in the same line with a space
	//	between two consecutive elements. (Structured)
	
	public static void printElementsStructured(List<Integer> l) {
		for (Object w : l) {
			System.out.print(w + " ");
		}
	}
	
	//1)Create a method to print the list elements on the console in the same line with a space
	//	between two consecutive elements. (Functional)
	public static void printElementsFunctional(List<Integer> l) {
		l.stream().forEach(t->System.out.print(t + " "));
	}
	
	//2)Create a method to print the even list elements on the console in the same line with a space
	//	between two consecutive elements (Structured)
	public static void printEvenElementsStructured(List<Integer> l) {
		for (Integer w : l) {
			if (w%2 == 0) {
				System.out.print(w + " ");
			}
		}
	}
	
	//2)Create a method to print the even list elements on the console in the same line with a space
	//	between two consecutive elements (Functional)
	public static void printEvenElementsFunctional(List<Integer> l) {
		l.stream().filter(t->t%2==0).forEach(t->System.out.print(t + " "));
	}
	 
	//3)Create a method to print the square of odd list elements on the console in the same line with a
	//	space between two consecutive elements.(Functional)
	public static void printSquareOfOddElements(List<Integer> l) {
		l.stream().filter(t->t%2!=0).map(t->t*t).forEach(t->System.out.print(t + " "));
	}
			
	//4)Create a method to print the cube of distinct elements on the console in the same line
	//	with a space between two consecutive elements
	public static void printCubeOfDistinctElements(List<Integer> l) {
		l.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t->System.out.print(t + " "));
	}
	
	//5)Create a method to calculate the sum of the squares of distinct even elements
	public static void sumOfSquaresOfDistincEvenElements(List<Integer> l) {
		Integer sum = l.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0, (t, u)->t+u);
		System.out.println(sum);
	}
	
	//6)Create a method to calculate the product of the cubes of distinct even elements
	public static void productCubesOfDistinctEvenElements(List<Integer> l) {
		Integer product = l.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1, (t,u)->t*u);
		System.out.println(product);
	}
	
	//7)Create a method to find the greatest value from the list elements
	//1.Way
	public static void getMaxElement01(List<Integer> l) {
		Integer maxVal = l.stream().distinct().reduce(Integer.MIN_VALUE, (t,u)->t>u?t:u);
		System.out.println(maxVal);
	}
	//2.Way
	public static void getMaxElement02(List<Integer> l) {
		Integer maxVal = l
						.stream()
						.distinct()
						.sorted()
						.reduce(Integer.MIN_VALUE, (t,u)->u);
		System.out.println(maxVal);
	}
	//Homework
	//8)Create a method to find the minimum value from the list elements(In 2 ways)
	//1.Way
	public static void getMinElement01(List<Integer> l) {
		Integer minVal = l
						.stream()
						.distinct()
						.reduce(Integer.MAX_VALUE, (t,u)->t<u?t:u);
		System.out.println(minVal);
	}
	
	
	//2.Way
	public static void getMinElement02(List<Integer> l) {
		Integer minVal = l
						.stream()
						.distinct()
						.sorted()
						.reduce((t,u)->t)
						.orElse(null);
		System.out.println(minVal);	
	}
	
	
	//9)Create a method to find the minimum value which is greater than 7 and even from the list
	public static void getMinGreaterThanSeven(List<Integer> l) {
		Integer minVal = l
						.stream()
						.filter(t->t>7)
						.filter(t->t%2==0)
						.sorted()
						.findFirst()
						.orElse(null);
		System.out.println(minVal);
	}
	
	//10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list
	public static void getHalfOfDistinctElementsInReverseOrder(List<Integer> l) {
		List<Double> result = l
								.stream()
								.filter(t->t>5)
								.map(t->t/2.0)
								.sorted(Comparator.reverseOrder())
								.collect(Collectors.toList());
		System.out.println(result);
	}
	
 
}


