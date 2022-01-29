package day08loops;

public class ForLoop01 {

	public static void main(String[] args) {

		//Type code to print "Hello!" 10 times  on the console
		
		//1.Way: Not recommended
//		System.out.println("Hello!");
//		System.out.println("Hello!");
//		System.out.println("Hello!");
//		System.out.println("Hello!");
//		System.out.println("Hello!");
//		System.out.println("Hello!");
//		System.out.println("Hello!");
//		System.out.println("Hello!");
//		System.out.println("Hello!");
//		System.out.println("Hello!");

		//2.Way: For repeated tasks you can use loops i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hello!");
		}
		
		//Type all integers from 11 to 44 in the same line with a space between consecutive integers
		for (int i = 11; i < 45; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//Type all even integers from 11 to 120 in the same line with a space between consecutive integers
		
		//1.Way: Recommended
		for (int i = 12; i < 121; i++) {
			
			if (i%2==0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		//2.Way
		for (int i = 12; i < 121; i = i + 2) {		
			System.out.print(i  + " ");
		}
		
		System.out.println();
		
		//Type all odd integers from 120 to 11 in the same line with a space between consecutive integers
		for (int i = 120; i > 10 ; i--) {
			if(i%2==1) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		//Type all integers which are divisible by 4 and 6, from 120 to 11 in the same line with a space between consecutive integers
		
		for (int i = 120; i > 10 ; i--) {
			
			if (i % 4 == 0 && i % 6 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//Convert "Java" to "J*a*v*a*"
		String str = "Java";
		
		//If you use spesific values in your code it is called "Hard Coding"
		for (int i = 0; i <str.length(); i++) {
			char newChar = str.charAt(i);
			System.out.print(newChar + "*");
		}
		

	}
}
