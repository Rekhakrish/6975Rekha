package collection;
import java.util.*;

public class ListEx {

	public static void main(String[] args) 
	{
		List<String> list=new ArrayList<String>();
		
		//Set<String> list=new TreeSet<String>();
		list.add("Rekha");
		list.add("Sharmila");
		list.add("Gayathri");
		
		
		list.add("Rekha");
		list.add("Sharmila");
		list.add("Gayathri");
		
		System.out.println(list.size());
		System.out.println("Original List" +list);
		Collections.sort(list);
		System.out.println("Sorted List" +list);
		System.out.println("-------------------------------------");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		      //  for(int i=0;i<list.size();i++)
		     //   {
		    //	System.out.println(list.get(i));
			
	        //	}
		   //   for(String s:list)
		  //   {
		 //  System.out.println(s);
			
		 // }
		//  list.stream().forEach(e->System.out.println(e));
		
	}
}

	

