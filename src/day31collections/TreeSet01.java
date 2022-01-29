package day31collections;

	/*
	 	1)If you need to store unique elements in natural order use TreeSet
	 	
	 */

import java.util.TreeSet;
import java.util.HashSet;

public class TreeSet01 {

	public static void main(String[] args) {

		TreeSet<Integer> ts1 = new TreeSet<>();
		ts1.add(12);
		ts1.add(35);
		ts1.add(10);
		ts1.add(46);
		ts1.add(9);
		System.out.println(ts1);//[9, 10, 12, 35, 46]
		
		/*
		 	1)How to store unique elements in natural order in a collection?
		 	  Ans: I use TreeSet
		 	  
		 	2)But as you know TreeSet is very slow, how can you make your code faster?
		 	  i: I create a HashSet and add the elements into HashSet
		 	  ii: I create a TreeSet and I convert HashSet to TreeSet  
		 */
		
		//1.Way:
		TreeSet<String> ts2 = new TreeSet<>();
		ts2.add("K");
		ts2.add("Z");
		ts2.add("A");
		ts2.add("C");
		ts2.add("T");
		System.out.println(ts2);//[A, C, K, T, Z]

		
		//2.Way: Recommended
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("K");
		hs1.add("Z");
		hs1.add("A");
		hs1.add("C");
		hs1.add("T");
		System.out.println(hs1);//[A, C, T, Z, K]
		
		TreeSet<String> ts3 = new TreeSet<>(hs1);
		System.out.println(ts3);//[A, C, K, T, Z]

		
		
		
		
	}

}
