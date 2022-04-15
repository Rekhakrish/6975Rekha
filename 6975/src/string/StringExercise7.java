package string;
import java.util.*;
public class StringExercise7 
{
	public int substringCounting(String stng)
	{
		int l = stng.length();
		  int ctr = 1;
		  String firsttwo = "li";
		  String lastone = "e";
		  if (l < 4)
		    return 0;
		  for (int i = 0; i < l - 3; i++) 
		  {
		    if (firsttwo.compareTo(stng.substring(i,++i)) == 0 && lastone.compareTo(stng.substring(i+2, i+3)) == 0)
		      ctr++;
		  }
		  return ctr;
		}
	public static void main(String[] args)
	{
		  StringExercise7 m= new StringExercise7();
	      String str1 =  "liveonwildlife";
	      System.out.println("The given string is: "+str1);
	      System.out.println("appear number of times: "+m.substringCounting(str1));
		  
	}

}
