package day19arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

	//How to check if multiple elements exist in a List
	//["A", "M", "C", "K", "B"] ==> If "A", and "C", and "K" exist in the list
	
	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("M");
		list1.add("C");
		list1.add("K");
		list1.add("B");
		
		//1.Way:
		List<String> list2 = new ArrayList<>();
		list2.add("A");
		list2.add("C");
		list2.add("K");

	     //Returns {@code true} if this list contains all of the elements of the specified collection.
		
		System.out.println(list1.containsAll(list2));

		//2.Way:
		list1.containsAll(Arrays.asList("A" , "C", "K"));
		
		//Note: When you use Arrays.asList() method you should be careful about not to change the length
		
		List<Integer> list3 = Arrays.asList(2, 5, 3, 4);
		//list3.add(7);//UnsupportedOperationException
		//list3.remove(1);//UnsupooırtedOperationException
	
		//clear() removes all elements from a list
		//list3.clear();//UnsupooırtedOperationException
		
		System.out.println(list3.contains(3));		
		
		//Remove M and put S in the place of M
		
		//1.Way
		System.out.println(list1);
		int idxOfObj = list1.indexOf("M");
//		list1.add(idxOfObj, "S");
//		list1.remove(idxOfObj+1);
//		System.out.println(list1);
		
		//2.Way
		//set() is used to update an element at a spesific index
		list1.set(idxOfObj, "S");
		System.out.println(list1);
	}

}
