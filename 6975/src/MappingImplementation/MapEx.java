package MappingImplementation;

import java.util.HashMap;

public class MapEx {

	public static void main(String[] args) 
	{
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("Rekha","A");
		map.put("Gayathri","F");
		map.put("Sharmila", "B");
		System.out.println("Name: " +map.get("Rekha"));
		System.out.println("ID: " +map.get("Gayathri"));
		System.out.println("Address: " +map.get("Sharmila"));
		

	}

}
