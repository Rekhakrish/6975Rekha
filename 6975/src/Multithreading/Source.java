package Multithreading;

import java.io.*;
import java.util.Scanner;
class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}
class Source
{
	public static void main(String[] args)throws Exception
	{
		Source a=new Source();
		a.myMethod();
	
	}
	void myMethod()throws MyException
	{
		String firstname,lastname;
		Scanner input=new Scanner(System.in);
		System.out.println("firstname");
		firstname=input.nextLine();
		System.out.println("lastname");
		lastname=input.nextLine();
		if(firstname.equals(" ")&&lastname.equals(" "))
		{
			throw new MyException("Invalid");
		}
		else
		{
			System.out.println("Succesful");
			
		}
	}

}
