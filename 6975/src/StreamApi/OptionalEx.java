package StreamApi;

import java.util.Optional;

public class OptionalEx 
{

	public static void main(String[] args) 
	{
		//Creating a String array
		String[] str=new String[5];
		
		//Setting value for 2nd index
		str[2]="Edubridge classes arecoming soon";
		System.out.println("Empty Method");
		//It returns an empty instance of Optional class
		Optional<String> empty=Optional.empty();
		
		System.out.println("\n\n of Method");
		//It returns a non-empty Optional
		Optional<String> value=Optional.of(str[2]);
		System.out.println(value);
		
		System.out.println("\n\n of Nullable Method");
		String[] words=new String[10];
		Optional<String> checkNull=Optional.ofNullable(words[9]);
		
		if(checkNull.isPresent())
		{
			String word=words[5].toLowerCase();
			System.out.print(word);
		}
		else
			System.out.println("Word is null");
		System.out.println("\n\n get Method");
		
		//It returns value of an Optional.
		//If value is not present,ut throws
		//an NoSuchElementException
		
		System.out.println("\n\nhashcode Method");
		//It returns true if value is present,
		//otherwise false
		
		System.out.println("\n\n ifPresent Method");
		System.out.println(value.isPresent());
		
		Optional<String> statement=Optional.of("this is ex program on ifPresent Method");
		statement.ifPresent(value1->System.out.println(value1.toUpperCase()));
		}
		

	}


