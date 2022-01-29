package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Fp02 {
	
	/*
	 	1)In functional programming we can use "lambda expressions" but if using "method reference" is possible
	 	  using "lambda expressions" is not recommended
	 	2)Method Reference is like "Class Name :: Name"
	 	  For Example				String	   :: length (Be careful we do not use method parenthesis in method reference)
	 */

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>(Arrays.asList(8, 9, 131, 10, 9, 10, 2, 8, 15));
		printElements(l);
		System.out.println();
		printEvenElementsFunctional(l);
		System.out.println();
		printSquaresOfOdds(l);
		System.out.println();
		sumOfSquaresOfDistinctEvenElements(l);
		getMaxElement(l);
		getMinElement(l);
		getMinGreaterThanSeven(l);
		
	}
	
	//1)Create a method to print the list elements on the console in the same line with a space
	//	between two consecutive elements(Functional)
	public static void printElements(List<Integer> l) {
		l.stream().forEach(Utils::printInTheSameLineWithSpace);
	}
	
	//2)Create a method to print the even list elements on the console in the same line with a space
	//	between two consecutive elements (Functional)
	public static void printEvenElementsFunctional(List<Integer> l) {
		l.stream().filter(Utils::isEven).forEach(Utils::printInTheSameLineWithSpace);
	}
	
	//3)Create a method to print the square of odd list elements on the console in the same line with a
	//	space between two consecutive elements.(Functional)
	public static void printSquaresOfOdds(List<Integer> l) {
		l.stream().filter(Utils::isOdd).map(Utils::square).forEach(Utils::printInTheSameLineWithSpace);
	}
	
	//4)Create a method to print the cube of distinct odd elements on the console in the same line
	//	with a space between two consecutive elements
	
	public static void printCubeOfDistinctElements(List<Integer> l) {
		l.stream().distinct().filter(Utils::isOdd).map(Utils::cube).forEach(Utils::printInTheSameLineWithSpace);
	}
	
	//5)Create a method to calculate the sum of the squares of distinct even elements
	public static void sumOfSquaresOfDistinctEvenElements(List<Integer> l) {
		Integer sum = l.stream().distinct().filter(Utils::isEven).map(Utils::square).reduce(0, Math::addExact);
		System.out.println(sum);
	}
	
	//6)Create a mtehod to calculate the product of cubes of distinct even elements
	public static void productOfCubesOfDistinctEvenElements(List<Integer> l) {
		Integer product = l.stream().distinct().filter(Utils::isEven).map(Utils::cube).reduce(1, Math::multiplyExact);
		System.out.println(product);
	}
	
	//7)Create a method to find the greatest value from the list elements
	public static void getMaxElement(List<Integer> l) {
		Integer max = l.stream().reduce(Integer.MIN_VALUE, Math::max);
		System.out.println(max);
	}
	
	//8)Create a method to find the minimum value from the list elements
	public static void getMinElement(List<Integer> l) {
		Integer min = l.stream().reduce(Math::min).get();
		System.out.println(min);
	}
	
	//9)Create a method to find the minimum value which is greater than 7 and even from the list
	public static void getMinGreaterThanSeven(List<Integer> l) {
		Integer minVal = l.stream().filter(t->t>7).filter(Utils::isEven).reduce(Math::min).get();
		System.out.println(minVal);
	}
	
	//10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list
	public static void getHalfOfDistinctElementsInReverseOrder(List<Integer> l) {
		List<Double> result = l.stream().distinct().filter(t->t>5).map(Utils::getHalf).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(result);
	}
	
	
	
	
	
	
	
	
}
