package Exceptionhandling;
class Edubridge extends Exception{
	public Edubridge(String msg)
	{
		super(msg);
	}
}
class UserDefinedException 
{
	public void toCheckEligibility(int age)throws Edubridge
	{
		if(age<18)
		{
			Edubridge obj=new Edubridge("You are not eligible");
			throw obj;
		}else {
			System.out.println("You are eligible");
		}
	}

	public static void main(String[] args)throws Edubridge
	{
		UserDefinedException obj2=new UserDefinedException();
		obj2.toCheckEligibility(19);
	 
	}

}
