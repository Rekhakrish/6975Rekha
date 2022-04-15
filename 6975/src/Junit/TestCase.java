package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() 
	{
		TestCaseTest obj=new TestCaseTest();
		int actualResult=obj.add(10, 20);
		assertEquals(30,actualResult);
		System.out.println("Add class : "+actualResult);
	}

}
