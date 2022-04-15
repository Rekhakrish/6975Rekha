package MappingImplementation;

import java.util.ArrayList;
import java.util.Iterator;

public class IterationTest {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		System.out.println("Original Elements of al...." +al);
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Object element=itr.next();
			System.out.println("Element  "+element);
		}

	}

}
