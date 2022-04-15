package Array;
import java.util.Arrays;
public class SortanArray {

	public static void main(String[] args) {
       int[] my_array= {90,143,405,504,609,201,777,899,108,940,1000,300};
       String[] my_array2= {"Sun","Moon","Earth","Uranus","Mercury","Venus","Mars","Jupiter","Saturn","Neptune"};
	System.out.println("Original Numeric Array :  "+Arrays.toString(my_array));
	Arrays.sort(my_array);
	System.out.println("Sorted Numeric Array :  "+Arrays.toString(my_array));
	System.out.println("Original String Array :  "+Arrays.toString(my_array2));
	Arrays.sort(my_array2);
	System.out.println("Sorted String Array :  "+Arrays.toString(my_array2));
	}
}
