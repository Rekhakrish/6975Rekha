package polymorphism;

public class Array
{
	public static void main(String[] args) 
	{
		int[] score= {10,20,31,24};
		System.out.println("score[0]="+score[0]);
		System.out.println("score[1]="+score[1]);
		System.out.println("score[2]="+score[2]);
		System.out.println("score[3]="+score[3]);
		int mean=(score[0]+score[1])/2;
		System.out.println("\nMean=" +mean);
		System.out.println("*******USING VARIABLE i********");
		int i;
		for(i=0;i<=2;i++)
		{
			System.out.println("score["+i+"="+score[i]);
			}
	}
}
