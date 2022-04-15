package Multithreading;

class A extends Thread
{
	public void run()
	{
		System.out.println("Thread A is started");
	    for(int i=0;i<=10;i++)
	    {
	    	System.out.println("Value of i "+i);
	    }
	    System.out.println("Thread A is Exit");
	}
}
class B extends Thread
{
	public void run()
	{
		System.out.println("Thread B is started");
	    for(int j=0;j<=10;j++)
	    {
	    	System.out.println("Value of j "+j);
	    }
	    System.out.println("Thread B is Exit");

}
}
	class C extends Thread
	{
		public void run()
		{
			System.out.println("Thread C is started");
		    for(int k=0;k<=10;k++)
		    {
		    	System.out.println("Value of K "+k);
		    }
		    System.out.println("Thread C is Exit");

	}
	}
public class MultithreadEx 
{

	public static void main(String[] args) 
	{
		A obj1=new A();
		B obj2=new B();
		C obj3=new C();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		Thread t3=new Thread(obj3);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
	



