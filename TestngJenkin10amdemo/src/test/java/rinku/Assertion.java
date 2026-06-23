package rinku;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	//@Test(expectedExceptions = ArithmeticException.class)
	//@Test
	void show()
	{
		String h="hello";
		int a=10/0;
		System.out.println("in show");
		String expTitle="Google";
		String acttitle="FB";
		//Assert.assertNotEquals(expTitle, acttitle);
		Assert.assertNotNull(h);
		System.out.println("after assertion");
	}
	@Test(invocationCount = 5)
	void display()
	{
		System.out.println("in display");
	}

}
