package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseDiv {

	@Test
	public void test() 
	{

		TestCaseTest obj=new TestCaseTest();
		int actualResult=obj.div(20, 10);
		assertEquals(2,actualResult);
		System.out.println("Division  class : "+actualResult);
	}

}
