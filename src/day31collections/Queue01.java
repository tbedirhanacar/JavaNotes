package day31collections;

import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue01 {

	public static void main(String[] args) {

		//If you use LinkedList constructor create an object in Queue data type, the elements will be in insertion order
		Queue<String> q1 = new LinkedList<>();
//		System.out.println(q1.offer("A"));
		q1.offer("1");
		q1.offer("2");
		q1.offer("3");
		System.out.println(q1);//[A]
		
		//If you use PriorityQueue constructor to create an object in Queue data type, the elements will be in
		//order according to the rule Java decided. But we are able to create our own rules to sort elements.
		//We will learn it in Lambda Course.
		Queue<String> q2 = new PriorityQueue<>();


	}

}
