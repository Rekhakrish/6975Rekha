package Java8;

import java.util.function.Function;

//to check the length of the String

public class FunctionalEx 
{

	public static void main(String[] args) 
	{
	
		int amount=3;
		Function<Integer,Integer>sum=i->i+i; //3+3=6
		Function<Integer,Integer>sq=i->i*i; //6*6=36
		
		System.out.println(sum.apply(amount));
		System.out.println(sq.apply(amount));  //3
		
		System.out.println(sum.andThen(sq).apply(amount));
		                     //3(6)    ->   //6(36)

		System.out.println(sum.compose(sq).apply(amount));
		                     //9(18)    <-   //3(9)
	}
	}

	