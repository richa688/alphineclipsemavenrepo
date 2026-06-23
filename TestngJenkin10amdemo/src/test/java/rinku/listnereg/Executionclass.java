package rinku.listnereg;

import org.testng.annotations.Factory;

public class Executionclass {
	
	@Factory
	Object[] execute()
	{
		Object[] obj= {new Testcaseclass(),new Testcaseclass2()};
		return obj;
		};
		
		
	}


