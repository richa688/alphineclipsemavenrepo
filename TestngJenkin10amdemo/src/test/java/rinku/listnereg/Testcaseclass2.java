package rinku.listnereg;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(MyListener.class)
public class Testcaseclass2 {
	
	@Test
	void test4()
	{
		System.out.println("in test 4 another class");
		
		Assert.assertTrue(true);
		//throw new SkipException("testcase skip");
		System.out.println("After Assert true");
	}

}
