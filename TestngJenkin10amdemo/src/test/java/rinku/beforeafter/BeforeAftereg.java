package rinku.beforeafter;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeAftereg {
	
	@BeforeSuite
	void beforeSuit()
	{
		System.out.println("-----------------------Before Suite ----------------------");
	}
	@AfterSuite
	void afterSuit()
	{
		System.out.println("---------------------- After SUit--------------------");
	}

}
