package polymorphism;
import java.util.*;
public class ReturnanArray
{
	public static String[]return_Array()
	{
     String[]ret_Array= {"java","C++","Python","Ruby","C"};
	      return ret_Array;
	      }
	public static void main(String[] args) 
	{
      String[]str_Array=return_Array();
      System.out.println("Array returned from method:"+Arrays.toString(str_Array));
	}
}

