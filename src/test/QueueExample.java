package test;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> prq = new PriorityQueue<Integer>();
		
		prq.add(4);
		prq.add(3);
		prq.add(2);
		prq.add(1);
		System.out.println(prq);
//		System.out.println(prq.peek());
		System.out.println(prq.poll());
		System.out.println(prq);
		
		
		//DeQueue
		ArrayDeque<String> adq = new ArrayDeque<String>();
		
		adq.add("Shubham");
		adq.add("Shivani");
		adq.add("Dhananjay");
		adq.addFirst("Mitali");
		adq.addLast("Neha");
		System.out.println(adq);
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		
		
		

	}
	

}
