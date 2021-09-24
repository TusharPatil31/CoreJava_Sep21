package test;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Vector;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		PriorityQueue<String>  queue =new PriorityQueue <String> ();
		
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");
		
		System.out.println(queue);
		
		System.out.println(queue.peek());
		
		String first=queue.poll();
		
		System.out.println(queue);
		
		System.out.println(first);
		*/
		
		ArrayDeque<String> deque=new ArrayDeque<String>();
		
		deque.add("A");
		deque.add("B");
		
		deque.add("C");
		deque.add("D");
		
		deque.addFirst("E");
		deque.addLast("F");
		
		System.out.println(deque);
		
		
	}

}
