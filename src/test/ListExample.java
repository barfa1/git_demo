package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Shubham");
		list.add("Deepak");
		list.add("Vishal");
		
//		System.out.println(list);
//		System.out.println(list.get(list.size() -1));
		
//		for(String data:list) {
//			System.out.println(data);
//		}
		
		Iterator<String> iter = list.iterator();
		
//		while(iter.hasNext()) 
//		System.out.println(iter.next());
		
		Collections.sort(list,Collections.reverseOrder());
//		Collections.reverse(list);
//		System.out.println(list);
		
		LinkedList<String> list1 = new LinkedList<String>();
		
		list1.add("Nikunj");
		list1.add("Shubham");
		list1.add("Viraj");
		list1.add("Devadharshini");
		list1.add("Praveen");
		list1.add("Amit");
		list1.addFirst("Kunal");
		list1.addLast("Pawan");
		
		ListIterator<String> iterator = list1.listIterator();

    // Printing the iterated value
    System.out.println("\nUsing ListIterator:\n");
    while (iterator.hasNext()) {
        System.out.println("Value is : "
                           + iterator.next());
    }
    
    
    
    
    // Stack
    
    Stack<String> s = new Stack<String>();
    
    s.push("Shubham");
    s.push("Viraj");
    s.push("Karan");
    s.push("Himanshu");
    s.pop();
    s.pop();
    System.out.println(s);
    System.out.println(s.peek());
    
    
    // Vector 
    Vector<String> v = new Vector<String>();
    v.add("Shubh");
    v.add("Shiva");
    v.add("Quinie");
    System.out.println(v);
    
    
		

}
}
