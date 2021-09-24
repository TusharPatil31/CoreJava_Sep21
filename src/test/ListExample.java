package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList <String> ();
		
		list.add("Aman");
		list.add("Atusha");
		list.add("Nisha");
		list.add("Atusha");
		
		System.out.println(list);
		/*
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		Iterator <String> itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(String data:list)
		{
			System.out.println(data);
		}
		*/
		
//		Collections.sort(list, Collections.reverseOrder());
//		
//		System.out.println(list);
		
//		Collections.reverse(list);
		
//		System.out.println(list);
		
		
		/*
		LinkedList<String> list1 = new LinkedList <String>();
		
		list1.add("shubham");
		list1.add("Ashwini");
		list1.add("Tushar");
		
		list1.addFirst("Raj");
		list1.addLast("Rohan");
		
		System.out.println(list1);
		*/
		
		/*
		Stack<String>  stack =new Stack <String> ();
		
		stack.push("A");
		stack.push("B");
		stack.pop();
		stack.push("C");
		stack.push("D");
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		*/
		
		Vector<String>  vector =new Vector <String> ();
		
		vector.add("A");
		vector.add("B");
		vector.add("C");
		vector.add("D");
		
	}

}
