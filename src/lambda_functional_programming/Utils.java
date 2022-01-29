package lambda_functional_programming;

public class Utils {

	public static void printInTheSameLineWithSpace(Object o) {
		System.out.print(o + " ");
	}
	
	public static boolean isEven(int x) {
		return x%2==0;
	}
	
	public static boolean isOdd(int x) {
		return x%2!=0;
	}

	public static int square(int x) {
		return (int) Math.pow(x, 2);
	}
	
	public static int cube(int x) {
		return (int) Math.pow(x, 3);
	}
	
	public static double getHalf(int x) {
		return x/2.0;
	}
	
	public static char lastChar(String s) {
		return s.charAt(s.length()-1);
	}
	
	public static int getSumOfDigits(int x) {
		int sum = 0;
		while(x!=0) {
			sum += x%10;
			x /= 10;
		}
		return sum;
	}
	
}
