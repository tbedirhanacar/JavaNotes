package lambda_functional_programming;

import java.util.stream.IntStream;

public class Fp04 {

	public static void main(String[] args) {
		
//		List<Integer> l = new ArrayList<>(Arrays.asList(12,9,13,4,9,2,4,12,15));
		System.out.println(getSumFromSevenToHundred01());
		System.out.println(getSumFromSevenToHundred02());
		System.out.println(getMultiplicationFromTwoToEleven());
		System.out.println(calculateFactorial(5));
		System.out.println(sumOfIntegersGivenRange(1, 10));
		System.out.println(findSumOfDigitsForIntegersInTheGivenRange(23, 32));
		
		
		
	}

	//1)Create a method to find the sum of integers from 7 to 100
	//1.Way
	public static int getSumFromSevenToHundred01() {
		return IntStream.range(7, 101).reduce(0, Math::addExact);	
	}
	
	//2.Way
	public static int getSumFromSevenToHundred02() {
		return IntStream.rangeClosed(7, 100).reduce(0, Math::addExact);	
	}
	
	//2)Create a method to find the multpilication of the integers from 2(inc) to 11(inc)
	public static int getMultiplicationFromTwoToEleven() {
		return IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);
	}
	
	//3)Create a method to calculate the factorial of a given number
	public static int calculateFactorial(int x) {
		if(x>=0) {
			return IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);
		}else {
			throw new IllegalArgumentException("Parameter cannot be negative");
		}
	}
	
	//4)Create a method to calculate the sum of even integers between given two integers
	public static int sumOfIntegersGivenRange(int s, int e) {
		if (s>e) {
			int x = 0;
			x = s;
			s = e;
			e = x;
		}
		return IntStream.rangeClosed(s, e).filter(Utils::isEven).sum();
	}
	
	//5)Create a method to calculate the sum of digits of every integers between given two integers
	//	23 and 32 ==> 2+3 + 2+4 + 2+5 + 2+6 + 2+7
	public static int findSumOfDigitsForIntegersInTheGivenRange(int s, int e) {
		if (s>e) {
			int x = 0;
			x = s;
			s = e;
			e = x;
		}
		return IntStream.rangeClosed(s, e).map(Utils::getSumOfDigits).sum();
	}
	
	
	
	
	
	
	
}
