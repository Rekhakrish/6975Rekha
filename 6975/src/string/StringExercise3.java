package string;
//print to removing duplicates from a given string
import java.util.*;
public class StringExercise3 
{
	public static void main(String[] args) 
	{
		String str1="Welcome to Welcome";
		System.out.println("The given string is: " + str1);
		System.out.println("After Removing duplicates  characters the new string is: " +removeDuplicateChars(str1));
     }
	private static String removeDuplicateChars(String sourceStr)
	{
		char[] arr1=sourceStr.toCharArray();
		String targetStr ="";
		for(char value:arr1) {
			if(targetStr.indexOf(value) ==-1)
			{
				targetStr += value;
			}
		}
		return targetStr;
	}

}
