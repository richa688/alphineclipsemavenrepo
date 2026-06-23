package rinku;

import org.testng.annotations.Test;

public class ThirdTestCase {
	
	@Test(groups="smoke")
	void cat()
	{
		System.out.println("in cat");
	}
	
	@Test(groups="regression")
	void dog()
	{
		System.out.println("in dog");
	}
	
	@Test(groups="negative")
	void mouse()
	{
		System.out.println("in mouse");
	}
	
	@Test
	void elephant()
	{
		System.out.println("in elephant");
	}

}
