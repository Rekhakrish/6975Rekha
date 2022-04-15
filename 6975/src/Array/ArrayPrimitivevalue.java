package Array;

public class ArrayPrimitivevalue 
{
   public static boolean contains(int[] arr,int item)
   {
	   for(int n:arr) {
		  if(item==n) {
			  return true;
		  }
	   }
	   return false;
   }
	public static void main(String[] args) {
        int[] my_array= {900,454,200,598,143,888,656};
        System.out.println(contains(my_array,598));
        System.out.println(contains(my_array,666));
	}

}
