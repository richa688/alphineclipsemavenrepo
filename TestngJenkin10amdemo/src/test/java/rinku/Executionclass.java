package rinku;

import org.testng.annotations.Factory;

public class Executionclass {
	
	@Factory
	Object[] execute()
	{
		Object[] obj= {new FirstTestcase(),new SecondTestcase(),new ThirdTestCase()};
		return obj;
		};
		
		
	}


