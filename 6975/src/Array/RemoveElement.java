package Array;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) 
	{
      int[] my_array= {25,14,15,26,56,29,49};
      System.out.println("Original Array : "+Arrays.toString(my_array));
      int removeIndex=2;
      for(int i=removeIndex; i<my_array.length-1;i++)
      {
    	  my_array[i]=my_array[i+1];
      }
      System.out.println("After Removing Element: "+Arrays.toString(my_array));
      
	}

}
