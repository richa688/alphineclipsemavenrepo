package rinku;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAttribute {
	

	@Test(description="this is test method",priority=3,timeOut=3000)
	void audi()
	{
		System.out.println("in audi");
	}
	
	@Test(timeOut=3000,priority=2)
	void alto()
	{
		System.out.println("in alto");
	}

	@Test(priority=1,dependsOnMethods = "alto")
	//@Test
	void bmw()
	{
		System.out.println("in BMW");
		Assert.assertTrue(false);
	}



}
