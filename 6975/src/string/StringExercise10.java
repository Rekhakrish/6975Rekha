package string;
import java.util.*;
public class StringExercise10
{
	public int endWithOrn(String stng)
	{
		int l = stng.length();
		  int ctr = 0;
		  stng = stng.toLowerCase();
		  for (int i = 0; i < l; i++) 
		  {
		    if (stng.charAt(i) == 'm' || stng.charAt(i) == 'n') 
			{
		      if (i < l-1 && !Character.isLetter(stng.charAt(i+1)))
		        ctr++;
		      else if (i == l-1)
		        ctr++;
		    }
		  }
		  return ctr;
		}
	public static void main(String[] args) 
	{
	      StringExercise10 m= new StringExercise10();
	      String str1 =  "mam is in the room";
	      System.out.println("The given string is: "+str1);
	      System.out.println("The number of words ends eith m or n is: "+m.endWithOrn(str1));
		  
		}

}
