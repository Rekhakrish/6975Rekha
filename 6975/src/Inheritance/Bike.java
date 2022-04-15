package Inheritance;

abstract class Bike1
{
     abstract void run();
}
class Honda extends Bike1
{
	void run()
	{
		System.out.println("running safely");
		}

	public static void main(String[] args) 
	{
       Honda obj=new Honda();
       obj.run();
       }
}
