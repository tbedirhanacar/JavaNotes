package day20passbyvaluedatetime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassByValue01 {
	
	/*
	 	Pass By Value: If you use any variable inside a method;
	 				   Java creates  a copy of the variable and use the copy inside the method.
	 				   Java does not use the variable itself inside the method.
	 				   Java does that to protect original value of the variable
	 */

	public static void main(String[] args) {	
		int number = 12;
		System.out.println(increase(12));
		System.out.println(number);
		
		int updateOriginalValue = 15;
		//To update original value you have to do assignment
		updateOriginalValue = increase(updateOriginalValue);
		
		//If you cannot update the value of a data type without assignment, those data types are called
		//"immutable" data types. So String is immutable.
		String s = "Ali";
		System.out.println(updateString(s));
		System.out.println(s);
		
		//In Lists, we can update the value without using assignment, because of that Lists are called "mutable" data types
		List<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(13);
		l.add(14);	
		System.out.println(updateList(l));
		System.out.println(l);
		
		//Arrays are mutable as well
		int arr[] = {14, 12, 13};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static int increase(int i) {	
		return i+5;	
	}
	
	public static String updateString(String s) {		
		return s + "!";	
	}
	
	public static List<Integer> updateList(List<Integer> list){
		list.remove(0);
		return list;
	}
}
