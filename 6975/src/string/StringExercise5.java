package string;
import java.util.Scanner;
public class StringExercise5
{
	public static void main(String[] args)
	{
		int i;
		String str;
		int counter[]=new int[256];
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a String :");
		str=in.nextLine();
		for(i=0;i<str.length();i++)
		{
			counter[(int) str.charAt(i)]++;
		}
		for(i=0;i<256;i++)
		{
			if(counter[i]!=0)
			{
				System.out.println("The Character " + (char)i + " has occurrence for " + counter[i] + " times");
			}
		}
	
	}

}
