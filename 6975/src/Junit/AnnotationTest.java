package Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationTest 
{
	@BeforeClass
	public static void beforeclass() 
	{
		System.out.println("in before class");
	}
	@AfterClass
	public static void afterclass() 
	{
		System.out.println("in after class");
	}
	@Before
	public static void before() 
	{
		System.out.println("in before ");
	}
	@After
	public static void after() 
	{
		System.out.println("in after");
	}
	@Test
	public void test()
	{
		System.out.println("in test");
	}
	@Ignore
	public void ignoreTest()
	{
		System.out.println("in ignore test");
	}

}
