package day20passbyvaluedatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	/*
	 	We can create object in 2 ways:
	 	1) By using "new" keyword. For example; "int arr[] = new int[3];"
	 	2) We convert an existing object to another object
	 */
	
	
	public static void main(String[] args) {
		
		System.out.println(LocalDate.now());	
		
		System.out.println(LocalTime.now());
		
		System.out.println(LocalDateTime.now());
		
		//How to manipulate date
		LocalDate currentDate = LocalDate.now();
		
		System.out.println(currentDate);
		currentDate = currentDate .plusDays(7);	
		System.out.println(currentDate);
		
		currentDate = currentDate.minusDays(2);
		System.out.println(currentDate);
		
		currentDate = currentDate.plusMonths(5);
		System.out.println(currentDate);
		
		currentDate = currentDate.minusYears(6).plusMonths(5).plusDays(5);
		System.out.println(currentDate);
		
		LocalDate dob = LocalDate.of(1986, 5, 12);
		
		//How to manipulate time
		LocalTime currentTime = LocalTime.now();
		
		int hour = currentTime.getHour();
		System.out.println(hour);
		
		boolean isAfter = currentTime.isAfter(LocalTime.of(23, 11, 32, 1234));
		System.out.println(isAfter);
		
		System.out.println(currentTime.NOON);//12:00
		
		
		
	}

}
