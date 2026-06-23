package rinku;

import org.testng.annotations.Test;

public class FirstTestcase {
	
	//@Test(enabled = false)
	@Test(groups="smoke")
	void first()
	{
		System.out.println("in first testcase");
	}
	
	@Test(groups={"regression","smoke"})
	void Second()
	{
		System.out.println("in Second Testcase");
	}
	
	@Test(groups="negative")
	void Third()
	{
		System.out.println("in third testcase");
	}
	@Test
	void Fouth()
	{
		System.out.println("in fourth testcase");
	}
	
	

}
