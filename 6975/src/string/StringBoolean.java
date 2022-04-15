package string;

public class StringBoolean {

	public static void main(String[] args) 
	{
       String str1="Hello Dear!";
       String str2="Hello Dear!";
       String str3=new String("Hello Dear!");
       if(str1.equals(str2))
       {
    	   System.out.println("str1 and str2 refer to identical Strings.");
       }
       else
       {
    	   System.out.println("str1 and str2 refer to non-identical Strings.");
       }
       if(str1==str2)
       {
    	   System.out.println("str1 and str2 refer to same Strings.");
       }
       else
       {
    	   System.out.println("str1 and str2 refer to Different Strings.");
       }
       if(str1.equals(str3))
       {
    	   System.out.println("str1 and str3 refer to identical Strings.");
       }
       else
       {
    	   System.out.println("str1 and str3 refer to non-identical Strings.");
       }
       if(str1==str3)
       {
    	   System.out.println("str1 and str3 refer to Same Strings.");
       }
       else
       {
    	   System.out.println("str1 and str3 refer to different Strings.");
       }
	}

}
