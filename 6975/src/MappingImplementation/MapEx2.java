package MappingImplementation;
import java.util.*;
public class MapEx2
{

	public static void main(String[] args) 
	{
		TreeMap treeMap= new TreeMap<String,String>();
		treeMap.put("name", "Rekha");
		treeMap.put("id","Reema");
		treeMap.put("address", "Sharmila");
		
		
		Collection values=treeMap.values();
		Iterator iterator=values.iterator();
		System.out.println("Printing the Values.....");
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

	}

	
	}


