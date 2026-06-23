package testngproject.TestngJenkin10amdemo;

import org.testng.annotations.Test;

public class FirstTestcase {
	
	//@Test(enabled = false)
	@Test
	void first()
	{
		System.out.println("in first testcase");
	}
	
	@Test
	void Second()
	{
		System.out.println("in Second Testcase");
	}
	
	@Test
	void Third()
	{
		System.out.println("in third testcase");
	}
	
	

}
