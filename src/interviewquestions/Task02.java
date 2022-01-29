package interviewquestions;

import java.util.Scanner;

	/*  Check if the integer is an Armstrong numbers
		Armstrong number is a number that is equal to the sum of cubes of its digits.
	
  		153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
  		370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

 	*/

public class Task02 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number...");
//		int num = sc.nextInt();
//		int numTemp = num;
//		int digit = 0;
//		int sum = 0; 
//		
//		while(numTemp>=1) {
//			digit = numTemp%10;			
//			sum += (digit*digit*digit);
//			numTemp = numTemp/10;
//		}
//		
//		System.out.println(sum == num ? "The number is an Armstrong number" : "The number is not an Armstrong number" );
//		
//		sc.close();
		
		findArmstrong(Integer.MAX_VALUE);
		
	}
	
	public static void findArmstrong(int i) {
		int num = 1;
		while (i>num) {
			int numTemp = num;
			int digit = 0;
			int sum = 0;
			while (numTemp >= 1) {
				digit = numTemp % 10;
				sum += (digit * digit * digit);
				numTemp = numTemp / 10;
			}
			if (sum==num) {
				System.out.println(num);
			}
			num++;
		}
		
	}

}
