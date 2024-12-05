package setpack;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEg {

	public static void main(String[] args)
	{
		HashSet<String> eg=new HashSet<String>();
		eg.add("A");
		eg.add("B");
		eg.add("C");
		eg.add("Z");
		System.out.println(eg);
		if(eg.contains("C"))
			System.out.println("contain C");
		else
			System.out.println("not present C");
		eg.add("A"); //duplication not allowed
		Iterator<String> rv=eg.iterator();
		System.out.println("Element in HashSet eg using Iterator");
		while(rv.hasNext())
		{
			System.out.println(rv.next());
			
		}
		HashSet<String> v=new HashSet<String>();
		v.add("G");
		v.add("H");
		v.add("I");
		v.add("J");
		System.out.println(" HashSet eg");
		System.out.println(eg);
		System.out.println(" HashSet v");
		System.out.println(v);
		eg.addAll(v);
		System.out.println("Added Set of eg and v");
		System.out.println(eg);
		System.out.println("remove B from HashSet");
		//System.out.println(eg);
		eg.remove("B");
		System.out.println(eg);
		eg.removeAll(eg);
		
		if(eg.isEmpty())
		{
			System.out.println("empty");
			
		}
		else
			System.out.println(eg.size());
		
		
		// TODO Auto-generated method stub

	}

}
