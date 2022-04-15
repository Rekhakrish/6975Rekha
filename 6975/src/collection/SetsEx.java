package collection;
import java.util.*;
public class SetsEx {

	public static void main(String[] args) 
	{
	   Set hash=new HashSet();
		
		hash.add("R");
		hash.add("E");
		hash.add("K");
		hash.add("H");
		hash.add("A");
		
		Iterator itr=hash.iterator();
		while(itr.hasNext())
      {
    	  System.out.println(itr.next());
	
      }
		System.out.println("---------------------");
		TreeSet<String> tree=new TreeSet<String>();
		tree.add("Rekha");
		tree.add("Gayu");
		tree.add("Shar");
		Iterator iterator=tree.iterator();
	    while(iterator.hasNext())
	    {
	    	System.out.println(iterator.next().toString());
	    }
		System.out.println("----------------------------------");
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		   
		lhs.add(new String("One"));
		lhs.add(new String("Two"));
		lhs.add(new String("Three"));
		
		Object array[]=lhs.toArray();
		for(int x=0;x<3;x++)
		{
			System.out.println(array[x]);
		}

	}

}

