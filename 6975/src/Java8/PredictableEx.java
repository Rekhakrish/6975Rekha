package Java8;

import java.util.function.Predicate;

//program find out all the even numbers in the given array
public class PredictableEx 
{

	public static void main(String[] args) 
	{
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		Predicate<Integer>even=x->x%2==0;
		//find out the number which is greater than 5 in the given array.
		Predicate<Integer>grt=y->y>5;
		for(int i:num)
		{
			if(even.test(i))
			{
				if(grt.or(even).test(i))
						{
					System.out.println(i);				
						}
				//For equality predicate has isEqual(Object o)method which is static
				{
					Predicate<String>name=Predicate.isEqual("Mumbai");
					System.out.println(name.test("Mumbai"));
				}
			}
		}
						
			
			
	
			}
			
		}
		
	
	


