package string;
import java.util.*;
public class StringExercise8 
{
	public boolean leftAndRightSame(String stng) 
	{
	  int l = stng.length();
	  boolean found=true;
	  for (int i = 0; i < l; i++) 
	  {
	    String tmpString = stng.substring(i,i+1);
	    if (tmpString.equals("#") && i > 0 && i < l-1) 
		{
	      if (stng.charAt(i-1) == stng.charAt(i+1))
	        found=true;
	      else
	        found=false;
	    }
	  }
	  return found;
	}
	public static void main(String[] args) 
	{
		StringExercise8 m= new StringExercise8();
	      String str1="moon#night";
	      String str2="bat##ball";
	      String str3="#moon#night";
	      System.out.println("The given string is: "+str1);
          System.out.println("The given string is: "+str2);
          System.out.println("The given string is: "+str3);
	      System.out.println("The before and after character are same: "+m.leftAndRightSame(str1));
	      System.out.println("The before and after character are same: "+m.leftAndRightSame(str2));
	      System.out.println("The before and after character are same: "+m.leftAndRightSame(str3));
	  	}

	}


