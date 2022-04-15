package Control;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		int marks;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks:");
        marks=sc.nextInt();
       if(marks>=80)
       {
    	   System.out.println("You are Pass in Distinction:");
       }
       else if(marks>=50)
       {
    	   System.out.println("You are Pass in Average:");
       }
       else if(marks<50)
       {
    	   System.out.println("You are Fail:");
       }

	}

}
