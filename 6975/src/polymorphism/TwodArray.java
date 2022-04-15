package polymorphism;

public class TwodArray 
{
	public static void main(String[] args) 
	{
       int[][] myarray=new int[2][2];
       myarray[0][0]=1;
       myarray[0][1]=myarray[1][0]=0;
       myarray[1][1]=1;
       System.out.println("Array elements are:");
       System.out.println(myarray[0][0] + " " +myarray[0][1]);
       System.out.println(myarray[1][0] + " " +myarray[1][1]);
	}

}
