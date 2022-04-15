package Array;
import java.util.Scanner;
public class MenuDriven 
{
	public static void main(String[] args) 
	{
      Scanner in=new Scanner(System.in);
      System.out.println("Type 1 for BuZZ Number");
      System.out.println("Type 2 for Even/Odd");
      System.out.println("Type 3 for Positive/Negative");
      System.out.print("Enter your Choice:  ");
      int ch=in.nextInt();
      System.out.print("Enter Number: ");
      int n=in.nextInt();
      switch(ch) 
      {
      case 1:
    	  if(n%7==0||n%10==7)
             System.out.println(n + " is a Buzz Number");
    	  else
    	      System.out.println(n + " is not a Buzz Number");
    	  break;
      case 2:
    	  if(n%2==0)
              System.out.println(n + " is a Even Number");
     	  else
     	      System.out.println(n + " is  a Odd Number");
     	  break;
      case 3:
	  if(n>=0)
         System.out.println(n + " is a Positive Number");
	  else
	      System.out.println(n + " is not a Negative Number");
	  break;
	  
	  default:
		  System.out.println("Incorrect choice");
	  
      }
	}
}
