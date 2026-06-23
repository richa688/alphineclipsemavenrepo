package rinku.listnereg;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(MyListener.class)
public class Testcaseclass {
	
	@Test
	void test1()
	{
		System.out.println("in test 1");
		
		Assert.assertTrue(true);
		System.out.println("After Assert true");
	}
	
	@Test
	void test2()
	{
		System.out.println("in test 2");
		
		Assert.assertTrue(false);
		System.out.println("After Assert false");
	}
	@Test
	void test3()
	{
		System.out.println("in test 3");
		
		//.assertTrue(true);
		throw new SkipException("testcase skip");
		//System.out.println("After Assert skip");
	}
	

}
