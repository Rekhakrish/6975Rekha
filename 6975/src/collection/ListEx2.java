package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
public class ListEx2 {

	public static void main(String[] args) 
	{
		ArrayList alist=new ArrayList();
		//LinkedList alist=new LinkedList();
		alist.add(new String("one"));

		alist.add(new String("two"));
		alist.add(new String("three"));
		
		System.out.println(alist.get(0));

		System.out.println(alist.get(1));

		System.out.println(alist.get(2));

	}
	{
         Vector<String> vc=new Vector<String>();
         vc.add("Vector Onject 1");
         vc.add("Vector Onject 2");
         vc.add("Vector Onject 3");
         vc.add("Vector Onject 4");
         vc.add("Vector Onject 5");
         vc.add(3,"Element at Fix position");
         System.out.println("Vector size :"+vc.size());
}
}