package linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<String> eg=new LinkedList<String>();
		eg.add("A");
		eg.add("B");
		eg.add("C");
		eg.add("D");
		System.out.println(eg);
		eg.add(3, "E");
		System.out.println(eg);
		//System.out.print( eg.add(1,"F"));
		System.out.println(eg.get(2));
		
		eg.set(3,"G");
		System.out.println(eg);
		
		eg.remove(0);
		System.out.println(eg);
		int s=0;
		if(eg.isEmpty())
			System.out.println("list is empty");
		else
			 s=eg.size();
		System.out.println("Size "+s);
		
		if(eg.contains("H"))
			System.out.println("Element is present");
		else
			System.out.println(" Element not present");
		Iterator<String> rv=eg.iterator();
		while(rv.hasNext())
		{
			System.out.println(rv.next());
			rv.remove();
		}
		System.out.println(eg);
		eg.add("A");
		eg.add("B");
		eg.add("C");
		eg.add("D");

	}
}
