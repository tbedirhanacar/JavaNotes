package day33maps;

import java.util.HashMap;
import java.util.Map.Entry;
	
	/*
	 	Type code to print non-repeated elements from an Array
	 	String s[] = {"A", "Z", "A", "K", "T", "K"}
	 */


public class MapsPractice01 {

	public static void main(String[] args) {
		
		//1.Way
		String s[] = {"A", "Z", "A", "K", "T", "K"};
//		List<String> arrList = new ArrayList<>(Arrays.asList(s)); 
//		List<String> nonRepeatedElements = new ArrayList<>(); 
//		
//		for (String w : arrList) {
//			if (arrList.indexOf(w) == arrList.lastIndexOf(w)) {
//				nonRepeatedElements.add(w);
//			}
//		}
//		
//		System.out.println(nonRepeatedElements);
		
		//2.Way
		HashMap<String, Integer> resultMap = new HashMap<>();
		for (String w : s) {
			Integer value = resultMap.putIfAbsent(w, 1);
			if (value!=null) resultMap.put(w, resultMap.get(w) + 1);
		}
		System.out.println(resultMap);
		
		for(Entry<String,Integer> w : resultMap.entrySet()) {
			if (w.getValue()==1) {
				System.out.println(w.getKey());
			}
		}
		
		
		
		
	}

}
