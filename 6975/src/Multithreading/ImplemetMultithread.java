package Multithreading;

class A1 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("From A...." +i);
		
		}
		System.out.println("Exit From A");
	}
}
class B1 implements Runnable
{
	public void run()
{
	for(int j=1;j<=5;j++)
	{
		System.out.println("From A...." +j);
	
	}
	System.out.println("Exit From B");
}
}
public class ImplemetMultithread 
{

	public static void main(String[] args) 
	{
		A1 ThreadA=new A1();
		B1 ThreadB=new B1();
		Thread a2=new Thread(ThreadA);
		Thread b2=new Thread(ThreadB);
		a2.start();
		b2.start();
		System.out.println("Exit from the Main");
				
	
	}

}
