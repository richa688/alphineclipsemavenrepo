package rinku;

import org.testng.annotations.Test;

public class SecondTestcase {
	
	@Test(groups="smoke")
	void display()
	{
		System.out.println("in display");
	}
	@Test(groups="regression")
	void show()
	{
		System.out.println("in show");
	}
	@Test(groups="negative")
	void view()
	{
		System.out.println("in view");
	}
	
	@Test
	void seen()
	{
		System.out.println("in seen");
	}

}
