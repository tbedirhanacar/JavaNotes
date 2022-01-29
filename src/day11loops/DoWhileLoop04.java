package day11loops;

import java.util.Scanner;

public class DoWhileLoop04 {

	/*
	 	Username is "admin", Password is "pwd123"
	 	Ask user to enter username and password
	 	User should see "Enter your username and password" message
	 	If he enters correct credentials he should get "You are in your account!" message
	 	After 3 times he should get "Your account is blocked message"
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int counter = 0;
		
		do {
			
			if (counter == 3) {
				System.out.println("Your account is blocked!");
				break;
			}
			
			System.out.print("Enter your username...");
			String username = sc.nextLine();
			System.out.print("Enter your password...");
			String pwd = sc.nextLine();
			
			if (username.equals("admin")  && pwd.equals("pwd123")) {
				System.out.println("You are in your account!");
				break;
			}
			

			
			counter++;
			
		} while(true);
	
		sc.close();
	}

}
