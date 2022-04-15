package Array;

public class AverageUsingArrays {

	public static void main(String[] args) 
	{
        int[] array= {20,31,14,11,7,8};
        int length=array.length;
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
        	sum +=array[i];
        }
        double average=sum/length;
        System.out.println("Average of Array : "+average);
        	}

}
