package day03scannerincrementdecrement;

public class Decrement01 {

	public static void main(String[] args) {
		
		int number = 120;
		System.out.println("Before decrement: " +  number);

		//1.Way:
		number = number - 10;
		System.out.println("After 1st decrement: " + number);
		
		number = number / 2;
		System.out.println("After 2nd decrement: " + number);
		
		//2.Way:
		number -= 5;
		System.out.println("After 3rd decrement: " + number);
		
		number /= 2;
		System.out.println("After 4th decrement: " + number);

		//3.Way: This way can be used just for decreasing by 1
		number--;
		number--;
		System.out.println("After 5th decrement: " + number);
		
		
	}

}
