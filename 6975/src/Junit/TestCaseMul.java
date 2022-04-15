package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseMul
{

	@Test
	public void test() 
	{

		TestCaseTest obj=new TestCaseTest();
		int actualResult=obj.mul(10, 20);
		assertEquals(200,actualResult);
		System.out.println("Multiplication class : "+actualResult);
	}

}
