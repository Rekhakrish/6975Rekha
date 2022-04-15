package Java8;

//Double colon::operator
//Reference to a static methos
interface Engine
{
	void speed();
}
class Car
{
	public static void average()
	{
		System.out.println("The average of the car is very Good");
	}
}

public class StaticMethod 
{

	public static void main(String[] args) 
	{
	  //using Lamda Expression
		Engine obj=()->System.out.println("Speed is Good");
		obj.speed();
		
		//Lamda replaced with static method reference
		Engine obj1=Car::average;
		obj1.speed();
	}

}
