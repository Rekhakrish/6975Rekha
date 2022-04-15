package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamConfiguration1 
{

	public static void main(String[] args) 
	{
		//create a list of Integers
				List<Integer>number=Arrays.asList(2,3,4,5);
				
				//create a list of Strings
				List<String>names=Arrays.asList("Reflection","Collection","Stream");
				
				//Demonstration of filter method
				List<String>result=names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
				System.out.println(result);
				
				System.out.println("....................................");
				
				//Demonstration of sorted method
				List<String>show=names.stream().sorted().collect(Collectors.toList());
				System.out.println(show);
				
				System.out.println("....................................");
				
				//Demonstration of MAP method
				Stream<String>s1=Stream.of("sweety","apple","mango","orange");
				List<String>result2=s1.map(s->s.toUpperCase()).collect(Collectors.toList());
			    System.out.println(result2);
			    
			    System.out.println("....................................");
			    
			    //forEach
			    Stream<Integer> s5=Stream.of(3,4,5,6,7,8);
			    s5.forEach(ele-> System.out.println(ele));
			    
			    System.out.println("..................................");
			    
			    //count()
			    Stream<Integer> s6=Stream.of(20,50,10,70,80);
			    long count=s6.count();
			    System.out.println(count);
			    
			    System.out.println("...................................");
				
			    
			    //toArray()
			    
			    Stream<Integer>s7=Stream.of(20,30,40,50);
			    Object[] array = s7.toArray();
			    for(Object a:array)
			    {
			    	System.out.println(a);
			    }
			    System.out.println(".....................................");
			    
			    //collect
			    Stream<String> words=Stream.of("hello","how","are","you","doing","mate");
			    List<String>words1=words.map(word->word.toUpperCase()).collect(Collectors.toList());
			    System.out.println(words1);
			    }
			    
			 }

	


