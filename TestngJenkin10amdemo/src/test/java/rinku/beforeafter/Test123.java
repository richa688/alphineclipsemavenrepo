package rinku.beforeafter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test123 {
	
	@BeforeTest
	void beforeTest()
	{
		System.out.println("``````````````` Before Test ```````````````````````````````````````");
	}
	
	@BeforeClass
	void beforeClass()
	{
		System.out.println("~~~~~~~~~~~~Before Class~~~~~~~~~~~~~~~~~~~");
	}
	
	@BeforeMethod
	void beforeMethod()
	{
		System.out.println("---------------it execute before method-----------");
	}
	
	@Test
	void show()
	{
		System.out.println("in show");
	}
	
	@Test
	void display()
	{
		System.out.println("in display");
	}
	
	@AfterMethod
	void afterMethod()
	{
		System.out.println("----------------In executes after method----------------");
	}
	
	@AfterClass
	void afterClass()
	{
		System.out.println("~~~~~~~~~~~~~~~~After Class~~~~~~~~~~~~~~~~");
	}
	
	@org.testng.annotations.AfterTest
	void AfterTest()
	{
		System.out.println("``````````````````````After Test ````````````````````````");
	}

}
