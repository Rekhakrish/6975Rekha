package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseSub 
{

	@Test
	public void test()
	{

		TestCaseTest obj=new TestCaseTest();
		int actualResult=obj.sub(30, 20);
		assertEquals(10,actualResult);
		System.out.println("Subtract class : "+actualResult);
	}

}
