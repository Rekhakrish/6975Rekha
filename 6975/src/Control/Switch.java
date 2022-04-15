package Control;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
       int months;
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the Months Name");
       months=in.nextInt();
       switch(months)
       {
	       case 1:
		            System.out.println("January");
		            break;
	       case 2:
      	            System.out.println("February");
	                break;
	       case 3:
	                System.out.println("March");
	                break;
	       case 4:
	            System.out.println("July");
	            break;

	       default:
	    	        System.out.println("Wrong Input");
}
       }
	}
