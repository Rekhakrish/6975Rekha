package string;
//program to compare two strings lexicographically ignoring case difference
public class StringIgnorecase 
{
	public static void main(String[] args)
	{
		String str1="Exercise 1";
		String str2="Exercise 1";
	    System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        int result=str1.compareToIgnoreCase(str2);
        if(result<0)
        {

    		System.out.println("\"" +str1 + "\"" + " is less than " +"\"" + str2 + "\"");
        }
        else if(result ==0)
        {

    		System.out.println("\"" + str1 + "\"" + " is equal to " + "\"" + str2 + "\"");
        }
        else//if(result>0)
        {

    		System.out.println("\"" + str1 + "\"" + " is greater than " + "\"" + str2 + "\"");
        }
		
	}

}
